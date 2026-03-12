public class prime2 {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;

        for (int i = a; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
