public class PitotTube extends SpeedConverter{

    @Override
    boolean isFast(double speed) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object convert(Object object) {
        double v = Double.parseDouble(object.toString());
        return v;
    }
    
}