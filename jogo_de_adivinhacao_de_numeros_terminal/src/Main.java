import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aletorio = new Random();
        int vadilacao = 0;
        int numero_aletoria = aletorio.nextInt(10);
        do {
            System.out.println("Digite o número que estou pensando");
            int n1 = leitor.nextInt();
            if (n1==numero_aletoria){
                vadilacao = 1;
                System.out.println("Acertou");
            }else {
                System.out.println("Erro! Tentou Novamente");
            }
        } while (vadilacao!=1);
        System.out.println("Fim");
        leitor.close();
    }
}
