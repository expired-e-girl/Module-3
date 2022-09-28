public class PassingVarsToo {
    public static double adder (int x) {
        x = x+1;
        return x;
    }
    public static void main(String[] args) {
        int x =1;
        /*
        example of erroneous code
        double y = adder(adder(x) + adder(x) + adder(x));
        Here the adder is passed a double by the y declaration and it expects an int so code generates error
        */
        double y = adder(x);
        System.out.println(y);
    }
}
