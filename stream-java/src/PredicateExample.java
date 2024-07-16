import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras  = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se as palavras tem mais de 5 letras
        palavras.stream().filter(palavra -> palavra.length()>5).forEach(System.out::println);
    }
}
