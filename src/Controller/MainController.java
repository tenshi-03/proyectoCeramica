package Controller;

import Model.Dolomita;
import Model.Material;
import Visual.PantallaPrincipal;
import Visual.VentanaAviso;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class MainController {
    public static void BotonPresionado(JTextField[] elementos,JTextArea resultado){
        boolean mayoresQueCero=true;
        Double[] elementosDouble = new Double[elementos.length];
        try{
            for (int i=0;i<elementos.length;i++){
                elementosDouble[i]= Double.parseDouble(String.valueOf(elementos[i].getText()));
            }
            for(int i=0;i<elementosDouble.length;i++){
                if(elementosDouble[i]<0 || elementosDouble[i].isNaN()){
                    mayoresQueCero=false;
                    elementos[i].setBackground(new Color(255, 186, 186));
                }
                else{
                    elementos[i].setBackground(new Color(255, 255, 255));
                }
            }
            if(mayoresQueCero){
                //Anidar métodos de comprobación de materiales
                Material material=new Material(elementosDouble[0],elementosDouble[1],elementosDouble[2],elementosDouble[3],elementosDouble[4],elementosDouble[5]
                        ,elementosDouble[6],elementosDouble[7],elementosDouble[8]);
                for (JTextField texto: elementos){
                    texto.setText("");
                    comprobacionMaterial(material,resultado);
                }

            }
            else{

                VentanaAviso va_NoNumero = new VentanaAviso("Hay un valor no válido.");
            }
        }catch (Exception e){

            VentanaAviso va_NoNumero = new VentanaAviso("Hay un valor no válido.");
            //Pop Up de error hay un elemento que no es un número
        }
    }
    public static void comprobacionMaterial(Material material,JTextArea resultado){
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
}
