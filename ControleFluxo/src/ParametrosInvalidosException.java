public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O primeiro parâmetro deve ser menor ou igual ao segundo.");
    }
}
