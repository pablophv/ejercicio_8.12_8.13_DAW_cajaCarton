public class CajaCarton extends Caja {
    public CajaCarton(double alto, double ancho, double largo, Unidad unidad,String etiqueta) {

        super(alto, ancho, largo, unidad,etiqueta);
        this.unidad.establecerUnidad("cm");

    }
    public double getVolumen(){
        double volumenCajaBici;
        double volumenCaja;
        volumenCaja = super.getVolumen();
        volumenCajaBici =  volumenCaja*0.8;
        return volumenCajaBici;
    }


}
