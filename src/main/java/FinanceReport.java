import java.time.LocalDate;

public class FinanceReport {
    private Payment[] payments;
    private String reporterName;
    private LocalDate reportDate;

    public FinanceReport(Payment[] payments, String reporterName, LocalDate reportDate) {
        this.payments = payments;
        this.reporterName = reporterName;
        this.reportDate = reportDate;
    }

    public int getPaymentCount() {
        return payments.length;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public Payment getPayment(int i) {
        if (i < 0 || i >= payments.length) {
            throw new IndexOutOfBoundsException("Индекс не входит в диапазон");
        }
        return payments[i];
    }

    public void setPayment(int i, Payment payment) {
        if (i < 0 || i >= payments.length) {
            throw new IndexOutOfBoundsException("Индекс не входит в диапазон");
        }
        payments[i] = payment;
    }

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder();
        report.append(String.format("[Автор: %s, дата: %s, Платежи: [\n",
                reporterName, reportDate.toString()));

        for (Payment payment : payments) {
            if (payment != null) {
                report.append(String.format("Плательщик: %s, дата: %d.%d.%d, сумма: %d руб. %d коп.\n",
                        payment.getFullName(),
                        payment.getPaymentDate().getDayOfMonth(), // Получаем день
                        payment.getPaymentDate().getMonthValue(), // Получаем месяц
                        payment.getPaymentDate().getYear(), // Получаем год
                        payment.getAmount() / 100, // рубли
                        payment.getAmount() % 100)); // копейки
            }
        }
        report.append("]]");
        return report.toString();
    }

    public FinanceReport(FinanceReport copy) {
        this.reporterName = copy.reporterName;
        this.reportDate = copy.reportDate;
        this.payments = new Payment[copy.payments.length];
        for (int i = 0; i < copy.payments.length; i++) {
            this.payments[i] = new Payment(copy.payments[i]);
        }
    }
}