package patterns.creational.singletons;

public class Singletons {

    public static class OrdinarySingleton {
        private static OrdinarySingleton singleton;

        private OrdinarySingleton() {
        }

        public static OrdinarySingleton getSingleton() {
            if (singleton == null) {
                singleton = new OrdinarySingleton();
            }
            return singleton;
        }

    }

    public static class LazyInstSingleton {

        private LazyInstSingleton() {
        }

        private static class SingletonInst {
            private static final LazyInstSingleton singleton = new LazyInstSingleton();

            public static LazyInstSingleton returnSingleton() {
                return singleton;
            }
        }

        public static LazyInstSingleton getSingleton() {
            return SingletonInst.returnSingleton();
        }

    }

    public static class DoubleCheckSingleton {
        private static volatile DoubleCheckSingleton singleton;

        private DoubleCheckSingleton() {
            System.out.println("inside Singleton");
        }

        public static DoubleCheckSingleton getSingleton() {
            if (singleton == null) {
                synchronized (Singletons.class) {
                    if (singleton == null) {
                        singleton = new DoubleCheckSingleton();
                    }
                }
            }
            return singleton;
        }
    }

    public static class MultithreadingSingleton {
        private static MultithreadingSingleton singleton;

        private MultithreadingSingleton() {
        }

        public static MultithreadingSingleton getSingleton() {
            synchronized (MultithreadingSingleton.class) {
                if (singleton == null) {
                    singleton = new MultithreadingSingleton();
                }
                return singleton;
            }
        }


    }
}

