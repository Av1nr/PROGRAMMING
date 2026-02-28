import java.util.Objects;
public class RationalFraction extends Number{
    private int chisl;
    private int znam;

    public RationalFraction(int znam , int chisl){
        if(znam != 0){
            this.znam = znam;
            this.chisl = chisl;
            if(znam < 0 && chisl < 0){
                this.znam = znam  *-1;
                this.chisl = chisl *-1;
            }
        }else{
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
        return getchisl() / getznam();
    }

    @Override
    public double doubleValue() {
        return getchisl() / getznam();
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
    public int  setznam(int newznam){
        znam = newznam;
        return znam;
    }
    public int setchisl(int newchisl){
        chisl = newchisl;
        return chisl;
    }
    public RationalFraction add(RationalFraction fraction){
        return  new RationalFraction(setznam(getznam() + fraction.getznam()), setznam(getznam() + fraction.getznam()));
    }
    public RationalFraction substract(RationalFraction fraction){
        return  new RationalFraction(setznam(getznam() - fraction.getznam()), setznam(getznam() - fraction.getznam()));
    }
    public RationalFraction multiply(RationalFraction fraction){
        return  new RationalFraction(setznam(getznam() * fraction.getznam()), setznam(getznam() * fraction.getznam()));
    }
    public RationalFraction divide(RationalFraction fraction){
        return  new RationalFraction(setznam(getznam() * fraction.getznam()), setznam(getznam() * fraction.getznam()));
    }
    public RationalFraction negate(){
        return  new RationalFraction(setznam(getznam()), setznam(getznam()*-1));
    }
    public boolean isProper(){
        if(chisl<0){
            chisl *=-1;
        }
        if(znam < 0){
            znam *=-1;
        }
        if (chisl < znam){
            return true;
        }
        else{
            return false;
        }
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