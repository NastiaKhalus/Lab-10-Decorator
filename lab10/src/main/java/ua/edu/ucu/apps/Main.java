package ua.edu.ucu.apps;
import ua.edu.ucu.apps.decorator.CachedDocument;
import ua.edu.ucu.apps.decorator.MockedDocument;
import ua.edu.ucu.apps.decorator.TimeDocument;

public class Main {
    public static void main(String[] args) {
        MockedDocument mockedDocument = new MockedDocument("path");
        TimeDocument timeDocument = new TimeDocument(mockedDocument);

        System.out.println(timeDocument.parse());
        CachedDocument cachedDocument = new CachedDocument (mockedDocument);
        System.out.println(cachedDocument.parse());
    }
}