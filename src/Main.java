import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String resultado;
        int dinheiro;
        Scanner le = new Scanner(System.in);

        dinheiro = le.nextInt();
        le.close();
        resultado = dinheiro + "\n";

        if(dinheiro >100){
            resultado += dinheiro/100 + " nota(s) de R$ 100,00\n";
            dinheiro = (dinheiro - ((dinheiro/100)*100));
        }else{
            resultado += "0 nota(s) de R$ 100,00\n";
        }
        if(dinheiro >50){
            resultado += dinheiro/50 + " nota(s) de R$ 50,00\n";
            dinheiro = (dinheiro - ((dinheiro/50)*50));
        }else{
            resultado += "0 nota(s) de R$ 50,00\n";
        }
        if(dinheiro >20){
            resultado += dinheiro/20 + " nota(s) de R$ 20,00\n";
            dinheiro = (dinheiro - ((dinheiro/20)*20));
        }else{
            resultado += "0 nota(s) de R$ 20,00\n";
        }
        if(dinheiro >10){
            resultado += dinheiro/10 + " nota(s) de R$ 10,00\n";
            dinheiro = (dinheiro - ((dinheiro/10)*10));
        }else{
            resultado += "0 nota(s) de R$ 10,00\n";
        }
        if(dinheiro >5){
            resultado += dinheiro/5 + " nota(s) de R$ 5,00\n";
            dinheiro = (dinheiro - ((dinheiro/5)*5));
        }else{
            resultado += "0 nota(s) de R$ 5,00\n";
        }
        if(dinheiro >2){
            resultado += dinheiro/2 + " nota(s) de R$ 2,00\n";
            dinheiro = (dinheiro - ((dinheiro/2)*2));
        }else{
            resultado += "0 nota(s) de R$ 2,00\n";
        }
        if(dinheiro >= 1){
            resultado += dinheiro/1 + " nota(s) de R$ 1,00\n";
            dinheiro = (dinheiro - ((dinheiro/1)*1));
        }else{
            resultado += "0 nota(s) de R$ 1,00\n";
        }
        System.out.println(resultado);
    }
}
