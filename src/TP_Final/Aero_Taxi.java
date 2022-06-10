package TP_Final;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.File;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

public class Aero_Taxi {


    private static final boolean conCatering = true;
    private static final boolean sinCatering = false;
    private static final boolean conWifi = true;
    private static final boolean sinWifi = false;


    List<Rutas> listaRutas = new ArrayList<Rutas>();
    List<Avion> listaAviones = new ArrayList<Avion>();
    ArrayList<String> listaFechas = new ArrayList(365);
    HashMap<Usuario, Integer> hashMapUsuarios = new HashMap();
    List<Reservas> listaReservas = new ArrayList<Reservas>();


    public void startMenu() {

        File archivoRutas = new File("Rutas.txt");
        File archivoAviones = new File("Aviones.txt");
        File archivoUsuarios = new File("Usuarios.txt");
        File archivoReservas = new File("Reservas.txt");

        int nota, nota1, nota2, nota3, nota5;
        String nota4;

        Scanner entrada = new Scanner(System.in);

        listaRutas.add(new Rutas(Ciudades.BUENOS_AIRES, Ciudades.CORDOBA, 695));
        listaRutas.add(new Rutas(Ciudades.BUENOS_AIRES, Ciudades.SANTIAGO, 1400));
        listaRutas.add(new Rutas(Ciudades.BUENOS_AIRES, Ciudades.MONTEVIDEO, 950));
        listaRutas.add(new Rutas(Ciudades.CORDOBA, Ciudades.MONTEVIDEO, 1190));
        listaRutas.add(new Rutas(Ciudades.CORDOBA, Ciudades.SANTIAGO, 1050));
        listaRutas.add(new Rutas(Ciudades.CORDOBA, Ciudades.BUENOS_AIRES, 695));
        listaRutas.add(new Rutas(Ciudades.MONTEVIDEO, Ciudades.SANTIAGO, 2100));
        listaRutas.add(new Rutas(Ciudades.MONTEVIDEO, Ciudades.CORDOBA, 1190));
        listaRutas.add(new Rutas(Ciudades.MONTEVIDEO, Ciudades.BUENOS_AIRES, 950));

        Bronze bronce1 = new Bronze("BZ 110");
        Bronze bronce2 = new Bronze("BZ 190");
        Bronze bronce3 = new Bronze("BZ 240");

        Silver silver1 = new Silver( "SL 106");
        Silver silver2 = new Silver( "SL 220");
        Silver silver3 = new Silver( "SL 260");

        Gold gold1 = new Gold(conCatering, sinWifi, "GL 130");
        Gold gold2 = new Gold(conCatering, conWifi, "GL 230");
        Gold gold3 = new Gold(conCatering, conWifi, "GL 330");

        listaAviones.add(bronce1);
        listaAviones.add(bronce2);
        listaAviones.add(bronce3);
        listaAviones.add(silver1);
        listaAviones.add(silver2);
        listaAviones.add(silver3);
        listaAviones.add(gold1);
        listaAviones.add(gold2);
        listaAviones.add(gold3);




        listaFechas.add("01-06-2022");
        listaFechas.add("02-06-2022");
        listaFechas.add("03-06-2022");
        listaFechas.add("04-06-2022");
        listaFechas.add("05-06-2022");
        listaFechas.add("06-06-2022");
        listaFechas.add("07-06-2022");
        listaFechas.add("08-06-2022");
        listaFechas.add("09-06-2022");
        listaFechas.add("10-06-2022");
        listaFechas.add("11-06-2022");
        listaFechas.add("12-06-2022");
        listaFechas.add("13-06-2022");
        listaFechas.add("14-06-2022");
        listaFechas.add("15-06-2022");
        listaFechas.add("16-06-2022");
        listaFechas.add("17-06-2022");
        listaFechas.add("18-06-2022");
        listaFechas.add("19-06-2022");
        listaFechas.add("20-06-2022");
        listaFechas.add("21-06-2022");
        listaFechas.add("22-06-2022");
        listaFechas.add("23-06-2022");
        listaFechas.add("24-06-2022");
        listaFechas.add("25-06-2022");
        listaFechas.add("26-06-2022");
        listaFechas.add("27-06-2022");
        listaFechas.add("28-06-2022");
        listaFechas.add("29-06-2022");
        listaFechas.add("30-06-2022");




        Usuario user1 = new Usuario("Matias", "Fierro", "31821264", 36, "Ars28");
        Usuario user2 = new Usuario("Alba", "Rodrigue", "12429874", 76, "mmt520");
        Usuario user3 = new Usuario("Abel", "Saiz", "11720180", 56, "Tx29ui");
        Usuario user4 = new Usuario("Alejandra", "Perez", "21442980", 46, "Rz12ka");
        Usuario user5 = new Usuario("Carlos", "Otamendi", "20219002", 36, "Uko71");
        Usuario user6 = new Usuario("Marcos", "Hagg", "93290012", 21, "mIp11");
        Usuario user7 = new Usuario("Ernesto", "Gomez", "45729934", 22, "73Lop");


        hashMapUsuarios.put(user1, user1.idUsuario);
        hashMapUsuarios.put(user2, user2.idUsuario);
        hashMapUsuarios.put(user3, user3.idUsuario);
        hashMapUsuarios.put(user4, user4.idUsuario);
        hashMapUsuarios.put(user5, user5.idUsuario);
        hashMapUsuarios.put(user6, user6.idUsuario);
        hashMapUsuarios.put(user7, user7.idUsuario);


        do {

            System.out.println("----AERO TAXI---- \n");
            System.out.println("1- RUTAS ");
            System.out.println("2- NUESTORS AVIONES");
            System.out.println("3- USUARIOS REGISTRADOS");
            System.out.println("4- REGISTRARSE\n");
            System.out.println("0- Salir");

            nota = entrada.nextInt();


            switch (nota) {
                case 1:
                    do {
                        System.out.println("MENU RUTAS: \n");
                        System.out.println("1- CONSULTA \n ");
                        System.out.println("2- FECHAS DISPONIBLES\n");
                        System.out.println("3- \n ");
                        System.out.println("0- Menu Anterior ");

                        nota1 = entrada.nextInt();

                        switch (nota1) {
                            case 1:
                                System.out.println("Listado de rutas\n");
                                for (Rutas ruta : listaRutas) {
                                    System.out.println(ruta.toString());
                                }
                                break;
                            case 2:
                                for (String fecha : listaFechas) {

                                    System.out.println(fecha.toString());
                                }

                                break;
                            case 3:

                                break;

                            case 4:

                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");

                        }
                    } while (nota1 > 0 && nota1 <= 4);
                    break;
                case 2:
                    do {
                        System.out.println("MENU AVIONES: \n");
                        System.out.println("1- BRONZE ");
                        System.out.println("2- SILVER ");
                        System.out.println("3- GOLD \n ");
                        System.out.println("0- Volver ");

                        nota2 = entrada.nextInt();

                        switch (nota2) {
                            case 1:
                                System.out.println("Caracteristica");

                                System.out.println(bronce1.toString());

                                break;
                            case 2:
                                System.out.println("Caracteristica");
                                System.out.println(silver1.toString());
                                break;
                            case 3:
                                System.out.println("Caracteristica");
                                System.out.println(gold1.toString());
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");

                        }
                    } while (nota2 > 0 && nota2 <= 3);
                    break;

                case 3:
                    do {
                        System.out.println("MENU USUARIOS \n");
                        System.out.println("1- Login");
                        System.out.println("2- Reservar");
                        System.out.println("3- Lista de Usuarios");
                        System.out.println("4- ");
                        System.out.println("5- \n");
                        System.out.println("0- Volver ");

                        nota3 = entrada.nextInt();

                        switch (nota3) {
                            case 1:

                                String str, str1;
                                Scanner entrada1 = new Scanner(System.in);
                                System.out.println("Ingrese su dni");
                                str = entrada1.nextLine();
                                System.out.println("Ingrese su contraseña");
                                str1 = entrada1.nextLine();

                                if (loguinUsuario(str, str1, hashMapUsuarios)) {
                                    System.out.println("usuario logueado");
                                }

                                break;
                            case 2:
                                do {
                                    System.out.println("1- Ida");
                                    System.out.println("2- Ida y vuelta" + "\n");
                                    System.out.println("0- Volver");

                                    nota5 = entrada.nextInt();

                                    switch (nota5) {
                                        case 1:
                                            try {
                                                nuevaReservaIda();
                                            }catch (ParseException e){
                                                e.getMessage();
                                            }

                                            break;
                                        case 2:
                                            try {
                                                nuevaReservaIdaVuelta();;
                                            }catch (ParseException e){
                                                e.getMessage();
                                            }

                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Opcion Incorrecta");
                                    }

                                }while (nota5 > 0 && nota5 <= 2);
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion incorrecta");

                        }
                    } while (nota3 > 0 && nota3 <= 5);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        } while (nota != 0);

    }

    public void calculoTotalVuelo() {
    }

    ;

    public void nuevaReservaIdaVuelta() throws ParseException {

        Scanner entrada4 = new Scanner(System.in);
        String origen, destino, dni, fechaVueloIda, fechaVueloVuelta, codigoAvion, formato = "dd-MM-yyy";
        int cantidadPasajeros;
        //SimpleDateFormat formatoString = new SimpleDateFormat(formato);


        do {
            System.out.println("Ciudad de origen");
            System.out.println("BUENOS_AIRES / CORDOBA / SANTIAGO / MONTEVIDEO");
            origen = entrada4.nextLine();

            System.out.println("Ciudad de destino");
            System.out.println("BUENOS_AIRES / CORDOBA / SANTIAGO / MONTEVIDEO");
            destino = entrada4.nextLine();

            if (origen.equals(destino)) {
                System.out.println("Error, el origen debe ser diferente al destino.");
            }

        } while (origen.equals(destino));

        System.out.println("Fecha Ida (DD-MM-AAAA)");
        fechaVueloIda = entrada4.nextLine();


        LocalDate localDate = LocalDate.parse(fechaVueloIda);
        //fechaVueloIda = formatoString.format(new Date());
        //Date idaFormteada = formatoString.parse(fechaVueloIda);

        System.out.println("Fecha Vuelta (DD-MM-AAAA)");
        fechaVueloVuelta = entrada4.nextLine();

       // fechaVueloVuelta = formatoString.format(new Date());

        // Date vueltaFormateado = formatoString.parse(fechaVueloVuelta);

        System.out.println("Ingrese cantidad de pasajeros)");
        cantidadPasajeros = entrada4.nextInt();

        System.out.println("Ingrese el codigo del avion");
        codigoAvion = entrada4.nextLine();

        System.out.println("Ingrese su DNI");
        dni = entrada4.nextLine();


        Reservas reserva1 = new Reservas(buscaUsuario(dni,hashMapUsuarios),origen,destino,codigoAvion,idaFormteada,vueltaFormateado,cantidadPasajeros);
        System.out.println(reserva1.toString());

        listaReservas.add(reserva1);
    }

    public void nuevaReservaIda() throws ParseException {

        Scanner entrada4 = new Scanner(System.in);
        String origen, destino, dni, fechaVueloIda, codigoAvion;
        int cantidadPasajeros;
        SimpleDateFormat formatoString = new SimpleDateFormat("dd-mm-yyyy");


        do {
            System.out.println("Ciudad de origen");
            System.out.println("BUENOS_AIRES / CORDOBA / SANTIAGO / MONTEVIDEO");
            origen = entrada4.nextLine();

            System.out.println("Ciudad de destino");
            System.out.println("BUENOS_AIRES / CORDOBA / SANTIAGO / MONTEVIDEO");
            destino = entrada4.nextLine();


            if (origen.equals(destino)) {
                System.out.println("Error, el origen debe ser diferente al destino.");
            }

        } while (origen.equals(destino));

        System.out.println("Fecha Ida (DD-MM-AAAA)");
        fechaVueloIda = entrada4.nextLine();
        Date idaFormteada = formatoString.parse(fechaVueloIda);

        System.out.println("Ingrese cantidad de pasajeros)");
        cantidadPasajeros = entrada4.nextInt();

        System.out.println("Ingrese el codigo del avion");
        codigoAvion = entrada4.nextLine();

        System.out.println("Ingrese su DNI");
        dni = entrada4.nextLine();


        Reservas reserva1 = new Reservas(buscaUsuario(dni,hashMapUsuarios),origen,destino,codigoAvion,idaFormteada,cantidadPasajeros);
        System.out.println(reserva1.toString());

        listaReservas.add(reserva1);
    }

    public Usuario registroUsuario() {

        Scanner entrada2 = new Scanner(System.in);
        String nombre, apellido, dni, contraseña;
        int edad;

        System.out.println("Ingrese Nombre");
        nombre = entrada2.nextLine();
        System.out.println("Ingrese Apellido");
        apellido = entrada2.nextLine();
        System.out.println("Ingrese DNI");
        dni = entrada2.nextLine();
        System.out.println("Ingrese Edad");
        edad = entrada2.nextInt();
        System.out.println("Ingrese Contrseña");
        contraseña = entrada2.nextLine();


        Usuario user = new Usuario(nombre, apellido, dni, edad, contraseña);

        return user;
    }


    //busca usuario y lo loguea
    public boolean loguinUsuario(String dni, String pass, HashMap<Usuario, Integer> map) {

        boolean exist = false;
        for (Usuario key : map.keySet()) {

            if (key.dni.equals(dni) && key.password.equals(pass)) {
                exist = true;
                key.logueado = true;
            }
        }
        if (!exist) System.out.println("usuario o contraseña incorrecta");
        return exist;
    }

    //busca usuario en el hashmap y si lo encuentra lo devuelve
    public Usuario buscaUsuario(String dni, HashMap<Usuario, Integer> map) {

        Usuario user = new Usuario();


        for (Usuario key : map.keySet()) {

            if (key.dni.equals(dni)&& key.logueado==true) {
                user = key;
            }

        }
        return user;
    }

    public void comparaCiudad(Ciudades ciudad, String oD) {

    }


    public void buscaAvion(List<Avion> avion, String codigo) {

    }

    public void recorrerCiudades (List<Ciudades> city, String origen, String destino){


    }
    //public boolean fechaDispobible
}



