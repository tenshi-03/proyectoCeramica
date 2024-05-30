package Controller;

import Model.Material;
import Visual.VentanaAviso;

import javax.swing.*;
import java.awt.*;

import static java.lang.Double.parseDouble;

public class MainController {
    public static void ComprobarPresionado(JTextField[] elementos, JLabel resultado){
        boolean mayoresQueCero=true;
        Double[] elementosDouble = new Double[elementos.length];
            for(int i= 0;i<elementosDouble.length;i++){
                if(!esNumero(elementos[i].getText())){
                    mayoresQueCero=false;
                    elementos[i].setBackground(new Color(255, 186, 186));
                }
                else if(Double.valueOf(elementos[i].getText())<0){
                    mayoresQueCero=false;
                    elementos[i].setBackground(new Color(255, 186, 186));
                }
                else{
                    elementosDouble[i]= parseDouble(String.valueOf(elementos[i].getText()));
                    elementos[i].setBackground(new Color(255, 255, 255));
                }
            }
            if(mayoresQueCero){
                //Anidar métodos de comprobación de materiales
                Material material=new Material(elementosDouble[0],elementosDouble[1],elementosDouble[2],elementosDouble[3],elementosDouble[4],elementosDouble[5]
                        ,elementosDouble[6],elementosDouble[7],elementosDouble[8]);
                    comprobacionMaterial(material,resultado);
            }
            else{
                VentanaAviso va_NoNumero = new VentanaAviso("Hay un valor no válido.");
            }
        }

    public static boolean esNumero(String dato){
        try{
            Double.valueOf(dato);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void comprobacionMaterial(Material material,JLabel resultado){
        ArcillaBlancaController abc = new ArcillaBlancaController();
        ArcillaRojaCalcareaController arc = new ArcillaRojaCalcareaController();
        ArcillaRojaIntermediaController ari = new ArcillaRojaIntermediaController();
        ArcillaRojaNoCalcareaController arnc = new ArcillaRojaNoCalcareaController();
        ArenaFeldespaticaController af = new ArenaFeldespaticaController();
        CaolinController c = new CaolinController();
        CarbonatoCalcicoController cc = new CarbonatoCalcicoController();
        DolomitaController d = new DolomitaController();
        FeldespatoController f = new FeldespatoController();
        FeldespatoMixtoController fm = new FeldespatoMixtoController();
        FeldespatoPotasicoController fp = new FeldespatoPotasicoController();
        FeldespatoSodicoController fs = new FeldespatoSodicoController();
        MagnesitaController m = new MagnesitaController();
        TalcoController t = new TalcoController();

        if (abc.esArcillaBlanca(material)){
            resultado.setText("Arcilla blanca");
        } else if (arc.esArcillaRojaCalcarea(material)) {
            resultado.setText("Arcilla roja calcarea");
        } else if (ari.esArcillaRojaIntermedia(material)) {
            resultado.setText("Arcilla roja intermedia");
        } else if (arnc.esArcillaRojaNoCalcarea(material)) {
            resultado.setText("Arcilla roja no calcarea");
        } else if (af.esArenaFeldespatica(material)) {
            resultado.setText("Arena feldespatica");
        } else if (c.esCaolin(material)) {
            resultado.setText("Caolin");
        } else if (cc.esCarbonatoCalcico(material)) {
            resultado.setText("Carbonato calcico");
        } else if (d.esDolomita(material)) {
            resultado.setText("Dolomita");
        } else if (f.esFeldespato(material)) {
            resultado.setText("Feldespato");
        } else if (fm.esFeldespatoMixto(material)) {
            resultado.setText("Feldespato mixto");
        } else if (fp.esFeldespatoPotasico(material)) {
            resultado.setText("Feldespato potasico");
        } else if (fs.esFeldespatoSodico(material)) {
            resultado.setText("Feldespato sodico");
        } else if (m.esMagnesita(material)) {
            resultado.setText("Magnesita");
        } else if (t.esTalco(material)) {
            resultado.setText("Talco");
        }else{
            resultado.setText("Material desconocido.");
        }
    }

    public static void LimpiarPresionado(JTextField[] elementos){
        for (JTextField texto: elementos){
            texto.setText("");
        }
    }
}
