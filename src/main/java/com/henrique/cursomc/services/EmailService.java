package com.henrique.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.henrique.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
