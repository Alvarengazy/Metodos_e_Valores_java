public class SistemaAprovacao {

    public static double calculo(String name, int nota) {
        System.out.println("Olá " + name + ", sua nota é: " + nota);
        return nota;
    }

    public static boolean aprovado(double calculo) {
       if (calculo >= 7) {
          System.out.println("Você está aprovado");
          return true;
       } else {
        System.out.println("Você está reprovado");
        return false;
       }
    }

    public static void main(String[] args) {
        aprovado(calculo("João", 7)); aprovado(calculo("Maria", 6));
    }
}
