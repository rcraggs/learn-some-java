package learnsomejava;

class LearnIf {

  String getGenderAndAge(boolean isFemale, int age) {

    String output = "this needs updating";

    if (isFemale){
      if (age > 40){
        output = "Female over 40";
      }else if (age < 40){
        output = "Female under 40";
      }else{
        output = "Female is 40";
      }
    }else{
      if (age > 40){
        output = "Male over 40";
      }else if (age < 40){
        output = "Male under 40";
      }else{
        output = "Male is 40";
      }
    }

    return output; 
  }
  
}