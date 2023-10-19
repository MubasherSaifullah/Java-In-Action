package mushi.main.runner;

import mushi.main.runner.java9.intefaceChangings.InterfaceWithPrivateMethodsImpl;
import mushi.util.Print;
//import mushi.util.internal.Notification;

public class MainRunner {
    public static void main(String[] args) {
        /**
         * +++++++++++++++++++++++++++++++++++++++++++++++++++ JAVA 9 +++++++++++++++++++++++++++++++++++++++++++++++++++
         * */

        Print print = new Print();
//         Notification notification; //-- This is not possible because this is another package if
        /**
         * If you want to do above you would have to add above file package in module-info.java file
         * */
        System.out.println("I'm MainRunner class and sending message");
//        print.sentMessage("Hello How are you doing guys");
//
//
//        /**
//         * Interface private methods
//         * */
//       new InterfaceWithPrivateMethodsImpl().check();
//        /**
//         * +++++++++++++++++++++++++++++++++++++++++++++++++++ JAVA 10 +++++++++++++++++++++++++++++++++++++++++++++++++++
//         * */
//
//        var message = "string";
//        System.out.println("value of message" + message);
    }
}