package com.morse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MorseCodeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Thymeleaf template located at src/main/resources/templates/index.html
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("text") String text, Model model) {
        String morseCode = MorseCodeTranslator.translateToMorse(text);
        model.addAttribute("originalText", text);
        model.addAttribute("morseCode", morseCode);
        return "result";  // Thymeleaf template located at src/main/resources/templates/result.html
    }

    @PostMapping("/morse-to-text")
    public String morseToText(@RequestParam("morseCode") String morseCode, Model model) {
        String text = MorseCodeTranslator.translateToText(morseCode);
        model.addAttribute("morseCode", morseCode);
        model.addAttribute("text", text);
        return "morseToTextResult";  // Display Morse to Text result
    }

    @PostMapping("/encrypt")
    public String encrypt(@RequestParam("encryptText") String encryptText, @RequestParam("key") String key, Model model) {
        try {
            String encryptedText = AES256Util.encrypt(encryptText, key);
            model.addAttribute("originalText", encryptText);
            model.addAttribute("encryptedText", encryptedText);
            return "encryptedResult";  // Display encrypted result
        } catch (Exception e) {
            model.addAttribute("error", "Encryption error: " + e.getMessage());
            return "index";
        }
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestParam("decryptText") String decryptText, @RequestParam("decryptKey") String decryptKey, Model model) {
        try {
            String decryptedText = AES256Util.decrypt(decryptText, decryptKey);
            model.addAttribute("encryptedText", decryptText);
            model.addAttribute("decryptedText", decryptedText);
            return "decryptedResult";  // Display decrypted result
        } catch (Exception e) {
            model.addAttribute("error", "Decryption error: " + e.getMessage());
            return "index";
        }
    }
}
