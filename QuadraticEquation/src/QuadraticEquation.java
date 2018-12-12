import java.util.Scanner;

class Account{
    private double a,b,c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }

    public double getRoot1(){
        double root1= (-this.b+ java.lang.Math.sqrt((this.b*this.b)-4*this.a*this.c))/(2*this.a);
        return root1;
    }

    public double getRoot2(){
        double root2= (-this.b- java.lang.Math.sqrt((this.b*this.b)-4*this.a*this.c))/(2*this.a);
        return root2;
    }
}
public class QuadraticEquation {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        account.setA(scanner.nextDouble());
        System.out.println("Enter b: ");
        account.setB(scanner.nextDouble());
        System.out.println("Enter c: ");
        account.setC(scanner.nextDouble());

        double delta =  account.getDiscriminant();
        if(delta>=0){
            System.out.println("The equation have two roots "+account.getRoot1()+" and "+account.getRoot2());
        }
        else if(delta==0){
            System.out.println("The equation have one root "+account.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}

/*
@startuml
Bob -> Alice : helloooo
@enduml
*/

