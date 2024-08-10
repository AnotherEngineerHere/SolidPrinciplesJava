package com.solid.srp;

import org.springframework.stereotype.Service;

/**
 * Servicio que envía correos electrónicos.
 * 
 * author TuNombre
 */
@Service
public class EmailService {

    /**
     * Envía un correo electrónico con el reporte.
     * 
     * @param report El contenido del reporte.
     */
    public void sendEmail(String report) {
        System.out.println("Enviando reporte: " + report);
    }
}