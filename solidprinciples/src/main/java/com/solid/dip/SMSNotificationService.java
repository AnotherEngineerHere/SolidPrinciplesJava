package com.solid.dip;

import org.springframework.stereotype.Service;

/**
 * Implementación del servicio de notificación por SMS.
 * 
 * author Andres Orozco
 */
@Service
public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando notificación por SMS: " + message);
    }
}
