import java.time.LocalDate;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Payment {
    private String fullName;
    private LocalDate paymentDate;
    private int amount;

    public Payment(String fullName, LocalDate paymentDate, int amount) {
        this.fullName = fullName;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return amount == payment.amount && Objects.equals(fullName, payment.fullName) && Objects.equals(paymentDate, payment.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, paymentDate, amount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fullName='" + fullName + '\'' +
                ", paymentDate=" + paymentDate +
                ", amount=" + amount +
                '}';
    }

    public Payment(Payment copy) {
        this.fullName = copy.fullName;
        this.paymentDate = LocalDate.from(copy.paymentDate); // Создаем новую дату
        this.amount = copy.amount;
    }

    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

        payments.add(new Payment("Иванов И.И.", LocalDate.of(2023, 3, 15), 10000));
        payments.add(new Payment("Петров П.П.", LocalDate.of(2023, 4, 20), 5000));
        payments.add(new Payment("Сидоров С.С.", LocalDate.of(2023, 5, 25), 15000));
        payments.add(new Payment("Иванова И.И.", LocalDate.of(2023, 6, 30), 8000));

        for (Payment payment : payments) {
            System.out.println(payment);
        }
    }
}