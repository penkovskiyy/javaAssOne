package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException  {
        Shape s1 = new Shape();
        Scanner sc1 = new Scanner(new File("C:\\Users\\ertug\\Desktop\\file1.txt"));
        Shape s2 = new Shape();
        Scanner sc2 = new Scanner(new File("C:\\Users\\ertug\\Desktop\\file2.txt"));
        int x, y;
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point p = new Point(x, y);
            s1.addPoint(p);}

        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point p = new Point(x, y);
            s2.addPoint(p);
        }
        s1.calcDistance();
        s2.calcDistance();
        System.out.println("1st shape's perimeter: " + s1.calcPerimeter());
        System.out.println("length of longest side: " + s1.longestDistance());
        System.out.println("Average length of 1st shape: " + s1.averageDistance());
        System.out.println("2nd shape's perimeter: " + s2.calcPerimeter());
        System.out.println("length of longest side: " + s2.longestDistance());
        System.out.println("Average length of 2nd shape: " + s2.averageDistance());

    }
}
//ending here