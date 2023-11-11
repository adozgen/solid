package com.adozgen.solid.isp.example1.good;

import com.adozgen.solid.isp.example1.bad.Document;

public interface IDocumentTranslator {
    String translateDocument(Document document, String targetLanguage);
}
