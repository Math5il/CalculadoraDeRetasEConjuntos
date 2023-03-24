import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(7);
        num1.add(6);
        num1.add(5);
        num1.add(4);
        num1.add(23);
        num1.add(2);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(4);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(23);
        num2.add(42);
        num2.add(9);
        CalcularRetas soma = new CalcularRetas(num2,num1);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros.add(-4);
        numeros.add(5);
        numeros2.add(-1);
        numeros2.add(20);

        ArrayList<Integer> resultado = new ArrayList<>();

        ArrayList<Integer> intersecao = new ArrayList<>();
        intersecao = CalcularRetas.CalcularIntersecao();


        System.out.println(CalcularRetas.CalcularIntersecao());
        System.out.println(CalcularRetas.CalcularIntersecaoRetas(numeros2, numeros));
        System.out.println(CalcularRetas.CalcularUniao());
        System.out.println(CalcularRetas.CalcularUniaoRetas(numeros, numeros2));

    }
}