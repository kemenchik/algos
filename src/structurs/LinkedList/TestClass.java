package structurs.LinkedList;

public class TestClass {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.addToTheEnd(1);
        list.addToTheEnd(2);
        list.addToTheEnd(3);
        list.addToTheEnd(4);
        list.addToTheEnd(5);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.reverse();

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
