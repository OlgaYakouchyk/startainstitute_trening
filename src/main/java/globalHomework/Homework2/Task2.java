package globalHomework.Homework2;

public class Task2 {

    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");
        printMyString(myString);
        printMyString(String.valueOf(myString.charAt(18)));
        printMyString(String.valueOf(myString.contains("Java")));
        printMyString(myString.replace("a", "o"));
        printMyString(myString.toUpperCase());
        printMyString(myString.toLowerCase());
        printMyString(myString.substring(0,14));



    }

    public static void  printMyString (String myString){
        System.out.println(myString);

    }

}
