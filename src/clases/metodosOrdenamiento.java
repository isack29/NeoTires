/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class metodosOrdenamiento {

    //Burbuja
    //Intercambio
    //Quicksort
    private Neumatico n[];
    private int num;

    public metodosOrdenamiento() {
        n = null;
        num = 0;
    }

    public void crearVector() {
        n = new Neumatico[num];
    }

    public void setNE(int i, String marca, int tamRing, char velMax, int perfilCarga, int anchoNominal) {
        Neumatico ne = new Neumatico();

        ne.setMarca(marca);
        ne.setTamRing(tamRing);
        ne.setVelMax(velMax);
        ne.setPerfilCarga(perfilCarga);
        ne.setAnchoNominal(anchoNominal);

        n[i] = ne;
    }

    public Neumatico getNE(int i) {
        return n[i];
    }

//    public int[] getVector() {
//        return datos;
//    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void cambiar(int p1, int p2) {

//        Neumatico temp;
//
//        temp = getNE(p1);
        setNE(p1, getNE(p2).getMarca(), getNE(p2).getTamRing(), getNE(p2).getVelMax(), getNE(p2).getPerfilCarga(), getNE(p2).getAnchoNominal());
        setNE(p2, getNE(p1).getMarca(), getNE(p1).getTamRing(), getNE(p1).getVelMax(), getNE(p1).getPerfilCarga(), getNE(p1).getAnchoNominal());

    }

    public void ordenarBurbuja() {

        int i, j;
        for (i = 0; i <= getNum() - 1; i++) {
            for (j = 0; j <= (getNum() - i) - 2; j++) {

                if (getNE(j).getAnchoNominal() > getNE(j + 1).getAnchoNominal()) {
                    cambiar(j, j + 1);
                }
            }
        }
    }

    public void ordenarIntercambio() {
        int i, j;
        for (i = 0; i <= getNum() - 1; i++) {
            for (j = i + 1; j <= getNum() - 1; j++) {
                if (getNE(i).getAnchoNominal() > getNE(j).getAnchoNominal()) {
                    cambiar(i, j);
                }
            }
        }
    }

//    public int posicionMenor(int inicio) {
//        int i;
//        int posMenor;
//        int menorElemento;
//        posMenor = inicio;
//
//        menorElemento = getDatos(inicio);
//        for (i = inicio + 1; i <= getNum() - 1; i++) {
//            if (getDatos(i) < menorElemento) {
//                menorElemento = getDatos(i);
//                posMenor = i;
//            }
//        }
//        return posMenor;
//    }
//
//    public void ordenarSeleccion() {
//        for (int i = 0; i <= getNum() - 1; i++) {
//            cambiar(i, posicionMenor(i));
//        }
//    }

//    public void ordenarShell() {
//
//        int salto, i;
//        boolean cambios;
//
//        for (salto = getNum() / 2; salto != 0; salto /= 2) {
//            cambios = true;
//            while (cambios) {
//                cambios = false;
//                for (i = salto; i < getNum(); i++) {
//                    if (getDatos(i - salto) > getDatos(i)) {
//                        cambiar(i, i - salto);
//                        cambios = true;
//                    }
//                }
//            }
//        }
//    }

    public void ordenarQuicksort(Neumatico[] vector, int primero, int ultimo) {
        int i = primero, j = ultimo;
        int pivote = vector[(primero + ultimo) / 2].getAnchoNominal();
        do {
            while (vector[i].getAnchoNominal() < pivote) {
                i++;
            }
            while (vector[j].getAnchoNominal() > pivote) {
                j--;
            }
            if (i <= j) {
                cambiar(i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordenarQuicksort(vector, primero, j);
        }
        if (ultimo > i) {
            ordenarQuicksort(vector, i, ultimo);
        }
    }

}
