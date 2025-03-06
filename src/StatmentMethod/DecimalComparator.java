package StatmentMethod;

public class DecimalComparator {

    /*


     */
    public static void main(String[] args) {


    }

    public static boolean areEqualByThreeDecimalPlaces(double xd, double yd){

        long w = (long) (xd * 1000d);
        long q = (long) (yd * 1000d);

        return w == q;
    }

}
