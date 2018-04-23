public class Circle extends Shape {
    public Circle(int r1) {
        if (r1>0){
            r=r1;
            area = (r*r*Math.PI);
            cir++;
        }else {
            System.out.println("錯誤");
        }
    }
    @Override
    public int getCir(){
        return super.getCir();
    }
    @Override
    public double getArea(){
        return super.getArea();
    }
}
