package Visual;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JFrame {

    JLabel l_Fe, l_Si, l_Al, l_Mg, l_Na, l_K, l_Ti, l_Ca, l_PPC;
    JTextField tf_Fe, tf_Si, tf_Al, tf_Mg, tf_Na, tf_K, tf_Ti, tf_Ca, tf_PPC;
    JButton b_enviar;
    JTextArea ta_resultados;

    public PantallaPrincipal(){
        setLayout(new BorderLayout());
        setVisible(true);
        setTitle("Proyecto cerámica");
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        Dimension dimension = mipantalla.getScreenSize();
        this.setSize(dimension.width/2, dimension.height/2);
        this.setLocation(dimension.width/4, dimension.height/4);

    }
    public static void main(String[] args) {
        PantallaPrincipal miPantalla=new PantallaPrincipal();
    }
}
