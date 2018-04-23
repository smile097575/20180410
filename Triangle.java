public class Triangle extends Shape {
    public Triangle(int a1, int b1, double angle1) {
        if (a > 0 && b > 0 && angle <= 180) {
            a = a1;
            b = b1;
            angle = angle1;
            area = a * b * Math.sin(angle);
            tri++;
        }else {
            System.out.println("錯誤");
        }
    }
    @Override
    public int getTri(){
        return super.getTri();
    }
    @Override
    public double getArea(){
        return super.getArea();
    }
}
