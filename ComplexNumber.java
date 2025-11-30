public class ComplexNumber {
    //Вещественная часть
    private double x;
    //Мнимая
    private double y;
    public ComplexNumber(){
        this(0 , 0);
    }
    public ComplexNumber(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public ComplexNumber add(ComplexNumber complex){
        double newx = x + complex.getx();
        double newy = y + complex.gety();
        return new ComplexNumber(newx , newy);
    }
    public void add2(ComplexNumber complex){
        x += complex.getx();
        y += complex.gety();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    public ComplexNumber sub(ComplexNumber complex){
        double newx = x - complex.getx();
        double newy = y - complex.gety();
        return new ComplexNumber(newx , newy);
    }
    public void sub2(ComplexNumber complex){
        x -= complex.getx();
        y -= complex.gety();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    public ComplexNumber multNumber(double k){
        double newx = x * k;
        double newy = y * k;
        return new ComplexNumber(newx , newy);
    }
    public void multNumber2(double k){
        x *= k;
        y *= k;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    public ComplexNumber mult(ComplexNumber complex){
        double newx = x * complex.getx() - (y  * complex.gety());
        double newy = x * complex.gety() + y * complex.getx();
        return new ComplexNumber(newx , newy);
    }
    public void mult2(ComplexNumber complex){
        double t = x * complex.getx() - (y  * complex.gety());
        double z = x * complex.gety() + y * complex.getx();
        x = t;
        y = z;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    public ComplexNumber div(ComplexNumber complex){
        double down = complex.getx() * complex.getx() + complex.gety() * complex.gety();
        double upx = (x * complex.getx() - y * (-complex.gety()) / down);
        double upy = (x * (-complex.gety()) + y * complex.getx() / down);
        return new ComplexNumber(upx , upy);
    }
    public void div2(ComplexNumber complex){
        double down = complex.getx() * complex.getx() + complex.gety() * complex.gety();
        double upx = (x * complex.getx() - y * (-complex.gety()) / down);
        double upy = (x * (-complex.gety()) + y * complex.getx() / down);
        System.out.println("X: " + upx);
        System.out.println("Y: " + upy);
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
    public double length(){
        return sqrt(0.00001 , x , y);
    }
    @Override
    public String toString(){
        if (x > 0 && y > 0){
            return "" + x + "+" + y + "*i";
        }
        else if(x > 0 && y < 0){
            return "" + x + y + "*i";
        }
        else if (x < 0 && y > 0){
            return "" + x + "+" + y + "*i";
        }
        else{
            return "" + x +  y + "*i";
        }
    }
    public String arg(){
        double xdivy = x/y;
        return "" + Math.atan(xdivy) + "2Pk";
    }
    public double pow(double k){
        double modulez = length();
        double zink = Math.pow(modulez , k) + (Math.cos(Math.acos(x / modulez) * k) + Math.sin(Math.asin(y / modulez) * k));
        return zink;
    }
    public boolean equals(ComplexNumber complex){
        if (x == complex.getx() && y == complex.gety()){
            return true;
        }
        else{
            return false;
        }
    }
}
