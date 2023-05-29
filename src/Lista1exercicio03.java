public class Lista1exercicio03 {
    public static void main(String[] args) {
        int cont = 1;

        while (cont <= 5){
            System.out.println(cont);
            cont += 1;
        }

        int somaNumeros = (cont=1) + (cont=2) + (cont=3) + (cont=4) + (cont=5);
        System.out.println("A soma desses 5 números é: " + somaNumeros);



    }
}
