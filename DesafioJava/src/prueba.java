public class prueba {


    public static void main(String[] args) {

        // Texto
        String sTexto = "Hola como estas";
        // Texto que vamos a buscar
        String sTextoBuscado = "o";
        // Contador de ocurrencias
        int contador = 0;

        while (sTexto.indexOf(sTextoBuscado) > -1) {
            sTexto = sTexto.substring(sTexto.indexOf(
                    sTextoBuscado) + sTextoBuscado.length());

            contador++;
        }

        System.out.println(contador);
    }


}
