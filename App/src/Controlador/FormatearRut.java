
package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;


public class FormatearRut implements KeyListener{
    
    private final JTextField textField;

    public FormatearRut(JTextField textField) {
        this.textField = textField;
    }
     
    
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        if (Character.isDigit(c) || c == 'k' || c == 'K') {
            String text = textField.getText().replaceAll("[.-]", "");

            if (text.length() < 8) {
                textField.setText(text + c);
            } else if (text.length() == 8 && (c == 'k' || c == 'K')) {
                textField.setText(text + "-" + Character.toUpperCase(c));
            }

            if (text.length() == 8) {
                textField.setText(text.substring(0, 2) + "." + text.substring(2, 5) + "." +
                        text.substring(5, 8) + "-" + Character.toUpperCase(c));
            }
        }

        e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
