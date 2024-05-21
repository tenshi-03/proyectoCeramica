package Controller;

import Model.ArcillaBlanca;
import Model.Caolin;
import Model.Material;

public class ArcillaBlancaController {
    private int cont = 0;
    private ArcillaBlanca arcillaBlanca = new ArcillaBlanca();
    public boolean esArcillaBlanca (Material material){
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
        if (material.getFe()<arcillaBlanca.getMaxFe() && material.getFe()>arcillaBlanca.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<arcillaBlanca.getMaxSi() && material.getSi()>arcillaBlanca.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<arcillaBlanca.getMaxAl() && material.getAl()>arcillaBlanca.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<arcillaBlanca.getMaxTi() && material.getTi()>arcillaBlanca.getMinTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<arcillaBlanca.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<arcillaBlanca.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<arcillaBlanca.getMaxK() && material.getK()>arcillaBlanca.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<arcillaBlanca.getMaxNa() && material.getNa()>arcillaBlanca.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<arcillaBlanca.getMaxPPC() && material.getPpc()>arcillaBlanca.getMinPPC()){
            cont++;
        }
    }
}
