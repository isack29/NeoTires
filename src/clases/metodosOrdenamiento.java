package clases;

public class metodosOrdenamiento {

    Neumatico[] n;

    public metodosOrdenamiento(Neumatico[] n) {
        this.n = n;
    }

    public void setNE(int i, Neumatico ne) {
        n[i] = ne;
    }

    public Neumatico getNE(int pos) {
        return n[pos];
    }

    public void cambiar(int p1, int p2) {
        Neumatico temp;
        temp = getNE(p1);
        setNE(p1, getNE(p2));
        setNE(p2, temp);
    }

    public Neumatico[] ordenarBurbuja() {

        int i, j;
        for (i = 0; i <= n.length - 1; i++) {
            if (getNE(i) == null) {
                continue;
            }
            for (j = 0; j <= (n.length - i) - 2; j++) {

                if (getNE(j).getAnchoNominal() < getNE(j + 1).getAnchoNominal()) {
                    cambiar(j, j + 1);
                }
            }
        }

        return n;
    }

    public Neumatico[] ordenarIntercambio() {
        int i, j;
        for (i = 0; i <= n.length - 1; i++) {
            for (j = i + 1; j <= n.length - 1; j++) {
                if (getNE(i).getAnchoNominal() < getNE(j).getAnchoNominal()) {
                    cambiar(i, j);
                }
            }
        }
        return n;
    }

    public Neumatico[] ordenarQuicksort(int primero, int ultimo) {

        int i = primero, j = ultimo;
        int pivote = n[(primero + ultimo) / 2].getAnchoNominal();
        do {
            while (n[i].getAnchoNominal() < pivote) {
                i++;
            }
            while (n[j].getAnchoNominal() > pivote) {
                j--;
            }
            if (i <= j) {
                cambiar(i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordenarQuicksort(primero, j);
        }
        if (ultimo > i) {
            ordenarQuicksort(i, ultimo);
        }
        return n;
    }
}
