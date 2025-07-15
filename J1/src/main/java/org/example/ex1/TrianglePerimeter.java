package org.example.ex1;

public class TrianglePerimeter {
    Pair[] pair = new Pair[3];
    public static int counter;

    static {
        counter = 0;
    }

    public TrianglePerimeter() {}

    public void executeProcessing(double x, double y) {
        pair[counter] = new Pair(x, y);
        counter++;
    }

    public void print() {
        for(int i = 0; i < counter; i++) {
            System.out.println(pair[i].getX() + " " + pair[i].getY());
        }
    }

    public boolean isTriangle() {
        return Math.abs((pair[counter - 3].getX() * (pair[counter - 2].getY() - pair[counter - 1].getY()) +
                pair[counter - 2].getX() * (pair[counter - 1].getY() - pair[counter - 3].getY()) +
                pair[counter - 1].getX() * (pair[counter - 1].getY() - pair[counter - 2].getY()))) > 0;
    }

    public double calculate() {
        Pair pairAB;
        Pair pairBC;
        Pair pairAC;

        pairAB = new Pair(pair[counter - 2].getX() - pair[counter - 3].getX(),
                pair[counter - 2].getY() - pair[counter - 3].getY());

        pairBC = new Pair(pair[counter - 1].getX() - pair[counter - 2].getX(),
                pair[counter - 1].getY() - pair[counter - 2].getY());

        pairAC = new Pair(pair[counter - 1].getX() - pair[counter - 3].getX(),
                pair[counter - 1].getY() - pair[counter - 3].getY());

        double ab = Math.sqrt(Math.pow(pairAB.getX(), 2) + Math.pow(pairAB.getY(), 2));
        double bc = Math.sqrt(Math.pow(pairBC.getX(), 2) + Math.pow(pairBC.getY(), 2));
        double ac = Math.sqrt(Math.pow(pairAC.getX(), 2) + Math.pow(pairAC.getY(), 2));

        return ab + bc + ac;
    }
}
