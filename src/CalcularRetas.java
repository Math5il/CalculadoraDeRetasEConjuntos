import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CalcularRetas {

    public static ArrayList<Integer> array = new ArrayList<>();
    public static ArrayList<Integer> array2= new ArrayList<>();

    public CalcularRetas(){

    }

    public CalcularRetas(ArrayList<Integer> array, ArrayList<Integer> array2){
        this.array = array;
        this.array2 = array2;

    }

    public static ArrayList<Integer> CalcularIntersecao(){

        ArrayList<Integer> interseccao = new ArrayList<>();

        if(array.size() > array2.size()) {
            for (int i = 0; i < array.size(); i++) {
                if (array2.size() > i) {
                    if (array.contains(array2.get(i))) {
                        interseccao.add((array2.get(i)));
                    }

                }
            }
        }else{
            for (int i = 0; i < array.size(); i++) {
                if (array2.size() > i) {
                    if (array2.contains(array.get(i))) {
                        interseccao.add((array.get(i)));
                    }

                }
            }
        }
        Collections.sort(interseccao);

        return interseccao;

    }

    public static ArrayList<Integer> CalcularIntersecaoRetas(ArrayList<Integer> num1, ArrayList<Integer> num2){

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> interseccao = new ArrayList<>();
        int maior1 = num1.size() -1;
        int maior2 = num2.size() -1;

        for (int i = num1.get(0); i < num1.get(maior1); i++){
            array.add(i);
        }
        for (int i = num2.get(0); i < num2.get(maior2); i++){
            array2.add(i);
        }

        if(array.size() > array2.size()) {
            for (int i = 0; i < array.size(); i++) {
                if (array2.size() > i) {
                    if (array.contains(array2.get(i))) {
                        interseccao.add((array2.get(i)));
                    }

                }
            }
        }else{
            for (int i = 0; i < array.size(); i++) {
                if (array2.size() > i) {
                    if (array2.contains(array.get(i))) {
                        interseccao.add((array.get(i)));
                    }

                }
            }
        }
        Collections.sort(interseccao);

        return interseccao;
    }

    public static  ArrayList<Integer> CalcularUniao(){
        ArrayList<Integer> uniao = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
           if(!uniao.contains(array.get(i))) {
                uniao.add(array.get(i));
           }
        }
        for (int i = 0; i < array2.size(); i++) {
            if(!uniao.contains(array2.get(i))){
                uniao.add(array2.get(i));
            }
        }
        Collections.sort(uniao);

        return uniao;
    }

    public static ArrayList<Integer> CalcularUniaoRetas(ArrayList<Integer> num1, ArrayList<Integer> num2){
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> uniao = new ArrayList<>();
        int maior1 = num1.size();
        int maior2 = num2.size();

        for (int i = num1.get(0); i < num1.get(maior1 - 1); i++){
            array.add(i);
        }
        for (int i = num2.get(0); i < num2.get(maior2 - 1); i++){
            array2.add(i);
        }

        for (int i = 0; i < array.size(); i++) {
            if(!uniao.contains(array.get(i))) {
                uniao.add(array.get(i));
            }
        }
        for (int i = 0; i < array2.size(); i++) {
            if(!uniao.contains(array2.get(i))){
                uniao.add(array2.get(i));
            }
        }
        Collections.sort(uniao);

        return uniao;
    }
}
