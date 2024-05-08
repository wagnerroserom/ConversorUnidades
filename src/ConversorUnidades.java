import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



System.out.println("Bienvenido al conversor de unidades.");
System.out.println("Por favor, seleccione el tipo de conversión que desea realizar:");
System.out.println("1. Longitud");
System.out.println("2. Área");
System.out.println("3. Peso");
System.out.println("4. Volumen");
System.out.println("5. Temperatura");
System.out.println("6. Velocidad");
System.out.println("7. Presión");
System.out.println("8. Fuerza");
System.out.println("9. Trabajo");
System.out.println("10. Potencia");

int opcion = scanner.nextInt();

switch (opcion) {
    case 1:
        convertirLongitud();
        break;
    case 2:
        convertirArea();
        break;
    case 3:
        convertirPeso();
        break;
    case 4:
        convertirVolumen();
        break;
    case 5:
        convertirTemperatura();
        break;
    case 6:
        convertirVelocidad();
        break;
    case 7:
        convertirPresion();
        break;
    case 8:
        convertirFuerza();
        break;
    case 9:
        convertirTrabajo();
        break;
    case 10:
        convertirPotencia();
        break;
    default:
        System.out.println("Opción no válida.");
}

scanner.close();
}

public static void convertirLongitud() { 
Scanner scanner = new Scanner(System.in);
System.out.println("Seleccione la unidad de longitud de origen:"); 
System.out.println("1. Metros");
System.out.println("2. Centímetros");
System.out.println("3. Milímetros");
System.out.println("4. Micrómetros");
System.out.println("5. Kilómetros");
System.out.println("6. Decímetros");
System.out.println("7. Pulgadas");
System.out.println("8. Pies");
System.out.println("9. Yardas");
System.out.println("10. Millas");
System.out.println("11. Nanómetros");
System.out.println("12. Millas Náuticas");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de longitud de destino:"); 
System.out.println("1. Metros");
System.out.println("2. Centímetros");
System.out.println("3. Milímetros");
System.out.println("4. Micrómetros");
System.out.println("5. Kilómetros");
System.out.println("6. Decímetros");
System.out.println("7. Pulgadas");
System.out.println("8. Pies");
System.out.println("9. Yardas");
System.out.println("10. Millas");
System.out.println("11. Nanómetros");
System.out.println("12. Millas Náuticas");

int unidadDestino = scanner.nextInt();

System.out.println("Ingrese la longitud:");
while (!scanner.hasNextDouble()) {
    System.out.println("Por favor, ingrese un valor numérico válido: ");
    scanner.next();
}
double longitud = scanner.nextDouble();
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

switch (unidadOrigen) {
    case 1: // Metros
        switch (unidadDestino) {
            case 1: resultado = longitud; break;
            case 2: resultado = longitud * 100; tipoConversion = "centímetros"; break;  // Metros a Centímetros
            case 3: resultado = longitud * 1000; tipoConversion = "milímetros"; break;  // Metros a Milímetros
            case 4: resultado = longitud * 1e6; tipoConversion = "micrómetros"; break;   // Metros a Micrómetros
            case 5: resultado = longitud / 1000; tipoConversion = "kilómetros"; break;  // Metros a Kilómetros
            case 6: resultado = longitud * 10; tipoConversion = "decímetros"; break;    // Metros a Decímetros
            case 7: resultado = longitud * 39.3701; tipoConversion = "pulgadas"; break;  // Metros a Pulgadas
            case 8: resultado = longitud * 3.28084; tipoConversion = "pies"; break;  // Metros a Pies
            case 9: resultado = longitud * 1.09361; tipoConversion = "yardas"; break;  // Metros a Yardas
            case 10: resultado = longitud / 1609.34; tipoConversion = "millas"; break;  // Metros a Millas
            case 11: resultado = longitud * 1e9; tipoConversion = "nanómetros"; break;  // Metros a Nanómetros
            case 12: resultado = longitud / 1852; tipoConversion = "millas náuticas"; break;  // Metros a Millas Náuticas
        }
        break;
    case 2: // Centímetros
        switch (unidadDestino) {
            case 1: resultado = longitud / 100; tipoConversion = "metros"; break;  // Centímetros a Metros
            case 2: resultado = longitud; break;
            case 3: resultado = longitud * 10; tipoConversion = "milímetros"; break;  // Centímetros a Milímetros
            case 4: resultado = longitud * 1e4; tipoConversion = "micrómetros"; break;  // Centímetros a Micrómetros
            case 5: resultado = longitud / 100000; tipoConversion = "kilómetros"; break;  // Centímetros a Kilómetros
            case 6: resultado = longitud / 10; tipoConversion = "decímetros"; break;  // Centímetros a Decímetros
            case 7: resultado = longitud * 0.393701; tipoConversion = "pulgadas"; break;  // Centímetros a Pulgadas
            case 8: resultado = longitud * 0.0328084; tipoConversion = "pies"; break;  // Centímetros a Pies
            case 9: resultado = longitud * 0.0109361; tipoConversion = "yardas"; break;  // Centímetros a Yardas
            case 10: resultado = longitud / 160934; tipoConversion = "millas"; break;  // Centímetros a Millas
            case 11: resultado = longitud * 10000000; tipoConversion = "nanómetros"; break;  // Centímetros a Nanómetros
            case 12: resultado = longitud / 185200; tipoConversion = "millas náuticas"; break;  // Centímetros a Millas Náuticas
        }
        break;
    case 3: // Milímetros
        switch (unidadDestino) {
            case 1: resultado = longitud / 1000; tipoConversion = "metros"; break;  // Milímetros a Metros
            case 2: resultado = longitud / 10; tipoConversion = "centímetros"; break;  // Milímetros a Centímetros
            case 3: resultado = longitud; break;
            case 4: resultado = longitud * 1000; tipoConversion = "micrómetros"; break;  // Milímetros a Micrómetros
            case 5: resultado = longitud / 1e6; tipoConversion = "kilómetros"; break;  // Milímetros a Kilómetros
            case 6: resultado = longitud / 100; tipoConversion = "decímetros"; break;  // Milímetros a Decímetros
            case 7: resultado = longitud * 0.0393701; tipoConversion = "pulgadas"; break;  // Milímetros a Pulgadas
            case 8: resultado = longitud * 0.00328084; tipoConversion = "pies"; break;  // Milímetros a Pies
            case 9: resultado = longitud * 0.00109361; tipoConversion = "yardas"; break;  // Milímetros a Yardas
            case 10: resultado = longitud / 1609344; tipoConversion = "millas"; break;  // Milímetros a Millas
            case 11: resultado = longitud * 1e6; tipoConversion = "nanómetros"; break;  // Milímetros a Nanómetros
            case 12: resultado = longitud / 1852000; tipoConversion = "milllas náuticas"; break;  // Milímetros a Millas Náuticas
        }
        break;
    case 4: // Micrómetros
        switch (unidadDestino) {
            case 1: resultado = longitud / 1e6; tipoConversion = "metros";  break;  // Micrómetros a Metros
            case 2: resultado = longitud / 1e4; tipoConversion = "centímetros"; break;  // Micrómetros a Centímetros
            case 3: resultado = longitud / 1000; tipoConversion = "milímetros"; break;  // Micrómetros a Milímetros
            case 4: resultado = longitud; break;
            case 5: resultado = longitud / 1e9; tipoConversion = "kilómetros"; break;  // Micrómetros a Kilómetros
            case 6: resultado = longitud / 1e5; tipoConversion = "decímetros"; break;  // Micrómetros a Decímetros
            case 7: resultado = longitud * 3.93701e-5; tipoConversion = "pulgadas"; break;  // Micrómetros a Pulgadas
            case 8: resultado = longitud * 3.28084e-6; tipoConversion = "pies"; break;  // Micrómetros a Pies
            case 9: resultado = longitud * 1.09361e-6; tipoConversion = "yardas"; break;  // Micrómetros a Yardas
            case 10: resultado = longitud / 1.609e9; tipoConversion = "millas"; break;  // Micrómetros a Millas
            case 11: resultado = longitud * 1000; tipoConversion = "nanómetros"; break;  // Micrómetros a Nanómetros
            case 12: resultado = longitud / 1.852e9; tipoConversion = "milllas náuticas"; break;  // Micrómetros a Millas Náuticas
        }
        break;
    case 5: // Kilómetros
        switch (unidadDestino) {
            case 1: resultado = longitud * 1000; tipoConversion = "metros"; break;  // Kilómetros a Metros
            case 2: resultado = longitud * 100000; tipoConversion = "centímetros"; break;  // Kilómetros a Centímetros
            case 3: resultado = longitud * 1e6; tipoConversion = "milímetros"; break;  // Kilómetros a Milímetros
            case 4: resultado = longitud * 1e9; tipoConversion = "micrómetros"; break;  // Kilómetros a Micrómetros
            case 5: resultado = longitud; break;
            case 6: resultado = longitud * 10000; tipoConversion = "decímetros"; break;  // Kilómetros a Decímetros
            case 7: resultado = longitud * 39370.1; tipoConversion = "pulgadas"; break;  // Kilómetros a Pulgadas
            case 8: resultado = longitud * 3280.84; tipoConversion = "pies"; break;  // Kilómetros a Pies
            case 9: resultado = longitud * 1093.61; tipoConversion = "yardas"; break;  // Kilómetros a Yardas
            case 10: resultado = longitud / 1.609; tipoConversion = "millas"; break;  // Kilómetros a Millas
            case 11: resultado = longitud * 1e12; tipoConversion = "nanómetros"; break;  // Kilómetros a Nanómetros
            case 12: resultado = longitud / 1.852; tipoConversion = "millas náuticas"; break;  // Kilómetros a Millas Náuticas
        }
        break;
    case 6: // Decímetros
        switch (unidadDestino) {
            case 1: resultado = longitud / 10; tipoConversion = "metros"; break;  // Decímetros a Metros
            case 2: resultado = longitud * 10; tipoConversion = "centímetros"; break;  // Decímetros a Centímetros
            case 3: resultado = longitud * 100; tipoConversion = "milímetros"; break;  // Decímetros a Milímetros
            case 4: resultado = longitud * 1e5; tipoConversion = "micrómetros"; break;  // Decímetros a Micrómetros
            case 5: resultado = longitud / 10000; tipoConversion = "kilómetros"; break;  // Decímetros a Kilómetros
            case 6: resultado = longitud; break;
            case 7: resultado = longitud * 3.93701; tipoConversion = "pulgadas"; break;  // Decímetros a Pulgadas
            case 8: resultado = longitud * 0.328084; tipoConversion = "metros"; break;  // Decímetros a Pies
            case 9: resultado = longitud * 0.109361; tipoConversion = "yardas"; break;  // Decímetros a Yardas
            case 10: resultado = longitud / 160934; tipoConversion = "millas"; break;  // Decímetros a Millas
            case 11: resultado = longitud * 1e8; tipoConversion = "nanómetros"; break;  // Decímetros a Nanómetros
            case 12: resultado = longitud / 18520; tipoConversion = "millas náuticas"; break;  // Decímetros a Millas Náuticas
        }
        break;
    case 7: // Pulgadas
        switch (unidadDestino) {
            case 1: resultado = longitud * 0.0254; tipoConversion = "metros"; break;  // Pulgadas a Metros
            case 2: resultado = longitud * 2.54; tipoConversion = "centímetros"; break;  // Pulgadas a Centímetros
            case 3: resultado = longitud * 25.4; tipoConversion = "milímetros"; break;  // Pulgadas a Milímetros
            case 4: resultado = longitud * 25400; tipoConversion = "micrómetros"; break;  // Pulgadas a Micrómetros
            case 5: resultado = longitud * 0.0000254; tipoConversion = "kilómetros"; break;  // Pulgadas a Kilómetros
            case 6: resultado = longitud * 0.254; tipoConversion = "decímetros"; break;  // Pulgadas a Decímetros
            case 7: resultado = longitud; break;
            case 8: resultado = longitud * 0.0833333; tipoConversion = "pies"; break;  // Pulgadas a Pies
            case 9: resultado = longitud * 0.0277778; tipoConversion = "yardas"; break;  // Pulgadas a Yardas
            case 10: resultado = longitud * 0.0000157828; tipoConversion = "millas"; break;  // Pulgadas a Millas
            case 11: resultado = longitud * 25400e-6; tipoConversion = "nanómetros"; break;  // Pulgadas a Nanómetros
            case 12: resultado = longitud * 1.37149e-5; tipoConversion = "millas náuticas"; break;  // Pulgadas a Millas Náuticas
        }
        break;
    case 8: // Pies
        switch (unidadDestino) {
            case 1: resultado = longitud * 0.3048; tipoConversion = "metros"; break;  // Pies a Metros
            case 2: resultado = longitud * 30.48; tipoConversion = "centímetros"; break;  // Pies a Centímetros
            case 3: resultado = longitud * 304.8; tipoConversion = "milímetros"; break;  // Pies a Milímetros
            case 4: resultado = longitud * 304800; tipoConversion = "micrómetros"; break;  // Pies a Micrómetros
            case 5: resultado = longitud * 0.0003048; tipoConversion = "kilómetros"; break;  // Pies a Kilómetros
            case 6: resultado = longitud * 3.048; tipoConversion = "decímetros"; break;  // Pies a Decímetros
            case 7: resultado = longitud * 12; tipoConversion = "pulgadas"; break;  // Pies a Pulgadas
            case 8: resultado = longitud; break;
            case 9: resultado = longitud * 0.333333; tipoConversion = "yardas"; break;  // Pies a Yardas
            case 10: resultado = longitud * 0.000189394; tipoConversion = "millas"; break;  // Pies a Millas
            case 11: resultado = longitud * 304800e-6; tipoConversion = "nanómetros"; break;  // Pies a Nanómetros
            case 12: resultado = longitud * 1.89394e-5; tipoConversion = "millas náuticas"; break;  // Pies a Millas Náuticas
        }
        break;
    case 9: // Yardas
        switch (unidadDestino) {
            case 1: resultado = longitud * 0.9144; tipoConversion = "metros"; break;  // Yardas a Metros
            case 2: resultado = longitud * 91.44; tipoConversion = "centímetros"; break;  // Yardas a Centímetros
            case 3: resultado = longitud * 914.4; tipoConversion = "metros"; break;  // Yardas a Milímetros
            case 4: resultado = longitud * 914400; tipoConversion = "micrómetros"; break;  // Yardas a Micrómetros
            case 5: resultado = longitud * 0.0009144; tipoConversion = "kilómetros"; break;  // Yardas a Kilómetros
            case 6: resultado = longitud * 9.144; tipoConversion = "decímetros"; break;  // Yardas a Decímetros
            case 7: resultado = longitud * 36; tipoConversion = "pulgadas"; break;  // Yardas a Pulgadas
            case 8: resultado = longitud * 3; tipoConversion = "yardas"; break;  // Yardas a Pies
            case 9: resultado = longitud; break;
            case 10: resultado = longitud * 0.000568182; tipoConversion = "millas"; break;  // Yardas a Millas
            case 11: resultado = longitud * 914400e-6; tipoConversion = "nanómetros"; break;  // Yardas a Nanómetros
            case 12: resultado = longitud * 1.37149e-5; tipoConversion = "millas náuticas"; break;  // Yardas a Millas Náuticas
        }
        break;
    case 10: // Millas
        switch (unidadDestino) {
            case 1: resultado = longitud * 1609.34; tipoConversion = "metros"; break;  // Millas a Metros
            case 2: resultado = longitud * 160934; tipoConversion = "centímetros"; break;  // Millas a Centímetros
            case 3: resultado = longitud * 1609344; tipoConversion = "milímetros"; break;  // Millas a Milímetros
            case 4: resultado = longitud * 1.609e9; tipoConversion = "micrómetros"; break;  // Millas a Micrómetros
            case 5: resultado = longitud * 1.60934; tipoConversion = "kilómetros"; break;  // Millas a Kilómetros
            case 6: resultado = longitud * 16093.4; tipoConversion = "decímetros"; break;  // Millas a Decímetros
            case 7: resultado = longitud * 63360; tipoConversion = "pulgadas"; break;  // Millas a Pulgadas
            case 8: resultado = longitud * 5280; tipoConversion = "pies"; break;  // Millas a Pies
            case 9: resultado = longitud * 1760; tipoConversion = "yardas"; break;  // Millas a Yardas
            case 10: resultado = longitud; break;
            case 11: resultado = longitud * 1.609e12; tipoConversion = "nanómetros"; break;  // Millas a Nanómetros
            case 12: resultado = longitud / 1.151; tipoConversion = "millas náuticas"; break;  // Millas a Millas Náuticas
        }
        break;
    case 11: // Nanómetros
        switch (unidadDestino) {
            case 1: resultado = longitud * 1e-9; tipoConversion ="metros"; break;  // Nanómetros a Metros
            case 2: resultado = longitud * 1e-7; tipoConversion = "centímetros"; break;  // Nanómetros a Centímetros
            case 3: resultado = longitud * 1e-6; tipoConversion = "milímetros"; break;  // Nanómetros a Milímetros
            case 4: resultado = longitud * 1e-3; tipoConversion = "micrómetros"; break;  // Nanómetros a Micrómetros
            case 5: resultado = longitud * 1e-12; tipoConversion = "kilómetros"; break;  // Nanómetros a Kilómetros
            case 6: resultado = longitud * 1e-8; tipoConversion = "decímetros"; break;  // Nanómetros a Decímetros
            case 7: resultado = longitud * 3.93701e-8; tipoConversion = "pulgadas"; break;  // Nanómetros a Pulgadas
            case 8: resultado = longitud * 3.28084e-9; tipoConversion = "pies"; break;  // Nanómetros a Pies
            case 9: resultado = longitud * 1.09361e-9; tipoConversion = "yardas"; break;  // Nanómetros a Yardas
            case 10: resultado = longitud * 6.21371e-13; tipoConversion = "millas"; break;  // Nanómetros a Millas
            case 11: resultado = longitud; break;
            case 12: resultado = longitud * 5.39957e-13; tipoConversion = "millas náuticas"; break;  // Nanómetros a Millas Náuticas
        }
        break;
    case 12: // Millas Náuticas
        switch (unidadDestino) {
            case 1: resultado = longitud * 1852; tipoConversion = "metros"; break;  // Millas Náuticas a Metros
            case 2: resultado = longitud * 185200; tipoConversion = "centímetros"; break;  // Millas Náuticas a Centímetros
            case 3: resultado = longitud * 1852000; tipoConversion = "milímetros"; break;  // Millas Náuticas a Milímetros
            case 4: resultado = longitud * 1.852e9; tipoConversion = "micrómetros"; break;  // Millas Náuticas a Micrómetros
            case 5: resultado = longitud * 1.852; tipoConversion = "kilómetros"; break;  // Millas Náuticas a Kilómetros
            case 6: resultado = longitud * 18520; tipoConversion = "decímetros"; break;  // Millas Náuticas a Decímetros
            case 7: resultado = longitud * 72913.4; tipoConversion ="pulgadas"; break;  // Millas Náuticas a Pulgadas
            case 8: resultado = longitud * 6076.12; tipoConversion ="pies"; break;  // Millas Náuticas a Pies
            case 9: resultado = longitud * 2025.37; tipoConversion ="yardas"; break;  // Millas Náuticas a Yardas
            case 10: resultado = longitud * 0.539957; tipoConversion ="millas"; break;  // Millas Náuticas a Millas
            case 11: resultado = longitud * 1.852e12; tipoConversion ="nanómetros"; break;  // Millas Náuticas a Nanómetros
            case 12: resultado = longitud; break;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}
//Imprimir el resultado y el tipo de conversión
System.out.println("Longitud convertida: " + resultado + "  " + tipoConversion + " .");

scanner.close();
}


public static void convertirArea() {
Scanner scanner = new Scanner(System.in);
System.out.println("Seleccione la unidad de área de origen:");
System.out.println("1. Metro cuadrado");
System.out.println("2. Centímetro cuadrado");
System.out.println("3. Decímetro cuadrado");
System.out.println("4. Milímetro cuadrado");
System.out.println("5. Pulgada cuadrada");
System.out.println("6. Pie cuadrado");
System.out.println("7. Yarda cuadrada");
System.out.println("8. Hectárea");
System.out.println("9. Kilómetro cuadrado");
System.out.println("10. Acre");
System.out.println("11. Milla cuadrada");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de área de destino:");
System.out.println("1. Metro cuadrado");
System.out.println("2. Centímetro cuadrado");
System.out.println("3. Decímetro cuadrado");
System.out.println("4. Milímetro cuadrado");
System.out.println("5. Pulgada cuadrada");
System.out.println("6. Pie cuadrado");
System.out.println("7. Yarda cuadrada");
System.out.println("8. Hectárea");
System.out.println("9. Kilómetro cuadrado");
System.out.println("10. Acre");
System.out.println("11. Milla cuadrada");

int unidadDestino = scanner.nextInt();

System.out.println("Ingrese el área:");
while (!scanner.hasNextDouble()) {
    System.out.println("Por favor, ingrese un valor numérico válido: ");
    scanner.next();
}
double area = scanner.nextDouble();
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

switch (unidadOrigen) {
    case 1: // Metro cuadrado
        switch (unidadDestino) {
            case 1: resultado = area; break;
            case 2: resultado = area * 1e4; tipoConversion = "centímetros cuadraddos"; break;  // Metro cuadrado a Centímetro cuadrado
            case 3: resultado = area * 100; tipoConversion = "decímetros cuadrados";break;  // Metro cuadrado a Decímetro cuadrado
            case 4: resultado = area * 1e6; tipoConversion = "milímetros cuadrados"; break;  // Metro cuadrado a Milímetro cuadrado
            case 5: resultado = area * 1550; tipoConversion = "pulgada cuadrada"; break;  // Metro cuadrado a Pulgada cuadrada
            case 6: resultado = area * 10.764; tipoConversion = "pie cuadrado"; break;  // Metro cuadrado a Pie cuadrado
            case 7: resultado = area * 1.196; tipoConversion = "yarda cuadrada"; break;  // Metro cuadrado a Yarda cuadrada
            case 8: resultado = area * 0.0001; tipoConversion = "hectárea"; break;  // Metro cuadrado a Hectárea
            case 9: resultado = area * 1e-6; tipoConversion = "kilómetro cuadrado"; break;  // Metro cuadrado a Kilómetro cuadrado
            case 10: resultado = area * 0.000247105; tipoConversion = "acre"; break;  // Metro cuadrado a Acre
            case 11: resultado = area * 3.861e-7; tipoConversion = "milla cuadrada"; break;  // Metro cuadrado a Milla cuadrada
        }
        break;
    case 2: // Centímetro cuadrado
        switch (unidadDestino) {
            case 1: resultado = area * 1e-4; tipoConversion = "metro cuadrado"; break;  // Centímetro cuadrado a Metro cuadrado
            case 2: resultado = area; break;
            case 3: resultado = area * 0.01; tipoConversion = "decímetro cuadrado"; break;  // Centímetro cuadrado a Decímetro cuadrado
            case 4: resultado = area * 100; tipoConversion = "milímetro cuadrado"; break;  // Centímetro cuadrado a Milímetro cuadrado
            case 5: resultado = area * 0.155; tipoConversion = "pulgada cuadrada"; break;  // Centímetro cuadrado a Pulgada cuadrada
            case 6: resultado = area * 0.00107639; tipoConversion = "pie cuadrado"; break;  // Centímetro cuadrado a Pie cuadrado
            case 7: resultado = area * 0.000119599; tipoConversion = "yarda cuadrada"; break;  // Centímetro cuadrado a Yarda cuadrada
            case 8: resultado = area * 1e-8; tipoConversion = "hectárea"; break;  // Centímetro cuadrado a Hectárea
            case 9: resultado = area * 1e-10; tipoConversion = "kilómetros cuadrados"; break;  // Centímetro cuadrado a Kilómetro cuadrado
            case 10: resultado = area * 2.47105e-8; tipoConversion = "acre"; break;  // Centímetro cuadrado a Acre
            case 11: resultado = area * 3.861e-11; tipoConversion = "milla cuadrada"; break;  // Centímetro cuadrado a Milla cuadrada
        }
        break;
    case 3: // Decímetro cuadrado
        switch (unidadDestino) {
            case 1: resultado = area * 0.01; tipoConversion = "metro cuadrado"; break;  // Decímetro cuadrado a Metro cuadrado
            case 2: resultado = area * 100; tipoConversion = "centímetro cuadrado"; break;  // Decímetro cuadrado a Centímetro cuadrado
            case 3: resultado = area; break;
            case 4: resultado = area * 10000; tipoConversion = "milímetro cuadrado"; break;  // Decímetro cuadrado a Milímetro cuadrado
            case 5: resultado = area * 15.5; tipoConversion = "pulgada cuadrada"; break;  // Decímetro cuadrado a Pulgada cuadrada
            case 6: resultado = area * 0.107639; tipoConversion = "pie cuadrado"; break;  // Decímetro cuadrado a Pie cuadrado
            case 7: resultado = area * 0.0119599; tipoConversion = "yarda cuadrada"; break;  // Decímetro cuadrado a Yarda cuadrada
            case 8: resultado = area * 1e-6; tipoConversion = "hectárea"; break;  // Decímetro cuadrado a Hectárea
            case 9: resultado = area * 1e-8; tipoConversion = "kilómetro cuadrado"; break;  // Decímetro cuadrado a Kilómetro cuadrado
            case 10: resultado = area * 2.47105e-6; tipoConversion = "acre"; break;  // Decímetro cuadrado a Acre
            case 11: resultado = area * 3.861e-9; tipoConversion = "milla cuadrada"; break;  // Decímetro cuadrado a Milla cuadrada
        }
        break;
    case 4: // Milímetro cuadrado
        switch (unidadDestino) {
            case 1: resultado = area * 1e-6; tipoConversion = "metro cuadrado"; break;  // Milímetro cuadrado a Metro cuadrado
            case 2: resultado = area * 0.01;tipoConversion = "centímetro cuadrado"; break;  // Milímetro cuadrado a Centímetro cuadrado
            case 3: resultado = area * 0.0001; tipoConversion = "decímetro cuadrado"; break;  // Milímetro cuadrado a Decímetro cuadrado
            case 4: resultado = area; break;
            case 5: resultado = area * 0.00155; tipoConversion = "pulgada cuadrada"; break;  // Milímetro cuadrado a Pulgada cuadrada
            case 6: resultado = area * 1.07639e-5; tipoConversion = "pie cuadrado"; break;  // Milímetro cuadrado a Pie cuadrado
            case 7: resultado = area * 1.19599e-6; tipoConversion = "yarda cuadrada"; break;  // Milímetro cuadrado a Yarda cuadrada
            case 8: resultado = area * 1e-8; tipoConversion = "hectárea"; break;  // Milímetro cuadrado a Hectárea
            case 9: resultado = area * 1e-12; tipoConversion = "kilómetro cuadrado"; break;  // Milímetro cuadrado a Kilómetro cuadrado
            case 10: resultado = area * 2.47105e-10; tipoConversion = "acre"; break;  // Milímetro cuadrado a Acre
            case 11: resultado = area * 3.861e-13; tipoConversion = "milla cuadrada"; break;  // Milímetro cuadrado a Milla cuadrada
        }
        break;
    case 5: // Pulgada cuadrada
        switch (unidadDestino) {
            case 1: resultado = area * 0.00064516; tipoConversion = "metro cuadrado"; break;  // Pulgada cuadrada a Metro cuadrado
            case 2: resultado = area * 6.4516; tipoConversion = "centímetro cuadrado"; break;  // Pulgada cuadrada a Centímetro cuadrado
            case 3: resultado = area * 0.064516; tipoConversion = "decímero cuadrado"; break;  // Pulgada cuadrada a Decímetro cuadrado
            case 4: resultado = area * 645.16; tipoConversion = "milímetro cuadrado"; break;  // Pulgada cuadrada a Milímetro cuadrado
            case 5: resultado = area; break;
            case 6: resultado = area * 0.00694444; tipoConversion = "pie cuadrado"; break;  // Pulgada cuadrada a Pie cuadrado
            case 7: resultado = area * 0.000771605; tipoConversion = "yarda cuadrada"; break;  // Pulgada cuadrada a Yarda cuadrada
            case 8: resultado = area * 6.4516e-8; tipoConversion = "hectárea"; break;  // Pulgada cuadrada a Hectárea
            case 9: resultado = area * 6.4516e-10; tipoConversion = "kilómetro cuadrado"; break;  // Pulgada cuadrada a Kilómetro cuadrado
            case 10: resultado = area * 1.59423e-7; tipoConversion = "acre"; break;  // Pulgada cuadrada a Acre
            case 11: resultado = area * 2.49098e-10; tipoConversion = "milla cuadrada"; break;  // Pulgada cuadrada a Milla cuadrada
        }
        break;
    case 6: // Pie cuadrado
        switch (unidadDestino) {
            case 1: resultado = area * 0.092903; tipoConversion = "metro cuadrado"; break;  // Pie cuadrado a Metro cuadrado
            case 2: resultado = area * 929.03; tipoConversion = "centímetro cuadrado"; break;  // Pie cuadrado a Centímetro cuadrado
            case 3: resultado = area * 9.2903; tipoConversion = "decímero cuadrado"; break;  // Pie cuadrado a Decímetro cuadrado
            case 4: resultado = area * 92903; tipoConversion = "milímetro cuadrado"; break;  // Pie cuadrado a Milímetro cuadrado
            case 5: resultado = area * 144; tipoConversion = "pulgada cuadrada"; break;  // Pie cuadrado a Pulgada cuadrada
            case 6: resultado = area; break;
            case 7: resultado = area * 0.111111; tipoConversion = "yarda cuadrada"; break;  // Pie cuadrado a Yarda cuadrada
            case 8: resultado = area * 9.2903e-6; tipoConversion = "hectárea"; break;  // Pie cuadrado a Hectárea
            case 9: resultado = area * 9.2903e-8; tipoConversion = "kilómetro cuadrado"; break;  // Pie cuadrado a Kilómetro cuadrado
            case 10: resultado = area * 2.29568e-5; tipoConversion = "acre"; break;  // Pie cuadrado a Acre
            case 11: resultado = area * 3.587e-8; tipoConversion = "milla cuadrada"; break;  // Pie cuadrado a Milla cuadrada
        }
        break;
    case 7: // Yarda cuadrada
        switch (unidadDestino) {
            case 1: resultado = area * 0.836127; tipoConversion = "metro cuadrado"; break;  // Yarda cuadrada a Metro cuadrado
            case 2: resultado = area * 8361.27; tipoConversion = "centímetro cuadrado"; break;  // Yarda cuadrada a Centímetro cuadrado
            case 3: resultado = area * 83.6127; tipoConversion = "decímero cuadrado"; break;  // Yarda cuadrada a Decímetro cuadrado
            case 4: resultado = area * 836127; tipoConversion = "milímetro cuadrado"; break;  // Yarda cuadrada a Milímetro cuadrado
            case 5: resultado = area * 1296; tipoConversion = "pulgada cuadrada"; break;  // Yarda cuadrada a Pulgada cuadrada
            case 6: resultado = area * 9; tipoConversion = "pie cuadrado"; break;  // Yarda cuadrada a Pie cuadrado
            case 7: resultado = area; break;
            case 8: resultado = area * 8.36127e-5; tipoConversion = "hectárea"; break;  // Yarda cuadrada a Hectárea
            case 9: resultado = area * 8.36127e-7; tipoConversion = "kilómetro cuadrado"; break;  // Yarda cuadrada a Kilómetro cuadrado
            case 10: resultado = area * 0.000206612; tipoConversion = "acre"; break;  // Yarda cuadrada a Acre
            case 11: resultado = area * 3.22831e-7; tipoConversion = "milla cuadrada"; break;  // Yarda cuadrada a Milla cuadrada
        }
        break;
    case 8: // Hectárea
        switch (unidadDestino) {
            case 1: resultado = area * 10000; tipoConversion = "metro cuadrado"; break;  // Hectárea a Metro cuadrado
            case 2: resultado = area * 1e8; tipoConversion = "centímetro cuadrado"; break;  // Hectárea a Centímetro cuadrado
            case 3: resultado = area * 1e6; tipoConversion = "decímero cuadrado"; break;  // Hectárea a Decímetro cuadrado
            case 4: resultado = area * 1e10; tipoConversion = "milímetro cuadrado"; break;  // Hectárea a Milímetro cuadrado
            case 5: resultado = area * 1.55e7; tipoConversion = "pulgada cuadrada"; break;  // Hectárea a Pulgada cuadrada
            case 6: resultado = area * 1.07639e5; tipoConversion = "pie cuadrado"; break;  // Hectárea a Pie cuadrado
            case 7: resultado = area * 1.19599e4; tipoConversion = "yarda cuadrada"; break;  // Hectárea a Yarda cuadrada
            case 8: resultado = area; break;
            case 9: resultado = area * 0.01; tipoConversion = "kilómetro cuadrado"; break;  // Hectárea a Kilómetro cuadrado
            case 10: resultado = area * 2.47105; tipoConversion = "acre"; break;  // Hectárea a Acre
            case 11: resultado = area * 0.00386102; tipoConversion = "milla cuadrada"; break;  // Hectárea a Milla cuadrada
        }
        break;
    case 9: // Kilómetro cuadrado
        switch (unidadDestino) {
            case 1: resultado = area * 1e6; tipoConversion = "metro cuadrado"; break;  // Kilómetro cuadrado a Metro cuadrado
            case 2: resultado = area * 1e10; tipoConversion = "centímetro cuadrado"; break;  // Kilómetro cuadrado a Centímetro cuadrado
            case 3: resultado = area * 1e8; tipoConversion = "decímero cuadrado"; break;  // Kilómetro cuadrado a Decímetro cuadrado
            case 4: resultado = area * 1e12; tipoConversion = "milímetro cuadrado"; break;  // Kilómetro cuadrado a Milímetro cuadrado
            case 5: resultado = area * 1.55e9; tipoConversion = "pulgada cuadrada"; break;  // Kilómetro cuadrado a Pulgada cuadrada
            case 6: resultado = area * 1.07639e7; tipoConversion = "pie cuadrado"; break;  // Kilómetro cuadrado a Pie cuadrado
            case 7: resultado = area * 1.19599e6; tipoConversion = "yarda cuadrada"; break;  // Kilómetro cuadrado a Yarda cuadrada
            case 8: resultado = area * 100; tipoConversion = "hectárea"; break;  // Kilómetro cuadrado a Hectárea
            case 9: resultado = area; break;
            case 10: resultado = area * 247.105; tipoConversion = "acre"; break;  // Kilómetro cuadrado a Acre
            case 11: resultado = area * 0.386102; tipoConversion = "milla cuadrada"; break;  // Kilómetro cuadrado a Milla cuadrada
        }
        break;
    case 10: // Acre
        switch (unidadDestino) {
            case 1: resultado = area * 4046.86; tipoConversion = "metro cuadrado"; break;  // Acre a Metro cuadrado
            case 2: resultado = area * 4.04686e7; tipoConversion = "centímetro cuadrado"; break;  // Acre a Centímetro cuadrado
            case 3: resultado = area * 4.04686e6; tipoConversion = "decímero cuadrado"; break;  // Acre a Decímetro cuadrado
            case 4: resultado = area * 4.04686e10; tipoConversion = "milímetro cuadrado"; break;  // Acre a Milímetro cuadrado
            case 5: resultado = area * 6.273e6; tipoConversion = "pulgada cuadrada"; break;  // Acre a Pulgada cuadrada
            case 6: resultado = area * 43560; tipoConversion = "pie cuadrado"; break;  // Acre a Pie cuadrado
            case 7: resultado = area * 4840; tipoConversion = "yarda cuadrada"; break;  // Acre a Yarda cuadrada
            case 8: resultado = area * 0.404686; tipoConversion = "hectárea"; break;  // Acre a Hectárea
            case 9: resultado = area * 0.00404686; tipoConversion = "kilómetro cuadrado"; break;  // Acre a Kilómetro cuadrado
            case 10: resultado = area; break;
            case 11: resultado = area * 0.0015625; tipoConversion = "milla cuadrada"; break;  // Acre a Milla cuadrada
        }
        break;
    case 11: // Milla cuadrada
        switch (unidadDestino) {
            case 1: resultado = area * 2589988; tipoConversion = "metro cuadrado"; break;  // Milla cuadrada a Metro cuadrado
            case 2: resultado = area * 2.58999e10; tipoConversion = "centímetro cuadrado"; break;  // Milla cuadrada a Centímetro cuadrado
            case 3: resultado = area * 2.58999e9; tipoConversion = "decímero cuadrado"; break;  // Milla cuadrada a Decímetro cuadrado
            case 4: resultado = area * 2.58999e13; tipoConversion = "milímetro cuadrado"; break;  // Milla cuadrada a Milímetro cuadrado
            case 5: resultado = area * 4.014e9; tipoConversion = "pulgada cuadrada"; break;  // Milla cuadrada a Pulgada cuadrada
            case 6: resultado = area * 2.788e7; tipoConversion = "pie cuadrado"; break;  // Milla cuadrada a Pie cuadrado
            case 7: resultado = area * 3.098e6; tipoConversion = "yarda cuadrada"; break;  // Milla cuadrada a Yarda cuadrada
            case 8: resultado = area * 2.58999; tipoConversion = "hectárea"; break;  // Milla cuadrada a Hectárea
            case 9: resultado = area * 2.58999e-6; tipoConversion = "kilómetro cuadrado"; break;  // Milla cuadrada a Kilómetro cuadrado
            case 10: resultado = area * 640; tipoConversion = "acre"; break;  // Milla cuadrada a Acre
            case 11: resultado = area; break;
        }
        break;
    default:
        System.out.println("Unidad de área de origen no válida.");
        return;
}

System.out.println("Área convertida: " + resultado + "  " + tipoConversion + " .");

scanner.close();
}

public static void convertirPeso() {
Scanner scanner = new Scanner(System.in);
System.out.println("Seleccione la unidad de peso de origen:");
System.out.println("1. Kilogramo");
System.out.println("2. Gramo");
System.out.println("3. Miligramo");
System.out.println("4. Microgramo");
System.out.println("5. Libra");
System.out.println("6. Onza");
System.out.println("7. Tonelada");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de peso de destino:");
System.out.println("1. Kilogramo");
System.out.println("2. Gramo");
System.out.println("3. Miligramo");
System.out.println("4. Microgramo");
System.out.println("5. Libra");
System.out.println("6. Onza");
System.out.println("7. Tonelada");

int unidadDestino = scanner.nextInt();

System.out.println("Ingrese el peso:");
while (!scanner.hasNextDouble()) {
    System.out.println("Por favor, ingrese un valor numérico válido: ");
    scanner.next();
}
double peso = scanner.nextDouble();
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

switch (unidadOrigen) {
    case 1: // Kilogramo
        switch (unidadDestino) {
            case 1: resultado = peso; break;
            case 2: resultado = peso * 1000; tipoConversion = "gramos"; break;  // Kilogramo a Gramo
            case 3: resultado = peso * 1e6; tipoConversion = "miligramos"; break;  // Kilogramo a Miligramo
            case 4: resultado = peso * 1e9; tipoConversion = "microgramos"; break;  // Kilogramo a Microgramo
            case 5: resultado = peso * 2.20462; tipoConversion = "libras"; break;  // Kilogramo a Libra
            case 6: resultado = peso * 35.274; tipoConversion = "onzas"; break;  // Kilogramo a Onza
            case 7: resultado = peso * 0.001; tipoConversion = "toneladas"; break;  // Kilogramo a Tonelada
        }
        break;
    case 2: // Gramo
        switch (unidadDestino) {
            case 1: resultado = peso * 0.001; tipoConversion = "kilogramos"; break;  // Gramo a Kilogramo
            case 2: resultado = peso; break;
            case 3: resultado = peso * 1000; tipoConversion = "miligramos"; break;  // Gramo a Miligramo
            case 4: resultado = peso * 1e6; tipoConversion = "microgramos"; break;  // Gramo a Microgramo
            case 5: resultado = peso * 0.00220462; tipoConversion = "libras"; break;  // Gramo a Libra
            case 6: resultado = peso * 0.035274; tipoConversion = "onzas"; break;  // Gramo a Onza
            case 7: resultado = peso * 1e-6; tipoConversion = "toneladas"; break;  // Gramo a Tonelada
        }
        break;
    case 3: // Miligramo
        switch (unidadDestino) {
            case 1: resultado = peso * 1e-6; tipoConversion = "kilogramos"; break;  // Miligramo a Kilogramo
            case 2: resultado = peso * 0.001; tipoConversion = "gramos"; break;  // Miligramo a Gramo
            case 3: resultado = peso; break;
            case 4: resultado = peso * 1000; tipoConversion = "microgramos"; break;  // Miligramo a Microgramo
            case 5: resultado = peso * 2.20462e-6;  tipoConversion = "libras"; break;  // Miligramo a Libra
            case 6: resultado = peso * 3.5274e-5; tipoConversion = "onzas"; break;  // Miligramo a Onza
            case 7: resultado = peso * 1e-9; tipoConversion = "toneladas"; break;  // Miligramo a Tonelada
        }
        break;
    case 4: // Microgramo
        switch (unidadDestino) {
            case 1: resultado = peso * 1e-9; tipoConversion = "kilogramos"; break;  // Microgramo a Kilogramo
            case 2: resultado = peso * 1e-6; tipoConversion = "gramos"; break;  // Microgramo a Gramo
            case 3: resultado = peso * 0.001; tipoConversion = "miligramos"; break;  // Microgramo a Miligramo
            case 4: resultado = peso; break;
            case 5: resultado = peso * 2.20462e-9; tipoConversion = "libras"; break;  // Microgramo a Libra
            case 6: resultado = peso * 3.5274e-8; tipoConversion = "onzas"; break;  // Microgramo a Onza
            case 7: resultado = peso * 1e-12; tipoConversion = "toneladas"; break;  // Microgramo a Tonelada
        }
        break;
    case 5: // Libra
        switch (unidadDestino) {
            case 1: resultado = peso * 0.453592; tipoConversion = "kilogramos"; break;  // Libra a Kilogramo
            case 2: resultado = peso * 453.592; tipoConversion = "gramos"; break;  // Libra a Gramo
            case 3: resultado = peso * 453592; tipoConversion = "miligramos"; break;  // Libra a Miligramo
            case 4: resultado = peso * 4.536e8; tipoConversion = "microgramos"; break;  // Libra a Microgramo
            case 5: resultado = peso; break;
            case 6: resultado = peso * 16; tipoConversion = "onzas"; break;  // Libra a Onza
            case 7: resultado = peso * 0.000453592; tipoConversion = "toneladas"; break;  // Libra a Tonelada
        }
        break;
    case 6: // Onza
        switch (unidadDestino) {
            case 1: resultado = peso * 0.0283495; tipoConversion = "kilogramos"; break;  // Onza a Kilogramo
            case 2: resultado = peso * 28.3495; tipoConversion = "gramos"; break;  // Onza a Gramo
            case 3: resultado = peso * 28349.5; tipoConversion = "miligramos"; break;  // Onza a Miligramo
            case 4: resultado = peso * 2.835e7; tipoConversion = "microgramos"; break;  // Onza a Microgramo
            case 5: resultado = peso * 0.0625; tipoConversion = "libras"; break;  // Onza a Libra
            case 6: resultado = peso; break;
            case 7: resultado = peso * 2.835e-5; tipoConversion = "toneladas"; break;  // Onza a Tonelada
        }
        break;
    case 7: // Tonelada
        switch (unidadDestino) {
            case 1: resultado = peso * 1000; tipoConversion = "kilogramos"; break;  // Tonelada a Kilogramo
            case 2: resultado = peso * 1e6; tipoConversion = "gramos"; break;  // Tonelada a Gramo
            case 3: resultado = peso * 1e9; tipoConversion = "miligramos"; break;  // Tonelada a Miligramo
            case 4: resultado = peso * 1e12; tipoConversion = "microgramos"; break;  // Tonelada a Microgramo
            case 5: resultado = peso * 2204.62; tipoConversion = "libras"; break;  // Tonelada a Libra
            case 6: resultado = peso * 35274; tipoConversion = "onzas"; break;  // Tonelada a Onza
            case 7: resultado = peso; break;
        }
        break;
    default:
        System.out.println("Unidad de peso de origen no válida.");
        return;
}

System.out.println("Peso convertido: " + resultado);

scanner.close();
}
public static void convertirVolumen() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Seleccione la unidad de volumen de origen:");
 System.out.println("1. Litro");
 System.out.println("2. Mililitro");
 System.out.println("3. Decalitro");
 System.out.println("4. Milímetro cúbico");
 System.out.println("5. Centímetro cúbico");
 System.out.println("6. Decímetro cúbico");
 System.out.println("7. Metro cúbico");
 System.out.println("8. Pulgada cúbica");
 System.out.println("9. Pie cúbico");
 System.out.println("10. Yarda cúbica");
 System.out.println("11. Galón");
 System.out.println("12. Pinta");
 System.out.println("13. Onza fluida");

 int unidadOrigen = scanner.nextInt();

 System.out.println("Seleccione la unidad de volumen de destino:");
 System.out.println("1. Litro");
 System.out.println("2. Mililitro");
 System.out.println("3. Decalitro");
 System.out.println("4. Milímetro cúbico");
 System.out.println("5. Centímetro cúbico");
 System.out.println("6. Decímetro cúbico");
 System.out.println("7. Metro cúbico");
 System.out.println("8. Pulgada cúbica");
 System.out.println("9. Pie cúbico");
 System.out.println("10. Yarda cúbica");
 System.out.println("11. Galón");
 System.out.println("12. Pinta");
 System.out.println("13. Onza fluida");

 int unidadDestino = scanner.nextInt();

 System.out.println("Ingrese el volumen:");
 while (!scanner.hasNextDouble()) {
     System.out.println("Por favor, ingrese un valor numérico válido: ");
     scanner.next();
 }
 double volumen = scanner.nextDouble();
 double resultado = 0;
 String tipoConversion = " "; // Variable para almacenar el tipo de conversión

 switch (unidadOrigen) {
     case 1: // Litro
         switch (unidadDestino) {
             case 1: resultado = volumen; break;
             case 2: resultado = volumen * 1000; tipoConversion = "mililitro"; break;  // Litro a Mililitro
             case 3: resultado = volumen * 0.1; tipoConversion = "decalitro"; break;  // Litro a Decalitro
             case 4: resultado = volumen * 1e6; tipoConversion = "milímetro cúbico"; break;  // Litro a Milímetro cúbico
             case 5: resultado = volumen * 1000; tipoConversion = "centímetro cúbico"; break;  // Litro a Centímetro cúbico
             case 6: resultado = volumen; tipoConversion = "decímetro cúbico"; break;  // Litro a Decímetro cúbico
             case 7: resultado = volumen * 0.001; tipoConversion = "metro cúbico"; break;  // Litro a Metro cúbico
             case 8: resultado = volumen * 61023.7; tipoConversion = "pulgada cúbica"; break;  // Litro a Pulgada cúbica
             case 9: resultado = volumen * 35.3147; tipoConversion = "pie cúbico"; break;  // Litro a Pie cúbico
             case 10: resultado = volumen * 1.30795; tipoConversion = "yarda cúbica"; break;  // Litro a Yarda cúbica
             case 11: resultado = volumen * 0.264172; tipoConversion = "galon"; break;  // Litro a Galón
             case 12: resultado = volumen * 2.11338; tipoConversion = "pinta"; break;  // Litro a Pinta
             case 13: resultado = volumen * 33.814; tipoConversion = "onza fluida"; break;  // Litro a Onza fluida
         }
         break;
     case 2: // Mililitro
         switch (unidadDestino) {
             case 1: resultado = volumen * 0.001; tipoConversion = "litro"; break;  // Mililitro a Litro
             case 2: resultado = volumen; break;
             case 3: resultado = volumen * 0.0001; tipoConversion = "decalitro"; break;  // Mililitro a Decalitro
             case 4: resultado = volumen * 1000; tipoConversion = "milímetro cúbico"; break;  // Mililitro a Milímetro cúbico
             case 5: resultado = volumen; tipoConversion = "centímetro cúbico"; break;  // Mililitro a Centímetro cúbico
             case 6: resultado = volumen * 0.001; tipoConversion = "decímetro cúbico"; break;  // Mililitro a Decímetro cúbico
             case 7: resultado = volumen * 1e-6; tipoConversion = "metro cúbico"; break;  // Mililitro a Metro cúbico
             case 8: resultado = volumen * 0.0610237; tipoConversion = "pulgada cúbica"; break;  // Mililitro a Pulgada cúbica
             case 9: resultado = volumen * 0.0000353147; tipoConversion = "pie cúbico"; break;  // Mililitro a Pie cúbico
             case 10: resultado = volumen * 1.30795e-6; tipoConversion = "yarda cúbica"; break;  // Mililitro a Yarda cúbica
             case 11: resultado = volumen * 0.000264172; tipoConversion = "galon"; break;  // Mililitro a Galón
             case 12: resultado = volumen * 0.00211338; tipoConversion = "pinta"; break;  // Mililitro a Pinta
             case 13: resultado = volumen * 0.033814; tipoConversion = "onza fluida"; break;  // Mililitro a Onza fluida
         }
         break;
     case 3: // Decalitro
         switch (unidadDestino) {
             case 1: resultado = volumen * 10; tipoConversion = "litro"; break;  // Decalitro a Litro
             case 2: resultado = volumen * 10000; tipoConversion = "mililitro"; break;  // Decalitro a Mililitro
             case 3: resultado = volumen; break;
             case 4: resultado = volumen * 1e7; tipoConversion = "milímetro cúbico"; break;  // Decalitro a Milímetro cúbico
             case 5: resultado = volumen * 10000; tipoConversion = "centímetro cúbico"; break;  // Decalitro a Centímetro cúbico
             case 6: resultado = volumen * 10; tipoConversion = "decímetro cúbico"; break;  // Decalitro a Decímetro cúbico
             case 7: resultado = volumen * 0.01; tipoConversion = "metro cúbico"; break;  // Decalitro a Metro cúbico
             case 8: resultado = volumen * 610236; tipoConversion = "pulgada cúbica"; break;  // Decalitro a Pulgada cúbica
             case 9: resultado = volumen * 353.147; tipoConversion = "pie cúbico"; break;  // Decalitro a Pie cúbico
             case 10: resultado = volumen * 13.0795; tipoConversion = "yarda cúbica"; break;  // Decalitro a Yarda cúbica
             case 11: resultado = volumen * 2.64172; tipoConversion = "galon"; break;  // Decalitro a Galón
             case 12: resultado = volumen * 21.1338; tipoConversion = "pinta"; break;  // Decalitro a Pinta
             case 13: resultado = volumen * 338.14; tipoConversion = "onza fluida"; break;  // Decalitro a Onza fluida
         }
         break;
     case 4: // Milímetro cúbico
         switch (unidadDestino) {
             case 1: resultado = volumen * 1e-6; tipoConversion = "litro"; break;  // Milímetro cúbico a Litro
             case 2: resultado = volumen; tipoConversion = "mililitro"; break;  // Milímetro cúbico a Mililitro
             case 3: resultado = volumen * 1e-7; tipoConversion = "decalitro"; break;  // Milímetro cúbico a Decalitro
             case 4: resultado = volumen; break;
             case 5: resultado = volumen * 0.001; tipoConversion = "centímetro cúbico"; break;  // Milímetro cúbico a Centímetro cúbico
             case 6: resultado = volumen * 1e-6; tipoConversion = "decímetro cúbico"; break;  // Milímetro cúbico a Decímetro cúbico
             case 7: resultado = volumen * 1e-9; tipoConversion = "metro cúbico"; break;  // Milímetro cúbico a Metro cúbico
             case 8: resultado = volumen * 6.10237e-5; tipoConversion = "pulgada cúbica"; break;  // Milímetro cúbico a Pulgada cúbica
             case 9: resultado = volumen * 3.53147e-7; tipoConversion = "pie cúbico"; break;  // Milímetro cúbico a Pie cúbico
             case 10: resultado = volumen * 1.30795e-8; tipoConversion = "yarda cúbica"; break;  // Milímetro cúbico a Yarda cúbica
             case 11: resultado = volumen * 2.64172e-7; tipoConversion = "galon"; break;  // Milímetro cúbico a Galón
             case 12: resultado = volumen * 2.11338e-6; tipoConversion = "pinta"; break;  // Milímetro cúbico a Pinta
             case 13: resultado = volumen * 3.3814e-5; tipoConversion = "onza fluida"; break;  // Milímetro cúbico a Onza fluida
         }
         break;
     case 5: // Centímetro cúbico
         switch (unidadDestino) {
             case 1: resultado = volumen * 0.001; tipoConversion = "litro"; break;  // Centímetro cúbico a Litro
             case 2: resultado = volumen; tipoConversion = "mililitro"; break;  // Centímetro cúbico a Mililitro
             case 3: resultado = volumen * 1e-4; tipoConversion = "decalitro"; break;  // Centímetro cúbico a Decalitro
             case 4: resultado = volumen * 1000; tipoConversion = "milímetro cúbico"; break;  // Centímetro cúbico a Milímetro cúbico
             case 5: resultado = volumen; break;
             case 6: resultado = volumen * 0.001; tipoConversion = "decímetro cúbico"; break;  // Centímetro cúbico a Decímetro cúbico
             case 7: resultado = volumen * 1e-6; tipoConversion = "metro cúbico"; break;  // Centímetro cúbico a Metro cúbico
             case 8: resultado = volumen * 6.10237e-2; tipoConversion = "pulgada cúbica"; break;  // Centímetro cúbico a Pulgada cúbica
             case 9: resultado = volumen * 3.53147e-5; tipoConversion = "pie cúbico"; break;  // Centímetro cúbico a Pie cúbico
             case 10: resultado = volumen * 1.30795e-6; tipoConversion = "yarda cúbica"; break;  // Centímetro cúbico a Yarda cúbica
             case 11: resultado = volumen * 2.64172e-5; tipoConversion = "galon"; break;  // Centímetro cúbico a Galón
             case 12: resultado = volumen * 2.11338e-4; tipoConversion = "pinta"; break;  // Centímetro cúbico a Pinta
             case 13: resultado = volumen * 3.3814e-3; tipoConversion = "onza fluida"; break;  // Centímetro cúbico a Onza fluida
         }
         break;
     case 6: // Decímetro cúbico
         switch (unidadDestino) {
             case 1: resultado = volumen; tipoConversion = "litro"; break;  // Decímetro cúbico a Litro
             case 2: resultado = volumen * 1000; tipoConversion = "mililitro"; break;  // Decímetro cúbico a Mililitro
             case 3: resultado = volumen * 10; tipoConversion = "decalitro"; break;  // Decímetro cúbico a Decalitro
             case 4: resultado = volumen * 1e6; tipoConversion = "milímetro cúbico"; break;  // Decímetro cúbico a Milímetro cúbico
             case 5: resultado = volumen * 1000; tipoConversion = "centímetro cúbico"; break;  // Decímetro cúbico a Centímetro cúbico
             case 6: resultado = volumen; break;
             case 7: resultado = volumen * 0.001; tipoConversion = "metro cúbico"; break;  // Decímetro cúbico a Metro cúbico
             case 8: resultado = volumen * 61.0237; tipoConversion = "pulgada cúbica"; break;  // Decímetro cúbico a Pulgada cúbica
             case 9: resultado = volumen * 0.0353147; tipoConversion = "pie cúbico"; break;  // Decímetro cúbico a Pie cúbico
             case 10: resultado = volumen * 1.30795e-3; tipoConversion = "yarda cúbica"; break;  // Decímetro cúbico a Yarda cúbica
             case 11: resultado = volumen * 0.0264172; tipoConversion = "galon"; break;  // Decímetro cúbico a Galón
             case 12: resultado = volumen * 0.211338; tipoConversion = "pinta"; break;  // Decímetro cúbico a Pinta
             case 13: resultado = volumen * 3.3814; tipoConversion = "onza fluida"; break;  // Decímetro cúbico a Onza fluida
         }
         break;
     case 7: // Metro cúbico
         switch (unidadDestino) {
             case 1: resultado = volumen * 1000; tipoConversion = "litro"; break;  // Metro cúbico a Litro
             case 2: resultado = volumen * 1e6; tipoConversion = "mililitro"; break;  // Metro cúbico a Mililitro
             case 3: resultado = volumen * 100; tipoConversion = "decalitro"; break;  // Metro cúbico a Decalitro
             case 4: resultado = volumen * 1e9; tipoConversion = "milímetro cúbico"; break;  // Metro cúbico a Milímetro cúbico
             case 5: resultado = volumen * 1e6; tipoConversion = "centímetro cúbico"; break;  // Metro cúbico a Centímetro cúbico
             case 6: resultado = volumen * 1000; tipoConversion = "decímetro cúbico"; break;  // Metro cúbico a Decímetro cúbico
             case 7: resultado = volumen; break;
             case 8: resultado = volumen * 61023.7; tipoConversion = "pulgada cúbica"; break;  // Metro cúbico a Pulgada cúbica
             case 9: resultado = volumen * 35.3147; tipoConversion = "pie cúbico"; break;  // Metro cúbico a Pie cúbico
             case 10: resultado = volumen * 1.30795; tipoConversion = "yarda cúbica"; break;  // Metro cúbico a Yarda cúbica
             case 11: resultado = volumen * 264.172; tipoConversion = "galon"; break;  // Metro cúbico a Galón
             case 12: resultado = volumen * 2113.38; tipoConversion = "pinta"; break;  // Metro cúbico a Pinta
             case 13: resultado = volumen * 33814; tipoConversion = "onza fluida"; break;  // Metro cúbico a Onza fluida
         }
         break;
     case 8: // Pulgada cúbica
         switch (unidadDestino) {
             case 1: resultado = volumen * 0.0163871; tipoConversion = "litro"; break;  // Pulgada cúbica a Litro
             case 2: resultado = volumen * 16.3871; tipoConversion = "mililitro"; break;  // Pulgada cúbica a Mililitro
             case 3: resultado = volumen * 0.00163871; tipoConversion = "decalitro"; break;  // Pulgada cúbica a Decalitro
             case 4: resultado = volumen * 16.3871; tipoConversion = "milímetro cúbico"; break;  // Pulgada cúbica a Milímetro cúbico
             case 5: resultado = volumen * 16.3871; tipoConversion = "centímetro cúbico"; break;  // Pulgada cúbica a Centímetro cúbico
             case 6: resultado = volumen * 0.0163871; tipoConversion = "decímetro cúbico"; break;  // Pulgada cúbica a Decímetro cúbico
             case 7: resultado = volumen * 1.63871e-5; tipoConversion = "metro cúbico"; break;  // Pulgada cúbica a Metro cúbico
             case 8: resultado = volumen; break;
             case 9: resultado = volumen * 0.000578704; tipoConversion = "pie cúbico"; break;  // Pulgada cúbica a Pie cúbico
             case 10: resultado = volumen * 2.14335e-5; tipoConversion = "yarda cúbica"; break;  // Pulgada cúbica a Yarda cúbica
             case 11: resultado = volumen * 0.000004329; tipoConversion = "galon"; break;  // Pulgada cúbica a Galón
             case 12: resultado = volumen * 0.000034632; tipoConversion = "pinta"; break;  // Pulgada cúbica a Pinta
             case 13: resultado = volumen * 0.000554113; tipoConversion = "onza fluida"; break;  // Pulgada cúbica a Onza fluida
         }
         break;
     case 9: // Pie cúbico
         switch (unidadDestino) {
             case 1: resultado = volumen * 28.3168; tipoConversion = "litro"; break;  // Pie cúbico a Litro
             case 2: resultado = volumen * 28316.8; tipoConversion = "mililitro"; break;  // Pie cúbico a Mililitro
             case 3: resultado = volumen * 2.83168; tipoConversion = "decalitro"; break;  // Pie cúbico a Decalitro
             case 4: resultado = volumen * 2.83168e7; tipoConversion = "milímetro cúbico"; break;  // Pie cúbico a Milímetro cúbico
             case 5: resultado = volumen * 28316.8; tipoConversion = "centímetro cúbico"; break;  // Pie cúbico a Centímetro cúbico
             case 6: resultado = volumen * 28.3168; tipoConversion = "decímetro cúbico"; break;  // Pie cúbico a Decímetro cúbico
             case 7: resultado = volumen * 0.0283168; tipoConversion = "metro cúbico"; break;  // Pie cúbico a Metro cúbico
             case 8: resultado = volumen * 1728; tipoConversion = "pulgada cúbica"; break;  // Pie cúbico a Pulgada cúbica
             case 9: resultado = volumen; break;
             case 10: resultado = volumen * 0.037037; tipoConversion = "yarda cúbica"; break;  // Pie cúbico a Yarda cúbica
             case 11: resultado = volumen * 7.48052; tipoConversion = "galon"; break;  // Pie cúbico a Galón
             case 12: resultado = volumen * 59.8442; tipoConversion = "pinta"; break;  // Pie cúbico a Pinta
             case 13: resultado = volumen * 957.506; tipoConversion = "onza fluida"; break;  // Pie cúbico a Onza fluida
         }
         break;
     case 10: // Yarda cúbica
         switch (unidadDestino) {
             case 1: resultado = volumen * 764.555; tipoConversion = "litro"; break;  // Yarda cúbica a Litro
             case 2: resultado = volumen * 764555; tipoConversion = "mililitro"; break;  // Yarda cúbica a Mililitro
             case 3: resultado = volumen * 76.4555; tipoConversion = "decalitro"; break;  // Yarda cúbica a Decalitro
             case 4: resultado = volumen * 7.64555e8; tipoConversion = "milímetro cúbico"; break;  // Yarda cúbica a Milímetro cúbico
             case 5: resultado = volumen * 764555; tipoConversion = "centímetro cúbico"; break;  // Yarda cúbica a Centímetro cúbico
             case 6: resultado = volumen * 764.555; tipoConversion = "decímetro cúbico"; break;  // Yarda cúbica a Decímetro cúbico
             case 7: resultado = volumen * 0.764555; tipoConversion = "metro cúbico"; break;  // Yarda cúbica a Metro cúbico
             case 8: resultado = volumen * 46656; tipoConversion = "pulgada cúbica"; break;  // Yarda cúbica a Pulgada cúbica
             case 9: resultado = volumen * 27; tipoConversion = "pie cúbico"; break;  // Yarda cúbica a Pie cúbico
             case 10: resultado = volumen; break;
             case 11: resultado = volumen * 201.974; tipoConversion = "galon"; break;  // Yarda cúbica a Galón
             case 12: resultado = volumen * 1615.79; tipoConversion = "pinta"; break;  // Yarda cúbica a Pinta
             case 13: resultado = volumen * 25852.7; tipoConversion = "onza fluida"; break;  // Yarda cúbica a Onza fluida
         }
         break;
     case 11: // Galón
         switch (unidadDestino) {
             case 1: resultado = volumen * 3.78541; tipoConversion = "litro"; break;  // Galón a Litro
             case 2: resultado = volumen * 3785.41; tipoConversion = "mililitro"; break;  // Galón a Mililitro
             case 3: resultado = volumen * 0.378541; tipoConversion = "decalitro"; break;  // Galón a Decalitro
             case 4: resultado = volumen * 3.78541e6; tipoConversion = "milímetro cúbico"; break;  // Galón a Milímetro cúbico
             case 5: resultado = volumen * 3785.41; tipoConversion = "centímetro cúbico"; break;  // Galón a Centímetro cúbico
             case 6: resultado = volumen * 3.78541; tipoConversion = "decímetro cúbico"; break;  // Galón a Decímetro cúbico
             case 7: resultado = volumen * 0.00378541; tipoConversion = "metro cúbico"; break;  // Galón a Metro cúbico
             case 8: resultado = volumen * 231; tipoConversion = "pulgada cúbica"; break;  // Galón a Pulgada cúbica
             case 9: resultado = volumen * 0.133681; tipoConversion = "pie cúbico"; break;  // Galón a Pie cúbico
             case 10: resultado = volumen * 0.00495113; tipoConversion = "yarda cúbica"; break;  // Galón a Yarda cúbica
             case 11: resultado = volumen; break;
             case 12: resultado = volumen * 8; tipoConversion = "pinta"; break;  // Galón a Pinta
             case 13: resultado = volumen * 128; tipoConversion = "onza fluida"; break;  // Galón a Onza fluida
         }
         break;
     case 12: // Pinta
         switch (unidadDestino) {
             case 1: resultado = volumen * 0.473176; tipoConversion = "litro"; break;  // Pinta a Litro
             case 2: resultado = volumen * 473.176; tipoConversion = "mililitro"; break;  // Pinta a Mililitro
             case 3: resultado = volumen * 0.0473176; tipoConversion = "decalitro"; break;  // Pinta a Decalitro
             case 4: resultado = volumen * 473176; tipoConversion = "milímetro cúbico"; break;  // Pinta a Milímetro cúbico
             case 5: resultado = volumen * 473.176; tipoConversion = "centímetro cúbico"; break;  // Pinta a Centímetro cúbico
             case 6: resultado = volumen * 0.473176; tipoConversion = "decímetro cúbico"; break;  // Pinta a Decímetro cúbico
             case 7: resultado = volumen * 0.000473176; tipoConversion = "metro cúbico"; break;  // Pinta a Metro cúbico
             case 8: resultado = volumen * 28.875; tipoConversion = "pulgada cúbica"; break;  // Pinta a Pulgada cúbica
             case 9: resultado = volumen * 0.0167101; tipoConversion = "pie cúbico"; break;  // Pinta a Pie cúbico
             case 10: resultado = volumen * 0.000618891; tipoConversion = "yarda cúbica"; break;  // Pinta a Yarda cúbica
             case 11: resultado = volumen * 0.125; tipoConversion = "galón"; break;  // Pinta a Galón
             case 12: resultado = volumen; break;
             case 13: resultado = volumen * 16; tipoConversion = "onza fluida"; break;  // Pinta a Onza fluida
         }
         break;
     case 13: // Onza fluida
         switch (unidadDestino) {
             case 1: resultado = volumen * 0.0295735; tipoConversion = "litro"; break;  // Onza fluida a Litro
             case 2: resultado = volumen * 29.5735; tipoConversion = "mililitro"; break;  // Onza fluida a Mililitro
             case 3: resultado = volumen * 0.00295735; tipoConversion = "decalitro"; break;  // Onza fluida a Decalitro
             case 4: resultado = volumen * 29.5735e3; tipoConversion = "milímetro cúbico"; break;  // Onza fluida a Milímetro cúbico
             case 5: resultado = volumen * 29.5735; tipoConversion = "centímetro cúbico"; break;  // Onza fluida a Centímetro cúbico
             case 6: resultado = volumen * 0.0295735; tipoConversion = "decímetro cúbico"; break;  // Onza fluida a Decímetro cúbico
             case 7: resultado = volumen * 2.95735e-5; tipoConversion = "metro cúbico"; break;  // Onza fluida a Metro cúbico
             case 8: resultado = volumen * 1.80469; tipoConversion = "pulgada cúbica"; break;  // Onza fluida a Pulgada cúbica
             case 9: resultado = volumen * 0.00104438; tipoConversion = "pie cúbico"; break;  // Onza fluida a Pie cúbico
             case 10: resultado = volumen * 3.86842e-5; tipoConversion = "yarda cúbica"; break;  // Onza fluida a Yarda cúbica
             case 11: resultado = volumen * 0.0078125; tipoConversion = "galón"; break;  // Onza fluida a Galón
             case 12: resultado = volumen * 0.0625; tipoConversion = "pinta"; break;  // Onza fluida a Pinta
             case 13: resultado = volumen; break;
         }
         break;
 }
 System.out.println("El resultado es: " + resultado);
}
public static void convertirTemperatura() {
Scanner scanner = new Scanner(System.in);
System.out.println("Seleccione la unidad de temperatura de origen:");
System.out.println("1. Celsius");
System.out.println("2. Fahrenheit");
System.out.println("3. Kelvin");
System.out.println("4. Rankine");
System.out.println("5. Réamur");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de temperatura de destino:");
System.out.println("1. Celsius");
System.out.println("2. Fahrenheit");
System.out.println("3. Kelvin");
System.out.println("4. Rankine");
System.out.println("5. Réamur");

int unidadDestino = scanner.nextInt();

System.out.println("Ingrese la temperatura:");
while (!scanner.hasNextDouble()) {
	System.out.println("Por favor, ingrese un valor numérico válido: ");
	scanner.next();
}
double temperatura = scanner.nextDouble();
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

switch (unidadOrigen) {
    case 1: // Celsius
        switch (unidadDestino) {
            case 1: resultado = temperatura; break; // Celsius
            case 2: resultado = (temperatura * 9 / 5) + 32; tipoConversion = "fahrenheit"; break; // Celcius a Fahrenheit
            case 3: resultado = temperatura + 273.15; tipoConversion = "kelvin";  break;// Celcius a Kelvin
            case 4: resultado = (temperatura + 273.15) * 9 / 5; tipoConversion = "rankine"; break; // Celcius a Rankine    
            case 5: resultado = temperatura * 4 / 5;tipoConversion = "réamur";  break; // Celcius a Réamur 
                
            default:
                System.out.println("Unidad de destino no válida.");
                return;
        }
        break;
    case 2: // Fahrenheit
        // Convertir Fahrenheit a Celsius primero para simplificar el proceso
        temperatura = (temperatura - 32) * 5 / 9;
        switch (unidadDestino) {
            case 1: resultado = temperatura; tipoConversion = "celcius"; break; // Fahrenheit a Celsius                
            case 2: resultado = (temperatura * 9 / 5) + 32; break; // Fahrenheit                              
            case 3: resultado = temperatura + 273.15; tipoConversion = "kelvin"; break; // Fahrenheit a Kelvin               
            case 4: resultado = (temperatura + 273.15) * 9 / 5; tipoConversion = "rankine"; break; // Fahrenheit a Rankine
            case 5: resultado = temperatura * 4 / 5; tipoConversion = "réamur"; break; // Fahrenheit a Réamur
                                
            default:
                System.out.println("Unidad de destino no válida.");
                return;
        }
        break;
    case 3: // Kelvin
        // Convertir Kelvin a Celsius primero para simplificar el proceso
        temperatura -= 273.15;
        switch (unidadDestino) {
            case 1: resultado = temperatura; tipoConversion = "celcius"; break; // Kelvin a Celsius                
            case 2:  resultado = (temperatura * 9 / 5) + 32; tipoConversion = "fahrenheit"; break; // Kelvin a Fahrenheit
            case 3: resultado = temperatura + 273.15; tipoConversion = "kelvin"; break; // Kelvin              
            case 4: resultado = (temperatura + 273.15) * 9 / 5; tipoConversion = "rankine"; break; // Kelvin a Rankine               
            case 5: resultado = temperatura * 4 / 5; tipoConversion = "réamur"; break; // Kelvin a Réamur
                
            default:
                System.out.println("Unidad de destino no válida.");
                return;
        }
        break;
    case 4: // Rankine
        // Convertir Rankine a Celsius primero para simplificar el proceso
        temperatura = (temperatura - 491.67) * 5 / 9;
        switch (unidadDestino) {
            case 1: resultado = temperatura; tipoConversion = "celcius"; break; // Rankine a Celsius                
            case 2: resultado = (temperatura * 9 / 5) + 32; tipoConversion = "fahrenheit"; break; // Rankine a Fahrenheit                
            case 3: resultado = temperatura + 273.15; tipoConversion = "kelvin"; break; // Rankine a Kelvin                
            case 4: resultado = (temperatura + 273.15) * 9 / 5; break; // Rankine                
            case 5: resultado = temperatura * 4 / 5; tipoConversion = "réamur"; break; // Rankine a Réamur
                                
            default:
                System.out.println("Unidad de destino no válida.");
                return;
        }
        break;
    case 5: // Réamur
        // Convertir Réamur a Celsius primero para simplificar el proceso
        temperatura = temperatura * 5 / 4;
        switch (unidadDestino) {
            case 1: resultado = temperatura; tipoConversion = "celcius"; break; // Réamur a Celsius                
            case 2: resultado = (temperatura * 9 / 5) + 32; tipoConversion = "fahrenheit"; break; // Réamur a Fahrenheit                                
            case 3: resultado = temperatura + 273.15; tipoConversion = "kelvin"; break; // Réamur a Kelvin                                
            case 4: resultado = (temperatura + 273.15) * 9 / 5; tipoConversion = "rankine"; break; // Réamur a Rankine                                
            case 5: resultado = temperatura * 4 / 5; break; // Réamur
                                
            default:
                System.out.println("Unidad de destino no válida.");
                return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("Temperatura convertida: " + resultado);

scanner.close();
}
public static void convertirVelocidad() {
Scanner scanner = new Scanner(System.in);

System.out.println("Bienvenido al conversor de unidades de velocidad.");
System.out.println("Seleccione la unidad de velocidad de origen:");
System.out.println("1. Metro/segundo (m/s)");
System.out.println("2. Pie/segundo (ft/s)");
System.out.println("3. Kilómetro/segundo (km/s)");
System.out.println("4. Metro/minuto (m/min)");
System.out.println("5. Pie/minuto (ft/min)");
System.out.println("6. Kilómetro/minuto (km/min)");
System.out.println("7. Kilómetro/hora (km/h)");
System.out.println("8. Milla/hora (mph)");
System.out.println("9. Nudo (knot)");
System.out.println("10. Minuto/kilómetro (min/km)");
System.out.println("11. Minuto/milla (min/mile)");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de velocidad de destino:");
System.out.println("1. Metro/segundo (m/s)");
System.out.println("2. Pie/segundo (ft/s)");
System.out.println("3. Kilómetro/segundo (km/s)");
System.out.println("4. Metro/minuto (m/min)");
System.out.println("5. Pie/minuto (ft/min)");
System.out.println("6. Kilómetro/minuto (km/min)");
System.out.println("7. Kilómetro/hora (km/h)");
System.out.println("8. Milla/hora (mph)");
System.out.println("9. Nudo (knot)");
System.out.println("10. Minuto/kilómetro (min/km)");
System.out.println("11. Minuto/milla (min/mile)");

int unidadDestino = scanner.nextInt();

System.out.println("Ingrese la velocidad:");
double velocidad = scanner.nextDouble();
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

switch (unidadOrigen) {
    case 1: // Metro/segundo (m/s)
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;
            case 2: resultado = velocidad * 3.28084; tipoConversion = "pie/segundo"; break; // m/s a ft/s
            case 3: resultado = velocidad * 0.001; tipoConversion = "km/segundo"; break; // m/s a km/s
            case 4: resultado = velocidad * 60; tipoConversion = "metro/minuto"; break; // m/s a m/min
            case 5: resultado = velocidad * 196.85; tipoConversion = "pie/minuto"; break; // m/s a ft/min
            case 6: resultado = velocidad * 0.06; tipoConversion = "km/minuto"; break; // m/s a km/min
            case 7: resultado = velocidad * 3.6; tipoConversion = "km/hora"; break; // m/s a km/h
            case 8: resultado = velocidad * 2.23694; tipoConversion = "milla/hora"; break; // m/s a mph
            case 9: resultado = velocidad * 1.94384; tipoConversion = "nudo"; break; // m/s a knot
            case 10: resultado = 1 / (velocidad * 60 / 1000); tipoConversion = "minuto/km"; break; // m/s a min/km
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); tipoConversion = "minuto/milla"; break; // m/s a min/mile
            default: System.out.println("Unidad de destino no válida.");
            return;
        }
        break;
    case 2: // Pie/segundo (ft/s)
        // Convertir ft/s a m/s primero para simplificar el proceso
        velocidad *= 0.3048;
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;        // ft/s a m/s
            case 2: resultado = velocidad * 3.28084; break;
            case 3: resultado = velocidad * 0.001; break;
            case 4: resultado = velocidad * 60; break;
            case 5: resultado = velocidad * 196.85; break;
            case 6: resultado = velocidad * 0.06; break;
            case 7: resultado = velocidad * 3.6; break;
            case 8: resultado = velocidad * 2.23694; break;
            case 9: resultado = velocidad * 1.94384; break;
            case 10: resultado = 1 / (velocidad * 60 / 1000); break;
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 3: // Kilómetro/segundo (km/s)
        // Convertir km/s a m/s primero para simplificar el proceso
        velocidad *= 1000;
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;        // km/s a m/s
            case 2: resultado = velocidad * 3.28084; break;
            case 3: resultado = velocidad * 0.001; break;
            case 4: resultado = velocidad * 60; break;
            case 5: resultado = velocidad * 196.85; break;
            case 6: resultado = velocidad * 0.06; break;
            case 7: resultado = velocidad * 3.6; break;
            case 8: resultado = velocidad * 2.23694; break;
            case 9: resultado = velocidad * 1.94384; break;
            case 10: resultado = 1 / (velocidad * 60 / 1000); break;
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 4: // Metro/minuto (m/min)
        // Convertir m/min a m/s primero para simplificar el proceso
        velocidad /= 60;
        switch (unidadDestino) {
            case 1: resultado = velocidad * 60; break;       // m/min a m/s
            case 2: resultado = velocidad * 196.85; break;   // m/min a ft/s
            case 3: resultado = velocidad * 0.001; break;    // m/min a km/s
            case 4: resultado = velocidad; break;
            case 5: resultado = velocidad * 3.28084; break;  // m/min a ft/min
            case 6: resultado = velocidad * 0.06; break;     // m/min a km/min
            case 7: resultado = velocidad * 3.6; break;      // m/min a km/h
            case 8: resultado = velocidad * 2.23694; break;  // m/min a mph
            case 9: resultado = velocidad * 1.94384; break;  // m/min a knot
            case 10: resultado = 1 / (velocidad * 60 / 1000); break;  // m/min a min/km
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); break;  // m/min a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 5: // Pie/minuto (ft/min)
        // Convertir ft/min a m/s primero para simplificar el proceso
        velocidad *= 0.00508;
        switch (unidadDestino) {
            case 1: resultado = velocidad * 60 / 3.28084; break;  // ft/min a m/s
            case 2: resultado = velocidad * 60; break;
            case 3: resultado = velocidad * 60 / 1000; break;
            case 4: resultado = velocidad * 60 / 196.85; break;    // ft/min a m/min
            case 5: resultado = velocidad; break;
            case 6: resultado = velocidad * 60 / 1063.1; break;    // ft/min a km/min
            case 7: resultado = velocidad * 60 / 196.85; break;    // ft/min a km/h
            case 8: resultado = velocidad * 60 / 3280.84; break;   // ft/min a mph
            case 9: resultado = velocidad * 60 / 6076.12; break;   // ft/min a knot
            case 10: resultado = 1 / (velocidad / 60 / 1000); break;  // ft/min a min/km
            case 11: resultado = 1 / (velocidad / 60 / 1609.34); break;  // ft/min a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 6: // Kilómetro/minuto (km/min)
        // Convertir km/min a m/s primero para simplificar el proceso
        velocidad /= 60;
        switch (unidadDestino) {
            case 1: resultado = velocidad * 60 * 1000; break;       // km/min a m/s
            case 2: resultado = velocidad * 60 * 1000 * 3.28084; break;
            case 3: resultado = velocidad * 60; break;
            case 4: resultado = velocidad * 60 * 1000 / 60; break;  // km/min a m/min
            case 5: resultado = velocidad * 60 * 1000 * 3.28084 / 60; break;
            case 6: resultado = velocidad; break;
            case 7: resultado = velocidad * 60; break;              // km/min a km/h
            case 8: resultado = velocidad * 60 * 1000 * 2.23694; break;   // km/min a mph
            case 9: resultado = velocidad * 60 * 1000 * 1.94384; break;   // km/min a knot
            case 10: resultado = 1 / velocidad; break;                     // km/min a min/km
            case 11: resultado = 1 / (velocidad / 60 / 1609.34); break;    // km/min a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 7: // Kilómetro/hora (km/h)
        // Convertir km/h a m/s primero para simplificar el proceso
        velocidad /= 3.6;
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;        // km/h a m/s
            case 2: resultado = velocidad * 3.28084; break;
            case 3: resultado = velocidad * 0.001; break;
            case 4: resultado = velocidad * 60; break;   // km/h a m/min
            case 5: resultado = velocidad * 196.85; break;  // km/h a ft/min
            case 6: resultado = velocidad / 60; break;   // km/h a km/min
            case 7: resultado = velocidad; break;
            case 8: resultado = velocidad * 0.621371; break;  // km/h a mph
            case 9: resultado = velocidad * 0.539957; break;  // km/h a knot
            case 10: resultado = 1 / (velocidad * 60 / 1000); break;  // km/h a min/km
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); break;  // km/h a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 8: // Milla/hora (mph)
        // Convertir mph a m/s primero para simplificar el proceso
        velocidad *= 0.44704;
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;        // mph a m/s
            case 2: resultado = velocidad * 3.28084; break;
            case 3: resultado = velocidad * 0.001; break;
            case 4: resultado = velocidad * 60; break;   // mph a m/min
            case 5: resultado = velocidad * 196.85; break;  // mph a ft/min
            case 6: resultado = velocidad / 60; break;   // mph a km/min
            case 7: resultado = velocidad * 1.60934; break;  // mph a km/h
            case 8: resultado = velocidad; break;
            case 9: resultado = velocidad * 0.868976; break;  // mph a knot
            case 10: resultado = 1 / (velocidad * 60 / 1609.34); break;  // mph a min/km
            case 11: resultado = 1 / (velocidad * 60 / 1609.34); break;  // mph a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 9: // Nudo (knot)
        // Convertir knot a m/s primero para simplificar el proceso
        velocidad *= 0.514444;
        switch (unidadDestino) {
            case 1: resultado = velocidad; break;        // knot a m/s
            case 2: resultado = velocidad * 3.28084; break;
            case 3: resultado = velocidad * 0.001; break;
            case 4: resultado = velocidad * 60; break;   // knot a m/min
            case 5: resultado = velocidad * 196.85; break;  // knot a ft/min
            case 6: resultado = velocidad / 60; break;   // knot a km/min
            case 7: resultado = velocidad * 1.852; break;  // knot a km/h
            case 8: resultado = velocidad * 1.15078; break;  // knot a mph
            case 9: resultado = velocidad; break;
            case 10: resultado = 1 / (velocidad * 60 / 1852); break;  // knot a min/km
            case 11: resultado = 1 / (velocidad * 60 / 1852 / 1609.34); break;  // knot a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 10: // Minuto/kilómetro (min/km)
        // Convertir min/km a m/s primero para simplificar el proceso
        velocidad = 1 / velocidad * 60 / 1000;
        switch (unidadDestino) {
            case 1: resultado = velocidad * 60; break;       // min/km a m/s
            case 2: resultado = velocidad * 60 * 3.28084; break;   // min/km a ft/s
            case 3: resultado = velocidad * 60 * 0.001; break;    // min/km a km/s
            case 4: resultado = velocidad; break;       // min/km a m/min
            case 5: resultado = velocidad * 196.85; break;   // min/km a ft/min
            case 6: resultado = velocidad * 0.06; break;     // min/km a km/min
            case 7: resultado = velocidad * 3.6; break;      // min/km a km/h
            case 8: resultado = velocidad * 2.23694; break;  // min/km a mph
            case 9: resultado = velocidad * 1.94384; break;  // min/km a knot
            case 10: resultado = velocidad; break;  // min/km a min/km
            case 11: resultado = velocidad * 1609.34; break;  // min/km a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 11: // Minuto/milla (min/mile)
        // Convertir min/mile a m/s primero para simplificar el proceso
        velocidad = 1 / velocidad * 60 / 1609.34;
        switch (unidadDestino) {
            case 1: resultado = velocidad * 60; break;       // min/mile a m/s
            case 2: resultado = velocidad * 60 * 3.28084; break;   // min/mile a ft/s
            case 3: resultado = velocidad * 60 * 0.001; break;    // min/mile a km/s
            case 4: resultado = velocidad; break;       // min/mile a m/min
            case 5: resultado = velocidad * 196.85; break;   // min/mile a ft/min
            case 6: resultado = velocidad * 0.06; break;     // min/mile a km/min
            case 7: resultado = velocidad * 3.6; break;      // min/mile a km/h
            case 8: resultado = velocidad * 2.23694; break;  // min/mile a mph
            case 9: resultado = velocidad * 1.94384; break;  // min/mile a knot
            case 10: resultado = velocidad * 1000; break;  // min/mile a min/km
            case 11: resultado = velocidad; break;  // min/mile a min/mile
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("Velocidad convertida: " + resultado + " unidades de destino .");

scanner.close();
} 
public static void convertirPresion() {
 Scanner scanner = new Scanner(System.in);
 double resultado = 0;

 System.out.println("Bienvenido al conversor de presión.");
 System.out.println("Por favor, seleccione la unidad de presión de origen:");
 System.out.println("1. Atmósfera");
 System.out.println("2. Pascal");
 System.out.println("3. Hectopascal");
 System.out.println("4. Kilopascal");
 System.out.println("5. Megapascal");
 System.out.println("6. Bar");
 System.out.println("7. Milibar");
 System.out.println("8. Psi");
 System.out.println("9. Psf");
 System.out.println("10. Ksi");
 System.out.println("11. Kilogramo-fuerza por centímetro cuadrado (kgf/cm^2)");
 System.out.println("12. Kilogramo-fuerza por metro cuadrado (kgf/m^2)");
 System.out.println("13. Milímetro de mercurio (mmHg)");
 System.out.println("14. Centímetro de mercurio (cmHg)");
 System.out.println("15. Pulgada de mercurio (inchHg)");
 System.out.println("16. Milímetro de agua (mmH2O)");
 System.out.println("17. Centímetro de agua (cmH2O)");
 System.out.println("18. Pulgada de agua (inchH2O)");

 int unidadOrigen = scanner.nextInt();

 System.out.println("Seleccione la unidad de presión de destino:");
 int unidadDestino = scanner.nextInt();

 System.out.println("Ingrese la presión:");
 double presion = scanner.nextDouble();
 String tipoConversion = " "; // Variable para almacenar el tipo de conversión

 String[] unidades = {"atm", "Pa", "hPa", "kPa", "MPa", "bar", "mbar", "psi", "psf", "ksi", "kgf/cm^2", "kgf/m^2", "mmHg", "cmHg", "inchHg", "mmH2O", "cmH2O", "inchH2O"};

 switch (unidadOrigen) {
     case 1: // Atmósfera
         switch (unidadDestino) {
             case 1: resultado = presion; break;
             case 2: resultado = presion * 101325; break;
             case 3: resultado = presion * 1013.25; break;
             case 4: resultado = presion * 101.325; break;
             case 5: resultado = presion * 0.101325; break;
             case 6: resultado = presion * 1.01325; break;
             case 7: resultado = presion * 1013.25; break;
             case 8: resultado = presion * 14.6959; break;
             case 9: resultado = presion * 2048.16; break;
             case 10: resultado = presion * 0.0146959; break;
             case 11: resultado = presion * 1.03323; break;
             case 12: resultado = presion * 101971.6; break;
             case 13: resultado = presion * 760; break;
             case 14: resultado = presion * 76; break;
             case 15: resultado = presion * 29.9213; break;
             case 16: resultado = presion * 10332.3; break;
             case 17: resultado = presion * 10332.3; break;
             case 18: resultado = presion * 406.793; break;
             default: System.out.println("Unidad de destino no válida."); return;
         }
         break;
    case 2: // Pascal (Pa)
        switch (unidadDestino) {
            case 1: resultado = presion * 9.8692e-6; break;     // Pa a atm
            case 2: resultado = presion; break;                // Pa a Pa
            case 3: resultado = presion * 0.01; break;         // Pa a hPa
            case 4: resultado = presion * 0.001; break;        // Pa a kPa
            case 5: resultado = presion * 1e-6; break;         // Pa a MPa
            case 6: resultado = presion * 1e-5; break;         // Pa a bar
            case 7: resultado = presion * 0.01; break;         // Pa a mbar
            case 8: resultado = presion * 0.000145038; break;  // Pa a psi
            case 9: resultado = presion * 0.0208854; break;    // Pa a psf
            case 10: resultado = presion * 1.45038e-7; break; // Pa a ksi
            case 11: resultado = presion * 1.01972e-5; break;  // Pa a kgf/cm^2
            case 12: resultado = presion * 10197.2; break;     // Pa a kgf/m^2
            case 13: resultado = presion * 0.00750062; break; // Pa a mmHg
            case 14: resultado = presion * 0.000750062; break;// Pa a cmHg
            case 15: resultado = presion * 0.0002953; break;  // Pa a inchHg
            case 16: resultado = presion * 0.101972; break;   // Pa a mmH2O
            case 17: resultado = presion * 10.1972; break;    // Pa a cmH2O
            case 18: resultado = presion * 0.401463; break;   // Pa a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 3: // Hectopascal (hPa)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.00098692; break;   // hPa a atm
            case 2: resultado = presion * 100; break;         // hPa a Pa
            case 3: resultado = presion; break;                // hPa a hPa
            case 4: resultado = presion * 0.1; break;         // hPa a kPa
            case 5: resultado = presion * 1e-4; break;        // hPa a MPa
            case 6: resultado = presion * 0.001; break;       // hPa a bar
            case 7: resultado = presion; break;                // hPa a mbar
            case 8: resultado = presion * 0.0145038; break;   // hPa a psi
            case 9: resultado = presion * 2.08854; break;     // hPa a psf
            case 10: resultado = presion * 1.45038e-5; break; // hPa a ksi
            case 11: resultado = presion * 0.00101972; break; // hPa a kgf/cm^2
            case 12: resultado = presion * 1019.72; break;    // hPa a kgf/m^2
            case 13: resultado = presion * 0.750062; break;  // hPa a mmHg
            case 14: resultado = presion * 0.0750062; break; // hPa a cmHg
            case 15: resultado = presion * 0.02953; break;   // hPa a inchHg
            case 16: resultado = presion * 10.1972; break;    // hPa a mmH2O
            case 17: resultado = presion * 1019.72; break;    // hPa a cmH2O
            case 18: resultado = presion * 4.01463; break;   // hPa a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 4: // Kilopascal (kPa)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.00986923; break;   // kPa a atm
            case 2: resultado = presion * 1000; break;         // kPa a Pa
            case 3: resultado = presion * 10; break;           // kPa a hPa
            case 4: resultado = presion; break;                // kPa a kPa
            case 5: resultado = presion * 1e-3; break;        // kPa a MPa
            case 6: resultado = presion * 0.01; break;        // kPa a bar
            case 7: resultado = presion * 10; break;          // kPa a mbar
            case 8: resultado = presion * 0.145038; break;    // kPa a psi
            case 9: resultado = presion * 20.8854; break;     // kPa a psf
            case 10: resultado = presion * 1.45038e-4; break;// kPa a ksi
            case 11: resultado = presion * 0.0101972; break;  // kPa a kgf/cm^2
            case 12: resultado = presion * 10197.2; break;    // kPa a kgf/m^2
            case 13: resultado = presion * 7.50062; break;    // kPa a mmHg
            case 14: resultado = presion * 0.750062; break;   // kPa a cmHg
            case 15: resultado = presion * 0.2953; break;     // kPa a inchHg
            case 16: resultado = presion * 101.972; break;    // kPa a mmH2O
            case 17: resultado = presion * 10197.2; break;    // kPa a cmH2O
            case 18: resultado = presion * 40.1463; break;    // kPa a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 5: // Megapascal (MPa)
        switch (unidadDestino) {
            case 1: resultado = presion * 9.8692; break;       // MPa a atm
            case 2: resultado = presion * 1e6; break;          // MPa a Pa
            case 3: resultado = presion * 1e4; break;          // MPa a hPa
            case 4: resultado = presion * 1e3; break;          // MPa a kPa
            case 5: resultado = presion; break;                // MPa a MPa
            case 6: resultado = presion * 10; break;           // MPa a bar
            case 7: resultado = presion * 1e4; break;          // MPa a mbar
            case 8: resultado = presion * 145.038; break;      // MPa a psi
            case 9: resultado = presion * 20885.4; break;      // MPa a psf
            case 10: resultado = presion * 0.145038; break;    // MPa a ksi
            case 11: resultado = presion * 10.1972; break;     // MPa a kgf/cm^2
            case 12: resultado = presion * 1.01972e7; break;   // MPa a kgf/m^2
            case 13: resultado = presion * 7500.62; break;    // MPa a mmHg
            case 14: resultado = presion * 750.062; break;    // MPa a cmHg
            case 15: resultado = presion * 295.3; break;      // MPa a inchHg
            case 16: resultado = presion * 101972; break;     // MPa a mmH2O
            case 17: resultado = presion * 1.01972e7; break;  // MPa a cmH2O
            case 18: resultado = presion * 40146.3; break;    // MPa a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 6: // Bar (bar)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.986923; break;     // bar a atm
            case 2: resultado = presion * 100000; break;       // bar a Pa
            case 3: resultado = presion * 1000; break;         // bar a hPa
            case 4: resultado = presion * 100; break;          // bar a kPa
            case 5: resultado = presion * 0.1; break;          // bar a MPa
            case 6: resultado = presion; break;                // bar a bar
            case 7: resultado = presion * 1000; break;        // bar a mbar
            case 8: resultado = presion * 14.5038; break;     // bar a psi
            case 9: resultado = presion * 2088.54; break;      // bar a psf
            case 10: resultado = presion * 0.0145038; break;  // bar a ksi
            case 11: resultado = presion * 1.01972; break;    // bar a kgf/cm^2
            case 12: resultado = presion * 101972; break;     // bar a kgf/m^2
            case 13: resultado = presion * 750.062; break;    // bar a mmHg
            case 14: resultado = presion * 75.0062; break;    // bar a cmHg
            case 15: resultado = presion * 29.53; break;      // bar a inchHg
            case 16: resultado = presion * 10197.2; break;    // bar a mmH2O
            case 17: resultado = presion * 101972; break;     // bar a cmH2O
            case 18: resultado = presion * 40146.3; break;    // bar a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 7: // Milibar (mbar)
        switch (unidadDestino) {
            case 1: resultado = presion * 9.8692e-4; break;    // mbar a atm
            case 2: resultado = presion * 100; break;         // mbar a Pa
            case 3: resultado = presion * 0.1; break;          // mbar a hPa
            case 4: resultado = presion * 0.01; break;         // mbar a kPa
            case 5: resultado = presion * 1e-5; break;         // mbar a MPa
            case 6: resultado = presion * 1e-3; break;         // mbar a bar
            case 7: resultado = presion; break;                // mbar a mbar
            case 8: resultado = presion * 0.0145038; break;    // mbar a psi
            case 9: resultado = presion * 2.08854; break;      // mbar a psf
            case 10: resultado = presion * 1.45038e-5; break; // mbar a ksi
            case 11: resultado = presion * 0.00101972; break; // mbar a kgf/cm^2
            case 12: resultado = presion * 1019.72; break;    // mbar a kgf/m^2
            case 13: resultado = presion * 0.750062; break;   // mbar a mmHg
            case 14: resultado = presion * 0.0750062; break;  // mbar a cmHg
            case 15: resultado = presion * 0.02953; break;   // mbar a inchHg
            case 16: resultado = presion * 10.1972; break;    // mbar a mmH2O
            case 17: resultado = presion * 1019.72; break;    // mbar a cmH2O
            case 18: resultado = presion * 4.01463; break;   // mbar a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 8: // Libra por pulgada cuadrada (psi)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.068046; break;    // psi a atm
            case 2: resultado = presion * 6894.76; break;     // psi a Pa
            case 3: resultado = presion * 68.9476; break;     // psi a hPa
            case 4: resultado = presion * 6.89476; break;     // psi a kPa
            case 5: resultado = presion * 0.00689476; break; // psi a MPa
            case 6: resultado = presion * 0.0689476; break;   // psi a bar
            case 7: resultado = presion * 68.9476; break;     // psi a mbar
            case 8: resultado = presion; break;               // psi a psi
            case 9: resultado = presion * 144; break;         // psi a psf
            case 10: resultado = presion * 0.001; break;     // psi a ksi
            case 11: resultado = presion * 0.070307; break;  // psi a kgf/cm^2
            case 12: resultado = presion * 7030.7; break;    // psi a kgf/m^2
            case 13: resultado = presion * 51.7149; break;   // psi a mmHg
            case 14: resultado = presion * 5.17149; break;   // psi a cmHg
            case 15: resultado = presion * 2.03602; break;   // psi a inchHg
            case 16: resultado = presion * 703.071; break;   // psi a mmH2O
            case 17: resultado = presion * 70307.1; break;  // psi a cmH2O
            case 18: resultado = presion * 27.6818; break;  // psi a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 9: // Libra por pie cuadrado (psf)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.00000689476; break;   // psf a atm
            case 2: resultado = presion * 0.0478803; break;       // psf a Pa
            case 3: resultado = presion * 0.000478803; break;     // psf a hPa
            case 4: resultado = presion * 0.0000478803; break;    // psf a kPa
            case 5: resultado = presion * 4.78803e-8; break;      // psf a MPa
            case 6: resultado = presion * 4.78803e-7; break;      // psf a bar
            case 7: resultado = presion * 0.0478803; break;       // psf a mbar
            case 8: resultado = presion * 0.00000694444; break;   // psf a psi
            case 9: resultado = presion; break;                   // psf a psf
            case 10: resultado = presion * 6.94444e-8; break;     // psf a ksi
            case 11: resultado = presion * 0.00000604592; break;  // psf a kgf/cm^2
            case 12: resultado = presion * 0.3048; break;         // psf a kgf/m^2
            case 13: resultado = presion * 0.00225266; break;    // psf a mmHg
            case 14: resultado = presion * 0.000225266; break;   // psf a cmHg
            case 15: resultado = presion * 0.0000884694; break;  // psf a inchHg
            case 16: resultado = presion * 0.3048; break;        // psf a mmH2O
            case 17: resultado = presion * 30.48; break;         // psf a cmH2O
            case 18: resultado = presion * 0.012; break;         // psf a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 10: // Ksi (ksi)
        switch (unidadDestino) {
            case 1: resultado = presion * 68.9476; break;     // ksi a atm
            case 2: resultado = presion * 6894757.29; break;  // ksi a Pa
            case 3: resultado = presion * 68947.5729; break;  // ksi a hPa
            case 4: resultado = presion * 6894.75729; break;  // ksi a kPa
            case 5: resultado = presion * 6.89476; break;    // ksi a MPa
            case 6: resultado = presion * 68.9476; break;    // ksi a bar
            case 7: resultado = presion * 68947.6; break;    // ksi a mbar
            case 8: resultado = presion * 1000; break;       // ksi a psi
            case 9: resultado = presion * 144000; break;     // ksi a psf
            case 10: resultado = presion; break;             // ksi a ksi
            case 11: resultado = presion * 70.307; break;    // ksi a kgf/cm^2
            case 12: resultado = presion * 7030703; break;   // ksi a kgf/m^2
            case 13: resultado = presion * 517149; break;    // ksi a mmHg
            case 14: resultado = presion * 51714.9; break;   // ksi a cmHg
            case 15: resultado = presion * 20360.2; break;   // ksi a inchHg
            case 16: resultado = presion * 7030710; break;   // ksi a mmH2O
            case 17: resultado = presion * 703071000; break; // ksi a cmH2O
            case 18: resultado = presion * 276818; break;    // ksi a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 11: // Kilogramo-fuerza por centímetro cuadrado (kgf/cm^2)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.967841; break;       // kgf/cm^2 a atm
            case 2: resultado = presion * 98066.5; break;        // kgf/cm^2 a Pa
            case 3: resultado = presion * 980.665; break;        // kgf/cm^2 a hPa
            case 4: resultado = presion * 98.0665; break;        // kgf/cm^2 a kPa
            case 5: resultado = presion * 0.0980665; break;     // kgf/cm^2 a MPa
            case 6: resultado = presion * 0.980665; break;      // kgf/cm^2 a bar
            case 7: resultado = presion * 980.665; break;        // kgf/cm^2 a mbar
            case 8: resultado = presion * 14.2233; break;        // kgf/cm^2 a psi
            case 9: resultado = presion * 2048.16; break;        // kgf/cm^2 a psf
            case 10: resultado = presion * 0.0142233; break;    // kgf/cm^2 a ksi
            case 11: resultado = presion; break;                // kgf/cm^2 a kgf/cm^2
            case 12: resultado = presion * 100000; break;       // kgf/cm^2 a kgf/m^2
            case 13: resultado = presion * 735.56; break;       // kgf/cm^2 a mmHg
            case 14: resultado = presion * 73.556; break;       // kgf/cm^2 a cmHg
            case 15: resultado = presion * 28.959; break;       // kgf/cm^2 a inchHg
            case 16: resultado = presion * 10000; break;        // kgf/cm^2 a mmH2O
            case 17: resultado = presion * 1000000; break;      // kgf/cm^2 a cmH2O
            case 18: resultado = presion * 3937.0; break;       // kgf/cm^2 a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 12: // Kilogramo-fuerza por metro cuadrado (kgf/m^2)
        switch (unidadDestino) {
            case 1: resultado = presion * 9.67841e-6; break;   // kgf/m^2 a atm
            case 2: resultado = presion * 9.80665; break;      // kgf/m^2 a Pa
            case 3: resultado = presion * 0.00980665; break;  // kgf/m^2 a hPa
            case 4: resultado = presion * 0.000980665; break; // kgf/m^2 a kPa
            case 5: resultado = presion * 9.80665e-7; break;  // kgf/m^2 a MPa
            case 6: resultado = presion * 9.80665e-6; break;  // kgf/m^2 a bar
            case 7: resultado = presion * 0.00980665; break;  // kgf/m^2 a mbar
            case 8: resultado = presion * 1.42233e-4; break; // kgf/m^2 a psi
            case 9: resultado = presion * 0.0204816; break;   // kgf/m^2 a psf
            case 10: resultado = presion * 1.42233e-7; break;// kgf/m^2 a ksi
            case 11: resultado = presion * 1e-5; break;      // kgf/m^2 a kgf/cm^2
            case 12: resultado = presion; break;             // kgf/m^2 a kgf/m^2
            case 13: resultado = presion * 0.0073556; break; // kgf/m^2 a mmHg
            case 14: resultado = presion * 0.00073556; break;// kgf/m^2 a cmHg
            case 15: resultado = presion * 0.00028959; break;// kgf/m^2 a inchHg
            case 16: resultado = presion * 10; break;        // kgf/m^2 a mmH2O
            case 17: resultado = presion * 1000; break;      // kgf/m^2 a cmH2O
            case 18: resultado = presion * 0.393701; break; // kgf/m^2 a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 13: // Milímetro de mercurio (mmHg)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.00131579; break;  // mmHg a atm
            case 2: resultado = presion * 133.322; break;     // mmHg a Pa
            case 3: resultado = presion * 1.33322; break;     // mmHg a hPa
            case 4: resultado = presion * 0.133322; break;    // mmHg a kPa
            case 5: resultado = presion * 1.33322e-4; break;  // mmHg a MPa
            case 6: resultado = presion * 0.00133322; break;  // mmHg a bar
            case 7: resultado = presion * 1.33322; break;     // mmHg a mbar
            case 8: resultado = presion * 0.0193368; break;   // mmHg a psi
            case 9: resultado = presion * 2.78451; break;     // mmHg a psf
            case 10: resultado = presion * 1.93368e-5; break;// mmHg a ksi
            case 11: resultado = presion * 0.00135951; break; // mmHg a kgf/cm^2
            case 12: resultado = presion * 1339.7; break;     // mmHg a kgf/m^2
            case 13: resultado = presion; break;              // mmHg a mmHg
            case 14: resultado = presion * 0.1; break;        // mmHg a cmHg
            case 15: resultado = presion * 0.0393701; break;  // mmHg a inchHg
            case 16: resultado = presion * 13.5951; break;    // mmHg a mmH2O
            case 17: resultado = presion * 1333.22; break;    // mmHg a cmH2O
            case 18: resultado = presion * 0.527431; break;   // mmHg a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 14: // Centímetro de mercurio (cmHg)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.0131579; break;   // cmHg a atm
            case 2: resultado = presion * 1333.22; break;     // cmHg a Pa
            case 3: resultado = presion * 13.3322; break;     // cmHg a hPa
            case 4: resultado = presion * 1.33322; break;     // cmHg a kPa
            case 5: resultado = presion * 0.00133322; break; // cmHg a MPa
            case 6: resultado = presion * 0.0133322; break;  // cmHg a bar
            case 7: resultado = presion * 13.3322; break;     // cmHg a mbar
            case 8: resultado = presion * 0.193368; break;   // cmHg a psi
            case 9: resultado = presion * 27.8451; break;    // cmHg a psf
            case 10: resultado = presion * 0.000193368; break;// cmHg a ksi
            case 11: resultado = presion * 0.0135951; break;  // cmHg a kgf/cm^2
            case 12: resultado = presion * 1339.7; break;     // cmHg a kgf/m^2
            case 13: resultado = presion * 10; break;         // cmHg a mmHg
            case 14: resultado = presion; break;              // cmHg a cmHg
            case 15: resultado = presion * 0.393701; break;  // cmHg a inchHg
            case 16: resultado = presion * 135.951; break;   // cmHg a mmH2O
            case 17: resultado = presion * 13332.2; break;   // cmHg a cmH2O
            case 18: resultado = presion * 52.7431; break;   // cmHg a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 15: // Pulgada de mercurio (inchHg)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.0334211; break;   // inchHg a atm
            case 2: resultado = presion * 3386.39; break;     // inchHg a Pa
            case 3: resultado = presion * 33.8639; break;     // inchHg a hPa
            case 4: resultado = presion * 3.38639; break;     // inchHg a kPa
            case 5: resultado = presion * 0.00338639; break; // inchHg a MPa
            case 6: resultado = presion * 0.0338639; break;  // inchHg a bar
            case 7: resultado = presion * 33.8639; break;     // inchHg a mbar
            case 8: resultado = presion * 0.491154; break;   // inchHg a psi
            case 9: resultado = presion * 70.7265; break;    // inchHg a psf
            case 10: resultado = presion * 0.000491154; break;// inchHg a ksi
            case 11: resultado = presion * 0.0345316; break;  // inchHg a kgf/cm^2
            case 12: resultado = presion * 3386.39; break;    // inchHg a kgf/m^2
            case 13: resultado = presion * 25.4; break;      // inchHg a mmHg
            case 14: resultado = presion * 2.54; break;      // inchHg a cmHg
            case 15: resultado = presion; break;             // inchHg a inchHg
            case 16: resultado = presion * 345.316; break;   // inchHg a mmH2O
            case 17: resultado = presion * 33863.9; break;   // inchHg a cmH2O
            case 18: resultado = presion * 1336.81; break;   // inchHg a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 16: // Milímetro de agua (mmH2O)
        switch (unidadDestino) {
            case 1: resultado = presion * 7.50062e-4; break; // mmH2O a atm
            case 2: resultado = presion * 9.80665; break;    // mmH2O a Pa
            case 3: resultado = presion * 0.00980665; break; // mmH2O a hPa
            case 4: resultado = presion * 0.000980665; break;// mmH2O a kPa
            case 5: resultado = presion * 9.80665e-7; break; // mmH2O a MPa
            case 6: resultado = presion * 9.80665e-6; break; // mmH2O a bar
            case 7: resultado = presion * 0.00980665; break; // mmH2O a mbar
            case 8: resultado = presion * 0.000142233; break;// mmH2O a psi
            case 9: resultado = presion * 20.4516; break;    // mmH2O a psf
            case 10: resultado = presion * 1.42233e-7; break;// mmH2O a ksi
            case 11: resultado = presion * 0.00101972; break;// mmH2O a kgf/cm^2
            case 12: resultado = presion * 10000; break;     // mmH2O a kgf/m^2
            case 13: resultado = presion * 0.735561; break;  // mmH2O a mmHg
            case 14: resultado = presion * 0.0735561; break; // mmH2O a cmHg
            case 15: resultado = presion * 0.028959; break;  // mmH2O a inchHg
            case 16: resultado = presion; break;             // mmH2O a mmH2O
            case 17: resultado = presion * 100; break;       // mmH2O a cmH2O
            case 18: resultado = presion * 0.393701; break; // mmH2O a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 17: // Centímetro de agua (cmH2O)
        switch (unidadDestino) {
            case 1: resultado = presion * 7.50062e-3; break; // cmH2O a atm
            case 2: resultado = presion * 980.665; break;    // cmH2O a Pa
            case 3: resultado = presion * 0.980665; break;   // cmH2O a hPa
            case 4: resultado = presion * 0.0980665; break;  // cmH2O a kPa
            case 5: resultado = presion * 9.80665e-5; break; // cmH2O a MPa
            case 6: resultado = presion * 9.80665e-4; break; // cmH2O a bar
            case 7: resultado = presion * 0.980665; break;   // cmH2O a mbar
            case 8: resultado = presion * 0.0142233; break;  // cmH2O a psi
            case 9: resultado = presion * 204.816; break;    // cmH2O a psf
            case 10: resultado = presion * 1.42233e-6; break;// cmH2O a ksi
            case 11: resultado = presion * 0.00101972; break;// cmH2O a kgf/cm^2
            case 12: resultado = presion * 1000; break;      // cmH2O a kgf/m^2
            case 13: resultado = presion * 735.561; break;   // cmH2O a mmHg
            case 14: resultado = presion * 73.5561; break;   // cmH2O a cmHg
            case 15: resultado = presion * 28.959; break;    // cmH2O a inchHg
            case 16: resultado = presion * 10; break;        // cmH2O a mmH2O
            case 17: resultado = presion; break;             // cmH2O a cmH2O
            case 18: resultado = presion * 0.393701; break; // cmH2O a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 18: // Pulgada de agua (inchH2O)
        switch (unidadDestino) {
            case 1: resultado = presion * 0.00245849; break; // inchH2O a atm
            case 2: resultado = presion * 249.088; break;    // inchH2O a Pa
            case 3: resultado = presion * 2.49088; break;   // inchH2O a hPa
            case 4: resultado = presion * 0.249088; break;  // inchH2O a kPa
            case 5: resultado = presion * 0.000249088; break;// inchH2O a MPa
            case 6: resultado = presion * 0.00249088; break; // inchH2O a bar
            case 7: resultado = presion * 2.49088; break;    // inchH2O a mbar
            case 8: resultado = presion * 0.0361273; break;  // inchH2O a psi
            case 9: resultado = presion * 5.20254; break;    // inchH2O a psf
            case 10: resultado = presion * 3.61273e-5; break;// inchH2O a ksi
            case 11: resultado = presion * 0.00259021; break;// inchH2O a kgf/cm^2
            case 12: resultado = presion * 2490.88; break;   // inchH2O a kgf/m^2
            case 13: resultado = presion * 1.86832; break;   // inchH2O a mmHg
            case 14: resultado = presion * 0.186832; break;  // inchH2O a cmHg
            case 15: resultado = presion * 0.0735559; break; // inchH2O a inchHg
            case 16: resultado = presion * 25.4; break;      // inchH2O a mmH2O
            case 17: resultado = presion * 2540; break;      // inchH2O a cmH2O
            case 18: resultado = presion; break;             // inchH2O a inchH2O
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("El resultado es: " + resultado + " " + unidades[unidadDestino - 1]);
}
public static void convertirFuerza() {
Scanner scanner = new Scanner(System.in);
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

System.out.println("Bienvenido al conversor de fuerza.");
System.out.println("Por favor, seleccione la unidad de fuerza de origen:");
System.out.println("1. Dina (dyn)");
System.out.println("2. Newton (N)");
System.out.println("3. Decanewton (daN)");
System.out.println("4. Kiloneuton (kN)");
System.out.println("5. Kilogramo-fuerza (kgf)");
System.out.println("6. Libra-fuerza (lbf)");
System.out.println("7. Kip");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de fuerza de destino:");
int unidadDestino = scanner.nextInt();

System.out.println("Ingrese la fuerza:");
double fuerza = scanner.nextDouble();


String[] unidades = {"dyn", "N", "daN", "kN", "kgf", "lbf", "kip"};


switch (unidadOrigen) {
    case 1: // Dina
        switch (unidadDestino) {
            case 1: resultado = fuerza; break;
            case 2: resultado = fuerza * 0.00001; break;
            case 3: resultado = fuerza * 1e-6; break;
            case 4: resultado = fuerza * 1e-7; break;
            case 5: resultado = fuerza * 1.01972e-6; break;
            case 6: resultado = fuerza * 2.24809e-7; break;
            case 7: resultado = fuerza * 2.24809e-10; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 2: // Newton
        switch (unidadDestino) {
            case 1: resultado = fuerza * 100000; break;
            case 2: resultado = fuerza; break;
            case 3: resultado = fuerza * 0.1; break;
            case 4: resultado = fuerza * 0.001; break;
            case 5: resultado = fuerza * 0.101972; break;
            case 6: resultado = fuerza * 0.224809; break;
            case 7: resultado = fuerza * 0.000224809; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 3: // Decanewton
        switch (unidadDestino) {
            case 1: resultado = fuerza * 1000000; break;
            case 2: resultado = fuerza * 10; break;
            case 3: resultado = fuerza; break;
            case 4: resultado = fuerza * 0.01; break;
            case 5: resultado = fuerza * 1.01972; break;
            case 6: resultado = fuerza * 2.24809; break;
            case 7: resultado = fuerza * 0.00224809; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 4: // Kiloneuton
        switch (unidadDestino) {
            case 1: resultado = fuerza * 10000000; break;
            case 2: resultado = fuerza * 1000; break;
            case 3: resultado = fuerza * 100; break;
            case 4: resultado = fuerza; break;
            case 5: resultado = fuerza * 1019.72; break;
            case 6: resultado = fuerza * 224.809; break;
            case 7: resultado = fuerza * 0.224809; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 5: // Kilogramo-fuerza
        switch (unidadDestino) {
            case 1: resultado = fuerza * 980665; break;
            case 2: resultado = fuerza * 9.80665; break;
            case 3: resultado = fuerza * 0.980665; break;
            case 4: resultado = fuerza * 0.00980665; break;
            case 5: resultado = fuerza; break;
            case 6: resultado = fuerza * 2.20462; break;
            case 7: resultado = fuerza * 0.00220462; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 6: // Libra-fuerza
        switch (unidadDestino) {
            case 1: resultado = fuerza * 444822; break;
            case 2: resultado = fuerza * 4.44822; break;
            case 3: resultado = fuerza * 0.444822; break;
            case 4: resultado = fuerza * 0.00444822; break;
            case 5: resultado = fuerza * 0.453592; break;
            case 6: resultado = fuerza; break;
            case 7: resultado = fuerza * 0.001; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 7: // Kip
        switch (unidadDestino) {
            case 1: resultado = fuerza * 444822000; break;
            case 2: resultado = fuerza * 4448.22; break;
            case 3: resultado = fuerza * 444.822; break;
            case 4: resultado = fuerza * 4.44822; break;
            case 5: resultado = fuerza * 453.592; break;
            case 6: resultado = fuerza * 1000; break;
            case 7: resultado = fuerza; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("El resultado es: " + resultado + " " + unidades[unidadDestino - 1]);

scanner.close();
}
public static void convertirTrabajo() {
Scanner scanner = new Scanner(System.in);
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

System.out.println("Bienvenido al conversor de trabajo.");
System.out.println("Por favor, seleccione la unidad de trabajo de origen:");
System.out.println("1. Julios (J)");
System.out.println("2. Kilojulios (kJ)");
System.out.println("3. Calorías (cal)");
System.out.println("4. Kilocalorías (kcal)");
System.out.println("5. Kilovatio-hora (kW*h)");
System.out.println("6. Kilogramo-fuerza metros (kgf*m)");
System.out.println("7. Pulgada libra-fuerza (in*lbf)");
System.out.println("8. British Thermal Unit (BTU)");
System.out.println("9. Tonelada equivalente de petróleo (toe)");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de trabajo de destino:");
int unidadDestino = scanner.nextInt();

System.out.println("Ingrese el trabajo:");
double trabajo = scanner.nextDouble();

String[] unidades = {"J", "kJ", "cal", "kcal", "kW*h", "kgf*m", "in*lbf", "BTU", "toe"};

switch (unidadOrigen) {
    case 1: // Julios (J)
        switch (unidadDestino) {
            case 1: resultado = trabajo; break;
            case 2: resultado = trabajo * 0.001; break;
            case 3: resultado = trabajo * 0.239006; break;
            case 4: resultado = trabajo * 0.000239006; break;
            case 5: resultado = trabajo * 2.77778e-7; break;
            case 6: resultado = trabajo * 0.101972; break;
            case 7: resultado = trabajo * 0.000737562; break;
            case 8: resultado = trabajo * 0.000947817; break;
            case 9: resultado = trabajo * 2.39006e-11; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 2: // Kilojulios (kJ)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 1000; break;
            case 2: resultado = trabajo; break;
            case 3: resultado = trabajo * 239.006; break;
            case 4: resultado = trabajo * 0.239006; break;
            case 5: resultado = trabajo * 0.000277778; break;
            case 6: resultado = trabajo * 101.972; break;
            case 7: resultado = trabajo * 737.562; break;
            case 8: resultado = trabajo * 0.947817; break;
            case 9: resultado = trabajo * 2.39006e-8; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 3: // Calorías (cal)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 4.184; break;
            case 2: resultado = trabajo * 0.004184; break;
            case 3: resultado = trabajo; break;
            case 4: resultado = trabajo * 0.001; break;
            case 5: resultado = trabajo * 1.16222e-6; break;
            case 6: resultado = trabajo * 0.426905; break;
            case 7: resultado = trabajo * 3.08802; break;
            case 8: resultado = trabajo * 0.00396567; break;
            case 9: resultado = trabajo * 1e-8; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 4: // Kilocalorías (kcal)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 4184; break;
            case 2: resultado = trabajo * 4.184; break;
            case 3: resultado = trabajo * 1000; break;
            case 4: resultado = trabajo; break;
            case 5: resultado = trabajo * 0.00116222; break;
            case 6: resultado = trabajo * 426.905; break;
            case 7: resultado = trabajo * 3088.02; break;
            case 8: resultado = trabajo * 3.96567; break;
            case 9: resultado = trabajo * 1e-5; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 5: // Kilovatio-hora (kW*h)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 3.6e6; break;
            case 2: resultado = trabajo * 3600; break;
            case 3: resultado = trabajo * 860421; break;
            case 4: resultado = trabajo * 860.421; break;
            case 5: resultado = trabajo; break;
            case 6: resultado = trabajo * 367097; break;
            case 7: resultado = trabajo * 2655220; break;
            case 8: resultado = trabajo * 3412.14; break;
            case 9: resultado = trabajo * 0.0860421; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 6: // Kilogramo-fuerza metros (kgf*m)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 9.80665; break;
            case 2: resultado = trabajo * 0.00980665; break;
            case 3: resultado = trabajo * 2.34214; break;
            case 4: resultado = trabajo * 0.00234214; break;
            case 5: resultado = trabajo * 2.72414e-6; break;
            case 6: resultado = trabajo; break;
            case 7: resultado = trabajo * 7.23301; break;
            case 8: resultado = trabajo * 0.00929208; break;
            case 9: resultado = trabajo * 2.34214e-7; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 7: // Pulgada libra-fuerza (in*lbf)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 135.582; break;
            case 2: resultado = trabajo * 0.135582; break;
            case 3: resultado = trabajo * 32.8084; break;
            case 4: resultado = trabajo * 0.0328084; break;
            case 5: resultado = trabajo * 3.8251e-5; break;
            case 6: resultado = trabajo * 0.138255; break;
            case 7: resultado = trabajo; break;
            case 8: resultado = trabajo * 0.00128507; break;
            case 9: resultado = trabajo * 3.28084e-8; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 8: // British Thermal Unit (BTU)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 1055.06; break;
            case 2: resultado = trabajo * 1.05506; break;
            case 3: resultado = trabajo * 252.164; break;
            case 4: resultado = trabajo * 0.252164; break;
            case 5: resultado = trabajo * 0.000293071; break;
            case 6: resultado = trabajo * 107.585; break;
            case 7: resultado = trabajo * 778.169; break;
            case 8: resultado = trabajo; break;
            case 9: resultado = trabajo * 2.52164e-5; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 9: // Tonelada equivalente de petróleo (toe)
        switch (unidadDestino) {
            case 1: resultado = trabajo * 4.184e10; break;
            case 2: resultado = trabajo * 4.184e7; break;
            case 3: resultado = trabajo * 1e7; break;
            case 4: resultado = trabajo * 1e4; break;
            case 5: resultado = trabajo * 11622.2; break;
            case 6: resultado = trabajo * 4.26905e6; break;
            case 7: resultado = trabajo * 3.08802e7; break;
            case 8: resultado = trabajo * 3.96567e4; break;
            case 9: resultado = trabajo; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("El resultado es: " + resultado + " " + unidades[unidadDestino - 1]);

scanner.close();
}
public static void convertirPotencia() {
Scanner scanner = new Scanner(System.in);
double resultado = 0;
String tipoConversion = " "; // Variable para almacenar el tipo de conversión

System.out.println("Bienvenido al conversor de potencia.");
System.out.println("Por favor, seleccione la unidad de potencia de origen:");
System.out.println("1. Vatio (W)");
System.out.println("2. Kilovatio (kW)");
System.out.println("3. Megavatio (MW)");
System.out.println("4. Kilocalorías por segundo (kcal/s)");
System.out.println("5. Kilocalorías por hora (kcal/h)");
System.out.println("6. Caballo de fuerza (HP)");
System.out.println("7. Pferdestärke (PS)");
System.out.println("8. British Thermal Unit por hora (BTU/h)");
System.out.println("9. Tonelada de refrigeración (TR)");
System.out.println("10. Boiler Horsepower (BHP)");
System.out.println("11. Decibelio-milivatio (dBm)");

int unidadOrigen = scanner.nextInt();

System.out.println("Seleccione la unidad de potencia de destino:");
int unidadDestino = scanner.nextInt();

System.out.println("Ingrese la potencia:");
double potencia = scanner.nextDouble();

String[] unidades = {"W", "kW", "MW", "kcal/s", "kcal/h", "HP", "PS", "BTU/h", "TR", "BHP", "dBm"};

switch (unidadOrigen) {
    case 1: // Vatio (W)
        switch (unidadDestino) {
            case 1: resultado = potencia; break;
            case 2: resultado = potencia * 0.001; break;
            case 3: resultado = potencia * 1e-6; break;
            case 4: resultado = potencia * 0.238845; break;
            case 5: resultado = potencia * 859.845; break;
            case 6: resultado = potencia * 0.00134102; break;
            case 7: resultado = potencia * 0.00135962; break;
            case 8: resultado = potencia * 3.41214; break;
            case 9: resultado = potencia * 0.000284345; break;
            case 10: resultado = potencia * 0.00134102; break;
            case 11: resultado = 10 * Math.log10(potencia / 0.001); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 2: // Kilovatio (kW)
        switch (unidadDestino) {
            case 1: resultado = potencia * 1000; break;
            case 2: resultado = potencia; break;
            case 3: resultado = potencia * 0.001; break;
            case 4: resultado = potencia * 238.845; break;
            case 5: resultado = potencia * 859845; break;
            case 6: resultado = potencia * 1.34102; break;
            case 7: resultado = potencia * 1.35962; break;
            case 8: resultado = potencia * 3412.14; break;
            case 9: resultado = potencia * 0.284345; break;
            case 10: resultado = potencia * 1.34102; break;
            case 11: resultado = Math.pow(10, (potencia / 10) + 3); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 3: // Megavatio (MW)
        switch (unidadDestino) {
            case 1: resultado = potencia * 1e6; break;
            case 2: resultado = potencia * 1000; break;
            case 3: resultado = potencia; break;
            case 4: resultado = potencia * 238845; break;
            case 5: resultado = potencia * 859845000; break;
            case 6: resultado = potencia * 1341.02; break;
            case 7: resultado = potencia * 1359.62; break;
            case 8: resultado = potencia * 3412140; break;
            case 9: resultado = potencia * 284.345; break;
            case 10: resultado = potencia * 1341020; break;
            case 11: resultado = Math.pow(10, (potencia / 10) + 6); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 4: // Kilocalorías por segundo (kcal/s)
        switch (unidadDestino) {
            case 1: resultado = potencia * 4186.8; break;
            case 2: resultado = potencia * 4.1868; break;
            case 3: resultado = potencia * 4.1868e-6; break;
            case 4: resultado = potencia; break;
            case 5: resultado = potencia * 3600; break;
            case 6: resultado = potencia * 0.00155961; break;
            case 7: resultado = potencia * 0.00157828; break;
            case 8: resultado = potencia * 3.96832; break;
            case 9: resultado = potencia * 0.000330693; break;
            case 10: resultado = potencia * 0.00155961; break;
            case 11: resultado = 10 * Math.log10(potencia * 1000 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 5: // Kilocalorías por hora (kcal/h)
        switch (unidadDestino) {
            case 1: resultado = potencia * 0.00116222; break;
            case 2: resultado = potencia * 1.16222e-6; break;
            case 3: resultado = potencia * 1.16222e-9; break;
            case 4: resultado = potencia * 2.77778e-4; break;
            case 5: resultado = potencia; break;
            case 6: resultado = potencia * 3.96832e-7; break;
            case 7: resultado = potencia * 4.01463e-7; break;
            case 8: resultado = potencia * 1.00068e-6; break;
            case 9: resultado = potencia * 8.36825e-8; break;
            case 10: resultado = potencia * 3.96832e-7; break;
            case 11: resultado = 10 * Math.log10(potencia * 3600 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 6: // Caballo de vapor (HP)
        switch (unidadDestino) {
            case 1: resultado = potencia * 745.7; break;
            case 2: resultado = potencia * 0.7457; break;
            case 3: resultado = potencia * 7.457e-4; break;
            case 4: resultado = potencia * 178.107; break;
            case 5: resultado = potencia * 641136; break;
            case 6: resultado = potencia; break;
            case 7: resultado = potencia * 1.01387; break;
            case 8: resultado = potencia * 2544.43; break;
            case 9: resultado = potencia * 0.212005; break;
            case 10: resultado = potencia; break;
            case 11: resultado = 10 * Math.log10(potencia * 745.7 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 7: // Pferdestärke (PS)
        switch (unidadDestino) {
            case 1: resultado = potencia * 735.499; break;
            case 2: resultado = potencia * 0.735499; break;
            case 3: resultado = potencia * 7.35499e-4; break;
            case 4: resultado = potencia * 175.784; break;
            case 5: resultado = potencia * 632412; break;
            case 6: resultado = potencia * 0.98632; break;
            case 7: resultado = potencia; break;
            case 8: resultado = potencia * 2495.88; break;
            case 9: resultado = potencia * 0.208845; break;
            case 10: resultado = potencia * 0.98632; break;
            case 11: resultado = 10 * Math.log10(potencia * 735.499 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 8: // British Thermal Unit por hora (BTU/h)
        switch (unidadDestino) {
            case 1: resultado = potencia * 0.293071; break;
            case 2: resultado = potencia * 2.93071e-4; break;
            case 3: resultado = potencia * 2.93071e-7; break;
            case 4: resultado = potencia * 0.0698874; break;
            case 5: resultado = potencia * 251.996; break;
            case 6: resultado = potencia * 0.000393014; break;
            case 7: resultado = potencia * 0.000398491; break;
            case 8: resultado = potencia; break;
            case 9: resultado = potencia * 8.33333e-5; break;
            case 10: resultado = potencia * 0.000393014; break;
            case 11: resultado = 10 * Math.log10(potencia * 2544.43 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 9: // Tonelada de refrigeración (TR)
        switch (unidadDestino) {
            case 1: resultado = potencia * 3516.85; break;
            case 2: resultado = potencia * 3.51685; break;
            case 3: resultado = potencia * 0.00351685; break;
            case 4: resultado = potencia * 843868; break;
            case 5: resultado = potencia * 304431000; break;
            case 6: resultado = potencia * 0.476179; break;
            case 7: resultado = potencia * 0.481476; break;
            case 8: resultado = potencia * 12000; break;
            case 9: resultado = potencia; break;
            case 10: resultado = potencia * 0.476179; break;
            case 11: resultado = 10 * Math.log10(potencia * 212005 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 10: // Boiler Horsepower (BHP)
        switch (unidadDestino) {
            case 1: resultado = potencia * 745.7; break;
            case 2: resultado = potencia * 0.7457; break;
            case 3: resultado = potencia * 7.457e-4; break;
            case 4: resultado = potencia * 178.107; break;
            case 5: resultado = potencia * 641136; break;
            case 6: resultado = potencia; break;
            case 7: resultado = potencia * 1.01387; break;
            case 8: resultado = potencia * 2544.43; break;
            case 9: resultado = potencia * 0.212005; break;
            case 10: resultado = potencia; break;
            case 11: resultado = 10 * Math.log10(potencia * 745.7 / 0.001163); break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    case 11: // Decibelio-milivatio (dBm)
        switch (unidadDestino) {
            case 1: resultado = Math.pow(10, (potencia / 10)) / 1000; break;
            case 2: resultado = Math.pow(10, (potencia / 10) - 3); break;
            case 3: resultado = Math.pow(10, (potencia / 10) - 6); break;
            case 4: resultado = 10 * Math.log10(potencia * 0.001 / 1000); break;
            case 5: resultado = 10 * Math.log10(potencia * 0.001 * 3600 / 1000); break;
            case 6: resultado = 10 * Math.log10(potencia * 0.001 * 745.7 / 1000); break;
            case 7: resultado = 10 * Math.log10(potencia * 0.001 * 735.499 / 1000); break;
            case 8: resultado = 10 * Math.log10(potencia * 0.001 * 2544.43 / 1000); break;
            case 9: resultado = 10 * Math.log10(potencia * 0.001 * 212005 / 1000); break;
            case 10: resultado = 10 * Math.log10(potencia * 0.001 * 745.7 / 1000); break;
            case 11: resultado = potencia; break;
            default: System.out.println("Unidad de destino no válida."); return;
        }
        break;
    default:
        System.out.println("Unidad de origen no válida.");
        return;
}

System.out.println("El resultado es: " + resultado + " " + unidades[unidadDestino - 1]);

scanner.close();
}
}







