package Controller;

import Model.Material;

import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class MainController {
    public static void BotonPresionado(String[] elementos){
        boolean mayoresQueCero=true;
        double[] elementosDouble = new double[elementos.length];
        try{
            for (int i=0;i<elementos.length;i++){
                elementosDouble[i]= Double.parseDouble(elementos[i]);
            }
            for(int i=0;i<elementosDouble.length;i++){
                if(elementosDouble[i]<0){
                    mayoresQueCero=false;
                }
            }
            if(mayoresQueCero){
                //Anidar métodos de comprobación de materiales
                /*Material material=new Material(elementosDouble[0],elementosDouble[1],elementosDouble[2],elementosDouble[3],elementosDouble[4],elementosDouble[5]
                        ,elementosDouble[6],elementosDouble[7],elementosDouble[8]);*/
            }
            else{
                //Pop Up de error existen numeros menores que 0
            }
        }catch (Exception e){
            //Pop Up de error hay un elemento que no es un número
        }
    }

}
