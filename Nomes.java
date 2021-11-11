public class Nomes implements Comparable<Nomes>{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeDados() {
        System.out.println("O nome é: " + getNome());
    }


    @Override
    public int compareTo(Nomes nome1) {
        return (this.nome.compareTo(nome1.getNome()));
    }
}
