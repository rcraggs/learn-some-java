package learnsomejava;

class Learn {

  String whoGetsEaten(boolean foxIsThere, boolean chickenIsThere, boolean cornIsThere, boolean farmerIsThere) {
    
    if (farmerIsThere){
      return "Nobody";
    }

    if (chickenIsThere && foxIsThere){
      return "Chicken";
    }
    
    if (chickenIsThere && cornIsThere){
      return "Corn";
    }

    return "Nobody"; 
  }
  
}