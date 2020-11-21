public class Tester{

  public static void main(String[] args){
    RealNumber zero = new RealNumber(0.0);
    RealNumber r1 = new RealNumber(0.000001);
    RealNumber r2 = new RealNumber(2.0);
    RealNumber r3 = new RealNumber(1.000000001);
    RealNumber r4 = new RealNumber(4.0);
    RationalNumber n1 = new RationalNumber(4 , 2); // 2
    RationalNumber n2 = new RationalNumber(5 , 2); // 2.5
    RationalNumber n3 = new RationalNumber(1 , 2); // 0.5
    RationalNumber n4 = new RationalNumber(6 , 1); // 6


    //Test equals
    System.out.println("Are they equal? " + zero.equals(zero)); // True
    System.out.println("Are they equal? " + r1.equals(zero)); // False
    System.out.println("Are they equal? " + r1.equals(r2)); // False
    System.out.println("Are they equal? " + r2.equals(r3)); // False
    System.out.println("Are they equal? " + n1.equals(r2)); // True
    System.out.println("Are they equal? " + n1.equals(n1)); // True
    System.out.println("Are they equal? " + n1.equals(n2)); // False

    //Test add
    System.out.println("Add? " + r2.add(r4)); // 6.0
    System.out.println("Add? " + n2.add(r4)); // 6.5

    //Test multiply
    System.out.println("Multiply? " + r2.multiply(r4)); // 8.0
    System.out.println("Multiply? " + n4.multiply(r4)); // 24.0

    //Test divide
    System.out.println("Divide? " + r2.divide(r4)); // 0.5
    System.out.println("Divide? " + n4.divide(r4)); // 1.5

    //Test subtract
    System.out.println("Subtract? " + r2.subtract(r4)); // -2.0
    System.out.println("Subtract? " + n4.subtract(r4)); // 2.0

    //Test reciprocal
    System.out.println("Reciprocal? " + n3.reciprocal()); // 2.0


  }




}
