package StatmentMethod;

public class SpeedConvertor {
    public static void main(String[] args) {



    }

    public static long toMilesPerHour(double kmPerHour){
        if (kmPerHour < 0) {
            return -1;
        }
        return Math.round(kmPerHour/1.609);
    }

    public static void printConversion(double kmPerHour){
        if (kmPerHour<0){
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour=toMilesPerHour(kmPerHour);
        System.out.println(kmPerHour+ " km/h = "+milesPerHour+" mi/hr");
    }


}
