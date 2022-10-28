package boot.camp.ejercicioCuatro;

public class Main {

    public static void main(String[] args) {
        SmartPhone s22 = new SmartPhone("Samsung", "S22", "Blue Sky", "SnapDragon 8 Gen1", "Android12", 8, 256);
        SmartWatch miBand6 = new SmartWatch("Xiaomi", "Mi Band6", "blanco", "Xs 121", 20, true, "gorila glass 5");

        System.out.println(s22.toString());
        System.out.println(miBand6.toString());

    }
}
