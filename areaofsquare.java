import java.util.Scanner;
class areasq{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
    int area = side*side;
    System.out.println("area of square is:" + area);
}
}