import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Pessoa> pessoaList = new ArrayList<>();
        Pessoa hugo = new Pessoa("Hugo", 20l, "05877799955", "DF");
        Pessoa jhonny = new Pessoa("Jhonny", 25l, "05877794955", "RJ");
        Pessoa amanda = new Pessoa("Amanda", 20l, "05877799955", "MG");
        Pessoa maria = new Pessoa("Maria", 25l, "05877799955", "MG");
        pessoaList.add(hugo);
        pessoaList.add(jhonny);
        pessoaList.add(amanda);
        pessoaList.add(maria);

        Stream<Pessoa> pessoaStream = pessoaList.stream();

        Long totalIdades = pessoaStream
                .map(pessoa -> pessoa.getIdade())
                .reduce(0l, (subtotal, valor) -> subtotal + valor);

        /*Long totalIdades = idades.stream()
                .reduce(0l, (subtotal, valor) -> subtotal + valor);*/
        System.out.println("Total de idades: " + totalIdades);

        // pessoaStream.reduce(0, (subtotal, pessoa) -> subtotal + pessoa.getIdade(), Long::sum);
        /*pessoaStream
                .filter(pessoa -> {
                    boolean isMg = pessoa.getRegiao().equals("MG");
                    boolean is20anos = pessoa.getIdade().longValue() == 20l;
                    return isMg && is20anos;
                }).max(Comparator.comparing(pessoa -> pessoa.getIdade()));*/

    }
}