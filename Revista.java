public class Revista {
    private int volume;
    private int mesAno;

    public Revista(int volume, int mesAno) {
        this.volume = volume;
        this.mesAno = mesAno;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMesAno() {
        return mesAno;
    }
    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }
}
