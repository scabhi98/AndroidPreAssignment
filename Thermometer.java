public class Thermometer extends TemperatureConverter {

    @Override
    public Object convert(Object object) {
        double v = Double.parseDouble(object.toString());
        return v;
    }

    @Override
    boolean isHot(double temp) {
        // TODO Auto-generated method stub
        return false;
    }
    
}