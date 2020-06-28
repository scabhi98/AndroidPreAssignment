public class ShaftLog extends SpeedConverter {

    @Override
    public Object convert(Object object) {
        System.out.println("ShaftLog convert called.");
        double v = Double.parseDouble(object.toString());
        return (double) v/1.609;
    }

    @Override
    boolean isFast(double speed) {
        System.out.println("ShaftLog isFast called.");
        return speed > 62.1371;
    }
    
}