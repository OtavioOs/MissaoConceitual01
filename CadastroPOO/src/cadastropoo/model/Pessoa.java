
package cadastropoo.model;
import java.util.HashMap;


public class Pessoa{
    private int id;
    private String nome;
    private HashMap<Integer, String> cadastro;
  
    
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.cadastro = new HashMap<>();
    }
      
        public int getId(){
        return id;
        };    
        private void setId(int key){
        this.id = key;
        };       
        public String getNome(){
        return this.nome;  
        };
        private void setNome(String n){
        this.nome = n;            
        };     

     
   public void adicionarDados(int id, String nome){
        cadastro.put(id,nome);
        
        System.out.println("Pessoa adicionada com sucesso!");
    };
    
    public void exibir(int key) {
        
        System.out.println(cadastro);
    }


   public class PessoaFisica extends Pessoa{
       private String cpf;
       private int idade;
       private HashMap<Integer, String> cadastroFisico;
      
       
        public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
        cadastroFisico = new HashMap<>();
        }
       
        public String getCpf(){
        return cpf;
        };    
       
        public void setCpf(String key){
        this.cpf = key;           
        }
 
        public int getIdade(){           
        return idade;  
        };
       
        public void setIdade(Integer n){
        this.idade = n;         
        }   
       
  
        public void adicionarDado(int id, String nome, String cpf, int idade){
            if (!cadastroFisico.containsKey(id) && !cadastro.containsKey(id)){
           
                super.adicionarDados(id, nome);
                super.setId(id);
                super.setNome(nome);
                cadastro.put(getId(), getNome());
                cadastroFisico.put(getId()," Nome: "+getNome()+ " CPF: "+getCpf()+" Idade: "+getIdade());          
                System.out.println("PessoaFisica adicionada com sucesso!");
            }else{
                System.out.println("Erro. id já está atribuido.");
            }        
        }

       public void exibirFisica(){
            System.out.println(cadastroFisico);
            System.out.println(cadastro);
            System.out.println("Lista de CPF");
        }
} 
  

    public class PessoaJuridica extends Pessoa{
       private String cnpj;
       private HashMap<Integer, String> cadastroJuridico;
       
        public PessoaJuridica(int id, String nome, String cnpj) {
            super(id, nome);
            this.cnpj = cnpj;
            this.cadastroJuridico = new HashMap<>();
        }
        
        public String getCnpj(){
            return cnpj;
        };
        public void setCnpj(String cnpj){
            this.cnpj = cnpj;
        };

        public void adicionarJuridico(int id, String nome, String cnpj){
            cadastroJuridico.put(id, "Nome: "+nome+" CNPJ: "+cnpj);
            cadastro.put(id, "Nome: "+nome);
        };
        
        public void exibirJuridico(){
            System.out.println(cadastro);
            System.out.println(cadastroJuridico);
        };
    }
}
