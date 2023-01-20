public class compoundInterest {
    public static void main(String[] args) {
        double amt;
        double princ = 10000;
        double rate = 0.01;

        for (int day=1; day<=20; day++){
            amt = princ*Math.pow(1+rate, day);
            System.out.println(day+ " : "+ amt);
        }
    }
}
