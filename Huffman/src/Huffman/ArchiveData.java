package Huffman;
import java.util.HashMap;


public class ArchiveData {
    public String compressedData;
    public String originalFileName;
    public HashMap<String, Byte> recoveryMap;
    int originalLength;
    int dataOffset;
}
