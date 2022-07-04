package projectTwo;

public class baseConverter {
    public static void main(String[] args) {
        double t = 33.3;
        System.out.println("t" + new Celsius().getConvertedValue(t));
        System.out.println("t" + new Kelvin().getConvertedValue(t));
        System.out.println("t" + new Farenheit().getConvertedValue(t));

    }




}
