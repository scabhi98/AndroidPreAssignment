public class PitotTube extends SpeedConverter{

    @Override
    boolean isFast(double speed) {
        System.out.println("PitotTube isFast called.");
        return speed > 1234.8;
    }

    @Override
    public Object convert(Object object) {
        System.out.println("PitotTube convert called.");
        double kms = Double.parseDouble(object.toString());
        return (double) kms/1234.8;
    }
    
}