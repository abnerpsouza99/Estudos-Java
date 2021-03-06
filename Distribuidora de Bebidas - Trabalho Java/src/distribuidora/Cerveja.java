/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidora;

/**
 *
 * @author Derickson Loss de Melo, Abner Pena e Miguel Lessa
 */
public class Cerveja extends BebidaAlcoolica {
    
    private String tipo;
    
    public Cerveja(double teorAlcoolico, String marca, double valor, double volume, int quantidade, String tipo) {
        super(teorAlcoolico, marca, valor, volume, quantidade);
        this.tipo = tipo;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: " + getTipo());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
