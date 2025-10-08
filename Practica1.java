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
                if (vistos.contains(elemento)) {
                    resultado.add(elemento);
                } else {
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
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        Iterator<Integer> itCuadrados = cuadrados.iterator();
        Iterator<Integer> itNoCuadrados = noCuadrados.iterator();
        Set<Integer> todos = new HashSet<>();
        todos.addAll(cuadrados); todos.addAll(noCuadrados);
        while (itCuadrados.hasNext()) {
            int elemento = itCuadrados.next();
            if (!noCuadrados.contains(Math.sqrt(elemento)) || !cuadrados.contains(Math.sqrt(elemento))) {
                noCuadrados.add(elemento);
                itCuadrados.remove();
            }
        }
        while (itNoCuadrados.hasNext()) {
            int elemento = itNoCuadrados.next();
            if (!noCuadrados.contains(Math.sqrt(elemento)) || !cuadrados.contains(Math.sqrt(elemento))) {
                cuadrados.add(elemento);
                itNoCuadrados.remove();
            }
        }

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
