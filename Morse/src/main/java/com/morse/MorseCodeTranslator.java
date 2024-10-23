package com.morse;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {

    private static final Map<Character, String> morseCodeMap = new HashMap<>();
    private static final Map<String, Character> reverseMorseCodeMap = new HashMap<>();

    static {
        // Morse code for letters
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        // Morse code for numbers
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");

        // Punctuation and space
        morseCodeMap.put('.', ".-.-.-");
        morseCodeMap.put(',', "--..--");
        morseCodeMap.put('?', "..--..");
        morseCodeMap.put(' ', "/");

        // Reverse mapping from Morse to text
        for (Map.Entry<Character, String> entry : morseCodeMap.entrySet()) {
            reverseMorseCodeMap.put(entry.getValue(), entry.getKey());
        }
    }

    // Translate text to Morse code
    public static String translateToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (morseCodeMap.containsKey(c)) {
                morseCode.append(morseCodeMap.get(c)).append(" ");
            } else {
                morseCode.append("? ");  // Handle unknown characters
            }
        }
        return morseCode.toString().trim();
    }

    // Translate Morse code back to text
    public static String translateToText(String morseCode) {
        StringBuilder text = new StringBuilder();
        String[] morseSymbols = morseCode.trim().split("\\s+");

        for (String symbol : morseSymbols) {
            if (reverseMorseCodeMap.containsKey(symbol)) {
                text.append(reverseMorseCodeMap.get(symbol));
            } else if (symbol.equals("/")) {
                text.append(" ");  // Space between words
            } else {
                text.append("?");  // Handle unknown symbols
            }
        }
        return text.toString();
    }
}
