package learnsomejava;

class Learn {

  long getFactorial(int number) {
    long counter = 1; 
    for (int i = 1; i <= number ; i++ ) {
      counter = counter * i;
    }
    return counter;
  }
}