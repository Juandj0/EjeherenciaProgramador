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
public class CompañiaSoftware {
    private ArrayList<Contrato> contratos;

    public CompañiaSoftware() {
        this.contratos = new ArrayList<>();
    }
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);
    }
    public double calculoSalarioTotal(){
        Double total=0.0;
        for(Contrato contrato: contratos){
            total+=contrato.calcularSalario();
        }
//        for(int k=0; k< this.contratos.size();k++){
//            total+=this.contratos.get(k).calcularSalario();
//        }
        return total;
    }
    
    
    
}
