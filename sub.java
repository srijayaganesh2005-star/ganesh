public class sub {
    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {

            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0)
                smallest = sub;

            if (sub.compareTo(largest) > 0)
                largest = sub;
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}