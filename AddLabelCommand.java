public class AddLabelCommand extends AbstractUndoableCommand {
    private String text;
    public AddLabelCommand(VideoEditor videoEditor, String text, History history) {
        super(videoEditor, history);
        this.text = text;
    }
    @Override
    public void doExecute() {
        videoEditor.setText(text);
    }
    @Override
    public void undo() {
        videoEditor.removeText();
    } 
}
