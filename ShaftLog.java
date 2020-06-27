public class ShaftLog extends SpeedConverter {

    @Override
    public Object convert(Object object) {
        double v = Double.parseDouble(object.toString());
        return v;
    }

    @Override
    boolean isFast(double speed) {
        return speed > 100 ;
    }
    
}