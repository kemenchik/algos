package patterns.behavioral.strategy;

public class InternalChatStrategy implements Strategy {

    private void createChat(String title) {
        System.out.println("create chat \"" + title + "\"  in app");
    }


    @Override
    public void execute(String title) {
        createChat(title);
    }
}
