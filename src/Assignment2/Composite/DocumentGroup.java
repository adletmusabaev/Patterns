package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Class to manage groups of documents (categories)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Task: Implement methods to add and remove documents from the group,
    // as well as display all documents in the group through the display() method.

    // Add a document to the group
    public void addDocument(Document document) {
        documents.add(document);
    }

    // Remove a document from the group
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    // Display all documents in the group
    @Override
    public void display() {
        for (Document doc : documents) {
            doc.display();  // Delegate the display to each document in the group
        }
    }

    @Override
    public void open() {

    }
}