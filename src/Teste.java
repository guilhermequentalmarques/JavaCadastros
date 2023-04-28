import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static  void main(String[] args){
        List<Pessoa> colaboradoresTeste = new ArrayList<>();

        Pessoa colaboradorTeste = new Pessoa("Guilherme", "50404727816", "11 97615-5550", "21/07/2006", "28/04/2023", "N");
        colaboradoresTeste.add(colaboradorTeste);

        Pessoa colaboradorTeste2 = new Pessoa("Guilherme", "50404727816", "11 97615-5550", "21/07/2006", "28/04/2023", "N");
        colaboradoresTeste.add(colaboradorTeste2);

        Pessoa colaboradorTeste3 = new Pessoa("Guilherme", "50404727816", "11 97615-5550", "21/07/2006", "28/04/2023", "N");
        colaboradoresTeste.add(colaboradorTeste3);
    }

}
