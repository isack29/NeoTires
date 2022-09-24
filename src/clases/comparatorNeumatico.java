/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Comparator;

public class comparatorNeumatico implements Comparator<Neumatico> {

    @Override
    public int compare(Neumatico neumatico1, Neumatico neumatico2) {

        return neumatico1.getMarca().compareTo(neumatico2.getMarca());

    }

}
