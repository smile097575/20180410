public class Trapezoidal extends Shape {
    public Trapezoidal(int u, int d, int h1) {
        if (u > 0 && d > 0 && h1 > 0) {
            up = u ;
            down = d;
            h = h1;
            area = (up + down)*h/2;
            trape++;
        }else {
            System.out.println("錯誤");
        }
    }
    @Override
    public int getTrape(){
        return super.getTrape();
    }
    @Override
    public double getArea(){
        return super.getArea();
    }
}
