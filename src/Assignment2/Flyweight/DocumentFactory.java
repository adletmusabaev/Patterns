package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;

import java.util.HashMap; // Import HashMap
import java.util.Map; // Import Map

// Factory for creating and reusing documents
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Method to get a document by its title
    public static Document getDocumentByTitle(String title) {
        // Check if the document already exists in the map
        Document document = documentMap.get(title);

        // If the document doesn't exist, create a new one
        if (document == null) {
            document = createDocument(title);
            documentMap.put(title, document); // Store the newly created document in the map
        }

        return document; // Return the existing or newly created document
    }

    // Helper method to create a new document
    private static Document createDocument(String title) {
        // For simplicity, assuming all documents are of the same type
        return new RealDocument(title); // Ensure RealDocument implements Document
    }
}