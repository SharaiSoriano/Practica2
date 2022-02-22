/**************************************
Maria Sharai Soriano de Avila 1273173

***************************************/

class mascota{
    public String nombre;
    public int edad;
    public String raza;
    public String genero;
    public String color;
    
}
class celular{
    public String marca;
    public int RAM;
    public String modelo;
    public String Operador;
    public String color;
    
}

class laptop{
    public String marca;
    public int pulgadas;
    public int RAM;
    public String SO;
    public String color;
    
}
class supermercado{
    public String nombre;
    public int tamano;
    public String departamento;
    public String ubicacion;
    public String color;
    
}
class television{
    public String marca;
    public int pulgadas;
    public int resolucion;
    public String SO;
    public String conector;
    
}

public class Main
{
 
    public static void main(String[] args) {
 
        mascota m1 = new mascota(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("MENU DE CLASES");
            System.out.println("1. Clase Mascota");
            System.out.println("2. Clase celular");
            System.out.println("3. Clase laptop");
            System.out.println("4. Clase supermercado");
            System.out.println("5. Clase television");
            System.out.println("6. Salir");
 
            try {
 
                System.out.println("Escoge una clase: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        public static void Main ( String[] args) {
                        mascota m1 = new mascota(System.in);
                        m1.nombre = "Zeus";
                        m1.edad = "8";
                        m1.raza = "Chihuahua";
                        m1.genero = "macho";
                        m1.color = "negro";
                        System.out.println(m1);
                        }
                        break;
                    case 2:
                        public static void Main ( String[] args)
                        {
                        celular c1 = new celular(System.in);
                        c1.marca = "samsung";
                        c1.RAM = "8";
                        c1.modelo = "gran prime";
                        c1.Operador = "telcel";
                        c1.color = "negro";
                        
                        System.out.println(c1);
                        break;
                    case 3:
                        public static void Main ( String[] args)
                        {
                        laptop L1 = new laptop(System.in);
                        L1.marca = "hp";
                        L1.RAM = "64";
                        L1.pulgadas = "15";
                        L1.SO = "windows";
                        L1.color = "negro";
                        
                        System.out.println(L1);
                        break;
                    case 4:
                        public static void Main ( String[] args)
                        {
                        supermercado sm1 = new supermercado(System.in);
                        sm1.nombre = "walmart";
                        sm1.ubicacion = "Tijuana";
                        sm1.tamano = "18 301,9";
                        sm1.departamento = "panaderia";
                        sm1.color = "azul";
                        System.out.println(sm1);
                        break;
                    case 5:
                        public static void Main ( String[] args)
                        {
                        television t1 = new television(System.in);
                        t1.marca = "Hisense";
                        t1.resolucion = "1080";
                        t1.pulgadas = "32";
                        t1.conector = "usb";
                        t1.color = "negro";
                        
                        System.out.println(t1);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }
 
    }
 
}

