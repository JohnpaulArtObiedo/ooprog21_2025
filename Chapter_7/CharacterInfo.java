import java.util.*;
class CharacterInfo{
   public static void main(String[] arg){
      Scanner in = new Scanner(System.in);
      char letter = 'O';
      
      System.out.println("The character is "+letter);
      
      if(Character.isUpperCase(letter)){
         System.out.println(letter+" is UpperCase");
      } else{
         System.out.println(letter +" is not a UpperCase");
      }
      
      if(Character.isLowerCase(letter)){
         System.out.println(letter+" is LowerCase");
      } else{
         System.out.println(letter +" is not a LowerCase");
      }
      
      System.out.println("After toLowerCase(), aChar is "+Character.toLowerCase(letter));
      System.out.println("After toUpperCase(), aChar is "+Character.toUpperCase(letter));
      
      if(Character.isLetterOrDigit(letter)){
         System.out.println(letter+" is a Letter or Digit");
      } else{
         System.out.println(letter +" is not a Letter or Digit");
      }
      
      if(Character.isWhitespace(letter)){
         System.out.println(letter+" is a White Space");
      } else{
         System.out.println(letter+" is not a Whitespace");
      }
      
      
   }
}