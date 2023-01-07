package patterns.behavioral.strategy;

public class ChatCreator {

    private Strategy strategy;

    public ChatCreator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy){
        this.strategy= strategy;
    }

    public void createChat(String title){
        strategy.execute(title);
    }

}
