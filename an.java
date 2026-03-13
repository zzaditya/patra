public class an {

    // private variables
    private int a = 10;

    // default variable
    int b = 20;

    // protected variable
    protected int c = 30;

    // public variable
    public int d = 40;

    // private method
    private int addPrivate() {
        return a + b;
    }

    // default method
    int addDefault() {
        return b + c;
    }

    // protected method
    protected int addProtected() {
        return c + d;
    }

    // public method
    public int addPublic() {
        return a + d;
    }

    // method overloading
    public double addpublic(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        an obj = new an();

        // Accessing methods
        System.out.println("Private Addition: " + obj.addPrivate());
        System.out.println("Default Addition: " + obj.addDefault());
        System.out.println("Protected Addition: " + obj.addProtected());
        System.out.println("Public Addition: " + obj.addPublic());
        System.out.println("Public Addition: " + obj.addpublic( double x, double y));
        /*
                                                                   * System.out.println("Public Addition: " +
                                                                   * obj.addpublic(a, b));
                                                                   * System.out.println("Public Addition: " +
                                                                   * obj.addpublic(a, b, c));
                                                                   * System.out.println("Public Addition: " +
                                                                   * obj.addpublic(a, b));
                                                                   * System.out.println("Public Addition: " +
                                                                   * obj.addpublic(a, b, c));
                                                                   */
    }
}
