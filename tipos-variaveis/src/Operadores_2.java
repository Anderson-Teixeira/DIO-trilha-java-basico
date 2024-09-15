public class Operadores_2 {
    
    public static void main(String[] args){
        int numero = 5;

        System.out.println(numero); 
        
        System.out.println("++ numero");
        System.out.println(++ numero); 
        
        System.out.println("-- numero");
        System.out.println(-- numero); 
        
        System.out.println("++ numero");
        System.out.println(++ numero); 

        numero = - numero;
        
        System.out.println("numero = - numero"); 
        System.out.println(numero); 
        // para tornar o numero positivo é necessário uma multiplicação, podemos fazer de duas formas
        numero = - (numero);
        System.out.println("numero = - (numero)");
        System.out.println(numero);
        // ou numero = numero * -1;
        numero = -6;
        System.out.println("numero negativo novamente para testar a proxima forma: " + numero);
        numero = numero * -1;
        System.out.println("numero = numero * -1");
        System.out.println(numero);
    }
}