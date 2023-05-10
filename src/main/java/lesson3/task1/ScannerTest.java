package lesson3.task1;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String world = scanner.nextLine();

        //System.out.println(world + " my friend");
        System.out.println("You enter: " + world);
    }
}
