public class RationalFraction {
    //Тот что сверху
    private int p;
    //Тот что снизу
    private int q;
    public RationalFraction(){
        this(0 , 1);
    }
    public RationalFraction(int p , int q){
        this.p = p;
        this.q = setq(q);
    }
    public int setq(int newq){
        if (newq != 0){
            q = newq;
            return q;
        }else{
            return 1;
        }
    }
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void reduce() {
        int commonDivisor = gcd(p, q);
        p /= commonDivisor;
        q /= commonDivisor;
        if (q < 0) {
            p = -p;
            q = -q;
        }
    }
    public void reduce(int newP, int newQ) {
        int commonDivisor = gcd(newP, newQ);
        this.p = newP / commonDivisor;
        this.q = newQ / commonDivisor;
        
        if (this.q < 0) {
            this.p = -this.p;
            this.q = -this.q;
        }
    }
    // public void reduce(int newp , int newq){
    //     for (int i = 0 ; i < findProperDivisors(newp).length ; i++){
    //         if (newp % findProperDivisors(newp)[i] == 0 && newq % findProperDivisors(newp)[i] == 0){
    //             newp /= findProperDivisors(newp)[i];
    //             newq /= findProperDivisors(newp)[i];
    //         }
    //     }
    // }
    // public int sqrt(int x) {
    // if (x == 0 || x == 1) {
    //     return x;
    // }
    
    // int left = 1;
    // int right = x;
    // int result = 0;
    
    // while (left <= right) {
    //     int mid = left + (right - left) / 2;
    //     int square = mid * mid;
    //     if (square == x) {
    //         return mid;
    //     } else if (square < x) {
    //         result = mid;
    //         left = mid + 1;
    //     } else {
    //         right = mid - 1;
    //     }
    // }
    // return result;
    // }

    // public int[] findProperDivisors(int x) {
    // int count = 0;
    // for (int i = 2; i <= Math.sqrt(x); i++) {
    //     if (x % i == 0) {
    //         if (i == x / i) {
    //             count++;
    //         } else {
    //             count += 2;
    //         }
    //     }
    // }
    // int[] divisors = new int[count];
    // int index = 0;
    
    // for (int i = 2; i <= Math.sqrt(x); i++) {
    //     if (x % i == 0) {
    //         divisors[index++] = i;
    //         if (i != x / i) {
    //             divisors[index++] = x / i;
    //         }
    //     }
    // }
    // return divisors;
    // }
    public int getp(){
        return p;
    }
    public int getq(){
        return q;
    }
    public RationalFraction add(RationalFraction fraction){
        int newp = p * fraction.getq() + fraction.getp() * q;
        int newq = q * fraction.getq();
        reduce(newp , newq);
        return new RationalFraction(newp , newq);
    }
    public void add2(RationalFraction fraction){
        p = p * fraction.getq() + fraction.getp() * q;
        q = q * fraction.getq();
        reduce();
        System.out.println(p + " " + q);
    }
    public RationalFraction sub(RationalFraction fraction){
        int newp = p * fraction.getq() - fraction.getp() * q;
        int newq = q * fraction.getq();
        reduce(newp , newq);
        return new RationalFraction(newp , newq);
    }
    public void sub2(RationalFraction fraction){
        p = p * fraction.getq() - fraction.getp() * q;
        q = q * fraction.getq();
        reduce();
        System.out.println(p + " " + q);
    }
    public RationalFraction mult(RationalFraction fraction){
        int newp = p * fraction.getp();
        int newq = q * fraction.getq();
        reduce(newp , newq);
        return new RationalFraction(newp , newq);
    }
    public void mult2(RationalFraction fraction){
        p = p * fraction.getp();
        q = q * fraction.getq();
        reduce();
        System.out.println(p + " " + q);
    }
    public RationalFraction div(RationalFraction fraction){
        int newp = p * fraction.getq();
        int newq = q * fraction.getp();
        reduce(newp , newq);
        return new RationalFraction(newp , newq);
    }
    public void div2(RationalFraction fraction){
        p = p * fraction.getq();
        q = q * fraction.getp();
        reduce();
        System.out.println(p + " " + q);
    }
    @Override
    public String toString(){
        return "" + p + "\\" + "q";
    }
    public double value(){
        return p/q;
    }
    public boolean equals(RationalFraction fraction) {
        if (this == fraction) {
            return true;
        }else{
            return false;
        }
    }
    public int numberpart(){
        return p/q;
    }
}
