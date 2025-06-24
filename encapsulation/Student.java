package encapsulation;

import java.util.Scanner;

public class Student extends Person{

    //static variables --> make them encapsulated

    private static String instituteName="Digital Edify";
    private static String courseName="java";
    private static double globalDiscount=0.10;

  //non-static variables--> make them encapsulated
     private int totalSessionsAttended;
     private int attendanceCredits;
     private int perfomanceCredits;
     private int finalCredits;
     private int trainerRating;
     private String studentDescription;
     private double courseFee;

     //setters & getters
     public int getTotalSessionsAttended() {
         return totalSessionsAttended;
     }
     public void setTotalSessionsAttended(int totalSessionsAttended) {
         this.totalSessionsAttended = totalSessionsAttended;
     }
     public int getAttendanceCredits() {
         return attendanceCredits;
     }
     public void setAttendanceCredits(int attendanceCredits) {
         this.attendanceCredits = attendanceCredits;
     }
     public int getPerfomanceCredits() {
         return perfomanceCredits;
     }
     public void setPerfomanceCredits(int perfomanceCredits) {
         this.perfomanceCredits = perfomanceCredits;
     }
     public int getFinalCredits() {
         return finalCredits;
     }
     public void setFinalCredits(int finalCredits) {
         this.finalCredits = finalCredits;
     }
     public int getTrainerRating() {
         return trainerRating;
     }
     public void setTrainerRating(int trainerRating) {
         this.trainerRating = trainerRating;
     }
     public String getStudentDescription() {
         return studentDescription;
     }
     public void setStudentDescription(String studentDescription) {
         this.studentDescription = studentDescription;
     }
     public double getCourseFee() {
         return courseFee;
     }
       // course fee must be above 0
     public void setCourseFee(double courseFee) {
        //fee validation
           if (courseFee>0) {
               this.courseFee = courseFee;
           } else {
            System.out.println("invalid course fee");
           }
         
     }

    //Array to store the subject scores
    int[] subjectScores; //we will initialize dynamically

    //Taking inputs

    Scanner sc =new Scanner(System.in);

     // Static Block For Initilizations & First Functionality To be called
    // Regardless you make a call or not, it will be executed
    
    static{
        System.out.println("Welcome to"+instituteName);
        System.out.println("Tham=nks for enrolling"+courseName+"course");
    }
       //only gets executed when you make a call
       public static void displayInstituteDetails(){
        System.out.println("Welcome to"+instituteName);
        System.out.println("Tham=nks for enrolling"+courseName+"course");
        System.out.println("you got discount"+(globalDiscount*100)+"%");

       }
       public void calculateCourseFee(){
        double discount=0;

        String description = studentDescription.toLowerCase();

        if (description.contains("reference")){
            discount +=5000; //based on keyword reference
        }
        if(description.contains("scholarship")){
            discount +=7000; //based on keyword scholarship
        }
        if(description.contains("promo")){
            discount +=3000; //based on keyword promo
        }
        //Apply global discount
        discount += courseFee * globalDiscount;

        //calculate final fee after applying discounts
         double finalFee=courseFee-discount;

         System.out.println("original course fee"+courseFee);
         System.out.println("Discount applied"+discount);
         System.out.println("global discount applied"+(globalDiscount*100)+"%");
         System.out.println("Final fee to pay"+finalFee);

       }

       // calculate attendance credits
       public int sessionCredits(){
            System.out.println("Total sessions attended");
            totalSessionsAttended=sc.nextInt();
            if(totalSessionsAttended>=30){
                return attendanceCredits=attendanceCredits+5;
            }else if(totalSessionsAttended>=20){
               return attendanceCredits= attendanceCredits+3;
            }else{
                return attendanceCredits=0;
            }
       }
       //get scores for dynamic number of subjects and calculate average
       public int calculateAverageScore(){
        System.out.println("Enter no.of subjects:");
        int numSubjects=sc.nextInt();

        //Initialize the array with specified number of subjects
        subjectScores = new int[numSubjects];
        int sum=0;

        //Read scores into the array and calculate the sum of all subjects
        for(int i=0; i<subjectScores.length; i++){
            System.out.println("Enter score for subject"+(i + 1)+":");
            subjectScores[i]=sc.nextInt();
            sum +=subjectScores[i];
        }
        //calculate average score
        int averageScore= sum/subjectScores.length;
        return averageScore;
       } 

       //calculate perfomance credits based on the average score
       public int scoreCredits(int averageScore){
           if(averageScore>=85){
            return perfomanceCredits=perfomanceCredits+5;
           }else if(averageScore>=60){
                return perfomanceCredits=perfomanceCredits+3;
            }else{
                return perfomanceCredits=0;
            }
           }
           //calculate achievments
           public void achievementStatus(){
            int averageScore=calculateAverageScore(); // get the average score
            finalCredits=scoreCredits(averageScore) + sessionCredits();
             if (finalCredits>=10){
                System.out.println("GOLD");
             }else if(finalCredits>=8){
                System.out.println("SILVER");
             }else{
                System.out.println("you need to improve");
             }
           }
            // Calculate Trainer Rating
           public int trainerRatings() {
          System.out.println("Enter Trainer Rating: 1-5");
           trainerRating = sc.nextInt();
          if (trainerRating >= 5) {
           // Set bonus as 5000
           return 5000;
         } else {
           // No bonus
           return 0;
         }
   }
       }

