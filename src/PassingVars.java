public class PassingVars {
    public static double adder (int x) {
        x = x+1;
        return x;
    }
    public static void main(String[] args) {
        int x =1;
        double y = adder((int) (adder(x) + adder(x) + adder(x)));
        System.out.println(y);
    }
}
