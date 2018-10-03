package desafio;
import mx.com.sintelti.desafios.oporx.Solucion;

import static sun.invoke.util.ValueConversions.cast;

public class Problema implements Solucion {

    private String entrada;

    //constructor sin parametros
public Problema(){
    entrada ="Desconocido";
}//fin del contructor


    @Override
    public String convertir(String entrada) {

        entrada=entrada.replaceAll("o","x");

        return entrada;
    }


    public String getEntrada() {
    entrada=convertir(entrada);
        return entrada;
    }
}
