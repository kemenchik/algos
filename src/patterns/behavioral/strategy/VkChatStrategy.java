package patterns.behavioral.strategy;

public class VkChatStrategy implements Strategy {

    private void getAccessCode() {
        System.out.println("Get access code vk");
    }

    private void createChat(String title) {
        System.out.println("create chat \"" + title + "\" in vk");
    }

    @Override
    public void execute(String title) {
        getAccessCode();
        createChat(title);
    }
}
