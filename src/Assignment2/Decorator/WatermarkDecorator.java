package Assignment2.Decorator;

import Assignment2.Document;

// Decorator for adding a watermark to the document
public class WatermarkDecorator extends DocumentDecorator {

    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Task: Implement the logic that first displays the document, then adds a watermark
    @Override
    public void display() {
        // First display the original document
        decoratedDocument.display();

        // Then add the watermark
        addWatermark();
    }

    @Override
    public void open() {

    }

    // Method to add the watermark
    private void addWatermark() {
        System.out.println("Adding watermark to the document.");
    }
}