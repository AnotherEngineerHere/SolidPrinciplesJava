package com.solid.srp;

import org.springframework.stereotype.Service;

/**
 * Servicio que genera reportes.
 * 
 * @author Andres Orozco
 */
@Service
public class ReportService {

    /**
     * Genera un reporte.
     * 
     * @return El contenido del reporte.
     */
    public String generateReport() {
        return "Este es un reporte.";
    }
}