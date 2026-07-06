import java.util.Scanner;

public class token {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String arr[] = s.split("[ !,?._'@]+");

        System.out.println(arr.length);

        for (String word : arr) {
            System.out.println(word);
        }
    }
}