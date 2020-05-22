import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;


   public class GUI extends JFrame {

       JButton button1, button2;
       JLabel label1, label2;


       public GUI() {
           super("Walther Timer");
           setLayout(new FlowLayout());
           button1 = new JButton("Start");
           button2 = new JButton("Stop");
           label1 = new JLabel("");
           label2 = new JLabel("");

           add(label1);
           add(label2);
           add(button1);
           add(button2);


           this.setSize(400, 400);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setResizable(false);
           this.setLocationRelativeTo(null);

       }
   }



        /*class eHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1){

                }
                else(e.getSource() == button2){

                }
            }

        }


    }*/





