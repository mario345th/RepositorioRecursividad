
package modelo;


public class OperacionesMatematicas {
    public int factorial (int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial (a - 1);
        }
    }
    
    public static void main(String[] args) {
        
        OperacionesMatematicas o = new OperacionesMatematicas ();
        System.out.println(o.factorial(5));
    }
}
