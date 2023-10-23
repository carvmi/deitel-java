import java.util.Scanner;

public class CalculadoraEmissaoCarbono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Emissão de Carbono");
        System.out.println("Escolha a fonte de emissão:");
        System.out.println("1. Transporte");
        System.out.println("2. Eletricidade");
        System.out.println("3. Uso de Gás");

        int escolha = scanner.nextInt();

        double emissaoCarbono = 0.0;

        switch (escolha) {
            case 1:
                emissaoCarbono = calcularEmissaoTransporte();
                break;
            case 2:
                emissaoCarbono = calcularEmissaoEletricidade();
                break;
            case 3:
                emissaoCarbono = calcularEmissaoGas();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Emissão de Carbono: " + emissaoCarbono + " kg de CO2 equivalente");
    }

    public static double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Emissão de Carbono - Transporte");
        System.out.print("Informe o tipo de veículo (1 - Carro, 2 - Ônibus, 3 - Bicicleta): ");
        int tipoVeiculo = scanner.nextInt();

        double distanciaPercorrida;
        System.out.print("Informe a distância percorrida (em quilômetros): ");
        distanciaPercorrida = scanner.nextDouble();

        double fatorEmissao = 0.0;

        switch (tipoVeiculo) {
            case 1: // Carro
                fatorEmissao = 0.2; // Fator de emissão fictício para carros em kg de CO2 por km
                break;
            case 2: // Ônibus
                fatorEmissao = 0.05; // Fator de emissão fictício para ônibus em kg de CO2 por km
                break;
            case 3: // Bicicleta
                fatorEmissao = 0.0; // Bicicletas não emitem carbono
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                return 0.0; 
        }
        
        // Calcular a emissão de carbono
        
         double emissaoCarbono = distanciaPercorrida * fatorEmissao;
         System.out.println("Emissão de Carbono: " + emissaoCarbono + " kg de CO2 equivalente");
         scanner.close();
         return emissaoCarbono;
    }

    public static double calcularEmissaoEletricidade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Emissão de Carbono - Eletricidade");

        // Solicitar dados de entrada do usuário
        System.out.print("Informe o consumo de eletricidade em kWh: ");
        double consumoEletricidade = scanner.nextDouble();

        // Solicitar o fator de emissão de CO2 para a região do usuário em kg de CO2 por kWh
        System.out.print("Informe o fator de emissão de CO2 (kg CO2/kWh): ");
        double fatorEmissao = scanner.nextDouble();

        // Calcular a emissão de carbono
        double emissaoCarbono = calcularEmissaoEletricidade(consumoEletricidade, fatorEmissao);

        System.out.println("Emissão de Carbono: " + emissaoCarbono + " kg de CO2 equivalente");
        scanner.close();
        return emissaoCarbono;
    }

    public static double calcularEmissaoEletricidade(double consumoEletricidade, double fatorEmissao) {
        // Fórmula para calcular a emissão de carbono: Consumo (kWh) * Fator de Emissão (kg CO2/kWh)
        return consumoEletricidade * fatorEmissao;
    }

    public static double calcularEmissaoGas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Emissão de Carbono - Uso de Gás");
        System.out.print("Informe o consumo de gás (em metros cúbicos): ");
        double consumoGas = scanner.nextDouble();

        // Fator de emissão de gás (em kg de CO2 equivalente por metro cúbico)
        double fatorEmissaoGas = 2.0; // Substitua pelo fator de emissão real

        double emissaoCarbonoGas = calcularEmissaoGas(consumoGas, fatorEmissaoGas);

        System.out.println("Emissão de Carbono do uso de gás: " + emissaoCarbonoGas + " kg de CO2 equivalente");
        scanner.close();
        return emissaoCarbonoGas;
    }

    public static double calcularEmissaoGas(double consumoGas, double fatorEmissaoGas) {
        return consumoGas * fatorEmissaoGas;
    }
}
