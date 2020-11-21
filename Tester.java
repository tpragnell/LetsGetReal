public class Tester{

  public static void main(String[] args){
    RealNumber zero = new RealNumber(0.0);
    RealNumber r1 = new RealNumber(0.000001);
    RealNumber r2 = new RealNumber(1.0);
    RealNumber r3 = new RealNumber(1.000000001);
    RealNumber r4 = new RealNumber(4.0);

    //Test equals
    System.out.println("Are they equal? " + zero.equals(zero)); // True
    System.out.println("Are they equal? " + r1.equals(zero)); // False
    System.out.println("Are they equal? " + r1.equals(r2)); // False
    System.out.println("Are they equal? " + r2.equals(r3)); // True

    //Test add
    System.out.println("Add? " + r2.add(r4)); // 5.0

    //

  }




}
