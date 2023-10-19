package mushi.main.runner.java9.intefaceChangings;

public interface InterfaceWithPrivateMethods {
    private static String staticPrivate() {
        return "Called static private method from the default method of interface";
    }

    private String instancePrivate() {
        return "Called instance private method from the default method of interface";
    }

    default void check() {
        System.out.println(staticPrivate());
        InterfaceWithPrivateMethods pvt = new InterfaceWithPrivateMethods() {
            // anonymous class
        };
        System.out.println(pvt.instancePrivate());
    }
}
