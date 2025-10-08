package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> resultado = new HashSet<>();
        while (it.hasNext()) {
            Integer elemento = it.next();
            if (elemento != 0) {
                vistos.add(elemento);
                for (int visto : vistos) {
                    if (elemento % visto == 0 && elemento != visto) {
                        resultado.add(elemento);
                    } else if (visto % elemento == 0 && elemento != visto) {
                        resultado.add(visto);
                    }
                }
            }
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
