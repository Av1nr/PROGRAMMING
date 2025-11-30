public class Vector2D {
    private double x;
    private double y;

    public Vector2D(){
        this(0 , 0);
    }
    public Vector2D(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public Vector2D add(Vector2D vector){
        double newx = x + vector.getx();
        double newy = y + vector.gety();
        return new Vector2D(newx , newy);
    }
    public void add2(Vector2D vector){
        x += vector.getx();
        y += vector.gety();
        System.out.println("New x: " + x);
        System.out.println("New y: " + y);
    }
    public Vector2D sub(Vector2D vector){
        double newx = x - vector.getx();
        double newy = y - vector.gety();
        return new Vector2D(newx , newy);
    }
    public void sub2(Vector2D vector){
        x -= vector.getx();
        y -= vector.gety();
        System.out.println("New x: " + x);
        System.out.println("New y: " + y);
    }
    public Vector2D mult(double k){
        double newx = x * k;
        double newy = y * k;
        return new Vector2D(newx , newy);
    }
    public void mult2(double k){
        x *= k;
        y *= k;
        System.out.println("New x: " + x);
        System.out.println("New y: " + y);
    }
    @Override
    public String toString(){
        return "(" + x + "," +  y + ")";
    }
    
    public double sqrt(double Eps , double newx , double newy) {
        double x2y2 = newx*newx + newy*newy;
        if (x2y2 == 0 || x2y2 == 1) {
            return x2y2;
        }
        double left;
        double right;
        if (x2y2 < 1) {
            left = x2y2;
            right = 1;
        } else {
            left = 1;
            right = x2y2;
        }
        double middle;
        double approx;
        do {
            middle = left + (right - left) / 2;
            approx = middle * middle;
            if (approx > x2y2) {
                right = middle;
            } else {
                left = middle;
            }
        } while (Math.abs(approx - x2y2) > Eps);
        return middle;
    }
    public double scalarProduct(Vector2D vector){
        double scalar = x * vector.getx() + y * vector.gety();
        return scalar;
    }
    public boolean equals(Vector2D vector){
        return (x == vector.getx() && y == vector.gety());
    }
    public double cos(Vector2D vector){
        double up = scalarProduct(vector);
        double down = sqrt(0.0001 , x , y) * sqrt(0.0001 , vector.getx() , vector.gety());
        if (down != 0){
            return up / down;
        }
        else{
            return 0;
        }
    }
    public double length(){
        return sqrt(0.0001 , x , y);
    }
}
