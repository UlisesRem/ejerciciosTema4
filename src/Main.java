public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvendios al menu principal");

        //Instanciamos objetos phone
        System.out.println("Datos telefono inteligente");
        SmarthPhone smarthPhone = new SmarthPhone("Samsung", "Galaxy", "Android", 2020, "Samsung", 100, "4G", true);
        System.out.println(smarthPhone.fabricante);
        System.out.println(smarthPhone.modelo);
        System.out.println(smarthPhone.OS);
        System.out.println(smarthPhone.conectividad);

        //Instancion objetos watch
        System.out.println("Datos reloj inteligente");
        SmarthWatch smarthWatch = new SmarthWatch("Xiaomi", "MiBand", "MIUI", 2022, "Xiaomi", true, true, true);
        System.out.println(smarthWatch.fabricante + " " + smarthWatch.modelo + " " + smarthWatch.OS + " " + smarthWatch.waterproof + " "
                + smarthWatch.lanzamiento);
    }
}