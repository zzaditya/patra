package java;

/*string palindrome */
public class main {
    public static void main(String args[]) {
        System.out.println("hello world");
        String str = "hello";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(n - i - 1)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }
        }

    }

}