public class Main {
    public static void main(String[] args) {

        Contenedor<Object> caja = new Contenedor<>(2);

        caja.agregar(1);
        caja.agregar("hola");
        caja.visualizar();
        caja.quitar(1);
        caja.verificar(0);
        caja.visualizar();

        //equals

        Contenedor<Object> caja2 = new Contenedor<>(1);
        caja2.agregar(1);
        caja2.visualizar();
        System.out.println(caja.equals(caja2));


    }
}
