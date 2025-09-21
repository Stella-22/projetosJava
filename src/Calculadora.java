public class Calculadora {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        double divisao = (double)num1/num2;
        int soma = num1+num2;
        int subtracao = num1-num2;
        int multiplicacao = num1*num2;
        int modulo = num1%num2;

        System.out.println("divisao = "+ divisao);
        System.out.println("soma = "+ soma);
        System.out.println("subtração = "+ subtracao);
        System.out.println("multiplicação = "+ multiplicacao);
        System.out.println("Resto = "+ modulo);

        boolean comparador= (num1>num2);

        System.out.println ("num1 > num2? "+ comparador);

        boolean ePar = ((num1 % 2) == 0);

        System.out.println("Num 1 é par? " + ePar);



    }
}
