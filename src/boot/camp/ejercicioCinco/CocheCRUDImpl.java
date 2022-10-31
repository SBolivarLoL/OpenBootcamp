package boot.camp.ejercicioCinco;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Saving");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
