package calculadora_new;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Calculadora_new {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        UIManager.put( "Button.arc", 999 );
        Principal p = new Principal();
        p.setVisible(true);
    }
}
