package desafio;
import mx.com.sintelti.desafios.oporx.Solucion;

import java.util.ArrayList;

public class Problema implements Solucion {

    int lentgth;
    String salida;
    char chars;
    String entrada;
    String temp;

    public Problema() {
        this.lentgth = 0;
        LimpiarValores();
    }

    private void LimpiarValores() {
        salida = "";
        chars = 'x';
        entrada = "";
    }

    public String convertir(String entrada) {
        lentgth = 0;
        LimpiarValores();
        int acumulado = 0;
        temp = entrada;
        ArrayList<String> Lista = new ArrayList<String>();
        for (char caracter : entrada.toCharArray()) {
            for (int b = 0; b < entrada.length(); b++) {
                this.temp = entrada.substring(b);
                this.entrada = temp.substring(0, 1);
                Lista.add(this.entrada);
            }
            for (int x = 0; x <= salida.length(); x++) {
                salida = entrada.replace('o',chars);
                for (String caracterCadena : Lista) {
                    if (caracterCadena.equals("o")) {
                        caracterCadena = "";
                        acumulado++;
                        for (int contador = 0; contador <= acumulado; contador++) {
                            caracterCadena ="x";
                        }
                    }
                    this.salida += caracterCadena;
                }
            }
        }
        return salida;
    }



}//fin de la clase