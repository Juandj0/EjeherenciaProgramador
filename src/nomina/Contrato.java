/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Juan David Jaime
 */
public abstract class Contrato {
   protected int id;
   protected double salario;

    public Contrato(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public abstract  double calcularSalario();
    public abstract   String  reportarNomina();
    
    
    
    
    
    
}
