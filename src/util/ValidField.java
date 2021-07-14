package util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidField {
        public boolean isEmpty(JTextField field) {
        if(field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Favor preencher todos os campos!");
            return true;
        }
        return false;
    }
}
