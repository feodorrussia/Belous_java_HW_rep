package Huffman.Tree;

import java.util.HashMap;

public class HuffmanTree {
    private HuffmanNode root;

    public HuffmanTree() {
        root = null;
    }

    public HuffmanTree(HuffmanNode root_) {
        root = root_;
    }

    public void generateHuffmanCodes(String str, HashMap<Character, String> huffmanCode) {
        root.generateHuffmanCodes(str, huffmanCode);
    }


}
