package com.nexocode.budget.notifications;

import org.springframework.stereotype.Service;

@Service
public class NotificationsServiceImpl implements NotificationsService {
    public void sendNotification(String email) {
        System.out.println("Sending email to:" + email);
    }
}