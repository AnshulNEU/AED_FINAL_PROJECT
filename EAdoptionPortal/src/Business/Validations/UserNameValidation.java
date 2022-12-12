/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Validations;

import java.awt.Color;
import userinterface.Register.*;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nihil
 */
public class UserNameValidation extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
     
        String pattern = "^[a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid string characters. Special characters are not valid", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}

