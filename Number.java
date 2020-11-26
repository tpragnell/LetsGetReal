public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number _other){
    if(this.equals(_other))
      return 0;
    if(getValue() > _other.getValue())
      return 1;
    else
      return -1;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number _other){
    if((_other.getValue() == 0.0) && getValue() == 0.0)
      return true;
    if(((_other.getValue() == 0.0) && getValue() != 0.0) || ((_other.getValue() != 0.0) && getValue() == 0.0))
      return false;
    return(Math.abs(getValue()-_other.getValue()) < 0.00001);
  }

}
