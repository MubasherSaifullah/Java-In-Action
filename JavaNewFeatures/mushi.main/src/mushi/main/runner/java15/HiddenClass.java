//package mushi.main.runner.java15;
//
//import java.lang.reflect.Lookup;
//
//public class HiddenClass {
//    public static void main(String[] args) throws Exception {
//        Lookup lookup = Lookup.lookupCaller();
//
//        // Create a hidden class
//        Class<?> hiddenClass = lookup.defineHiddenClass("com.example.HiddenClass", new byte[]{});
//
//        // Get an instance of the hidden class
//        Object hiddenInstance = hiddenClass.newInstance();
//
//        // Call a method on the hidden instance
//        hiddenClass.getMethod("print").invoke(hiddenInstance);
//    }
//}
