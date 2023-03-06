package GuiWithPassword;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Gui implements ActionListener {
    private static JFrame frame = new JFrame(); // frame is a window
    private static JPanel panel = new JPanel(); // panel is inside the window

    private static JLabel UserLabel = new JLabel(); // it is just label
    private static JLabel PasswordLabel = new JLabel();
    private static JLabel SuccesLabel = new JLabel();

    private static JTextField TextFiledUser = new JFormattedTextField(); // it is a place where we can text smth String;
    private static JTextField TextFieldPassword = new JPasswordField();

    private static JButton button = new JButton("Log in"); // it is just button
    public static void main(String[] args) {





        // frame
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // it is adding  an exit button
        frame.setVisible(true);




        // panel
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(null);
        frame.add(panel);




        // UserLabel
        UserLabel.setText("User");
        UserLabel.setBounds(10, 20, 80, 25); // it is like bounds (границы)
        panel.add(UserLabel);


        //PasswordLabel
        PasswordLabel.setText("Password");
        PasswordLabel.setBounds(10, 50, 80, 25);
        panel.add(PasswordLabel);


        // SuccesLabel
        SuccesLabel.setBounds(10,110,300,25);
        panel.add(SuccesLabel);



        // TextFiledUser
        TextFiledUser.setBounds(100, 20, 165, 25);
        panel.add(TextFiledUser);


        // TextFieldPassword
        TextFieldPassword.setBounds(100,50,165,25);
        panel.add(TextFieldPassword);

        // Button
        button.setBounds(120,80,80,25);
        panel.add(button);
        button.addActionListener(new Gui());




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String User = TextFiledUser.getText(); // we give to the var User, to get text
        String Password = TextFieldPassword.getText(); // we give to the var Password, to get text
        System.out.println( User + ", " + Password);

        List <String>UserNames = new ArrayList();
        List <String>UserPassword = new ArrayList();

        if(User == User && Password == Password){
            UserNames.add(User);
            UserPassword.add(Password);
            System.out.println(UserNames + "  " + UserPassword);
            SuccesLabel.setText("Login Successful!");
        }



    }

    private class getText {
    }
}
