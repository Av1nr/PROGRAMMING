public class Matrix2x2 {
    private double x;
    private double y;
    private double z;
    private double w;
    private double[][] matrix;
    public Matrix2x2(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    public Matrix2x2(double value){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = value;
            }
        }
    }
    public Matrix2x2(double[][] array){
        this.matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i < array.length && j < array[i].length) {
                    matrix[i][j] = array[i][j];
                } else {
                    matrix[i][j] = 0; 
                }
            }
        }
    }
    public double getx(){
        return matrix[0][0];
    }
    public double gety(){
        return matrix[0][1];
    }
    public double getz(){
        return matrix[1][0];
    }
    public double getw(){
        return matrix[1][1];
    }

    public Matrix2x2(double x , double  y , double z , double w){
        this.matrix = new double[2][2];
        matrix[0][0] = x;
        matrix[0][1] = y;
        matrix[1][0] = z;
        matrix[1][1] = w;
    }
    public Matrix2x2 add(Matrix2x2 matrixx){
        double newx = x + matrixx.getx();
        double newy = y + matrixx.gety();
        double newz = z + matrixx.getz();
        double neww = w + matrixx.getw();
        return new Matrix2x2(newx , newy , newz , neww);
    }
    public void add2(Matrix2x2 matrixx){
        matrix[0][0] += matrixx.getx();
        matrix[0][1] += matrixx.gety();
        z += matrixx.getz();
        w += matrixx.getw();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix2x2 sub(Matrix2x2 matrixx){
        double newx = x - matrixx.getx();
        double newy = y - matrixx.gety();
        double newz = z - matrixx.getz();
        double neww = w - matrixx.getw();
        return new Matrix2x2(newx , newy , newz , neww);
    }
    public void sub2(Matrix2x2 matrixx){
        matrix[0][0] -= matrixx.getx();
        matrix[0][1] -= matrixx.gety();
        matrix[1][0] -= matrixx.getz();
        matrix[1][1] -= matrixx.getw();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix2x2 multNumber(double k){
        double newx = x * k;
        double newy = y * k;
        double newz = z * k;
        double neww = w * k;
        return new Matrix2x2(newx , newy , newz , neww);
    }
    public void multNumber(Matrix2x2 matrixx){
        matrix[0][0] *= matrixx.getx();
        matrix[0][1] *= matrixx.gety();
        matrix[1][0] *= matrixx.getz();
        matrix[1][1] *= matrixx.getw();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix2x2 mult(Matrix2x2 matrixx){
        double newx = x * matrixx.getx() + y * matrixx.getz();
        double newy = x * matrixx.gety() + y * matrixx.getw();
        double newz = z * matrixx.getx() + w * matrixx.getz();
        double neww = z * matrixx.gety() + w * matrixx.getw();
        return new Matrix2x2(newx , newy , newz , neww);
    }
    public void mult2(Matrix2x2 matrixx){
        double tx = x * matrixx.getx() + y * matrixx.getz();
        double ty = x * matrixx.gety() + y * matrixx.getw();
        double tz = z * matrixx.getx() + w * matrixx.getz();
        double tw = z * matrixx.gety() + w * matrixx.getw();
        matrix[0][0] = tx;
        matrix[0][1] = ty;
        matrix[1][0] = tz;
        matrix[1][1] = tw;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public double det(){
        double det = x * w - y * z;
        return det;
    }
    public void transport(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = matrix[j][i];
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix2x2 inverseMatrix(){
        double newx = matrix[1][1] / det();
        double newy = -matrix[0][1] / det();
        double newz = -matrix[1][0] / det();
        double neww = matrix[0][0] / det();
        return new Matrix2x2(newx , newy , newz , neww);
    }
    public Vector2D multVector(Vector2D vector){
        double vectorx = x * vector.getx() + y * vector.getx();
        double vectory = z * vector.gety() + w * vector.gety();
        return new Vector2D(vectorx, vectory);
    }
    public Matrix2x2 equivalentDiagonal() {
    double trace = x + w;
    double discriminant = trace * trace - 4 * det();
    if (discriminant >= 0) {

        double lambda1 = (trace + Math.sqrt(discriminant)) / 2;
        double lambda2 = (trace - Math.sqrt(discriminant)) / 2;
        
        return new Matrix2x2(lambda1, 0, 0, lambda2);
    } else {
        return new Matrix2x2();
        }
    }
}
