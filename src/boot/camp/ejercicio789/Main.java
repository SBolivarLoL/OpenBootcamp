package boot.camp.ejercicio789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // Devolver la cadena al reves
        System.out.println(reverse("hola mundo"));

        // Crear un array unidimensional y mostrar sus valores
        String[] arr = {"Maria", "Juan", "Carmen", "Pedro", "Juanra"};
        arrayUni(arr);

        // Crear arrayBidimensional de ints y mosrar posición con valores
        int[][] arrBi = {
                {11, 1},
                {12, 2},
                {13, 3}
        };
        arrayBidi(arrBi);

        // Vector de 5 elementos, añadir valores, borrar 2do y 3ero, mostrar resultado
        Vector<Integer> vec = new Vector<>(5);
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);
        System.out.println("Vector con todos los valores añadidos: " + vec);
        vec.remove(1);
        vec.remove(2);
        System.out.println("Vector con 2do y 3ero borrado: " + vec);

        // Cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
        La capacidad inicial del vector por defecto es de 10
        Cada vez que pasamos esa capacidad, java hace una copia del vector en uno nuevo con el doble de capacidad
        Si añadimos 1000 elementos, son 100 copias que nos van a costar mucho en memoria
         */

        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrList = new ArrayList<>(4);
        arrList.add("can");
        arrList.add("dy ");
        arrList.add("ca");
        arrList.add("ne");
        LinkedList<String> linList = new LinkedList<>(arrList);

        for (String value : arrList) {
            System.out.println("ArrayList Value: " + value);
        }
        for (String s : linList) {
            System.out.println("LinkedList Value: " + s);

        }

        /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int value = i + 1;
            arrListInteger.add(value);
            for (int num = 0; num < arrListInteger.size(); num++) {

                if (arrListInteger.get(num) % 2 == 0) {
                    arrListInteger.remove(num);
                }
            }
        }
        System.out.println(arrListInteger);

        /*
        Crea una función DividePorCero.
        Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        que será capturada por su llamante (desde "main", por ejemplo).
        Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        Finalmente, mostraremos en cualquier caso: "Demo de código".
         */
        dividePorCero();

        /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn"
        al fichero dado en "fileOut".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiaFicheros(fileIn, fileOut);

    }

    public static String reverse(String texto) {
        StringBuilder result = new StringBuilder(texto);
        texto = result.reverse().toString();
        return texto;
    }

    public static void arrayUni(String[] lista){
        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static void arrayBidi(int[][] lista){
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++){
                System.out.println("Posición " + i + "," + j + " Valor: " + lista[i][j]);
            }
        }
    }

    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void dividePorCero(){
        System.out.println("Vamos a dividir");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica los numeros que quieres dividir: ");
        System.out.print("Numero 1: ");
        int a = scanner.nextInt();
        System.out.print("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void copiaFicheros(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }
}
