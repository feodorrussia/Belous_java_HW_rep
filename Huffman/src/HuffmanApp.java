import java.io.File;
import Huffman.*;

public class HuffmanApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Неправильный формат команды. Используйте: java HuffmanApp <encode/decode/info> <inputFile>");
            return;
        }
        Archivator h = new Archivator();

        String[] nargs = new String[args.length];
        System.arraycopy(args, 0, nargs, 0, args.length);

        switch (nargs[0]) {
            case "decode" -> {

                ArchiveData archiveData = FileManager.readArchive(args[1]);

                byte[] result = h.decode(archiveData.compressedData, archiveData.recoveryMap);

                FileManager.writeFile(result, archiveData.originalFileName);
            }
            case "encode" -> {

                byte[] data = FileManager.readFile(nargs[1]);
                byte[] result = h.encode(data);
                File f = new File(nargs[1]);
                String originalFileName = f.getName();
                String outputFilePath = originalFileName.substring(0, originalFileName.lastIndexOf('.')) + ".huff";

                FileManager.writeArchive(result, h.codeMap, originalFileName, outputFilePath);
            }
            case "info" -> {

                ArchiveData archiveData = FileManager.readArchive(args[1]);
                byte[] result = h.decode(archiveData.compressedData, archiveData.recoveryMap);

                FileManager.test(archiveData, result);
            }
            default -> System.out.println("Invalid mode. Use 'encode', 'decode' or 'info'");
        }
    }

}
