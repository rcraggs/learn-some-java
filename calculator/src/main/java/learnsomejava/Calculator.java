package learnsomejava;

class Calculator {

  int performIntegerArithmetic(char operator, int value1, int value2) {

    switch (operator){

      case '+':
        return value1 + value2;
      case '*':
        return value1 * value2;
      case '-':
        return value1 - value2;
      case '/':
        return value1 / value2;
      }

      return 0;
  }
}