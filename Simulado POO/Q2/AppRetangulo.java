package Q2;
public class AppRetangulo {
    public static void main(String args[]){
        Retangulo r = new Retangulo(5.0, 5.0);

        System.out.println(r.isQuadrado());
        System.out.println(r.calcularArea());
    }
}