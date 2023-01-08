package patterns.behavioral.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        ChatCreator chatCreator = new ChatCreator(new InternalChatStrategy());
        chatCreator.createChat("HB");
        System.out.println("\n  Need chat in vk");
        chatCreator.changeStrategy(new VkChatStrategy());
        chatCreator.createChat("HB in vk");
        System.out.println("\n  Need chat in tg");
        chatCreator.changeStrategy(new TelegramChatStrategy());
        chatCreator.createChat("HB in tg");
    }

}
