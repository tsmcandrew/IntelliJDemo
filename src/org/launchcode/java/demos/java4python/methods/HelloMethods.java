package org.launchcode.java.demos.java4python.methods;

/**
 * Created by LaunchCode
 */
public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("fr");
        System.out.println(message);
        String msg = "Hello World";
        for (char c : msg.toCharArray()) System.out.println(c);
    }
}
