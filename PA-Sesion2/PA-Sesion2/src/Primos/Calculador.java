//Calculador sirve para sumar los números primos que hay en un intervalo (x,y)
package Primos;
import java.math.BigInteger;
public class Calculador extends Thread {
    int desde,hasta;
    Resultado r;
    public Calculador(int x, int y, Resultado r){
        desde=x;
        hasta=y;
        this.r=r;
        start();
    }
    public void run(){
        for (int i=desde;i<=hasta;i++)if(esPrimo(i)){
            r.sumar(i);
            
        }
    }
        private boolean esPrimo(int n){
        int raiz = (int) Math.sqrt((double) n);
        for(int i=2;i<=raiz;i++) if (n % i == 0 ) return false;
        return true;
    }
}
