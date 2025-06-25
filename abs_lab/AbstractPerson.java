package abs_lab;

import java.util.Scanner;

// will have common behaviours
public abstract class AbstractPerson {
    // common attributes Student, Trainer, etc
    // apply encapsulation --> use private access modifier
  private int personId;
  private String personName;
  private int personAge;
  private int personMobileNumber;
  private String personDescription;

  
  //implement setters and getters
  public int getPersonId() {
    return personId;
  }
  public void setPersonId(int personId) {
    this.personId = personId;
  }
  public String getPersonName() {
    return personName;
  }
  public void setPersonName(String personName) {
    this.personName = personName;
  }
  public int getPersonAge() {
    return personAge;
  }
  //set some conditions based on age
  public void setPersonAge(int personAge) {
    //age must be positive
     if(personAge>0){
         this.personAge = personAge;
     }else{
        System.out.println("Invalid age");
     }
   
  }
  public int getPersonMobileNumber() {
    return personMobileNumber;
  }
  public void setPersonMobileNumber(int personMobileNumber) {
    this.personMobileNumber = personMobileNumber;
  }
  public String getPersonDescription() {
    return personDescription;
  }
  public void setPersonDescription(String personDescription) {
    Scanner sc=new Scanner(System.in);
    personDescription=sc.next();
    personDescription += sc.nextLine();
    this.personDescription = personDescription;
  }


  

}
