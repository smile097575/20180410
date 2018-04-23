public class Shape {
    protected int r, length, width, a, b, up, down, h;
    protected double area, angle;
    public static int cir, squr, tri, trape;
    private int sum;

    public Shape() {
    }

    public int getCir() {
        return cir;
    }

    public int getSqur() {
        return squr;
    }

    public int getTri() {
        return tri;
    }

    public int getTrape() {
        return trape;
    }

    public double getArea() {
        return area;
    }

    public int getSum() {
        sum = cir + squr + tri + trape;
        return sum;
    }
}
