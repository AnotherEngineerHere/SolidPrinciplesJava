package com.solid.srp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SRPTest {

    @Autowired
    private ReportService reportService;

    @Autowired
    private EmailService emailService;

    @Test
    public void testGenerateReport() {
        String report = reportService.generateReport();
        assertEquals("Este es un reporte.", report);
    }

    @Test
    public void testSendEmail() {
        String report = reportService.generateReport();
        emailService.sendEmail(report);
    }
}
