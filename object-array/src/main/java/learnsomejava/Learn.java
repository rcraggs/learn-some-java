package learnsomejava;

class Learn {

  public static ObjectDoubler[] createDoublers(int[] numArray) {
    ObjectDoubler[] doublers = new ObjectDoubler[numArray.length];

    for (int i=0; i<numArray.length ; i++ ) {
      doublers[i] = new ObjectDoubler(numArray[i]);
    }

    return doublers;
  }
}
