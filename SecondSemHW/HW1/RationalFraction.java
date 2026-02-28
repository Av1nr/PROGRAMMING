import java.util.Objects;
import java.util.Scanner;
public class RationalFraction extends Number{
    private int chisl;
    private int znam;
    Scanner enter = new Scanner(System.in);

    public RationalFraction(int chisl , int znam){
        if(znam != 0){
            if(znam < 0){
                znam = -znam;
                chisl = -chisl;
            }
            this.chisl = chisl;
            this.znam = znam;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    @Override
    public int intValue() {
        return getchisl() / getznam();
    }

    @Override
    public long longValue() {
        return getchisl() / getznam();
    }

    @Override
    public float floatValue() {
        return (float) getchisl() / getznam();
    }

    @Override
    public double doubleValue() {
        return (double) getchisl() / getznam();
    }
    public int getchisl(){
        return chisl;
    }
    public int getznam(){
        return znam;
    }
    public int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }
    public void reduce() {
        int commonDivisor = gcd(chisl, znam);
        chisl /= commonDivisor;
        znam /= commonDivisor;
    }
    public void setznam(int newznam){
        while(newznam == 0){
            System.out.print("Даю тебе еще раз выбрать ненулевой znam: ");
            newznam = enter.nextInt();
        }
        znam = newznam;
    }
    public void setchisl(int newchisl){
        chisl = newchisl;
    }
    public RationalFraction add(RationalFraction other) {
    int newChisl = chisl * other.getznam() + other.getchisl() * znam;
    int newZnam = znam * other.getznam();
    return new RationalFraction(newChisl, newZnam);
}

public RationalFraction subtract(RationalFraction other) {
    int newChisl = chisl * other.getznam() - other.getchisl() * znam;
    int newZnam = znam * other.getznam();
    return new RationalFraction(newChisl, newZnam);
}

public RationalFraction multiply(RationalFraction other) {
    return new RationalFraction(chisl * other.getchisl(), znam * other.getznam());
}

public RationalFraction divide(RationalFraction other) {
    return new RationalFraction(chisl * other.getznam(), znam * other.getchisl());
}

public RationalFraction negate() {
    return new RationalFraction(-chisl, znam);
}

    public boolean isProper(){
        int vremchisl = chisl;
        int vremznam = znam;
        if (vremchisl < 0){
            vremchisl *= -1;
        }
        if(vremznam < 0){
            vremznam *=-1;
        }
        return vremchisl < vremznam;
    }
    @Override
    public  int hashCode(){
        return Objects.hash(chisl, znam);
    }
    @Override
    public boolean equals(Object a){
        if (a instanceof RationalFraction k){
            return (getchisl() == k.getchisl() && getznam() == k.getznam());
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return chisl + "/" + znam;
    }
}