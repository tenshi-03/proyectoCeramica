package Controller;

import Model.ArcillaBlanca;
import Model.ArcillaRojaCalcarea;
import Model.Material;

public class ArcillaRojaCalcareaController {
    private int cont = 0;
    private ArcillaRojaCalcarea arcillaRojaCalcarea = new ArcillaRojaCalcarea();
    public boolean esArcillaRojaCalcarea (Material material){
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
        if (material.getFe()<arcillaRojaCalcarea.getMaxFe() && material.getFe()>arcillaRojaCalcarea.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<arcillaRojaCalcarea.getMaxSi() && material.getSi()>arcillaRojaCalcarea.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<arcillaRojaCalcarea.getMaxAl() && material.getAl()>arcillaRojaCalcarea.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<arcillaRojaCalcarea.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<arcillaRojaCalcarea.getMaxCa() && material.getTi()>arcillaRojaCalcarea.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<arcillaRojaCalcarea.getMaxMg() && material.getTi()>arcillaRojaCalcarea.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<arcillaRojaCalcarea.getMaxK() && material.getK()>arcillaRojaCalcarea.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<arcillaRojaCalcarea.getMaxNa() && material.getNa()>arcillaRojaCalcarea.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<arcillaRojaCalcarea.getMaxPPC() && material.getPpc()>arcillaRojaCalcarea.getMinPPC()){
            cont++;
        }
    }
}
