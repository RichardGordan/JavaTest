package projectTwo;

public class Celsius implements Converter {
    double value;

    @Override
    public double getConvertedValue(double baseValue) {
        value = baseValue;
        return baseValue;
    }
}

