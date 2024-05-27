package Controller;

import Model.Dolomita;
import Model.Feldespato;
import Model.Material;

public class FeldespatoController {
    private int cont = 0;
    private Feldespato feldespato = new Feldespato();
    public boolean esFeldespato (Material material){
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
        if (material.getFe()<feldespato.getMaxFe() && material.getFe()>feldespato.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<feldespato.getMaxSi() && material.getSi()>feldespato.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<feldespato.getMaxAl() && material.getAl()>feldespato.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<feldespato.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<feldespato.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<feldespato.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<feldespato.getMaxK() && material.getK()>feldespato.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<feldespato.getMaxNa() && material.getNa()>feldespato.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<feldespato.getMaxPPC() && material.getPpc()>feldespato.getMinPPC()){
            cont++;
        }
    }
}
