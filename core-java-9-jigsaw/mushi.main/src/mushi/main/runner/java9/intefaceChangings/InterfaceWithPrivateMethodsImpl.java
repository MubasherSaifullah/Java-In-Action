package mushi.main.runner.java9.intefaceChangings;

public class InterfaceWithPrivateMethodsImpl implements InterfaceWithPrivateMethods{
    @Override
    public void check() {
        InterfaceWithPrivateMethods.super.check();
    }
}
