import java.util.Scanner;

public class mainShape {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Shape shape = new Shape();
        boolean flag = true;
        while (flag) {
            System.out.println("1.建立圓形");
            System.out.println("2.建立矩形");
            System.out.println("3.建立三角形");
            System.out.println("4.建立梯形");
            System.out.println("5.顯示共建立了幾個物件");
            System.out.println("6.END");
            int op = scn.nextInt();
            switch (op) {
                case 1:
                    System.out.println("請輸入半徑");
                    Circle cir = new Circle(scn.nextInt());
                    System.out.println(cir.getArea());
                    break;
                case 2:
                    System.out.println("請輸入長寬");
                    Square sq = new Square(scn.nextInt(),scn.nextInt());
                    System.out.println(sq.getArea());
                    break;
                case 3:
                    System.out.println("請輸入a,b,角度");
                    Triangle tria = new Triangle(scn.nextInt(), scn.nextInt(), scn.nextInt());
                    System.out.println(tria.getArea());
                    break;
                case 4:
                    System.out.println("請輸入上底,下底,高");
                    Trapezoidal trape = new Trapezoidal(scn.nextInt(), scn.nextInt(), scn.nextInt());
                    System.out.println(trape.getArea());
                    break;
                case 5:
                    System.out.println("圓形" + shape.getCir());
                    System.out.println("矩形" + shape.getSqur());
                    System.out.println("三角形" + shape.getTri());
                    System.out.println("梯形" + shape.getTrape());
                    System.out.println("共建立" + shape.getSum() + "個物件");
                    break;
                case 6:
                    System.out.println("結束程序");
                    flag = false;
                    break;
            }
            System.out.println("------------------------------");
        }
    }

}

