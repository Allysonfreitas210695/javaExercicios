import java.util.Scanner;

public class ClienteShow {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner leitor = new Scanner(System.in);
        boolean verificar = true;
        
        while (verificar){
           verificar = cliente.verificarId(leitor, cliente);
        }

        cliente.imprimirArrayListe();
        System.out.println("Tamanho do array de Cliente!");
        System.out.println(cliente.tamanhoArrayCliente());
        leitor.close();
    }
}
