package com.solid.dip;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DIPTest {

    @Autowired
    private NotificationApplication notificationApplication;

    @Test
    public void testNotificationApplication() {
        notificationApplication.processNotification("Este es un mensaje de prueba.");
    }
}
