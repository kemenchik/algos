package patterns.behavioral.comand;

public class JoinCommand implements Command {

    private Messenger messenger;

    public JoinCommand(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void execute() {
        messenger.joinGroup();
    }
    }
