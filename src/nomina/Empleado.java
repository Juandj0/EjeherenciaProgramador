/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Estudiante
 */
public abstract  class Empleado extends Contrato {
    
    protected String nombre;

    public Empleado(String nombre,int id, double salario) {
        super(id, salario);
        this.nombre=nombre;
    }
    
}
