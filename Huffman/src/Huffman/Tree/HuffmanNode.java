package Huffman.Tree;

import java.util.HashMap;

public class HuffmanNode {
    private char symbol;
    private int frequency;
    private HuffmanNode left = null;
    private HuffmanNode right = null;

    public HuffmanNode(char symbol, int freq) {
        this.symbol = symbol;
        this.frequency = freq;
    }

    public HuffmanNode setSum() {
        if (left != null)
            frequency += left.frequency;
        if (right != null)
            frequency += right.frequency;
        return this;
    }

    public int getFrequency() {
        return frequency;
    }

    public HuffmanNode(char symbol, int freq, HuffmanNode left, HuffmanNode right) {
        this.symbol = symbol;
        this.frequency = freq;
        this.left = left;
        this.right = right;
    }

    public void generateHuffmanCodes(String str, HashMap<Character, String> huffmanCode) {

        if (left == null && right == null) {
            huffmanCode.put(symbol, str);
            return;
        }
        if (left != null)
            left.generateHuffmanCodes(str + "0", huffmanCode);
        if (right != null)
            right.generateHuffmanCodes(str + "1", huffmanCode);
    }
}