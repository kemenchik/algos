package patterns.behavioral.comand;

public class Invoker {

    public Invoker() {
    }

    public void execute(Command command){
        command.execute();
    }
}
