package boot.camp.ejercicioCuatro;

public class SmartWatch extends SmartDevice{
    int diameterMilimeters;
    boolean sportWatch;
    String glassName;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String brandName, String model, String color, String processor, int diameterMilimeters, boolean sportWatch, String glassName) {
        super(brandName, model, color, processor);
        this.diameterMilimeters = diameterMilimeters;
        this.sportWatch = sportWatch;
        this.glassName = glassName;
    }

    @Override
    public String toString() {
        return "marca=" + brandName +
                ", modelo=" + model +
                ", color=" + color +
                ", procesador=" + processor +
                ", diametro en milimetros=" + diameterMilimeters +
                ", es deportivo=" + sportWatch +
                ", tipo de cristal=" + glassName;
    }
}
