import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入矩形的一条边长：");
        Double lenth=scanner.nextDouble();
        System.out.println("请输入矩形的另外一条边长：");
        Double width=scanner.nextDouble();
        Double area=lenth*width;
        System.out.println("所求矩形的面积是："+area);

    }
}
	