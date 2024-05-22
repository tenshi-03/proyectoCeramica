package Controller;

import Model.Material;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class MainController {
    public static void BotonPresionado(JTextField[] elementos){
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
                System.out.println("Son todos mayores");
                //Anidar métodos de comprobación de materiales
                Material material=new Material(elementosDouble[0],elementosDouble[1],elementosDouble[2],elementosDouble[3],elementosDouble[4],elementosDouble[5]
                        ,elementosDouble[6],elementosDouble[7],elementosDouble[8]);
                for (JTextField texto: elementos){
                    texto.setText("");
                }
            }
            else{
                System.out.println("Hay uno menor");
            }
        }catch (Exception e){
            System.out.println("no es un numero");
            //Pop Up de error hay un elemento que no es un número
        }
    }
}
