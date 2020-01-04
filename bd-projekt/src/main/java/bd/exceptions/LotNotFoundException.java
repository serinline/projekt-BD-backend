package bd.exceptions;

public class LotNotFoundException extends RuntimeException {

    LotNotFoundException() {
        super("Nie znaleziono lotu o podanych parametrach");
    }
}