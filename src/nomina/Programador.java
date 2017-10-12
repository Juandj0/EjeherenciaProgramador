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
public class Programador extends Empleado {
    protected String lenguaje;
    protected double bonificacion;

    public Programador(String lenguaje, String nombre, int id, double salario) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
        if(this.lenguaje.equals("java")){
        this.bonificacion= (this.salario*0.2);
        }
    }

   

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
 return this.bonificacion+ this.salario;
    }

    @Override
    public String reportarNomina() {
        return "Programador"+this.nombre+"id"+ this.id+"Salario"+ this.salario;
               
    }
    
}
