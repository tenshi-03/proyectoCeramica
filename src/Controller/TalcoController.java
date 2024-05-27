package Controller;

import Model.ArcillaRojaIntermedia;
import Model.Material;
import Model.Talco;

public class TalcoController {
    private int cont = 0;
    private Talco talco = new Talco();
    public boolean esTalco (Material material){
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
        if (material.getFe()<talco.getMaxFe() && material.getFe()>talco.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<talco.getMaxSi() && material.getSi()>talco.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<talco.getMaxAl() && material.getAl()>talco.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<talco.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<talco.getMaxCa() && material.getCa()>talco.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<talco.getMaxMg() && material.getMg()>talco.getMinMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<talco.getMaxK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<talco.getMaxNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<talco.getMaxPPC() && material.getPpc()>talco.getMinPPC()){
            cont++;
        }
    }
}
