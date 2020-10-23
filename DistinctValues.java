import static java.lang.Integer.parseInt;

public class DistinctValues {

    public static void main (String[] args) {



        int a = parseInt(args[0]);
        int b = parseInt(args[1]);
        int c = parseInt(args[2]);
        int suma;

        if (a==b && b==c){
            suma=1;
            System.out.println(suma);
        } else if (a==b && c!=b || a==c && b!=c|| a!=b && b==c){
            suma=2;
            System.out.println(suma);
        } else if (a!=b && b!=c){
            suma=3;
            System.out.println(suma);
        }
    }
}
