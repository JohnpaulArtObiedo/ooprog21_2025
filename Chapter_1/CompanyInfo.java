/*
   Name: Johnpaul Art E. Obiedo
   Activity: #1
   Date: Septemper 16, 2025
*/
public class CompanyInfo{
   public static void main(String[] args){
      CompanyInfo obj = new CompanyInfo();
      //display the method
      obj.main();
   }
   // create method
   public void main(){
      System.out.println("Smart Electronics");
      displayHour();
   }
   // create method
   public void displayHour(){
      System.out.println("Monday - Friday 8 am to 6 pm");
      System.out.println("Saturday        8 am to noon");
      System.out.println("Sunday          closed");
   }
}
