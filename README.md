
# Crypt_Web_ver1.0 (Morse Code & AES Encryption/Decryption Web Application)

This is a Java-based Spring Boot web application that allows users to:

- Convert **text to Morse code**.
- Convert **Morse code to text**.
- Encrypt text using **AES 256-bit encryption**.
- Decrypt AES-encrypted text.

The application is built using **Spring Boot**, **Thymeleaf**, and **Java AES encryption** techniques. The UI is simple and responsive, with forms to input text, Morse code, and encryption keys.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Installation](#installation)
4. [Running the Application](#running-the-application)
5. [Project Structure](#project-structure)
6. [Usage](#usage)
   - [Text to Morse Code](#text-to-morse-code)
   - [Morse Code to Text](#morse-code-to-text)
   - [AES Encryption](#aes-encryption)
   - [AES Decryption](#aes-decryption)
7. [Visual References](#visual-references)
   
---

## Features

This application provides the following features:

1. **Text to Morse Code**: Enter any text to be translated into Morse code.
2. **Morse Code to Text**: Input Morse code to translate it back to text.
3. **AES 256-bit Encryption**: Encrypt text with a key of any length using AES encryption (key is padded to 16, 24, or 32 bytes).
4. **AES Decryption**: Decrypt AES-encrypted text with the same key.

---

## Technologies Used

- **Java**: Backend logic using Spring Boot framework.
- **Spring Boot**: Simplified development of REST APIs and web applications.
- **Thymeleaf**: Server-side template engine for rendering HTML views.
- **AES 256-bit Encryption**: For secure encryption and decryption of text.
- **Bootstrap**: For simple and responsive styling of the frontend.

---

## Installation

To run this project locally, follow these steps:

### Prerequisites

- Java 11 or higher installed.
- Apache Maven installed.
- A modern web browser.

### Clone the Repository

```bash
git clone https://github.com/your-username/morse-code-aes-encryption.git
cd morse-code-aes-encryption
```

### Build and Package

```bash
mvn clean install
```

### Running the Application

```bash
mvn spring-boot:run
```

Alternatively, you can run the JAR file:

```bash
java -jar target/morse-code-aes-encryption-0.0.1-SNAPSHOT.jar
```

---

## Running the Application

Once the application is running, open a browser and navigate to:

```
http://localhost:8080
```

You will be presented with a simple web interface where you can:

- Convert text to Morse code.
- Convert Morse code back to text.
- Encrypt text using AES encryption.
- Decrypt AES-encrypted text.

---

## Project Structure

```
src/
└── main/
    ├── java/
    │   └── com/example/morsecode/
    │       ├── AES256Util.java              # Utility class for AES encryption/decryption
    │       ├── MorseCodeApplication.java    # Main Spring Boot application class
    │       ├── MorseCodeController.java     # Controller handling user requests
    │       └── MorseCodeTranslator.java     # Logic for converting text to/from Morse code
    ├── resources/
    │   ├── static/                          # Static resources (CSS, JS, etc.)
    │   └── templates/                       # Thymeleaf templates
    │       ├── index.html                   # Main page for input forms
    │       ├── result.html                  # Result page for text to Morse code conversion
    │       ├── morseToTextResult.html       # Result page for Morse code to text conversion
    │       ├── encryptedResult.html         # Result page for AES encryption
    │       └── decryptedResult.html         # Result page for AES decryption
    └── application.properties               # Application configuration file
```

---

## Usage

### 1. Text to Morse Code
To convert text to Morse code:

1. Open the web page.
2. Enter your text into the **Text to Morse Code** input field.
3. Click the **Translate to Morse Code** button.
4. The result will display the corresponding Morse code.

### 2. Morse Code to Text
To convert Morse code to text:

1. Input your Morse code (use `/` for spaces between words).
2. Click **Translate Morse to Text**.
3. The result will show the translated text.

### 3. AES Encryption
To encrypt text:

1. Enter the text you want to encrypt in the **AES Encryption** section.
2. Provide a key of any length (it will be padded to a valid AES length).
3. Click the **Encrypt Text** button to get the encrypted result.

### 4. AES Decryption
To decrypt text:

1. Enter the AES-encrypted text in the **AES Decryption** section.
2. Provide the same key used for encryption.
3. Click **Decrypt Text** to retrieve the original text.

---

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push the branch to your fork (`git push origin feature/new-feature`).
5. Open a Pull Request.

---
## Visual References
![sfsfd](https://github.com/user-attachments/assets/18ec52a9-2b5e-401b-87e0-b272f535fc4c)
![Screenshot 2024-10-24 021006](https://github.com/user-attachments/assets/3a377ecc-d1cd-4008-a5dd-2b84e0ca818e)
![photo_2024-10-24_02-28-52](https://github.com/user-attachments/assets/70f6beb4-d397-44c3-a133-809607668dd2)
![photo_2024-10-24_02-29-00](https://github.com/user-attachments/assets/d494eba7-2206-4ad8-8fc1-b40bd66d051b)
![photo_2024-10-24_02-28-39](https://github.com/user-attachments/assets/7efc46bd-cc1d-44e1-880e-60a7baeeb1f4)
![photo_2024-10-24_02-29-05](https://github.com/user-attachments/assets/8fa892de-333c-4b2d-a33f-4fb5644872a3)


---
---
 ### WayneCorp © 🦇 < Swapnil Mishra />
---

