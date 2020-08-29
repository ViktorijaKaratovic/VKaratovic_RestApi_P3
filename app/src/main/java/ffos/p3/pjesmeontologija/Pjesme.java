package ffos.p3.pjesmeontologija;

public class Pjesme {

    private int sifra;
    private String pjesma;
    private String autor;
    private String anotacija;

    public Pjesme(int sifra, String pjesma, String autor, String anotacija) {
        this.sifra = sifra;
        this.pjesma = pjesma;
        this.autor = autor;
        this.anotacija = anotacija;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getPjesma() {
        return pjesma;
    }

    public void setPjesma(String pjesma) {
        this.pjesma = pjesma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnotacija() {
        return anotacija;
    }

    public void setAnotacija(String anotacija) {
        this.anotacija = anotacija;
    }
}
