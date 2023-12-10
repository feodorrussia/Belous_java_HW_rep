package Huffman.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReader {
    public static String readFile(String filename) throws IOException {
        try (BitReader Input = new BitReader(new FileInputStream(filename))) {
            StringBuilder stringBuilder = new StringBuilder();
            int bit = 0;
            while ((bit = Input.readBits(8)) != -1) {
                char character = (char) bit;
                stringBuilder.append(character);
            }
            return stringBuilder.toString();
        }
    }

    public static String readEncodedFile(BitReader Input, Map<Character, String> huffmanCode) throws IOException {
        StringBuilder content = new StringBuilder();
        int bit = 0;
        StringBuilder currentCode = new StringBuilder();
        while ((bit = Input.readBit()) != -1) {
            currentCode.append(bit);
            for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
                if (entry.getValue().contentEquals(currentCode)) {
                    content.append(entry.getKey());
                    currentCode = new StringBuilder();
                    break;
                }
            }
        }
        return content.toString();
    }

    public static String readExtensionFromFile(BitReader Input) throws IOException {
        StringBuilder extensionBuilder = new StringBuilder();
        char extensionChar;
        while ((extensionChar = (char) Input.readBits(8)) != 0)
            extensionBuilder.append(extensionChar);
        return extensionBuilder.toString();
    }

    public static HashMap<Character, String> readHuffmanCode(BitReader Input) throws IOException {
        HashMap<Character, String> huffmanCode = new HashMap<>();
        int symbol;
        while ((symbol = Input.readBits(8)) != 0) {
            int codeLength = Input.readBits(32);
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < codeLength; i++)
                code.append(Input.readBit());
            huffmanCode.put((char) symbol, code.toString());
        }
        return huffmanCode;
    }
}