package boot.camp.ejercicioCuatro;


public class SmartPhone extends SmartDevice{
    String osName;
    int ram;
    int storage;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String brandName, String model, String color, String processor, String osName, int ram, int storage) {
        super(brandName, model, color, processor);
        this.osName = osName;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "marca=" + brandName +
                ", modelo=" + model +
                ", color=" + color +
                ", procesador=" + processor +
                ", sistema operativo=" + osName +
                ", ram=" + ram +
                ", almacenamiento=" + storage;
    }
}



