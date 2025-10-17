import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuffer resposta = new StringBuffer();
        float montante = 0;
        DecimalFormat df = new DecimalFormat("R$ #,###.00");

        try{
            montante = valorParaParticionar();
            resposta.append("Particionamento de " + df.format(montante) + "\n");
        }catch (InputMismatchException e){
            System.out.println("Erro: Use apenas números e vírgula");
        }catch (Exception e){
            System.out.println(e);
        }

        int[] valoresCedulas = {100,50,20,10,5,2};
        float[] valoresMoedas = {1F,0.5F,0.25F,0.1F,0.05F,0.01F};


        for(int divisor : valoresCedulas){
            var ciclo = (int) montante / divisor;
            if(ciclo!=0){
                resposta.append(ciclo + " cédula(s) de " + divisor + " R$\n");
                montante -= (ciclo * divisor);
            }
        }

            if(montante<=1.99F) {
                for (Float divisorM : valoresMoedas) {
                    var cicloM =  montante / divisorM;
                    if ((int) cicloM != 0) {
                        resposta.append( (int) cicloM + " moedas(s) de " + divisorM + " \u00A2\n");
                        cicloM = (int) cicloM;
                        montante -= divisorM * cicloM;
                        montante = (float) (Math.round(montante * 100.0) / 100.0);
                    }
                }
            }



        System.out.println(resposta.toString());


    }

    public static float valorParaParticionar() throws InputMismatchException {
        Scanner leitura = new Scanner(System.in);

        System.out.print("\nDigite o valor a ser particionado: ");
        float valor = leitura.nextFloat();
        leitura.close();
        return valor;
    }
}
