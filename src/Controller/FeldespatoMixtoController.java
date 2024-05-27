package Controller;

import Model.Feldespato;
import Model.FeldespatoMixto;
import Model.Material;

public class FeldespatoMixtoController {
    private int cont = 0;
    private FeldespatoMixto feldespatoMixto = new FeldespatoMixto();
    public boolean esFeldespatoMixto (Material material){
        comprobacionFe(material);
        comprobacionAl(material);
        comprobacionCa(material);
        comprobacionSi(material);
        comprobacionTi(material);
        comprobacionMg(material);
        comprobacionNaK(material);
        comprobacionPPC(material);
        if (cont==8){
            return true;
        }else {
            return false;
        }
    }
    public void comprobacionFe(Material material) {
        if (material.getFe()<feldespatoMixto.getMaxFe() && material.getFe()>feldespatoMixto.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<feldespatoMixto.getMaxSi() && material.getSi()>feldespatoMixto.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<feldespatoMixto.getMaxAl() && material.getAl()>feldespatoMixto.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<feldespatoMixto.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<feldespatoMixto.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<feldespatoMixto.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionNaK(Material material) {
        if (material.getNa()+material.getK()>feldespatoMixto.getSumaNaK()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<feldespatoMixto.getMaxPPC() && material.getSi()>feldespatoMixto.getMinPPC()){
            cont++;
        }
    }
}
