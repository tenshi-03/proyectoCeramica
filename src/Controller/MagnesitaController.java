package Controller;

import Model.Dolomita;
import Model.Magnesita;
import Model.Material;

public class MagnesitaController {
    private int cont = 0;
    private Magnesita magnesita = new Magnesita();
    public boolean esMagnesita (Material material){
        comprobacionFe(material);
        comprobacionAl(material);
        comprobacionCa(material);
        comprobacionSi(material);
        comprobacionTi(material);
        comprobacionK(material);
        comprobacionMg(material);
        comprobacionNa(material);
        comprobacionPPC(material);
        if (cont==9){
            return true;
        }else {
            return false;
        }
    }
    public void comprobacionFe(Material material) {
        if (material.getFe()<=magnesita.getMaxFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<magnesita.getMaxSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<magnesita.getMaxAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<magnesita.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<magnesita.getMaxCa() && material.getCa()>magnesita.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()>magnesita.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<magnesita.getMaxK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<magnesita.getMaxNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<magnesita.getMaxPPC()){
            cont++;
        }
    }
}
