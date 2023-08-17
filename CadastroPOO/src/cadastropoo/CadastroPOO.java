
package cadastropoo;

import cadastropoo.model.Pessoa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class CadastroPOO {
    
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Sistema de Pessoas Cadastradas");
        System.out.println("");
        System.out.println("");  

        System.out.println("1 - Adicionar nova Pessoa");
        System.out.println("2 - Adicionar nova Pessoa Fisica");

        
        Scanner entrada = new Scanner(System.in);
        
       int opCao = entrada.nextInt();
        entrada.nextLine();

        boolean continuar = true;
        Pessoa pessoa = new Pessoa(0, "");
        Pessoa.PessoaFisica pessoaFisica = pessoa.new PessoaFisica(0, "", "", 0);
       
        switch (opCao) {
            case 1:  
            {
                
                while (continuar){
                    System.out.println("ID: ");
                    int id = entrada.nextInt();
                    
                    entrada.nextLine();
                    
                    System.out.println("Nome: ");
                    String nome = entrada.nextLine();
                    
                    pessoa.adicionarDados(id, nome);
                    pessoa.exibir(id);
                    
                    System.out.println("Deseja Sair ? (1 = Sair)");
                    String sair = entrada.nextLine();
                    
                    if (sair.equals("1")){
                        continuar = false;
                        break;
                    }
                     break;
                    }
                }
            case 2:                 
            
                while (continuar){
                    
                    
                    
                    System.out.println("ID: ");
                    int id1 = entrada.nextInt();
                    
                    entrada.nextLine();
                    System.out.println("Nome: ");
                    String nome1 = entrada.nextLine();
                    
                    /*if(continuar = pessoaFisica.adicionarDado(id, nome) == false){
                        break;
                    };*/
                    
                    
                    
                    
                    
                    
                    System.out.println("CPF: ");
                    String cpf = entrada.nextLine();
                    
                    
                    
                    System.out.println("Idade: ");
                    int idade = entrada.nextInt();
                    
                    
                    
                    
                    
                    
                    
                    pessoaFisica.adicionarDado(id1, nome1, cpf, idade);
                    pessoaFisica.exibirFisica();
                    
                    System.out.println("Deseja Sair ? (1 = Sair)");
                    String sair = entrada.nextLine();
                    
                    if (sair.equals("1")){
                        continuar = false;
                        break;
                    }
                    
                }
                


                default: {System.err.println("Erro de opção");
                    }
                
            }                   
        }
    }

    

        
        
        
        
        
        
        
        
    

                
      /*  Pessoa.PessoaFisica pessoa1 = pessoa.new PessoaFisica(2, "Joao", "123.456.789-00", 30);
        
        
        Pessoa.PessoaJuridica pessoa2 = pessoa.new PessoaJuridica(3, "Camila", "429.631.528-50");
        pessoa2.exibir();

        
        
        
    }
}




        System.out.println("-----------------------------------");
        System.out.println("Sistema de Pessoas Cadastradas");
        System.out.println("");
        System.out.println("");    
        
     
        Pessoa pessoa = new Pessoa();
        pessoa.id = 1;
        pessoa.nome = "Otavio";
        pessoa.exibir();
        
        Pessoa.PessoaFisica fisica = pessoa.new PessoaFisica();
        pessoa.id = 2;
        pessoa.nome = "Joao";
        fisica.cpf = "429.631.528.50";
        fisica.idade = 31;
        
        fisica.exibir();
             
        Pessoa.PessoaJuridica juridica = pessoa.new PessoaJuridica();
        pessoa.id = 3;
        pessoa.nome = "VISIONDEVS";
        juridica.cnpj = "543.173.333/0001-10";
        
        juridica.exibir();
         
    } */