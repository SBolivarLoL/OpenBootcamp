package boot.camp;

public class EjercicioTres {

    public static void main(String[] args) {

        String[] testos = new String[]{"la", "mamá", "de", "la", "mamá"};
        String result = concatenar(testos);
        System.out.println(result);
    }

    static String concatenar(String[] textos){
        String result = "";
        for (String texto : textos) {
            result += " " + texto;
        }
        return result;
    }
}
