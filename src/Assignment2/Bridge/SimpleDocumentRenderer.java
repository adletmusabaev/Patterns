package Assignment2.Bridge;

// Implementation of document rendering using the selected engine
public class SimpleDocumentRenderer extends DocumentRenderer {

    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {

    }

    // Task: Implement the rendering of the document using the passed engine
    @Override
    public void renderDocument(String content) {
        // Call the render method of the RenderEngine (which can be SimpleRenderEngine or HighlightRenderEngine)
        engine.render(content);
    }
}