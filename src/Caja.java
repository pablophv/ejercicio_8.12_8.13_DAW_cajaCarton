import java.util.Scanner;

public class Caja {

    final double largo;
    final double ancho;
    final double alto;
    protected String etiqueta = "";
    protected Unidad unidad;
    public Caja(double alto, double ancho, double fondo,Unidad unidad, String etiqueta) {
        this.largo = alto;
        this.ancho = ancho;
        this.alto = fondo;
        this.unidad = unidad;
        this.etiqueta = etiqueta;

    }

    public void setEtiqueta(String nombreEtiqueta) {
            if(nombreEtiqueta.length() < 30){
               this.etiqueta = nombreEtiqueta;
            }else{
                System.out.println("Etiqueta demasiado larga");
            }
    }

    public double getVolumen(){
        double volumen;
        volumen = largo * ancho * alto;

        return volumen;
    }

    public String toString(){
        return "\nLargo: "+largo+" " +unidad.toString()+"\nAncho: "+ancho+" " +unidad.toString()+"\nAlto: " +
                alto+" " + unidad.toString()+"\nInformacion etiqueta: "+etiqueta;
    }

    public double calcularSuperficie(){
        //superficie = (2*ancho*fondo)+(2*ancho*alto)+(2*fondo*alto);

        double superficie = (2*ancho*largo)+(2*ancho*alto)+(2*largo*alto);
        return superficie;
    }

    public double calcularSuperficieCajaCarton(){
        //superficie = (2*ancho*fondo)+(2*ancho*alto)+(2*fondo*alto);

        double superficie = 0.8*(2*ancho*largo)+(2*ancho*alto)+(2*largo*alto);
        return superficie;
    }
}
