package Controller;

import Model.ArcillaRojaIntermedia;
import Model.ArcillaRojaNoCalcarea;
import Model.Material;

public class ArcillaRojaNoCalcareaController {
    private int cont = 0;
    private ArcillaRojaNoCalcarea arcillaRojaNoCalcarea = new ArcillaRojaNoCalcarea();
    public boolean esArcillaRojaNoCalcarea (Material material){
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
        if (material.getFe()<arcillaRojaNoCalcarea.getMaxFe() && material.getFe()>arcillaRojaNoCalcarea.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<arcillaRojaNoCalcarea.getMaxSi() && material.getSi()>arcillaRojaNoCalcarea.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<arcillaRojaNoCalcarea.getMaxAl() && material.getAl()>arcillaRojaNoCalcarea.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<arcillaRojaNoCalcarea.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<arcillaRojaNoCalcarea.getMaxCa() && material.getTi()>arcillaRojaNoCalcarea.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<arcillaRojaNoCalcarea.getMaxMg() && material.getTi()>arcillaRojaNoCalcarea.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<arcillaRojaNoCalcarea.getMaxK() && material.getK()>arcillaRojaNoCalcarea.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<arcillaRojaNoCalcarea.getMaxNa() && material.getNa()>arcillaRojaNoCalcarea.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<arcillaRojaNoCalcarea.getMaxPPC()){
            cont++;
        }
    }
}
