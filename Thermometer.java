public class Thermometer extends TemperatureConverter {

    @Override
    public Object convert(Object object) {
        System.out.println("Thermometer convert called.");
        double c = Double.parseDouble(object.toString());
        return (double) (c * 9 / 5) + 32;
    }

    @Override
    boolean isHot(double temp) {
        System.out.println("Thermometer isHot called.");
        return temp > 212;
    }
    
}