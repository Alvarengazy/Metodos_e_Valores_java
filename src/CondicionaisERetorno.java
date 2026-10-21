public class CondicionaisERetorno {

    public static boolean Maioridade(String name, int idade){ 
        if (idade >= 18) {
            System.out.println("Olá " + name + ", você é Maior de idade");
            return true;
        } else {
            System.out.println("Olá " + name + ", você é Menor de idade");
            return false;
        }
    }

    public static void main(String[] args) {
        Maioridade("Felipe", 18); Maioridade("Marina", 15);
    }
}
