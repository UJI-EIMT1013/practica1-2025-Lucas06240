package practica1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.DoubleToIntFunction;

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
        Set<Integer> nuevoCuadrados = new HashSet<>();
        Set<Integer> nuevoNoCuadrados = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();
        repetidos.addAll(cuadrados);
        repetidos.retainAll(noCuadrados);

        while (itCuadrados.hasNext()) {
            int elemento = itCuadrados.next();
            if (elemento == 1 && !repetidos.contains(1)) {
                nuevoNoCuadrados.add(elemento);
            } else if (elemento == 1 && repetidos.contains(1)) {
                nuevoCuadrados.add(elemento);
            } else {
                if (cuadrados.contains(elemento * elemento) || noCuadrados.contains(elemento * elemento)) {
                    nuevoCuadrados.add(elemento * elemento);
                    nuevoNoCuadrados.remove(elemento*elemento);
                    nuevoNoCuadrados.add(elemento);
                } else if (!cuadrados.contains(elemento * elemento) && !noCuadrados.contains(elemento * elemento)) {
                    if (!nuevoCuadrados.contains(elemento)) {
                        nuevoNoCuadrados.add(elemento);
                    }
                }
            }
        }

        while (itNoCuadrados.hasNext()) {
            int elemento = itNoCuadrados.next();
            if (elemento == 1 && !repetidos.contains(1)) {
                nuevoNoCuadrados.add(elemento);
            } else if (elemento == 1 && repetidos.contains(1)) {
                nuevoCuadrados.add(elemento);
            } else {
                if (cuadrados.contains(elemento * elemento) || noCuadrados.contains(elemento * elemento)) {
                    nuevoCuadrados.add(elemento * elemento);
                    nuevoNoCuadrados.remove(elemento*elemento);
                    nuevoNoCuadrados.add(elemento);
                } else if (!cuadrados.contains(elemento * elemento) && !noCuadrados.contains(elemento * elemento)) {
                    if (!nuevoCuadrados.contains(elemento)) {
                        nuevoNoCuadrados.add(elemento);
                    }
                }
            }
        }

        cuadrados.clear(); cuadrados.addAll(nuevoCuadrados);
        noCuadrados.clear(); noCuadrados.addAll(nuevoNoCuadrados);

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        Collection<Set<T>> resultado = new ArrayList<>();
        Iterator<Set<T>> itResultado;

        while (it.hasNext()) {
            itResultado = resultado.iterator();
            boolean repetido = true;
            T elemento = it.next();
            while (itResultado.hasNext()) {
                Set<T> conjunto = itResultado.next();
                if (!conjunto.contains(elemento)) {
                    repetido = false;
                    conjunto.add(elemento);
                    break;
                }
            }
            if (repetido) {
                Set<T> nuevoConjunto = new HashSet<>();
                nuevoConjunto.add(elemento);
                resultado.add(nuevoConjunto);
            }
        }

        return resultado;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
