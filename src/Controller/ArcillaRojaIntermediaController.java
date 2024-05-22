package Controller;

import Model.ArcillaRojaCalcarea;
import Model.ArcillaRojaIntermedia;
import Model.Material;

public class ArcillaRojaIntermediaController {
    private int cont = 0;
    private ArcillaRojaIntermedia arcillaRojaIntermedia = new ArcillaRojaIntermedia();
    public boolean esArcillaRojaIntermedia (Material material){
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
        if (material.getFe()<arcillaRojaIntermedia.getMaxFe() && material.getFe()>arcillaRojaIntermedia.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<arcillaRojaIntermedia.getMaxSi() && material.getSi()>arcillaRojaIntermedia.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<arcillaRojaIntermedia.getMaxAl() && material.getAl()>arcillaRojaIntermedia.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<arcillaRojaIntermedia.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<arcillaRojaIntermedia.getMaxCa() && material.getTi()>arcillaRojaIntermedia.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<arcillaRojaIntermedia.getMaxMg() && material.getTi()>arcillaRojaIntermedia.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<arcillaRojaIntermedia.getMaxK() && material.getK()>arcillaRojaIntermedia.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<arcillaRojaIntermedia.getMaxNa() && material.getNa()>arcillaRojaIntermedia.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<arcillaRojaIntermedia.getMaxPPC() && material.getPpc()>arcillaRojaIntermedia.getMinPPC()){
            cont++;
        }
    }
}
