
package cadastropoo.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pessoa{
    private int id;
    private String nome;
    private HashMap<Integer, String> cadastro;

  
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.cadastro = new HashMap();
  
        
    }

   public void adicionarDados(int id, String dados){
        cadastro.put(id, dados);
        System.out.println("Pessoa adicionada com sucesso!");
    };
    
    public void exibir(int key) {
        
        System.out.println(cadastro);
        System.out.println(cadastro.size());
        
         
    }



   public class PessoaFisica extends Pessoa{
       private String cpf;
       private int idade;
       
       public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
       }
       
   public void adicionarDado(int id, String dados){
        cadastro.put(id, dados);
        System.out.println("Pessoa adicionada com sucesso!");
    };

       
       public void exibirFisica(){
           
           
           System.out.println(cadastro);
       }
   
   
   }  
   
 /* public class PessoaJuridica extends Pessoa{
       private String cnpj;
       
        public PessoaJuridica(int id, String nome, String cnpj) {
            super(id, nome);
            this.cnpj = cnpj;
        }
        protected void setCnpj(String cnpj){
            this.cnpj = cnpj;
   };
        
       @Override
        public void exibir(){
            super.exibir();
            System.out.println("CNPJ: "+cnpj);
        }
    };*/ 
   
   
}

    
   
  
   
   



















/*
interface Exibivel{
    void exibir();
}
public class Pessoa implements Serializable, Exibivel{
    public int id;
    public String nome;  

    public Pessoa(){
       
        
    }
    public void exibir(){
        System.out.println(id); 
        System.out.println(nome);         
       
    }
  

 Classe Pessoa Fisica com atributos de heranca
public class PessoaFisica implements Serializable, Exibivel{
        public String cpf;
        public int idade;
        
    public PessoaFisica() {
        Pessoa.this.id = id;
        Pessoa.this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public void exibir(){
        System.out.println("ID: "+id); 
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("idade: "+idade);
    }
}

public class PessoaJuridica implements Serializable, Exibivel{
        public String cnpj;
    public PessoaJuridica() {
        Pessoa.this.id = id;
        Pessoa.this.nome = nome;
        this.cnpj = cnpj;
        
    }
    public void exibir(){
        System.out.println("ID: "+ id);
        System.out.println("Nome: "+ nome);
        System.out.println("CNPJ: "+ cnpj);
    }
}

}*/


