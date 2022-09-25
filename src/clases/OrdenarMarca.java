package clases;

import java.util.Comparator;

public class OrdenarMarca implements Comparator<Neumatico> {

    @Override
    public int compare(Neumatico neumatico1, Neumatico neumatico2) {

        return neumatico1.getMarca().compareTo(neumatico2.getMarca());

    }

}
