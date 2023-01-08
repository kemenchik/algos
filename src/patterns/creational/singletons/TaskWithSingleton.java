package patterns.creational.singletons;

public class TaskWithSingleton implements Runnable{

    @Override
    public void run() {
        Singletons.MultithreadingSingleton singleton = Singletons.MultithreadingSingleton.getSingleton();
        System.out.println(singleton.hashCode());
    }
}
