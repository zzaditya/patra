public class prime {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(a[i]);
            }

        }
    }
}
