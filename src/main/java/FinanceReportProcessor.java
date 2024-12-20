import java.util.ArrayList;
import java.util.List;

public class FinanceReportProcessor {

    public static FinanceReport getPaymentsBySurnameInitial(FinanceReport report, char initial) {
        List<Payment> filteredPayments = new ArrayList<>();

        for (Payment payment : report.getPayments()) {
            if (payment != null && payment.getFullName().charAt(0) == initial) {
                filteredPayments.add(payment);
            }
        }

        Payment[] paymentsArray = new Payment[filteredPayments.size()];
        paymentsArray = filteredPayments.toArray(paymentsArray);

        return new FinanceReport(paymentsArray, report.getReporterName(), report.getReportDate());
    }

    public static FinanceReport getPaymentsBelowAmount(FinanceReport report, int maxAmount) {
        List<Payment> filteredPayments = new ArrayList<>();

        for (Payment payment : report.getPayments()) {
            if (payment != null && payment.getAmount() < maxAmount) {
                filteredPayments.add(payment);
            }
        }

        Payment[] paymentsArray = new Payment[filteredPayments.size()];
        paymentsArray = filteredPayments.toArray(paymentsArray);

        return new FinanceReport(paymentsArray, report.getReporterName(), report.getReportDate());
    }
}