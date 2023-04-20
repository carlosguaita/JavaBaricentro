import java.util.Scanner;

public class Triangulo {

    double x1=0;
    double x2=0;
    double x3=0;
    double y1=0;
    double y2=0;
    double y3=0;

    public Triangulo(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public Triangulo() {
    }

    public void ingresoCoordenadas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la componente en X del punto 1");
        this.x1=sc.nextDouble();
        System.out.println("Ingrese la componente en y del punto 1");
        this.y1=sc.nextDouble();
        System.out.println("Ingrese la componente en X del punto 2");
        this.x2=sc.nextDouble();
        System.out.println("Ingrese la componente en Y del punto 2");
        this.y2=sc.nextDouble();
        System.out.println("Ingrese la componente en X del punto 3");
        this.x3=sc.nextDouble();
        System.out.println("Ingrese la componente en Y del punto 3");
        this.y3=sc.nextDouble();
    }

    public void calculoBaricentro(){
        double bx=(this.x1+this.x2+this.x3)/3;
        double by=(this.y1+this.y2+this.y3)/3;
        System.out.println("Las coordenadas del baricentro son: x="+bx+" y="+by);
    }

    public void imprimirDistancias(){
        double d1 = calculoDistancia(this.x1,this.y1,this.x2,this.y2);
        double d2 = calculoDistancia(this.x2,this.y2,this.x3,this.y3);
        double d3 = calculoDistancia(this.x1,this.y1,this.x3,this.y3);
        System.out.println("Las distancias entre los puntos del triangulo son: d1: "+d1+
                " d2: "+d2+" d3: "+d3);
    }

    public double calculoDistancia(double x1, double y1, double x2, double y2){

        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return d;
    }
}
