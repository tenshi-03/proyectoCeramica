package Controller;

import Model.Feldespato;
import Model.FeldespatoSodico;
import Model.Material;

public class FeldespatoSodicoController {
    private int cont = 0;
    private FeldespatoSodico feldespatoSodico = new FeldespatoSodico();
    public boolean esFeldespatoSodico(Material material){
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
        if (material.getFe()<feldespatoSodico.getMaxFe() && material.getFe()>feldespatoSodico.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<feldespatoSodico.getMaxSi() && material.getSi()>feldespatoSodico.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<feldespatoSodico.getMaxAl() && material.getSi()>feldespatoSodico.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<feldespatoSodico.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<feldespatoSodico.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<feldespatoSodico.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<feldespatoSodico.getMaxK() && material.getSi()>feldespatoSodico.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getSi()>feldespatoSodico.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<feldespatoSodico.getMaxPPC() && material.getSi()>feldespatoSodico.getMinPPC()){
            cont++;
        }
    }
}
