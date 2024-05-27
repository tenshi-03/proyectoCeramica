package Controller;

import Model.Feldespato;
import Model.FeldespatoPotasico;
import Model.Material;

public class FeldespatoPotasicoController {
    private int cont = 0;
    private FeldespatoPotasico feldespatoPotasico = new FeldespatoPotasico();
    public boolean esFeldespatoPotasico (Material material){
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
        if (material.getFe()<feldespatoPotasico.getMaxFe() && material.getFe()>feldespatoPotasico.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<feldespatoPotasico.getMaxSi() && material.getSi()>feldespatoPotasico.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<feldespatoPotasico.getMaxAl() && material.getAl()>feldespatoPotasico.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<feldespatoPotasico.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<feldespatoPotasico.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<feldespatoPotasico.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getSi()>feldespatoPotasico.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<feldespatoPotasico.getMaxNa() && material.getNa()>feldespatoPotasico.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<feldespatoPotasico.getMaxPPC() && material.getPpc()>feldespatoPotasico.getMinPPC()){
            cont++;
        }
    }
}
