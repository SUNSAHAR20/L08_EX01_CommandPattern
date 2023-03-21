public class Demo {
    public static void main(String[] args){
        VideoEditor videoEditor = new VideoEditor();
        History history = new History();

        // set text command
        AddLabelCommand setTextCommand = new AddLabelCommand(videoEditor, "Video Title", history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor); // VideoEditor{contrast=0.5, text='First Command'}

        // set contrast command
        ChangeContrastCommand setContrastCommand = new ChangeContrastCommand(videoEditor, 1.0f, history);
        setContrastCommand.execute();
        System.out.println("CONTRAST: " + videoEditor); // VideoEditor{contrast=0.8, text='First Command'}

        // set undo command
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor); // VideoEditor{contrast=0.8, text='First Command'}

        // undo the previous command
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor); // VideoEditor{contrast=0.8, text='First Command'}

        // undo the previous command
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor); // VideoEditor{contrast=0.8, text='First Command'}
    }
}
