package com.adozgen.solid.isp.example1.good;

import com.adozgen.solid.isp.example1.bad.Document;

public class SimpleDocumentProcessor implements IDocumentConverter, IDocumentPrinter {

    @Override
    public String convertToPDF(Document document) {
        // PDF dönüşüm mantığı
        return "converted.pdf";
    }

    @Override
    public void printDocument(Document document) {
        // Belgeyi yazdırma mantığı
    }
}