import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cargaProjeto = 15.0;
        double limiteSeguro = cargaProjeto * 0.8;

        System.out.println("--- Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.print("Digite a leitura atual do sensor (km/l): ");
        double cargaAtual = teclado.nextDouble();

        if(cargaAtual < limiteSeguro){
            System.out.println("Status: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parametros de segurança");
        } else if(cargaAtual >= limiteSeguro && cargaAtual <= cargaProjeto){
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não essencial");
        } else {
            System.out.println("Status: VERMELHO (CRITICO)");
            System.out.println("Decisão: INTERROMPER IMEDIATAMENTE: Risco de colapso das escoras");

            if(cargaAtual >= (cargaProjeto * 1.22)){
                System.out.println("ALERTA ADICIONAL: Possivel falha catastrofe iminente. Evacuar area total");
            }
        }
    }
}
