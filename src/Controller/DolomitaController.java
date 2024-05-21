package Controller;

import Model.Caolin;
import Model.Dolomita;
import Model.Material;

public class DolomitaController {
    private int cont = 0;
    private Dolomita dolomita = new Dolomita();
    public boolean esDolomita (Material material){
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
        if (material.getFe()<dolomita.getMaxFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<dolomita.getMaxSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<dolomita.getMaxAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<dolomita.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()>dolomita.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<dolomita.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<dolomita.getMaxK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<dolomita.getMaxNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()>dolomita.getMinPPC()){
            cont++;
        }
    }
}
