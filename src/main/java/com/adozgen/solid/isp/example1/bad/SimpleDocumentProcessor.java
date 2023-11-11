package com.adozgen.solid.isp.example1.bad;

public class SimpleDocumentProcessor implements IDocumentProcessor {

    @Override
    public String convertToPDF(Document document) {
        // PDF dönüşüm mantığı
        return "converted.pdf";
    }

    @Override
    public void printDocument(Document document) {
        // Belgeyi yazdırma mantığı
    }

    @Override
    public String translateDocument(Document document, String targetLanguage) {
        throw new UnsupportedOperationException("Translation not supported.");
    }
}
