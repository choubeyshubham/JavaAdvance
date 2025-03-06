package StatmentMethod;

public class TeenNumberChecker {
    /*


     */

    public static void main(String[] args) {


    }

    public static boolean hasTeen(int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z);
    }


    public static boolean isTeen(int h) {
        return h >= 13 && h <= 19;
    }


}
