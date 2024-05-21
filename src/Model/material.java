package Model;

public class material {
    private double fe, si, al, mg, na, k, ti, ca, ppc;

    public material(double fe, double si, double al, double mg, double na, double k, double ti, double ca, double ppc) {
        this.fe = fe;
        this.si = si;
        this.al = al;
        this.mg = mg;
        this.na = na;
        this.k = k;
        this.ti = ti;
        this.ca = ca;
        this.ppc = ppc;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public double getSi() {
        return si;
    }

    public void setSi(double si) {
        this.si = si;
    }

    public double getAl() {
        return al;
    }

    public void setAl(double al) {
        this.al = al;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public double getNa() {
        return na;
    }

    public void setNa(double na) {
        this.na = na;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getPpc() {
        return ppc;
    }

    public void setPpc(double ppc) {
        this.ppc = ppc;
    }
}
