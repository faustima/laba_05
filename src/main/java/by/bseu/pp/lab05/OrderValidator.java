package by.bseu.pp.lab05;

public final class OrderValidator {
    private OrderValidator() {
    }

    public static void validateId(String id) {
        if (id == null) {
            throw new ValidationException("id не должен быть пустым");
        }
        if (id.isBlank()) {
            throw new ValidationException("id не должен быть пустым");
        }
    }

    public static void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new ValidationException("Некорректная сумма amount=" + Double.toString(amount) + "требуется конечное число больше 0");
        }
    }
}
