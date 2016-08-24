package learnsomejava;

import learnsomejava.subpackage.OtherPackageClass;

class Learn {

  String methodCaller() {
    
    ClassInSamePackage samePackage = new ClassInSamePackage();
    samePackage.methodInSamePackage();

    OtherPackageClass otherPackage = new OtherPackageClass();
    otherPackage.methodInOtherPackage();

    return "all manner of things shall be exceeding well";
  }
}