package Controller;

import Model.ArenaFeldespatica;
import Model.Caolin;
import Model.Material;

public class ArenaFeldespaticaController {
    private int cont = 0;
    private ArenaFeldespatica arenaFeldespatica = new ArenaFeldespatica();
    public boolean esArenaFeldespatica (Material material){
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
        if (material.getFe()<arenaFeldespatica.getMaxFe() && material.getFe()>arenaFeldespatica.getMinFe()){
            cont++;
        }
    }
    public void comprobacionSi(Material material) {
        if (material.getSi()<arenaFeldespatica.getMaxSi() && material.getSi()>arenaFeldespatica.getMinSi()){
            cont++;
        }
    }
    public void comprobacionAl(Material material) {
        if (material.getAl()<arenaFeldespatica.getMaxAl() && material.getAl()>arenaFeldespatica.getMinAl()){
            cont++;
        }
    }
    public void comprobacionTi(Material material) {
        if (material.getTi()<arenaFeldespatica.getMaxTi()){
            cont++;
        }
    }
    public void comprobacionCa(Material material) {
        if (material.getCa()<arenaFeldespatica.getMaxCa()){
            cont++;
        }
    }
    public void comprobacionMg(Material material) {
        if (material.getMg()<arenaFeldespatica.getMaxMg()){
            cont++;
        }
    }
    public void comprobacionK(Material material) {
        if (material.getK()<arenaFeldespatica.getMaxK() && material.getK()>arenaFeldespatica.getMinK()){
            cont++;
        }
    }
    public void comprobacionNa(Material material) {
        if (material.getNa()<arenaFeldespatica.getMaxNa() && material.getNa()>arenaFeldespatica.getMinNa()){
            cont++;
        }
    }
    public void comprobacionPPC(Material material) {
        if (material.getPpc()<arenaFeldespatica.getMaxPPC()){
            cont++;
        }
    }
}
