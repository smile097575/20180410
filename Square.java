public class Square extends Shape {
    public Square(int l, int w) {
        if (l > 0 && w > 0) {
            length = l;
            width = w;
            area = length*width;
            squr++;
        }else {
            System.out.println("錯誤");
        }
    }
    @Override
    public double getArea(){
        return super.getArea();
    }
    @Override
    public int getSqur(){
        return super.getSqur();
    }
}
