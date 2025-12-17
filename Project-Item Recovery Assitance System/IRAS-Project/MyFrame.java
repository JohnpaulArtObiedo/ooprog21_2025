import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class MyFrame extends Main implements ActionListener{
    
   String[] columnNames = {"First Name", "Last Name", "Department", "Year", "Found Item", "Date", "Location"};
   String[] columnNames1 = {"First Name", "Last Name", "Department", "Year", "Lost Item", "Date", "Description"};

   JFrame frame = new JFrame();
   JTable table1, table2;
   JLabel label1, label2, label3, label4;
   JPanel panel1, panel2;
   JButton button1, button2, buttonFirst, buttonSecond;
   JTextField textField1, textFieldFirst, textFieldLast, textFieldDepartment, textFieldYear, textFieldFoundItem, textFieldTime, textFieldLocation,
   textField2, textFieldFirst2, textFieldLast2, textFieldDepartment2, textFieldYear2, textFieldLostItem, textFieldDate, textFieldDescription;
   
   ImageIcon image1;

   Border border1, border2, border3;
   DefaultTableModel model1, model2;
   JScrollPane scrollPane1, scrollPane2;

   MyFrame(){

      //Image
      image1 = new ImageIcon("sample.png");

      //Image-Display
      frame.setIconImage(image1.getImage()); //Icon Application


      //Frame
      frame.setTitle("Item Recovery Assistance System");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1930, 1030);
      frame.setResizable(false);
      frame.setLayout(null); 
      frame.getContentPane().setBackground(new Color(51, 153, 255)); //Color skyblue(?)


      //Border
      border1 = BorderFactory.createLineBorder(Color.white, 5);
      border2 = BorderFactory.createLineBorder(Color.black, 1);
      border3 = BorderFactory.createLineBorder(Color.gray, 7);


      //Label
      //Label Title
      label1 = new JLabel();
      label1.setText("ITEM RECOVERY ASSISTANCE SYSTEM");
      label1.setForeground(Color.green);
      label1.setFont(new Font("Broadway", Font.PLAIN, 50));
      label1.setBackground(Color.black);
      label1.setOpaque(true);
      label1.setBorder(border1);
      label1.setHorizontalAlignment(JLabel.CENTER);
      label1.setBounds(250, 10, 1500, 100);

      //Label Found Item
      label2 = new JLabel();
      label2.setText("Found Item/Belongings");
      label2.setForeground(Color.white);
      label2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
      label2.setBackground(Color.black);
      label2.setOpaque(true);
      label2.setBorder(border2);
      label2.setHorizontalAlignment(JLabel.CENTER);
      label2.setBounds(200, 250, 330, 50);

      //Label Lost Item
      //Label Found Item
      label3 = new JLabel();
      label3.setText("Lost Item/Belongings");
      label3.setForeground(Color.white);
      label3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 30));
      label3.setBackground(Color.black);
      label3.setOpaque(true);
      label3.setBorder(border2);
      label3.setHorizontalAlignment(JLabel.CENTER);
      label3.setBounds(1350, 250, 330, 50);
      
      
      //Table, TableModel and Scroll 
      //Table, TableModel and Scroll Found Item
      model1 = new DefaultTableModel(columnNames, 0);

      table1 = new JTable(model1);
      table1.setBounds(10, 370, 800, 250); //800
      table1.getTableHeader().setBounds(10, 320, 800, 50);

      scrollPane1 = new JScrollPane(table1); 

      //Table, TableModel and Scroll Lost Item
      model2 = new DefaultTableModel(columnNames1, 0);

      table2 = new JTable(model2);
      table2.setBounds(1100, 370, 800, 250); //800
      table2.getTableHeader().setBounds(1100, 320, 800, 50); 

      scrollPane2 = new JScrollPane(table2);
 
      
      //TextField
      //TextField Found Item
      textField1 = new JTextField();
      textField1.setPreferredSize(new Dimension(200, 40));
      textField1.setFont(new Font("Consolas",Font.PLAIN, 15)); 
      textField1.setForeground(Color.blue);
      textField1.setBackground(Color.gray);
      textField1.setCaretColor(Color.black);

      textFieldFirst = new JTextField(20); // 10 meaning width of textfield
      textFieldLast = new JTextField(20);      // 10 meaning width of textfield
      textFieldDepartment = new JTextField(20);
      textFieldYear = new JTextField(20);
      textFieldFoundItem = new JTextField(20);
      textFieldTime = new JTextField(20);
      textFieldLocation = new JTextField(25);
      
      //TextField Lost Item
      textField2 = new JTextField();
      textField2.setPreferredSize(new Dimension(200, 40));
      textField2.setFont(new Font("Consolas",Font.PLAIN, 15));
      textField2.setForeground(Color.blue);
      textField2.setBackground(Color.gray);
      textField2.setCaretColor(Color.black);

      textFieldFirst2 = new JTextField(20); // 10 meaning width of textfield
      textFieldLast2 = new JTextField(20);      // 10 meaning width of textfield
      textFieldDepartment2 = new JTextField(20);
      textFieldYear2 = new JTextField(20);
      textFieldLostItem = new JTextField(20);
      textFieldDate = new JTextField(20);
      textFieldDescription = new JTextField(25);

      
      //Button
      //Button Found Item
      button1 = new JButton("Enter");
      button1.addActionListener(this);

      buttonFirst = new JButton("Submmit");

      //Found Item
      //Basta pisliton and buttonFirst kay i submit niya sa Table-Found-Item
      buttonFirst.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
            addRowFromUserInput();
         }
      } );

      //Button Lost Item
      button2 = new JButton("Enter");
      button2.addActionListener(this);

      buttonSecond = new JButton("Submmit");
      
      //Lost Item
      //Basta pisliton and buttonSecond kay i submit niya sa Table-Lost-Item
      buttonSecond.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
            addRowFromUserInput2();
         }
      } );


      //Panel
      //Panel ----------> Found Item
      panel1 = new JPanel();
      panel1.setLayout(new GridLayout(8,1));
      panel1.setBackground(Color.white);
      panel1.setBorder(border3);
      panel1.setBounds(10, 625, 800, 320);

      panel1.add(new JLabel("First Name:"));
      panel1.add(textFieldFirst);
      panel1.add(new JLabel("Last Name:"));
      panel1.add(textFieldLast); 
      panel1.add(new JLabel("Department:"));
      panel1.add(textFieldDepartment);
      panel1.add(new JLabel("Year:"));
      panel1.add(textFieldYear);
      panel1.add(new JLabel("Found Item:"));
      panel1.add(textFieldFoundItem);
      panel1.add(new JLabel("Date  (Ex: 09(DD)/01(MM)/2025(YYYY)):"));
      panel1.add(textFieldTime);
      panel1.add(new JLabel("Location:"));
      panel1.add(textFieldLocation);

      panel1.add(buttonFirst); // Found Item Button
      
      //Panel ---------> Lost Item
      panel2 = new JPanel();
      panel2.setLayout(new GridLayout(8,1));
      panel2.setBackground(Color.white);
      panel2.setBorder(border3);
      panel2.setBounds(1100, 625, 800, 320);

      panel2.add(new JLabel("First Name:"));
      panel2.add(textFieldFirst2);
      panel2.add(new JLabel("Last Name:"));
      panel2.add(textFieldLast2); 
      panel2.add(new JLabel("Department:"));
      panel2.add(textFieldDepartment2);
      panel2.add(new JLabel("Year:"));
      panel2.add(textFieldYear2);
      panel2.add(new JLabel("Lost Item:"));
      panel2.add(textFieldLostItem);
      panel2.add(new JLabel("Date (Ex: 09(DD)/01(MM)/2025(YYYY):"));
      panel2.add(textFieldDate);
      panel2.add(new JLabel("Description:"));
      panel2.add(textFieldDescription);

      panel2.add(buttonSecond); // Lost Item Button



      // Section: Add
      // Add Frame
      frame.add(textField1);
      frame.add(textField2);

      //Add Label
      frame.add(label1);
      frame.add(label2);
      frame.add(label3);
      
      //Table
      frame.add(table1);
      frame.add(scrollPane1);

      frame.add(table2);
      frame.add(scrollPane2);


      //Panel
      frame.add(panel1);
      frame.add(table1.getTableHeader());

      frame.add(panel2);
      frame.add(table2.getTableHeader());

      //Add Button
      frame.add(button1);
      frame.add(button2);

      //Make it Visible
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==button1){
         //  NewWindow myWindow = new NewWindow();
         frame.dispose();

         System.out.print("Welcome "+textField1.getText());
      }
   }
   
   //Found table
   void addRowFromUserInput(){
      String first = textFieldFirst.getText();
      String last = textFieldLast.getText();
      String department = textFieldDepartment.getText();
      String year = textFieldYear.getText();
      String foundItem = textFieldFoundItem.getText();
      String time = textFieldTime.getText();
      String location = textFieldLocation.getText();
      
      try{

         Object[] rowData = {first, last, department, year, foundItem, time, location};
         
         model1.addRow(rowData);
         
         textFieldFirst.setText("");
         textFieldLast.setText("");
         textFieldDepartment.setText("");
         textFieldYear.setText("");
         textFieldFoundItem.setText("");
         textFieldTime.setText("");
         textFieldLocation.setText("");
      } catch(Exception e){
         JOptionPane.showMessageDialog(frame, "Please enter valid Year (Number)", "Invalid Input", JOptionPane.ERROR_MESSAGE);
      }
   }

   //Lost table
   void addRowFromUserInput2(){
      String first2 = textFieldFirst2.getText();
      String last2 = textFieldLast2.getText();
      String department2 = textFieldDepartment2.getText();
      String year2 = textFieldYear2.getText();
      String lostItem = textFieldLostItem.getText();
      String date = textFieldDate.getText();
      String description = textFieldDescription.getText();
      
      try{
         Object[] rowData2 = {first2, last2, department2, year2, lostItem, date, description};
         
         
         model2.addRow(rowData2);
         
         textFieldFirst2.setText("");
         textFieldLast2.setText("");
         textFieldDepartment2.setText("");
         textFieldYear2.setText("");
         textFieldLostItem.setText("");
         textFieldDate.setText("");
         textFieldDescription.setText("");
      } catch(Exception e){
         JOptionPane.showMessageDialog(frame, "Please enter valid Year or Date (Number)", "Invalid Input", JOptionPane.ERROR_MESSAGE);
      }
   }
}
