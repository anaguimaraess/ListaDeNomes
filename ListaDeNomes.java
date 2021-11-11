import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNomes {

    private static List<Nomes> lista = new ArrayList<>(6);

    static void addNome(String nome){
        Nomes pessoa = new Nomes();
        pessoa.setNome(nome);
        lista.add(pessoa);
    }
    static void exibirLista(){
        lista.forEach(pessoa -> pessoa.imprimeDados());
    }

    static void ordenarLista(){
        Collections.sort(lista);
    }

    public static void main(String[] args) {
        System.out.println("----------------LISTA DESORDENADA---------------");
        addNome("mario");
        addNome("carol");
        addNome("zezinho");
        addNome("fernanda");
        addNome("walace");
        addNome("ana");

        exibirLista();

        System.out.println("----------------LISTA ORDENADA EM ORDEM ALFABETICA");

        ordenarLista();

        exibirLista();

    }

}
