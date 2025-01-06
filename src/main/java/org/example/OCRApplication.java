package org.example;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class OCRApplication {

    public static void main(String[] args) {
        // Ubicación del archivo de imagen
        File imageFile = new File("C:\\Users\\DELL\\Desktop\\M2\\OCR-Text-Scanner-main\\src\\main\\resources\\TextPhoto.jpg"); // Şəkilin yolunu düzgün qeyd edin

        // Crea una instancia de Tesseract
        ITesseract tesseract = new Tesseract();


// Registra dónde está instalado Tesseract
        tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata"); // tessdata qovluğunun yeri
        tesseract.setPageSegMode(3); // Segmentación automática
        tesseract.setOcrEngineMode(1); // Modo LSTM
        tesseract.setTessVariable("user_defined_dpi", "300");
        //tesseract.setTessVariable("tessedit_char_whitelist", "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        // Selección de idioma (por ejemplo, "eng" para inglés)
        tesseract.setLanguage("eng");

        try {
            // Şəkildən mətn oxunur
            String result = tesseract.doOCR(imageFile);
            System.out.println("OCR Resultado: ");
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println("OCR se produjo un error durante: " + e.getMessage());
        }
    }
}