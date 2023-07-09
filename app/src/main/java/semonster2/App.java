/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import java.util.LinkedList;
import java.util.Random;

public class App {
    final static Random random = new Random();
    final static int maxRandomNumber = 4;

    public String getGreeting() {
        return "こんにちは SEMonster";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static LinkedList<Integer> createRandomList(int count) {
        LinkedList<Integer> randNumList = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            randNumList.add(random.nextInt(maxRandomNumber + 1));
        }

        return randNumList;
    }
}
