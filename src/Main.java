import java.util.Scanner;

public class Main{

    public static void main(String[] args){
//RETO 1
        String nombre="Lola";
        int edad=36;
        double peso=50.8;
        float altura=1.75f;

        System.out.println("El nommbre del usuario es " + nombre + ", su edad es " + edad + " años, su peso es " + peso + "kg. y su altura es " + altura + " metros.");

//RETO 2
        long newpeso=(long)peso;
        long newaltura= (int)(altura*100);

        System.out.println("El usuario se llama " + nombre + " tiene " + edad + " años, su peso es " + newpeso + " kg. y su altura es de " + newaltura + " centímetros.");

//RETO 3
        String stringToint="100";
        int convertido=Integer.parseInt(stringToint);

        System.out.println("Cadena real:" + stringToint);
        System.out.println("Convertido a Int:" + convertido);

        int intTostring=200;
        String convertido1=String.valueOf(intTostring);

        System.out.println("Cadena real:" + intTostring);
        System.out.println("Convertido a String:" + convertido1);

//RETO 4
        //Definimos la frase en entrada
        //String frase="";
        //Scanner in= new Scanner(System.in);

        //Preguntamos sobre la frase
       // System.out.println("Introduce una frase");
       // frase=in.nextLine();

        //Eliminar espacios
        //frase=in.next.trim();

       // System.out.println(frase.replace(oldChar='a', newChar='@'));

//RETO 5
        //Definimos variables
       // int numUsuario=0;
       // int numRandom=0;
      //  Scanner in=new Scanner(Sytem.in);

        //Generamos el aleatorio
       // Random r= new Random();
      //  numRandom=r.nextInt(11);

        //Preguntamos por un número al usuario
       // System.out.println("Dame un número entre 1 y 10");

//RETO 7

    }
}

