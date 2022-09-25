package clases;

public class metodosBusqueda {

    public Neumatico[] ordenarIntercambio(Neumatico[] n) {
        int i, j;
        for (i = 0; i <= n.length - 1; i++) {
            for (j = i + 1; j <= n.length - 1; j++) {
                if (n[i].getPerfilCarga() > n[j].getPerfilCarga()) {
                    Neumatico temp;
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        return n;
    }

    public String buscarPorPerfildeCargaLineal(int perfil, Neumatico[] n) {
        String ms = "";
        for (int i = 0; i < 100; i++) {
            if (n[i] == null) {
                continue;
            }
            if (n[i].getPerfilCarga() == perfil) {
                ms = "Marca: " + n[i].getMarca() + "\nTamaño de rin: " + n[i].getTamRing() + "\nVelocidad maxima: " + n[i].getVelMax() + "\nPerfil de carga: " + n[i].getPerfilCarga() + "\nAncho nominal" + n[i].getAnchoNominal();
            }
        }
        return ms;
    }

    public String buscarPorPerfildeCargaBinaria(int perfil, Neumatico[] n) {
        String ms = "";

        int posicion, izq, der, centro;
        n = ordenarIntercambio(n);
        izq = 0;
        der = n.length - 1;

        posicion = -1;

        while ((izq <= der) && (posicion == -1)) {

            centro = (izq + der) / 2;

            if (perfil == n[centro].getPerfilCarga()) {
                posicion = centro;
            } else {
                if (perfil < n[centro].getPerfilCarga()) {
                    der = centro - 1;
                } else {
                    izq = centro + 1;
                }
            }
        }
        
        if (posicion != -1) {
            ms = "Marca: " + n[posicion].getMarca() + "\nTamaño de rin: " + n[posicion].getTamRing() + "\nVelocidad maxima: " + n[posicion].getVelMax() + "\nPerfil de carga: " + n[posicion].getPerfilCarga() + "\nAncho nominal" + n[posicion].getAnchoNominal();
        }
        
        return ms;
    }
}
