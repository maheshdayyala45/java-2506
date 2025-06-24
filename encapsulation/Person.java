package encapsulation;

public class Person {

      // common attributes Student, Trainer, etc
    // apply encapsulation --> use private access modifier
     private int personId;
     private String personName;
     private int personAge;
     private int PersonMobileNumber;

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
         // set some condition based on age
     public void setPersonAge(int personAge) {
        //age must be positive
        if(personAge>0){
         this.personAge = personAge;
        }else{
            System.out.println("Invalid age");
        }
     }
     public int getPersonMobileNumber() {
         return PersonMobileNumber;
     }
     public void setPersonMobileNumber(int personMobileNumber) {
         PersonMobileNumber = personMobileNumber;
     }

     public void displayInfo(){
        System.out.println("ID:"+personId);
        System.out.println("Name:"+personName);
        System.out.println("Age:"+personAge);
        System.out.println("Number:"+PersonMobileNumber);



     }
     


}