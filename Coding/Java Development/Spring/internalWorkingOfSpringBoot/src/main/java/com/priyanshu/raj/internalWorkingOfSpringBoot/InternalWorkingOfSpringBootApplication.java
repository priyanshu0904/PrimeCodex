package com.priyanshu.raj.internalWorkingOfSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

    public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

//    @Autowired
//    private final RazorpayPaymentService razorpayPaymentService;
//
//    public InternalWorkingOfSpringBootApplication(RazorpayPaymentService razorpayPaymentService) {
//        this.razorpayPaymentService = razorpayPaymentService;
//    }

    private final PaymentService paymentService;


    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println("Payment Doneeee...." + payment);
    }
}
