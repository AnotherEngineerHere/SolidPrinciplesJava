package com.solid.dip;

import org.springframework.stereotype.Service;

/**
 * Clase que representa una aplicación que utiliza un servicio de notificación.
 * 
 * author Andres Orozco
 */
@Service
public class NotificationApplication {

    private final NotificationService notificationService;

    
    public NotificationApplication(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processNotification(String message) {
        notificationService.sendNotification(message);
    }
}