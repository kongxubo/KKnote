package 简易计算器;

import javax.swing.*;
import java.awt.*;

public class UI {
    public static void main(String[] args) {
        //Create a container to hold label and operating box
        JFrame jFrame = new JFrame("KikiCalculator");
        Container container = jFrame.getContentPane();

        //Create label
        JLabel jLabel = new JLabel("0");
        jLabel.setFont(new Font("微软雅黑",0,40));
        container.add(jLabel,BorderLayout.NORTH);

        //Create operating box
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(4,4));
        JButton[] Buttons = new JButton[16];
        String[] button_name = {"7","8","9","/","4","5","6","*","1","2","3","+","C","0","-","="};
        Listener listener = new Listener(jLabel);           //Create a listener instance
        for(int i=0;i<Buttons.length;i++){
            Buttons[i] = new JButton(button_name[i]);
            Buttons[i].addActionListener(listener);
            jPanel1.add(Buttons[i]);
        }
        container.add(jPanel1,BorderLayout.CENTER);

        //Set window size
        jFrame.setBounds(800,170,300,400);
        jFrame.setVisible(true);
    }
}
