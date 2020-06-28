import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter;
        ShaftLog shaftLog = new ShaftLog();
        PitotTube pitotTube = new PitotTube();
        Thermocouple thermocouple = new Thermocouple();
        Thermometer thermometer = new Thermometer();
        Random r = new Random(System.currentTimeMillis());

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        double value;
        while(choice != 0){
            System.out.println("1. Thermometer\n2. Thermocouple\n3. Shaftlog\n4. PitotTube\n");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            try {
                switch(choice){
                    case 1:
                        converter = thermometer;
                        value = r.nextDouble()*1000;
                        System.out.println("Thermometer: Converter output: "+converter.convert(value));
                        // System.out.println("OnConverterRef: isHot? "+converter.isHot(value));
                        System.out.println("Thermometer: isHot? "+ ((Thermometer)converter).isHot(value));
                    break;
                    case 2:
                        converter = thermocouple;
                        value = r.nextDouble()*1000;
                        System.out.println("Thermocouple: Converter output: "+converter.convert(value));
                        // System.out.println("OnConverterRef: isHot? "+converter.isHot(value));
                        System.out.println("Thermocouple: isHot? "+ ((Thermocouple)converter).isHot(value));
                    break;
                    case 3:
                        converter = shaftLog;
                        value = r.nextDouble()*1000;
                        System.out.println("ShaftLog: Converter output: "+converter.convert(value));
                        // System.out.println("OnConverterRef: isFast? "+converter.isFast(value));
                        System.out.println("ShaftLog: isFast? "+ ((ShaftLog)converter).isFast(value));
                    break;
                    case 4:
                        converter = pitotTube;
                        value = r.nextDouble()*1000;
                        System.out.println("PitotTube: Converter output: "+converter.convert(r.nextDouble()));
                        // System.out.println("OnConverterRef: isFast? "+converter.isFast(value));
                        System.out.println("PitotTube: isFast? "+ ((PitotTube)converter).isFast(value));
                    break;
                    case 5:
                        converter = thermometer;
                        value = r.nextDouble();
                        System.out.println("Thermometer: Converter: "+converter.convert(value));
                        System.out.println("Thermometer: isHot? "+((Thermometer)converter).isHot(value));
                        System.out.println("TemperatureConverter: isHot? "+((TemperatureConverter)converter).isHot(value));
                        System.out.println("PitotTube: isFast? "+((Thermocouple)converter).isHot(value));
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
    
}