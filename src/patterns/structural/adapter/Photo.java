package patterns.structural.adapter;

public class Photo implements Post{
    @Override
    public void load() {
        System.out.println("New photo already on the wall");
    }
}
