public class Ex04FormulaDeBhaskara { //Exercício 4
    public static void main(String [] args){
        double r1;
        double r2;
        double a = 10.3;
        double b = 203.0;
        double c = 5.0;
        double delta = (b*b) - 4*a*c;

        r1 = ((b*-1) + Math.sqrt(delta))/(2*a);
        r2 = ((b*-1) - Math.sqrt(delta))/(2*a);

        if(a != 0 && delta >= 0){
            System.out.printf("R1 = %.5f\n" , r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
        else{
        System.out.println("Impossível calcular");}
    }
}
