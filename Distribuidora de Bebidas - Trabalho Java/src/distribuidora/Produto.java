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
public class Produto {

    private int idProduto;
    private static int auxConta;
    private String tipo, marca;
    private double valor, volume;
    private int quantidade;
    
    public Produto(String marca, double valor, double volume, int quantidade) {
        this.marca = marca;
        this.valor = valor;
        this.volume = volume;
        this.quantidade = quantidade;
        this.setIdProduto(codigoProduto(auxConta));
    }
    
    private static int codigoProduto(int v) {
        auxConta++;
        return auxConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getIdProduto() {
        return idProduto;
    }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public void mostrarDados() {
        System.out.println("--------------------------------------");
        System.out.println("---------- DADOS DO PRODUTO ----------");
        System.out.println("Código: " + getIdProduto());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.println("Valor: " + this.getValor());
        System.out.println("--------------------------------------");
    }
    
}
