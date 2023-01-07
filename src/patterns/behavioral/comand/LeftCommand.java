package patterns.behavioral.comand;

public class LeftCommand implements Command {

    private Messenger messenger;

    public LeftCommand(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void execute() {
        messenger.leftGroup();
    }
}
