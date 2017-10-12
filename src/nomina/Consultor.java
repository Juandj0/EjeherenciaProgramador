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
public class Consultor extends Contrato  {
    private String labor;

    public Consultor(String labor, int id) {
        super(id, 220);
        this.labor = labor;
    }

    @Override
    public double calcularSalario() {
   return this.salario;
    }

    @Override
    public String reportarNomina() {
     return "Consultor"+this.id+" Salario:"+this.salario+" "+this.labor;
    }
    
}
