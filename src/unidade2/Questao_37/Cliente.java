package Questao_37;
import java.util.ArrayList;
import java.util.Scanner;

// Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone. 
// Faça um programa para solicitar os dados de vários clientes e 
// armazenar em um ArrayList até que se digite um número de ID negativo. 
// Em seguida, exiba os dados de todos os clientes.

public class Cliente {
    private int id, idade;
    private String nome, telefone;
    private ArrayList<Cliente> clientes;

    Cliente(){
         clientes = new ArrayList<Cliente>();
    }

    Cliente(int id, int idade, String nome, String telefone){
        this.setId(id);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setIdade(idade);
    }

    public void addCliente(Cliente cliente){
        if (clientes != null){
            clientes.add(cliente);
        }else{
            System.err.println("Cliente invalido!");
        }
    }

    public void imprimirArrayListe(){
        if(clientes.size() > 0){
            System.out.println(">>>>>>>>>>>>>>>>>>>> Lista de Clientes >>>>>>>>>>>>>>>>>>>>");
            for (Cliente Cliente : clientes) {
                System.out.println(Cliente);
                System.out.println();
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }else{
            System.out.println("Array de Clientes vazio!");
        }
    }

    public boolean verificarId(Scanner leitor, Cliente cliente){
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           System.out.println(">>>>>>>>>>> Cadastra Cliente >>>>>>>>>>>");
           System.out.println("Digite o id do cliente: ");
           int id = leitor.nextInt();
           if(id > 0){
            System.out.println("Digite o Nome do cliente: ");
            String nome = leitor.next();
            leitor.nextLine();

            System.out.println("Digite o idade do cliente: ");
            int idade = leitor.nextInt();
            
            System.out.println("Digite o telefone do cliente: ");
            String telefone = leitor.next();
            leitor.nextLine();

            cliente.addCliente(new Cliente(id, idade, nome, telefone));
            return true;
           }else{
               System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
               System.out.println("ID invalido!, Operação encerrada!");
               System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
               return false;
           }
    } 

    public int tamanhoArrayCliente(){
        return clientes.size();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefonee){
        this.telefone = telefonee;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        
        return "ID: "+ this.getId() + "\n" +
               "Nome: " + this.getNome() + "\n" +
               "Idade: "+ this.getIdade() + "\n" +
               "Telefone: " + this.getTelefone();
    }
}
