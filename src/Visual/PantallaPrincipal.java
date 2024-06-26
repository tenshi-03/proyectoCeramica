package Visual;

import Controller.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal extends JFrame implements ActionListener {

    JLabel l_Fe, l_Si, l_Al, l_Mg, l_Na, l_K, l_Ti, l_Ca, l_PPC;
    JTextField tf_Fe, tf_Si, tf_Al, tf_Mg, tf_Na, tf_K, tf_Ti, tf_Ca, tf_PPC;
    JButton b_comprobar,b_limpiar;
    JLabel lbl_resultado;
    JLabel ta_resultados;
    JPanel panelIzq, panelIzqSup, panelIzqInf;
    public JPanel panelDer;
    private Color colorFondo = new Color(31,29,59);
    private Color colorBoton = new Color(59, 65, 245, 255);

    public PantallaPrincipal(){
        setLayout(new GridLayout(1,2));

        setTitle("Proyecto cerámica");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        Dimension dimension = mipantalla.getScreenSize();
        this.setSize(dimension.width/2, dimension.height/2);
        this.setLocation(dimension.width/4, dimension.height/4);

        panelIzq = new JPanel();
        panelIzqSup = new JPanel();

        panelIzqInf = new JPanel();

        panelDer= new JPanel();


        panelIzq.setLayout(new GridLayout(2,1));
        panelIzqSup.setLayout(new GridLayout(9, 2));
        panelIzqInf.setLayout(new FlowLayout());


        panelIzqSup.add(l_Fe = new JLabel("    - Fe2O3: "));
        panelIzqSup.add(tf_Fe = new JTextField(8));
        panelIzqSup.add(l_Si = new JLabel("    - SiO2: "));
        panelIzqSup.add(tf_Si = new JTextField(8));
        panelIzqSup.add(l_Al= new JLabel("    - Al2O3: "));
        panelIzqSup.add(tf_Al = new JTextField(8));
        panelIzqSup.add(l_Mg = new JLabel("    - MgO"));
        panelIzqSup.add(tf_Mg = new JTextField(8));
        panelIzqSup.add(l_Na= new JLabel("    - Na2O: "));
        panelIzqSup.add(tf_Na = new JTextField(8));
        panelIzqSup.add(l_K= new JLabel("    - K2O: "));
        panelIzqSup.add(tf_K = new JTextField(8));
        panelIzqSup.add(l_Ti = new JLabel("    - TiO2: "));
        panelIzqSup.add(tf_Ti = new JTextField(8));
        panelIzqSup.add(l_Ca = new JLabel("    - CaO: "));
        panelIzqSup.add(tf_Ca = new JTextField(8));
        panelIzqSup.add(l_PPC= new JLabel("    - PPC: "));
        panelIzqSup.add(tf_PPC = new JTextField(8));


        b_comprobar = new JButton("Comprobar");
        b_comprobar.setSize(50,10);
        b_comprobar.setForeground(Color.white);
        b_comprobar.setBackground(colorBoton);

        b_limpiar = new JButton("Limpiar");
        b_limpiar.setSize(50,10);
        b_limpiar.setForeground(Color.white);
        b_limpiar.setBackground(colorBoton);

        panelIzqInf.add(b_comprobar);
        panelIzqInf.add(b_limpiar);

        ta_resultados = new JLabel();

        //ta_resultados.setFont(Fo);
        panelDer.add(lbl_resultado = new JLabel("Resultado:"));
        panelDer.add(ta_resultados);

        panelIzq.add(panelIzqSup);
        panelIzq.add(panelIzqInf);
        add(panelIzq);
        add(panelDer);

        b_comprobar.addActionListener(this);
        b_limpiar.addActionListener(this);

    }
    public static void main(String[] args) {
        PantallaPrincipal miPantalla=new PantallaPrincipal();
        miPantalla.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source= actionEvent.getSource();
        JTextField[] materiales= {tf_Fe, tf_Si, tf_Al, tf_Mg, tf_Na, tf_K, tf_Ti, tf_Ca, tf_PPC};
        if (source==b_comprobar){
            MainController.ComprobarPresionado(materiales,ta_resultados);
        }
        else{
            MainController.LimpiarPresionado(materiales);
        }
        //El resultado se añade al panel de results
    }
}
