public class Thermocouple extends TemperatureConverter {

    @Override
    public Object convert(Object object) {
        System.out.println("Thermocouple convert called.");
        double f = Double.parseDouble(object.toString());
        return (double)(f+273);
    }

    @Override
    boolean isHot(double temp) {
        System.out.println("Thermocouple isHot called.");
        return temp > 100;
    }
    
}