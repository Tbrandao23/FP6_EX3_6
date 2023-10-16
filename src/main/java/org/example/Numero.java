package org.example;

public class Numero {

    public int contaDigitos(int num){
        int cont = 0;
        int med = 0;
        int sum = 0;
        while(num > 0){
            cont++;
            int digit = num % 10;
            sum += digit;
            med = sum / cont;
            num /= 10;
        }
        return med;
    }
}
