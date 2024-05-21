package Controller;

import Model.Caolin;
import Model.CarbonatoCalcico;
import Model.Material;

public class CarbonatoCalcicoController {
    private int cont = 0;
    private CarbonatoCalcico carbonatoCalcico = new CarbonatoCalcico();
    public boolean esCarbonatoCalcico (Material material){
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
        if (material.getFe()<carbonatoCalcico.getMaxFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<carbonatoCalcico.getMaxSi() && material.getSi()>carbonatoCalcico.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<carbonatoCalcico.getMaxAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<carbonatoCalcico.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<carbonatoCalcico.getMaxCa() && material.getCa()>carbonatoCalcico.getMinCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<carbonatoCalcico.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<carbonatoCalcico.getMaxK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<carbonatoCalcico.getMaxNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<carbonatoCalcico.getMaxPPC() && material.getPpc()>carbonatoCalcico.getMinPPC()){
            cont++;
        }
    }
}
