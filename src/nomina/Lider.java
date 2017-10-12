/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador {
    private ArrayList<Programador> programador;

    public Lider(String lenguaje, String nombre, int id, double salario) {
        super(lenguaje, nombre, id, salario);
        this.programador=new ArrayList<>();
    }
    
    
        @Override
    public double calcularSalario() {
   this.bonificacion+=(this.salario*this.programador.size()*0.1);
 return this.salario+this.bonificacion;
    }
    
    

    @Override
    public String reportarNomina() {
       String reporte ="lider"+ this.nombre+"Programadores";
       for(int i=0; i< this.programador.size();i++){
       Programador programador =this.programador.get(i);
       reporte += programador.reportarNomina();
       }
       return reporte;        
    }
    public boolean addProgramador (Programador programador){
    return this.programador.add(programador);
    }
    
    
    
}
