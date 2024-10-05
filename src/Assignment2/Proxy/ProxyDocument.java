package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Proxy for lazy loading of the document
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // Logic to create the document only on the first call to display()
    @Override
    public void display() {
        // Check if the real document has not been instantiated yet
        if (realDocument == null) {
            // Create the RealDocument only when needed
            realDocument = new RealDocument(title);
        }
        // Delegate the display call to the RealDocument
        realDocument.display();
    }

    @Override
    public void open() {

    }
}
