package com.adozgen.solid;

/*import com.adozgen.solid.lsp.example1.good.CreditCardPayment;
import com.adozgen.solid.lsp.example1.good.PaymentService;
import com.adozgen.solid.lsp.example1.good.PaypalPayment;*/
import com.adozgen.solid.lsp.example2.good.ExportableReport;
		import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);

/*		Payment badCreditCardPayment = new CreditCardPayment();
		Payment badPaypalPayment = new PaypalPayment();
		PaymentService badPaymentService = new PaymentService();
		badPaymentService.processPayment(badPaypalPayment, 100);*/


/*		CreditCardPayment goodCreditCardPayment = new CreditCardPayment();
		PaypalPayment goodPaypalPayment = new PaypalPayment();
		PaymentService goodPaymentService = new PaymentService();
		goodPaymentService.processPayment(goodPaypalPayment, 100);*/

/*		Report badEmployeeReport = new EmployeeReport();
		ReportService badReportService = new ReportService();
		badReportService.viewReport(badEmployeeReport);*/

/*		ExportableReport goodReport = new com.adozgen.solid.lsp.example2.good.EmployeeReport();
		com.adozgen.solid.lsp.example2.good.ReportService goodReportService = new com.adozgen.solid.lsp.example2.good.ReportService();
		goodReportService.exportReport(goodReport, "x.pdf");*/


	}

}
