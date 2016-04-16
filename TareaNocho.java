<<<<<<< HEAD
package tareanocho;

public class TareaNocho {
    public static void main(String[] args) {
        magia();
    }
    public static void magia(){
        int respuesta = 0;
        do{
            mensaje();
            switch (respuesta = leerRespuesta()){
                case 1:
                    imprimir(multiplo(leerDos()));
                    break;
                case 2:
                    imprimir(primos(leerUno()));
                    break;
                case 3:
                    imprimir(arreglo(leerUno()));
                    break;
                case 4:
                    System.out.println("Hasta pronto! :)");
                    System.out.println("~ gg izi tarea ~");
                    break;
                default:
                    System.out.println("Ingrese opción válida");
                    break;
            }
        }while(respuesta != 4);
    }
    public static void mensaje(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BIENVENIDO! :)");
        System.out.println("\nSeleccione la operación que desea realizar");
        System.out.println("\n1) Ingresar dos números y evaluar si el primero es múltiplo del segundo.\n2) Ingresar un número y conocer todos los números primos menores o iguales.\n3) Crear un arreglo que se llene aleatoriamente con números entre 0 y 150, buscando el mayor y su posición.\n4) Salir.");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    public static int leerRespuesta(){
        Scanner read = new Scanner(System.in);
        int answer=0, e;
        do{
            e=0;
            try{
                do{ 
                    System.out.println("Ingrese su opción");
                    answer=read.nextInt();
                }while(answer<1 && answer>4);    
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return answer;
    }
    public static int leerUno(){
        Scanner read = new Scanner(System.in);
        int numero = 0;
        int e;
        do{
            e=0;
            try{
                do{
                    System.out.println("Ingrese número entero");
                    numero=read.nextInt();
                }while(numero<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return numero;
    }
    public static float[] leerDos(){
        Scanner read = new Scanner(System.in);
        float numeros[] = new float[2];
        int e;
        do{
            e=0;
            try{
                do{
                System.out.println("Ingrese primer número");
                numeros[0]=read.nextFloat();
                }while(numeros[0]<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        do{
            e=0;
            try{
                do{
                    System.out.println("Ingrese segundo número");
                    numeros[1]=read.nextFloat();
                }while(numeros[1]<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return numeros; 
    }
    public static String multiplo(float[] numeros){
        String respuesta = "";
        if(numeros[0]%numeros[1] == 0){
            respuesta = "El número "+numeros[0]+" es múltiplo del número "+numeros[1]+".";
        }else{
            respuesta = "El número "+numeros[0]+" no es múltiplo del número "+numeros[1]+".";
        }
        return respuesta;
    }
    public static String primos(int numero){
        boolean prim = true;
        String respuesta = "";
        String primos = "- ";
        int C, div=2;
        for(C=numero;C>1;C--){
            div=2;
            prim = true;
            while((prim)&&(div!=C)){
                if(C%div==0){
                    prim=false;
                }else{
                    div++;
                }  
            }
            if(prim == true){
                primos += C+" - "; 
            }
        }
        respuesta = "Los números primos menores o iguales a "+numero+" son: "+primos;
        return respuesta;
    }
    public static String arreglo(int dimension){
        int[] arreglo = new int[dimension];
        int i=0;
        Random rand = new Random();
        String respuesta = "";
        for(int C=0;C<dimension;C++){
            arreglo[C]=rand.nextInt(151);
        }
        int mayor = arreglo[0], place = 0;
        for(int C=0;C<dimension;C++){
            if (mayor<arreglo[C]){
                mayor = arreglo[C];
                place = C;
            }
        }
        System.out.print("El resultado del arreglo es: ");
        for(int C=0;C<dimension;C++){
            System.out.print(arreglo[C]+" - ");
        }
        System.out.println("");
        respuesta = "El número mayor almacenado en el arreglo de dimensión "+dimension+", es el número "+mayor+" y está en la posición número "+(place+1)+".";
        return respuesta;
    }
    public static void imprimir(String respuesta){
        System.out.println(respuesta+"\n");
    }
=======
package tareanocho;
import java.util.*;
public class TareaNocho {
    public static void main(String[] args) {
        int respuesta = 0;
        do{
            mensaje();
            switch (respuesta = leerRespuesta()){
                case 1:
                    imprimir(multiplo(leerDos()));
                    break;
                case 2:
                    imprimir(primos(leerUno()));
                    break;
                case 3:
                    imprimir(arreglo(leerUno()));
                    break;
                case 4:
                    System.out.println("Hasta pronto! :)");
                    System.out.println("~ gg izi tarea ~");
                    break;
                default:
                    System.out.println("Ingrese opción válida");
                    break;
            }
        }while(respuesta != 4);
    }
    public static void mensaje(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BIENVENIDO! :)");
        System.out.println("\nSeleccione la operación que desea realizar");
        System.out.println("\n1) Ingresar dos números y evaluar si el primero es múltiplo del segundo.\n2) Ingresar un número y conocer todos los números primos menores o iguales.\n3) Crear un arreglo que se llene aleatoriamente con números entre 0 y 150, buscando el mayor y su posición.\n4) Salir.");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    public static int leerRespuesta(){
        Scanner read = new Scanner(System.in);
        int answer=0, e;
        do{
            e=0;
            try{
                do{ 
                    System.out.println("Ingrese su opción");
                    answer=read.nextInt();
                }while(answer<1 && answer>4);    
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return answer;
    }
    public static int leerUno(){
        Scanner read = new Scanner(System.in);
        int numero = 0;
        int e;
        do{
            e=0;
            try{
                do{
                    System.out.println("Ingrese número entero");
                    numero=read.nextInt();
                }while(numero<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return numero;
    }
    public static float[] leerDos(){
        Scanner read = new Scanner(System.in);
        float numeros[] = new float[2];
        int e;
        do{
            e=0;
            try{
                do{
                System.out.println("Ingrese primer número");
                numeros[0]=read.nextFloat();
                }while(numeros[0]<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        do{
            e=0;
            try{
                do{
                    System.out.println("Ingrese segundo número");
                    numeros[1]=read.nextFloat();
                }while(numeros[1]<1);
            }catch(InputMismatchException x){
                e=1;
                System.err.println("ERROR! - ingrese dato válido");
                read.next();
            }
        }while(e==1);
        return numeros; 
    }
    public static String multiplo(float[] numeros){
        String respuesta = "";
        if(numeros[0]%numeros[1] == 0){
            respuesta = "El número "+numeros[0]+" es múltiplo del número "+numeros[1]+".";
        }else{
            respuesta = "El número "+numeros[0]+" no es múltiplo del número "+numeros[1]+".";
        }
        return respuesta;
    }
    public static String primos(int numero){
        boolean prim = true;
        String respuesta = "";
        String primos = "- ";
        int C, div=2;
        for(C=numero;C>1;C--){
            div=2;
            prim = true;
            while((prim)&&(div!=C)){
                if(C%div==0){
                    prim=false;
                }else{
                    div++;
                }  
            }
            if(prim = true){
                primos += C+" - "; 
            }
        }
        respuesta = "Los números primos menores o iguales a "+numero+" son: "+primos;
        return respuesta;
    }
    public static String arreglo(int dimension){
        int[] arreglo = new int[dimension];
        int i=0;
        Random rand = new Random();
        String respuesta = "";
        for(int C=0;C<dimension;C++){
            arreglo[C]=rand.nextInt(151);
        }
        int mayor = arreglo[0], place = 0;
        for(int C=0;C<dimension;C++){
            if (mayor<arreglo[C]){
                mayor = arreglo[C];
                place = C;
            }
        }
        System.out.print("El resultado del arreglo es: ");
        for(int C=0;C<dimension;C++){
            System.out.print(arreglo[C]+" - ");
        }
        System.out.println("");
        respuesta = "El número mayor almacenado en el arreglo de dimensión "+dimension+", es el número "+mayor+" y está en la posición número "+(place+1)+".";
        return respuesta;
    }
    public static void imprimir(String respuesta){
        System.out.println(respuesta+"\n");
        //holaaaaaaa1
    }
>>>>>>> origin/master
}
