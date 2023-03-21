public class ChangeContrastCommand extends AbstractUndoableCommand {
    private float contrast;
    private float prevContrast;
    public ChangeContrastCommand(VideoEditor videoEditor, float contrast, History history) {
        super(videoEditor, history);
        this.contrast = contrast;
        prevContrast = videoEditor.getContrast();
    }
    @Override
    public void doExecute() {
        videoEditor.setContrast(contrast);
    }
    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    } 
}
