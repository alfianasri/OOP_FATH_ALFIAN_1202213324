package MODUL3_ALFIAN;

public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;
    
    @Override
    public void run() {
        System.out.println("--- Program will start in ---");
        for (int i = 3; i <= 3; i--) {
            try {
                System.out.println("Starting with thread"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                
        }
    }

    public void setSquare(double side) {
        double squareArea = side*side;
        try {
            if (side < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.area = squareArea;
    }

    public double getSquare() {
        return area;
    }

    public void setCircle(double radius, double phi) {
        double circleArea = phi*(radius*radius);
        try {
            if (side < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.area = circleArea;
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        double trapezoidArea = (a+b)*t;
        try {
            if (side < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.area = trapezoidArea;
    }

    public double getTrapezoid() {
        return area;
    }
}   