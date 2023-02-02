public class SmarthPhone extends SmarthDevices {
    String marca;
    int bateria;
    String conectividad;
    boolean nfc;

   public SmarthPhone(){
   }

    public SmarthPhone(String fabricante, String modelo, String OS, int lanzamiento, String marca, int bateria, String conectividad, boolean nfc) {
        super(fabricante, modelo, OS, lanzamiento);
        this.marca = marca;
        this.bateria = bateria;
        this.conectividad = conectividad;
        this.nfc = nfc;
    }
}
