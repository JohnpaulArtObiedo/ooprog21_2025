import javax.swing.JOptionPane;
public class UsingJOptionPaneDialog{
   public static void main(String[] args){
      
      String userInput = JOptionPane.showInputDialog(null, "Input your name: ", JOptionPane.QUESTION_MESSAGE);
      int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to show your name here?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      
      if(confirmation == JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null, "Hi, "+userInput+"!");
      } else{
         JOptionPane.showInputDialog(null, "Input your name: ", JOptionPane.QUESTION_MESSAGE);
      }
   }
}