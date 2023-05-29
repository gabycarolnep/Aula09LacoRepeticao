import java.util.Scanner;

public class Lista1exercicio05 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Quantas pessoas estão na fila com você? ");

        int numPessoasFila = entrada_do_usuario.nextInt();
        int cont = numPessoasFila - 1;

        while (cont <= numPessoasFila && cont != -1) {
            System.out.println("Número, " + (cont + 1) + " por favor!");
            cont = cont - 1;
        } System.out.println("Ufa... achei que não fosse acabar nunca");
        System.out.println("Angela, ainda estamos gravando");
        System.out.println("ops!... CORTA!");


    }
}
