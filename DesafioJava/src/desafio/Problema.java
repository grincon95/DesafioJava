package desafio;
import mx.com.sintelti.desafios.oporx.Solucion;

import java.util.ArrayList;

public class Problema implements Solucion {

    private int contador;
    private String cadenaSalida;
    private String cadenaEntrada;
    private String variable;
   private  char chars;


    public Problema() {
        cadenaSalida = "";
        chars = 'x';
        cadenaEntrada = "";
    }

    public String convertir(String entrada) {
        contador = 0;
        int acumulado = 0;
        variable = entrada;
        ArrayList<String> Lista = new ArrayList<String>();
        for (char caracter : entrada.toCharArray()) {
            for (int b = 0; b < entrada.length(); b++) {
                this.variable = entrada.substring(b);
                this.cadenaEntrada = variable.substring(0, 1);
                Lista.add(this.cadenaEntrada);
            }
            for (int x = 0; x <= cadenaSalida.length(); x++) {
                cadenaSalida = entrada.replace('o',chars);
                for (String caracterCadena : Lista) {
                    if (caracterCadena.equals("o")) {
                        caracterCadena = "";
                        acumulado++;
                        for (int contador = 0; contador <= acumulado; contador++) {
                            caracterCadena ="x";
                        }
                    }
                    this.cadenaSalida += caracterCadena;
                }
            }
        }
        return cadenaSalida;
    }



}//fin de la clase