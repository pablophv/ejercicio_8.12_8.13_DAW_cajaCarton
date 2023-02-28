public class Main {

    public static void main(String[] args) {

        Unidad metros = new Unidad("metros");
        Unidad cm = new Unidad("cm");
        Caja caja1 = new Caja(15,20,20,metros, "");
        Caja caja2 = new Caja(15,50,20,cm,"");

        caja1.setEtiqueta("Pablo Hita, C/java n88");
        caja2.setEtiqueta("Raquel Garreda, C/php n92");


        System.out.println(caja1);
        System.out.println("Superficie: "+caja1.calcularSuperficie()+" cm2");
        System.out.println("Volumen: "+caja1.getVolumen()+"cm3");
        System.out.println(caja2);
        System.out.println("Superficie: " + caja2.calcularSuperficie()+" cm2");
        System.out.println("Volumen: "+caja2.getVolumen()+"cm3");




        System.out.println("\n-------------------------------------Cajas de carton----------------------------------------");
        Caja cajaCarton1 = new CajaCarton(15,20,20,metros, "Calle php n5 p4");
        Caja cajaCarton2 = new CajaCarton(15,50,20,cm,"Av CSS n69");
        System.out.println();
        System.out.println(cajaCarton1);
        System.out.println("Volumen: "+cajaCarton1.getVolumen()+ " cm3");
        System.out.println("Superficie: "+cajaCarton1.calcularSuperficieCajaCarton()+" cm2");
        System.out.println(cajaCarton2);
        System.out.println("Volumen: " + cajaCarton2.getVolumen()+" cm3");
        System.out.println("Superficie: " + cajaCarton2.calcularSuperficieCajaCarton()+" cm2");
        System.out.println();






    }
}
