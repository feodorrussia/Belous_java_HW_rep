import Huffman.File.BitReader;
import Huffman.File.FileReader;
import Huffman.File.FileWriter;
import Huffman.Tree.HuffmanNode;
import Huffman.Tree.HuffmanTree;

import java.io.*;
import java.util.*;


public class HuffmanApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Неправильный запрос");
            System.out.println("Пример: java Main <encode|decode> <inputFile> <outputFileName - путь и имя файла без расширения>");
            return;
        }

        String mode = args[0]; // Режим работы (кодирование или декодирование)
        String inputFilePath = args[1]; // Путь к входному файлу
        String outputFileName = args[2]; // Путь к выходному файлу

        try {
            if (mode.equals("encode")) {
                encode(inputFilePath, outputFileName);
                System.out.println("Файл успешно закодирован.");
            } else if (mode.equals("decode")) {
                decode(inputFilePath, outputFileName);
                System.out.println("Файл успешно раскодирован.");
            } else {
                System.out.println("Неверный режим работы. Допустимые значения: encode или decode.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при " + (mode.equals("encode") ? "кодировании" : "декодировании") + " файла: " + e.getMessage());
        }
    }

    public static void encode(String inputFileName, String outputFileName) throws IOException {
        HuffmanTree tree;
        HashMap<Character, String> huffmanCode = new HashMap<>();
        StringBuilder encodedData = new StringBuilder();

        String content = FileReader.readFile(inputFileName);
        tree = buildHuffmanTree(content);
        tree.generateHuffmanCodes( "", huffmanCode);

        for (char c : content.toCharArray())
            encodedData.append(huffmanCode.get(c));

        outputFileName += ".huff";
        FileWriter.write(inputFileName, outputFileName, huffmanCode, encodedData.toString());
    }

    public static void decode(String inputFileName, String outputFileName) throws IOException {

        BitReader reader = new BitReader(new FileInputStream(inputFileName));
        String extension = FileReader.readExtensionFromFile(reader);

        HashMap<Character, String> huffmanCode = FileReader.readHuffmanCode(reader);
        String decodedData = FileReader.readEncodedFile(reader, huffmanCode);

        outputFileName += "." + extension;
        FileWriter.writeDecoded(outputFileName, decodedData);
    }

    public static HuffmanTree buildHuffmanTree(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(HuffmanNode::getFrequency));

        freq.forEach((key, value) -> pq.add(new HuffmanNode(key, value)));
        while (pq.size() != 1) {
            HuffmanNode current = new HuffmanNode('\0', 0, pq.poll(), pq.poll());
            pq.add(current.setSum());
        }
        return new HuffmanTree(pq.peek());
    }
}
