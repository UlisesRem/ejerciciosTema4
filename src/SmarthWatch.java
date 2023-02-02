public class SmarthWatch extends SmarthDevices {
    String marca;
    boolean NFC;
    boolean waterproof;
    boolean GPS;

    public SmarthWatch(){
    }

    public SmarthWatch(String fabricante, String modelo, String OS, int lanzamiento, String marca, boolean NFC, boolean waterproof, boolean GPS) {
        super(fabricante, modelo, OS, lanzamiento);
        this.marca = marca;
        this.NFC = NFC;
        this.waterproof = waterproof;
        this.GPS = GPS;
    }
}