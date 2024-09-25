
package modelo;


public class OperacionesMatematicas {
    public int factorial (int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial (a - 1);
        }
    }
    
    public int exponente (int base, int exp){
        if(exp == 1 ){
            return base;
        } else if (exp == 0) {
            return 1;
        } else {
            return base * exponente(base, exp -1);
        }
    }
}
