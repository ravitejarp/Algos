package com.ravi.datastructures.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffManCode {

    public static void main(String[] args) {
        HuffManCode huffManCode = new HuffManCode();
        huffManCode.generateHuffManCode("Huffman coding is a data compression algorithm.");
    }

    public void encode(Node characterPriorityQueue, HashMap<Character, String> huffManEncode, String s) {
        if (characterPriorityQueue == null) {
            return;
        }
        if (characterPriorityQueue.left == null && characterPriorityQueue.left == null) {
            huffManEncode.put(characterPriorityQueue.character, s);
        }
        encode(characterPriorityQueue.left, huffManEncode, s + "0");
        encode(characterPriorityQueue.right, huffManEncode, s + "1");
    }

    public int decode(String s, Node peek, int index) {
        if (peek == null) {
            return index;
        }

        if (peek.left == null && peek.right == null) {
            System.out.print(peek.character);
            return index;
        }
        index++;

        if (s.charAt(index) == '0') {
            index = decode(s, peek.left, index);
        } else {
            index = decode(s, peek.right, index);
        }

        return index;
    }

    public void generateHuffManCode(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!frequencyMap.containsKey(text.charAt(i))) {
                frequencyMap.put(text.charAt(i), 1);
            } else {
                frequencyMap.put(text.charAt(i), frequencyMap.get(text.charAt(i)) + 1);
            }
        }

        PriorityQueue<Node> characterPriorityQueue = new PriorityQueue<>(
                (l, r) -> l.frequency - r.frequency
        );
        Set<Map.Entry<Character, Integer>> entries = frequencyMap.entrySet();
        entries.forEach(entry -> characterPriorityQueue.add(new Node(entry.getKey(), entry.getValue(), null, null)));

        while (characterPriorityQueue.size() != 1) {
            Node node1 = characterPriorityQueue.poll();
            Node node2 = characterPriorityQueue.poll();
            characterPriorityQueue.add(new Node('\0', node1.frequency + node2.frequency, node1, node2));
        }
        HashMap<Character, String> huffManEncode = new HashMap<>();

        StringBuilder todecode = new StringBuilder();
        encode(characterPriorityQueue.peek(), huffManEncode, "");
        huffManEncode.forEach((key, value) -> {
            System.out.println(key + "--" + value);
            todecode.append(value);
        });
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encoded.append(huffManEncode.get(text.charAt(i)));
        }
        System.out.println(encoded.toString());
        int index = -1;
        while (encoded.length() - 2 > index) {
            index = decode(encoded.toString(), characterPriorityQueue.peek(), index);
        }

    }

    public class Node {
        Character character;
        int frequency;
        Node left = null;
        Node right = null;

        Node(Character character, int frequency, Node left, Node right) {
            this.character = character;
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }
    }
}
