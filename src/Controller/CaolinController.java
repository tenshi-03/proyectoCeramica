package Controller;

import Model.Caolin;
import Model.Material;

public class CaolinController {
    private int cont = 0;
    private Caolin caolin = new Caolin();
    public boolean esCaolin (Material material){
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
        if (material.getFe()<caolin.getMaxFe() && material.getFe()>caolin.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<caolin.getMaxSi() && material.getSi()>caolin.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<caolin.getMaxAl() && material.getAl()>caolin.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<caolin.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<caolin.getMaxCa() && material.getCa()>caolin.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<caolin.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<caolin.getMaxK() && material.getK()>caolin.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<caolin.getMaxNa() && material.getNa()>caolin.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<caolin.getMaxPPC() && material.getPpc()>caolin.getMinPPC()){
            cont++;
        }
    }
}
