package org.example;

import javax.xml.transform.stream.StreamSource;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int xx = sc.nextInt();
        String dia = "dia inicial";

        switch (xx){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
        }
        System.out.println("Dia da semana "+ dia);
        System.out.println(xx);

        int numA, numB;
        numA = sc.nextInt();
        numB = sc.nextInt();

        int soma = numA + numB;
        System.out.println("SOMA = "+ soma);


        //
       /*  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.

        Fórmula da área: area = π . raio2

        Considere o valor de π = 3.14159
        */

        double raio;
        raio = sc.nextDouble();
        double areaCirculo = 3.14159 * Math.pow(raio,2);
        String resultadoCirculo = String.format("%.4f", areaCirculo);
        System.out.println("A="+resultadoCirculo);

        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */

        int intA, intB, intC, intD;
        intA = sc.nextInt();
        intB = sc.nextInt();
        intC = sc.nextInt();
        intD = sc.nextInt();

        int diferenca = ((intA*intB) - (intC*intD));
        System.out.println("DIFERENCA = "+diferenca);

         //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        //
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int a, A;
        a = 5;
        A = 2;
        double resultado;
        resultado = (double) a / A;
        System.out.println(resultado);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // limpar o buffer de leitura
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        double w = 2.0;
        double y =4.0;
        double t = -10;

       double D = Math.sqrt(y);
        System.out.println(D);

        double E = Math.pow(w, y);
        System.out.println(E);

        double F = Math.abs(t); //abs = valor sempre positivo
        System.out.println(F);


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}