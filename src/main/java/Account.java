import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh bac 2");
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double dental = quadraticEquation.getDiscriminant();
        if(dental < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(dental == 0) {
            System.out.println("Phuong trinh co 1 nghiem la: "+ quadraticEquation.getRoot1());;
        } else {
            System.out.println("Phuong trinh co nghiem 1 la: " + quadraticEquation.getRoot1());
            System.out.println("Phuong trinh co nghiem 2 la: " + quadraticEquation.getRoot2());
        }
    }
}
