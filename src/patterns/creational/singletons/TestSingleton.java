package patterns.creational.singletons;

public class TestSingleton {

    public static void main(String[] args) {
        Singletons.OrdinarySingleton ordinarySingleton1 = Singletons.OrdinarySingleton.getSingleton();
        Singletons.OrdinarySingleton ordinarySingleton2 = Singletons.OrdinarySingleton.getSingleton();
        System.out.println(ordinarySingleton1.hashCode()+" & "+ordinarySingleton2.hashCode());

        Singletons.LazyInstSingleton lazyInstSingleton1 = Singletons.LazyInstSingleton.getSingleton();
        Singletons.LazyInstSingleton lazyInstSingleton2 = Singletons.LazyInstSingleton.getSingleton();
        System.out.println(lazyInstSingleton1.hashCode()+" & "+lazyInstSingleton2.hashCode());

        Runnable task = new TaskWithSingleton();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();



    }

}
