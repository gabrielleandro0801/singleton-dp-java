public class Singleton {
    private static Singleton unicaInstancia;
    private String nome;

    private Singleton(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static synchronized Singleton getInstance(){
        if(unicaInstancia == null){
            unicaInstancia = new Singleton();
        }
        return unicaInstancia;
    }

    //A instância única é a variável do próprio tipo da classe
    //O Construtor é privado e vazio
    //O getInstance() verifica se a classe já foi instanciada ou não, e retorna a instância
}
