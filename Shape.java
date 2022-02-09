package com.company;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> pointArrayList;
    ArrayList<Double> pointDistance;
    private static int id_gen=0;
    private int id;
    public Shape(){
        id=id_gen++;
        pointArrayList = new ArrayList<>();
        pointDistance = new ArrayList<>();
    }

    public void addPoint(Point point){
        pointArrayList.add(point);
    }

    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }

    public Point getPoint(int index){
        return pointArrayList.get(index);
    }

    public void calcDistance(){
        int size = pointArrayList.size();
        for (int i = 0; i < size-1; i++) {
            pointDistance.add(i,pointArrayList.get(i).distance(pointArrayList.get(i+1)));
        }
        pointDistance.add(size-1,pointArrayList.get(size-1).distance(pointArrayList.get(0)));
    }
    public double calcPerimeter(){
        if(pointDistance.size()==0)
            calcDistance();
        double sum=0;
        for (Double pointDistances : pointDistance) {
            sum+=pointDistances;
        }
        return sum;
    }
    public double averageDistance(){
        return calcPerimeter()/ pointArrayList.size() ;
    }

    public double longestDistance(){
        double max = pointDistance.get(0);
        for(int i = 0; i<pointDistance.size(); i++ )
        {
        max = (max < pointDistance.get(i)  ? pointDistance.get(i) : max );
        }
        return max;
    }
}

