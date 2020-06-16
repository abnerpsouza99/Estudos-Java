package distribuidora;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int menu, escolhaBebida, menuBebidasAlcoolicas, menuBebidasNaoAcoolicas, qtdRemove;
        int menuEditar, qtdAtualizada;
        String nomeBebida;

        ArrayList<BebidaAlcoolica> bebidaAlcoolica = new ArrayList();
        ArrayList<BebidaNaoAlcoolica> bebidaNaoAlcoolica = new ArrayList();

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("*   DISTRIBUIDORA DE BEBIDAS   *");
            System.out.println("------------- MENU -------------");
            System.out.println("1 - Cadastrar Bebida");
            System.out.println("2 - Lista de Bebidas Cadastradas");
            System.out.println("3 - Realizar Pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma das opções acima => ");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    do {
                        System.out.println(" ");
                        System.out.println("---------- CADASTRO DE BEBIDAS ----------");
                        System.out.println("1 - Bebida Alcoólica");
                        System.out.println("2 - Bebida Não Alcoólica");
                        System.out.print("Informe o tipo de bebida => ");
                        escolhaBebida = ler.nextInt();

                        switch (escolhaBebida) {
                            case 1:
                                System.out.println(" ");
                                System.out.println("------------ BEBIDAS ALCOÓLICAS ------------");
                                System.out.println("1 - Cervejas");
                                System.out.println("2 - Destilados");
                                System.out.println("3 - Espumantes");
                                System.out.println("4 - Vinhos");
                                System.out.println("Escolha uma das bebidas alcoólicas acima => ");
                                menuBebidasAlcoolicas = ler.nextInt();

                                switch (menuBebidasAlcoolicas) {
                                    case 1:
                                        System.out.println("---- CERVEJAS ----");
                                        System.out.println(" ");
                                        ler.nextLine();
                                        System.out.print("Marca: ");
                                        String marca;
                                        marca = ler.nextLine();
                                        System.out.print("Valor: R$");
                                        double valor;
                                        valor = ler.nextDouble();
                                        System.out.print("Quantidade: ");
                                        int quantidade;
                                        quantidade = ler.nextInt();
                                        System.out.print("Tipo de Cerveja: ");
                                        String tipo;
                                        ler.nextLine();
                                        tipo = ler.nextLine();
                                        System.out.print("Volume: ");
                                        double volume;
                                        volume = ler.nextDouble();
                                        System.out.print("Teor Alcoólico: ");
                                        double teorAlcoolico;
                                        teorAlcoolico = ler.nextDouble();
                                        Cerveja cerveja = new Cerveja(teorAlcoolico, marca, valor, volume, quantidade, tipo);
                                        bebidaAlcoolica.add(cerveja);
                                        System.out.println("Cerveja cadastrada com sucesso!");
                                        escolhaBebida = 0;
                                        break;
                                    case 2:
                                        System.out.println("---- DESTILADOS ----");
                                        ler.nextLine();
                                        System.out.print("Marca: ");
                                        marca = ler.nextLine();
                                        System.out.print("Valor: R$");
                                        valor = ler.nextDouble();
                                        System.out.print("Quantidade: ");
                                        quantidade = ler.nextInt();
                                        System.out.print("Tipo de Cerveja: ");
                                        ler.nextLine();
                                        tipo = ler.nextLine();
                                        System.out.print("Volume: ");
                                        volume = ler.nextDouble();
                                        System.out.print("Teor Alcoólico: ");
                                        teorAlcoolico = ler.nextDouble();
                                        Destilado destilado = new Destilado(teorAlcoolico, marca, valor, volume, quantidade, tipo);
                                        bebidaAlcoolica.add(destilado);
                                        System.out.println("Destilado cadastrado com sucesso!");
                                        escolhaBebida = 0;
                                        break;
                                    case 3:
                                        System.out.println("---- ESPUMANTES ----");
                                        ler.nextLine();
                                        System.out.print("Marca: ");
                                        marca = ler.nextLine();
                                        System.out.print("Valor: R$");
                                        valor = ler.nextDouble();
                                        System.out.print("Quantidade: ");
                                        quantidade = ler.nextInt();
                                        System.out.print("Tipo de Cerveja: ");
                                        ler.nextLine();
                                        tipo = ler.nextLine();
                                        System.out.print("Volume: ");
                                        volume = ler.nextDouble();
                                        System.out.print("Teor Alcoólico: ");
                                        teorAlcoolico = ler.nextDouble();
                                        Espumante espumante = new Espumante(teorAlcoolico, marca, valor, volume, quantidade);
                                        bebidaAlcoolica.add(espumante);
                                        System.out.println("Espumante cadastrado com sucesso!");
                                        escolhaBebida = 0;
                                        break;
                                    case 4:
                                        System.out.println("---- VINHOS ----");
                                        ler.nextLine();
                                        System.out.print("Marca: ");
                                        marca = ler.nextLine();
                                        System.out.print("Valor: R$");
                                        valor = ler.nextDouble();
                                        System.out.print("Quantidade: ");
                                        quantidade = ler.nextInt();
                                        System.out.print("Tipo de Cerveja: ");
                                        ler.nextLine();
                                        tipo = ler.nextLine();
                                        System.out.print("Volume: ");
                                        volume = ler.nextDouble();
                                        System.out.print("Teor Alcoólico: ");
                                        teorAlcoolico = ler.nextDouble();
                                        Vinho vinho = new Vinho(teorAlcoolico, marca, valor, volume, quantidade);
                                        bebidaAlcoolica.add(vinho);
                                        System.out.println("Destilado cadastrado com sucesso!");
                                        escolhaBebida = 0;
                                        break;
                                    default:
                                        System.out.println("Opção Invalida");
                                }
                                break;
                            case 2:
                                System.out.println("  ");
                                System.out.println("------ BEBIDAS NÃO ALCOOLICAS ------");
                                System.out.println("1 - Água");
                                System.out.println("2 - Refrigerante");
                                System.out.print("Escolha uma das bebidas não alcoólicas acima => ");
                                menuBebidasNaoAcoolicas = ler.nextInt();

                                switch (menuBebidasNaoAcoolicas) {
                                    case 1:
                                        System.out.println("-------- AGUA ---------");
                                        Agua agua = new Agua("", "", 0, 0, 0);
                                        System.out.print("Tipo: ");
                                        ler.nextLine();
                                        agua.setTipo(ler.nextLine());
                                        System.out.print("Marca: ");
                                        agua.setMarca(ler.nextLine());
                                        System.out.print("Valor: R$");
                                        agua.setValor(ler.nextDouble());
                                        System.out.print("Volume: ");
                                        agua.setVolume(ler.nextDouble());
                                        System.out.print("Quantidade: ");
                                        agua.setQuantidade(ler.nextInt());
                                        bebidaNaoAlcoolica.add(agua);
                                        escolhaBebida = 0;
                                        break;
                                    case 2:
                                        System.out.println("-------- REFRIGERANTE ---------");
                                        Refrigerante refri = new Refrigerante("", "", 0, 0, 0);
                                        System.out.print("Tipo: ");
                                        ler.nextLine();
                                        refri.setTipo(ler.nextLine());
                                        System.out.print("Marca: ");
                                        refri.setMarca(ler.nextLine());
                                        System.out.print("Valor: R$");
                                        refri.setValor(ler.nextDouble());
                                        System.out.print("Volume: ");
                                        refri.setVolume(ler.nextDouble());
                                        System.out.print("Quantidade: ");
                                        refri.setQuantidade(ler.nextInt());
                                        bebidaNaoAlcoolica.add(refri);
                                        escolhaBebida = 0;
                                        break;
                                    default:
                                        System.out.println("Opção invalida");
                                        break;
                                }

                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    } while (escolhaBebida != 0);
                    break;
                case 2:
                    if (bebidaAlcoolica.isEmpty() && bebidaNaoAlcoolica.isEmpty()) {
                        System.out.println(" ");
                        System.out.println("Não há bebidas cadastradas!");
                        System.out.println(" ");
                    } else {
                        if (bebidaAlcoolica.isEmpty()) {
                            System.out.println("---------- BEBIDAS ALCOÓLICAS ---------");
                            System.out.println(" Não há bebidas alcoólicas cadastradas ");
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("---- BEBIDAS ALCOÓLICAS ----");
                            for (BebidaAlcoolica beb : bebidaAlcoolica) {
                                beb.mostrarDados();
                            }
                        }
                        if (bebidaNaoAlcoolica.isEmpty()) {
                            System.out.println("---------- BEBIDAS NÃO ALCOÓLICAS ---------");
                            System.out.println(" Não há bebidas não alcoólicas cadastradas ");
                            System.out.println("-------------------------------------------");
                        } else {
                            System.out.println("---- BEBIDAS NÃO ALCOÓLICAS ----");
                            for (BebidaNaoAlcoolica bebN : bebidaNaoAlcoolica) {
                                bebN.mostrarDados();
                            }
                        }
                    }
                    break;
                case 3:
                    if (bebidaAlcoolica.isEmpty() && bebidaNaoAlcoolica.isEmpty()) {
                        System.out.println(" ");
                        System.out.println("Não há bebidas cadastradas!");
                        System.out.println(" ");
                    } else {
                        if (bebidaAlcoolica.isEmpty()) {
                            System.out.println("---------- BEBIDAS ALCOÓLICAS ---------");
                            System.out.println(" Não há bebidas alcoólicas cadastradas ");
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("---- BEBIDAS ALCOÓLICAS ----");
                            for (BebidaAlcoolica beb : bebidaAlcoolica) {
                                beb.mostrarDados();
                            }
                        }
                        if (bebidaNaoAlcoolica.isEmpty()) {
                            System.out.println("---------- BEBIDAS NÃO ALCOÓLICAS ---------");
                            System.out.println(" Não há bebidas não alcoólicas cadastradas ");
                            System.out.println("-------------------------------------------");
                        } else {
                            System.out.println("---- BEBIDAS NÃO ALCOÓLICAS ----");
                            for (BebidaNaoAlcoolica bebN : bebidaNaoAlcoolica) {
                                bebN.mostrarDados();
                            }
                        }
                        ler.nextLine();
                        System.out.print("Informe a marca da bebida que deseja editar: ");
                        nomeBebida = ler.nextLine();
                        
                        for(BebidaAlcoolica bebA: bebidaAlcoolica){
                            if(bebA.getMarca() == nomeBebida){
                                System.out.println("A bebida selecionada foi: ");
                                bebA.mostrarDados();
                                System.out.println(" ");
                                System.out.println("------- EDITAR BEBIDA -------");
                                System.out.println("1 - Editar quantidade");
                                System.out.println("2 - Remover bebida");
                                System.out.println("0 - Sair");
                                menuEditar = ler.nextInt();
                                
                                do{
                                    switch(menuEditar){
                                        case 1:
                                            System.out.print("Informe a quantidade que deseja remover: ");
                                            qtdRemove = ler.nextInt();
                                            if(qtdRemove <= 0 || qtdRemove > bebA.getQuantidade()){
                                                System.out.println("Quantidade informada inválida!");
                                                System.out.println("Escolha novamente uma das opções do menu...");
                                            } else{
                                                qtdAtualizada = bebA.getQuantidade() - qtdRemove;
                                                bebA.setQuantidade(qtdAtualizada);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Bebida removida com sucesso!");
                                            bebidaAlcoolica.remove(bebA.getIdProduto());
                                            break;
                                        case 0:
                                            System.out.println("");
                                            break;
                                        default:
                                        System.out.println("Opção inválida!");
                                    }
                                }while(menuEditar != 0);
                                
                            } else{
                                System.out.println("Código informado inválido!");
                            }
                            
                        }
                        
                    }
                    break;
                    
            }
        } while (menu != 0);
        
        System.out.println("Você saiu do sistema!");
    }
}
