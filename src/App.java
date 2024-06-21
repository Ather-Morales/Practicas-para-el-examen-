
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static String marca; 
    public static String año;
    public static String tipcombu;
    public static String kilometraje; 
    public static String carplaca; 

    public static Vehiculo nuevovehiculo;
    public static ArrayList <Vehiculo> vehiculos= new ArrayList <Vehiculo>();

    public static Scanner lumi= new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al sistema de registro vehicular de la consecionaria ´El Chele'");



        boolean Meli= true; 

        do {
            try {
                
                System.out.println("Que desea realizar?");
    
                System.out.println("============================");
    
                System.out.println("1- Añadir");
                System.out.println("2- Mostrar catalogo");
                System.out.println("3- Buscar");
                System.out.println("4- Eliminar");
                System.out.println("5- Guardar");
                System.out.println("6- Salir");
    
                int opcion= lumi.nextInt();
                lumi.nextLine();
    
    
                switch (opcion) {
                    case 1:
                        añadir();
                        break;
                    case 2:
                        Mostrarcat();
                        break;
                    case 3:
    
                        BuscarVehiculo(carplaca);
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
    
                     System.out.println("Muchas gracias por utilizar nuestro sistema, vuelva pronto.");
                     Meli=false; 
                        
                        break;
                    
                    default:
                    System.out.println("Opcion no valida, porfavor intente de nuevo");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Opcion invalida, porfavor intente de nuevo.");
            }
        } while (Meli);




    }

    public static void añadir (){

        System.out.println("Ingrese los datos del vehiculo");
        
        System.out.println("1. Marca");

        String marca= lumi.nextLine();

        System.out.println("2. Año");

        String año= lumi.nextLine();

        System.out.println("3. Tipo de cobustible");

        String tipcombu= lumi.nextLine();

        System.out.println("4. Kilometraje");

        String kilometraje= lumi.nextLine();

        System.out.println("5. Numero de placa");
        
        String placa= lumi.nextLine();

        nuevovehiculo= new Vehiculo(marca, año, tipcombu, kilometraje, placa);

        vehiculos.add(nuevovehiculo);

        

        

    }

    public static void Mostrarcat(){

        System.out.println("==========================================================");
        for (Vehiculo vehiculo : vehiculos) {

            

            System.out.println("1. Marca: "+ vehiculo.marca);
            System.out.println("2. Año: "+ vehiculo.año);
            System.out.println("3. Tipo de combustible: "+ vehiculo.tipcombu);
            System.out.println("4. Kilometraje: "+ vehiculo.kilometraje);
            System.out.println("5. Placa: "+ vehiculo.carplaca);


            
        }

        System.out.println("=========================================================");
        

    }


    public static Vehiculo BuscarVehiculo (String Placa){

        Vehiculo buscar= null;
        
        for (Vehiculo vehiculo : vehiculos) {
        
            if (vehiculo.carplaca.equals(Placa)) {

                buscar= vehiculo;
                break;
            }
            
           

        }



        return buscar;



    }

    public static void eliminarVehiculos(){

        Vehiculo buscar= null;

        for (Vehiculo vehiculo : vehiculos) {
            
            if (buscar==null) {
                System.out.println("Vehiculo no encontrado");
            } else {
                
            }



        }



    }



}
