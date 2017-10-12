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
public class Administrador extends Empleado {

    public Administrador(String nombre, int id, double salario) {
        super(nombre, id, salario);
    }

    @Override
    public double calcularSalario() {
      return this.salario;
    }

    @Override
    public String reportarNomina() {
        return "Administrador"+ this.nombre+" "+ this.id+" "+this.salario;
        
    }
    
}
