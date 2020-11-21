public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *param nume the numerator
  *param deno the denominator
  */
  public RationalNumber(int _nume, int _deno){
    super(((_deno == 0) ? 0 : _nume) / ((_deno == 0) ? 1 : _deno));
    numerator = ((_deno == 0) ? 0 : _nume);
    denominator = ((_deno == 0) ? 1 : _deno);
  }

  public double getValue(){
    return super.getValue();
  }

  /**
  *return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber _other){
    return((getNumerator() == _other.getNumerator()) && (getDenominator() == _other.getDenominator()));
  }

  /**Calculate the GCD of two integers.
  *param a the first integers
  *param b the second integer
  *return the value of the GCD
  */
  private static int gcd(int _a, int _b){
    /*use euclids method or a better one*/
    if(_a == 0)
      return _b;
    if(_b == 0)
      return _a;
    int gcd = 1;
    for(int i = 1; i <= _a && i <= _b; i++){
      if(_a%i==0 && _b%i==0)
        gcd = i;
    }
    return gcd;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    numerator = (numerator / gcd(numerator, denominator));
    denominator = (denominator / gcd(numerator, denominator));
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber _other){
    return new RationalNumber(numerator * _other.getNumerator(), denominator * _other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(numerator * _other.getDenominator(), denominator * _other.getNumerator());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator * _other.getNumerator(), denominator * _other.getDenominator());
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
