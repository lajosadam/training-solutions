package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(){
        double result = Math.sqrt(Math.abs(x) + Math.abs(y));
        return result;
    }
}
