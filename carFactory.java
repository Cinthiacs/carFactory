package Desafio_carFactory;
import java.util.Locale;
import java.util.Scanner;

// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

public class carFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, caro Usuário! Digite seu nome Abaixo: ");
        String name = scanner.nextLine();

        System.out.println(name + " Digite a marca veículo abaixo: ");
        String carName = scanner.nextLine();

        System.out.println(name + " Digite o custo de fábrica do veículo abaixo: ");
        float distributorPrice = scanner.nextFloat();
        
        System.out.println(name + " Digite abaixo o valor numérico da porcentagem do distribuidor (ex:3.5): ");
        int distributorPercentage = scanner.nextInt();

        System.out.println(name + " Digite abaixo o valor numérico da porcentagem do imposto (ex:10.4): ");
        int percentageTax = scanner.nextInt();

        System.out.println(name + " O veículo " + carName);

        float salePrice = ((distributorPrice*(distributorPercentage+percentageTax)/100)+ distributorPrice);
        System.out.println("O valor para venda é de: " + salePrice); 

        
    }
}

