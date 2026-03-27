/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploComparator;

import java.util.Comparator;

/**
 *
 * @author Daw1
 */
public class ComparaApellidos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Persona) o1).getApellido1().compareTo(((Persona) o2).getApellido1());
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

}
