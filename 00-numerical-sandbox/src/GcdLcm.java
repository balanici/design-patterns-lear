public class GcdLcm {

    public static void main(String[] args) {

        System.out.println(gcd(10, 24));
        System.out.println(gcd(12, 24));
        System.out.println(gcd(11, 24));

        System.out.println();
        System.out.println(lcm(3, 4));
        System.out.println(lcm(3, 9));
        System.out.println(lcm(5, 12));

    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
