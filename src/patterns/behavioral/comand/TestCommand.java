package patterns.behavioral.comand;

public class TestCommand {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Command joinCom = new JoinCommand(messenger);
        Command leftCom = new LeftCommand(messenger);
        Invoker invoker = new Invoker();
        invoker.execute(joinCom);
        invoker.execute(leftCom);

    }

}
