package Assignment2;

// Real document that requires loading
public  class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk(); // Load the document when it's instantiated
    }

    private void loadFromDisk() {
        // Output message about loading the document
        System.out.println("Loading document: " + title);
    }

    @Override
    public void display() {
        // Output message about displaying the document
        System.out.println("Displaying document: " + title);
    }

    @Override
    public void open() {

    }
}