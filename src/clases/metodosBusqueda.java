/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class metodosBusqueda {

    //Metodo busqueda lineal (por id)
    //Metodo busqueda binaria
    Procesos p = new Procesos();

    
    //Busqueda Lineal
    public String buscarPorPerfildeCarga(int perfilDeCarga) {

        String mensaje = "Marca\tTamaño de Ring\tVelocidad Max\tPerfil de Carga\tAncho Nominal\n";

        for (int i = 0; i < p.neumaticos.length; i++) {

            if (p.verificarPerfildeCarga(perfilDeCarga) == false) {

                mensaje += p.getNeumatico(i).getMarca() + "\t" + p.getNeumatico(i).getTamRing() + "\t" + p.getNeumatico(i).getVelMax() + "\t" + p.getNeumatico(i).getPerfilCarga() + "\n" + p.getNeumatico(i).getAnchoNominal();

            }

        }

        return mensaje;

    }

}
