package com.adozgen.solid.isp.example1.bad;

public interface IDocumentProcessor {
    String convertToPDF(Document document);
    void printDocument(Document document);
    String translateDocument(Document document, String targetLanguage);
}
