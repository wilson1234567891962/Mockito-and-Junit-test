package com.prueba.test.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}