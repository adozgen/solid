package com.adozgen.solid.isp.example1.good;

import com.adozgen.solid.isp.example1.bad.Document;

public interface IDocumentConverter {
    String convertToPDF(Document document);
}
