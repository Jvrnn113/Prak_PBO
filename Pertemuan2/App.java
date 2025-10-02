public class App {
    public static void main(String[] args) throws Exception {
        Iphone Iphone1 = new Iphone();
        Iphone Iphone2 = new Iphone();

        Iphone1.color = "Gold";
        Iphone1.Storage = "128";
        Iphone2.color = "Red";
        Iphone2.Storage = "512";

        Iphone1.nyala();
        Iphone1.mati();
        Iphone1.berdering();
        
        Iphone2.nyala();
        Iphone2.mati();
        Iphone2.berdering();

        Motor motor = new Motor();
        motor.warna = "Biru";
        motor.tipe = "Manual";
        
        motor.NyalakanMesin();
        motor.MatikanMesin();
        motor.Klakson();

    }
}