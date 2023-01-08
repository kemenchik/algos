package patterns.behavioral.strategy;

public class TelegramChatStrategy implements Strategy {

    private void getAccessCode() {
        System.out.println("Get access code tg");
    }

    private void createChat(String title) {
        System.out.println("create chat  \"" + title + "\" in tg");
    }

    private void addBot() {
        System.out.println("add bot to chat");
    }

    @Override
    public void execute(String title) {
        getAccessCode();
        createChat(title);
        addBot();
    }
}
