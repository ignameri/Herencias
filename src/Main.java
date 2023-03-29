public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.nombre = "Ignacio";
        cliente.edad = 23;
        cliente.telefono = 3546328;
        cliente.credito = 25;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


        Trabajador trabajador = new Trabajador();
        trabajador.salario = 25000;

        System.out.println(trabajador.salario);
    }
}



    class Persona {
        int edad;
        String nombre;
        int telefono;
     }

    class Cliente extends Persona{
        int credito;
    }

    class Trabajador extends Persona{
        int salario;
    }









