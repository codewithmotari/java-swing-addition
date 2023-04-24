import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Main extends JFrame implements ActionListener{
JLabel lbl1,lbl2;
JTextField txt1,txt2;
JButton submit;

    public Main(){
        createComponents();
        createFrame();

    }


    private void createFrame(){
        setTitle("Mogaka");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(submit);
        setVisible(true);
    }

    private void createComponents(){
        lbl1=new JLabel("no 1:");
        txt1=new JTextField();
        lbl1.setBounds(5,10, 50,25);
        txt1.setBounds(65,10, 250,25);
        txt1.setBackground(Color.CYAN);

        lbl2=new JLabel("no 2:");
        txt2=new JTextField();
        lbl2.setBounds(5,35, 50,25);
        txt2.setBounds(65,35, 250,25);
        txt2.setBackground(Color.CYAN);

        submit=new JButton("Submit");
        submit.setBounds(120,63,100,25);
        submit.addActionListener(this);
        submit.setFocusable(false);

    }
    public static void main(String[] args) throws Exception {
      new Main();  
    }

    private void addnumbers(){
        int num1=Integer.parseInt(txt1.getText());
        int num2=Integer.parseInt(txt2.getText());

        int sum=num1+num2;

        JOptionPane.showMessageDialog(null,"the sum is"+sum);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==submit){
            addnumbers();
        }
        
    }
}
