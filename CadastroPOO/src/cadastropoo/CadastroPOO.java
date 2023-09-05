
package cadastropoo;

import cadastropoo.model.Pessoa;
import java.util.Scanner;


public class CadastroPOO {
    
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Sistema de Pessoas Cadastradas");
        System.out.println("");
        System.out.println("");  

        System.out.println("1 - Adicionar nova Pessoa");
        System.out.println("2 - Adicionar nova Pessoa Fisica");
        System.out.println("3 - Adicionar nova Pessoa Juridica");

        Scanner entrada = new Scanner(System.in);

        int opCao = entrada.nextInt();
        entrada.nextLine();

        boolean continuar = true;
        Pessoa pessoa = new Pessoa(0, "");
        Pessoa.PessoaFisica pessoaFisica = pessoa.new PessoaFisica(0, "", "", 0);
        Pessoa.PessoaJuridica pessoaJuridica = pessoa.new PessoaJuridica(0,"","");
        switch (opCao) {
            case 1:  
            {
                while (continuar){
                    System.out.println("ID: ");
                    int id = entrada.nextInt();   
                                     
                    entrada.nextLine();                    
                    System.out.println("Nome: ");
                    String nome = entrada.nextLine();
                    
                    //Metodos para passar informações
                    pessoa.adicionarDados(id,nome);
                    
                    //Exibir
                    pessoa.exibir(pessoa.getId());
                    
                    //Chamada para caso queira Adicionar mais
                    System.out.println("Deseja Sair ? (1 = Sair)");
                    String sair = entrada.nextLine();
                    
                    if (sair.equals("1")){
                        continuar = false;
                    }else{
                        System.out.println("Acionou aqui"); 
                    }
                }
            }
            case 2:                 
                while (continuar){
                    System.out.println("ID: ");
                    int id1 = entrada.nextInt();
                    
                    entrada.nextLine();
                    System.out.println("Nome: ");
                    String nome1 = entrada.nextLine();
                    System.out.println("CPF: ");
                    String cpf = entrada.nextLine();
                    System.out.println("Idade: ");
                    int idade = entrada.nextInt();
                    
                    pessoaFisica.setCpf(cpf);
                    pessoaFisica.setIdade(idade);
                    
                    pessoaFisica.adicionarDado(id1, nome1, pessoaFisica.getCpf(), pessoaFisica.getIdade());
                    
                    pessoaFisica.exibirFisica();
                    
                    System.out.println("Deseja Sair ? (1 = Sair)");
                    entrada.nextLine();  // Consumir a nova linha pendente
                    String sair = entrada.nextLine();

                    if (sair.equals("1")) {
                        continuar = false;
                        break;
                    }
                }
            case 3:
                while (continuar){
                    System.out.println("ID: ");
                    int id = entrada.nextInt();
                    
                    entrada.nextLine();
                    System.out.println("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.println("CNPJ: ");
                    String cnpj = entrada.nextLine();
                

                    pessoaJuridica.setCnpj(cnpj);
                
                    pessoaJuridica.adicionarJuridico(pessoa.getId(), pessoa.getNome(), pessoaJuridica.getCnpj());
                    pessoa.adicionarDados(id, nome);
                
                    pessoaJuridica.exibirJuridico();
                
                    System.out.println("Deseja Sair ? (1 = Sair)");
                    entrada.nextLine();  // Consumir a nova linha pendente
                    String sair = entrada.nextLine();

                    if (sair.equals("1")) {
                        continuar = false;
                    }
                }
            break;
        }
        entrada.close();
    }
}
