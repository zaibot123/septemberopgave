
package com.company;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        boolean færdig = false;
        while (færdig == false) {

            System.out.println("Tryk 1 for valg af trekant, 2 for valg af cirkel,3 for valg af rektangel eller 4 for at afbryde valget");
            Scanner s = new Scanner(System.in);
            int valg = s.nextInt();

            Shapes Triangle, Circle, Rectangle;
            Triangle = new Triangle();
            Circle = new Circle();
            Rectangle = new Rectangle();

            switch (valg) {
                case 1:
                    Triangle.shapeNavn();
                    Triangle.shapeCalc();

                    break;
                case 2:
                    Circle.shapeNavn();
                    Circle.shapeCalc();

                    break;
                case 3:
                    Rectangle.shapeNavn();
                    Rectangle.shapeCalc();

                    ;
                    break;
                case 4:
                    færdig = true;
                    System.out.println("Du har nu afbrudt valget");
                    break;

            }
        }
    }
}
abstract class Shapes {

    abstract void shapeCalc();
    abstract void shapeNavn();

}

class Triangle extends Shapes{


    @Override
    void shapeCalc() {

        Scanner in = new Scanner(System.in);
        System.out.println("Skriv punkt A");
        System.out.println("X");

        int Ax = in.nextInt();
        System.out.println("Y");
        int Ay = in.nextInt();

        System.out.println("Skriv punkt B");
        System.out.println("X");
        int Bx = in.nextInt();
        System.out.println("y");
        int By = in.nextInt();

        System.out.println("Skriv punkt C");
        System.out.println("X");
        int Cx = in.nextInt();
        System.out.println("Y");
        int Cy = in.nextInt();


        System.out.println("Koordinaterne på de 3 punkter i trekanten er");
        System.out.println(Ax + "," + Ay);
        System.out.println(Bx + "," + By);
        System.out.println(Cx + "," + Cy);
    }

    void shapeNavn(){
        System.out.println("Du har valgt: Trekant");
    }
}

class Circle extends Shapes{
    @Override
    void shapeCalc() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("skriv radius på en cirkel");
        double radius= scanner.nextDouble();
        double areal=(22*radius*radius)/7 ;
        double omkreds =radius*2*3.14159;
        System.out.println("arealet af cirklen er " + areal);
        System.out.println("omkredsen af cirklen er " + omkreds);
    }
    void shapeNavn(){
        System.out.println("Du har valgt: Cirkel");
    }
}



class Rectangle extends Shapes{
    @Override
    void shapeCalc() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Skriv bredden på et rektangel");
        double bredde=scanner.nextInt();
        System.out.println("Skriv Højde på et rektangel");
        double højde=scanner.nextInt();
        double areal=bredde*højde;
        double omkreds= bredde*2+højde*2;
        System.out.println("areal af rektangel="+areal);
        System.out.println("omkreds af rektangel="+omkreds);

    }
    void shapeNavn(){
        System.out.println("Du har valgt: Rektangel");
    }
}


