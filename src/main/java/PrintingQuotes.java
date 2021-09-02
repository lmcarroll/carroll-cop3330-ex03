import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.println("Who said it?");
        input = new Scanner(System.in);
        String who = input.nextLine();

        System.out.println(who + " says " + "\"" + quote + "\"");
    }

}
