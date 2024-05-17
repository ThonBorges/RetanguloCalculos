package application;

import java.util.Locale;
import java.util.Scanner;
import entities.FuncoesRet;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FuncoesRet X;
        X = new FuncoesRet();

        System.out.println("Digite um valor para a altura do Retângulo: ");
        X.altura = sc.nextDouble();

        System.out.println("Agora digite o valor da largura do Retângulo: ");
        X.largura = sc.nextDouble();

        double resultArea = X.areaRet();
        double resultDiagonal = X.diagonalRet();
        double resultPerimetro = X.perimetroRet();

        System.out.printf("A area do retangulo é: %.2f\n", resultArea);
        System.out.printf("O perímetro do retângulo é: %.2f\n", resultPerimetro);
        System.out.printf("A diagona do retângulo é: %.2f\n", resultDiagonal);

        sc.close();
    }
}
