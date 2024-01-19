import java.awt.event.*;
import javax.swing.*;

public class Main {

        JLabel text;
        Main(){

                JFrame frame = new JFrame("ToDo");

                //the heading thingy
                text = new JLabel("Today's To Do List: ");
                text.setBounds(125,50,300,20);

                //checkboxes
                JCheckBox checkBox1 = new JCheckBox("Math homework");
                checkBox1.setBounds(120,100,150,20);
                System.out.println(checkBox1.isSelected());
                JCheckBox checkBox2 = new JCheckBox("Physics homework");
                checkBox2.setBounds(120,140,250,20);
                System.out.println(checkBox2.isSelected());
                JCheckBox checkBox3 = new JCheckBox("AP work");
                checkBox3.setBounds(120,180,350,20);
                System.out.println(checkBox3.isSelected());
                JCheckBox checkBox4 = new JCheckBox("Study for a test");
                checkBox4.setBounds(120,220,450,20);
                System.out.println(checkBox4.isSelected());

                //adds all the boxes, buttons, and lables
                frame.add(text);
                frame.add(checkBox1);
                frame.add(checkBox2);
                frame.add(checkBox3);
                frame.add(checkBox4);
                //the size of the window
                frame.setSize(450,400);
                frame.setLayout(null);
                frame.setVisible(true);

                //button
                JButton b = new JButton("All COMPLETE");
                b.setBounds(110,260,150,25);
                b.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){

                                System.out.println(checkBox1.isSelected());
                                System.out.println(checkBox2.isSelected());
                                System.out.println(checkBox3.isSelected());
                                System.out.println(checkBox4.isSelected());

                                int count = 0;

                                if(checkBox1.isSelected()){
                                        count++;
                                }if(checkBox2.isSelected()){
                                        count++;
                                }if(checkBox3.isSelected()){
                                        count++;
                                }if(checkBox4.isSelected()){
                                        count++;
                                }
                                JOptionPane.showMessageDialog(frame,count+ "/4 of today's ToDo is completed!");
                        }
                });
                //adds button
                frame.add(b);
        }

    public static void main(String[] args){
                new Main();
                new JOptionPane();

    }
}



