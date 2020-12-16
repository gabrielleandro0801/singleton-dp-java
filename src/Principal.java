public class Principal {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setNome("Gabriel");
        System.out.println("Valor do nome da instancia: " + singleton.getNome());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Valor do nome da instancia: " + singleton2.getNome());
        System.out.println("Ambos sao a mesma instancia!");



    }
}
