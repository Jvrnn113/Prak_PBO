public class Mobil {
    String warna;
    String tipe;

    public void NyalakanMesin() { 
        System.out.println ("mobil " + this.tipe + " " + this.warna + " menyala.");
    }
    public void MatikanMesin() { 
        System.out.println ("mobil " + this.tipe + " " + this.warna + " mati.");
    }
    public void Klakson() { 
        System.out.println ("mobil " + this.tipe + " " + this.warna + " klakson.");
    }
}