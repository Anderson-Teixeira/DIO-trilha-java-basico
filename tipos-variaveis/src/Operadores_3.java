public class Operadores_3 {
    public static void main(String[] args){
        // Repetições
        int numero = 5;
        System.out.println("Valor inicial da variavel:  " + numero);

        // incremento de um numero pode ser feito por: numero++ 
        // ou numero = numero + 1;

        numero++;
        System.out.println("Incrementando a variavel usando ++");
        System.out.println("Resultado: " + numero);

        /* System.out.println(numero++) não resultaria em uma impressão com valor incremntado
        pois o incremento vem após a impressão da variavel, porém se a expressão fosse: System.out.println(++ numero) o valor impresso ja teria o incremento, então a posição do operador de incremento muda a ordem da execução do incremento */ 
        

        // Negando valores booleanos

        boolean variavel = true;
        System.out.println("Valor inicial da variavel booleana: " + variavel);

        System.out.println("Negando a variavel booleana");
        System.out.println("Resultado da variavel: " + !variavel);
    }
    
}
