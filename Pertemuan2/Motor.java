public class Motor {
    String warna;
    String tipe;

    public void NyalakanMesin() { 
        System.out.println ("Motor " + this.tipe + " " + this.warna + " menyala.");
    }
    public void MatikanMesin() { 
        System.out.println ("Motor " + this.tipe + " " + this.warna + " mati.");
    }
    public void Klakson() { 
        System.out.println ("Motor " + this.tipe + " " + this.warna + " klakson.");
    }
}