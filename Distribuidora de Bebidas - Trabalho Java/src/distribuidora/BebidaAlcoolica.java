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
public class BebidaAlcoolica extends Produto{
    private double teorAlcoolico;

    public BebidaAlcoolica(double teorAlcoolico, String marca, double valor, double volume, int quantidade) {
        super(marca, valor, volume, quantidade);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Teor Alcoólico: " + this.getTeorAlcoolico() + "%");
    }
}
