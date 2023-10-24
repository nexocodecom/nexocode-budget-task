package com.nexocode.budget.notifications;

import org.springframework.stereotype.Service;

@Service
public class NotificationsServiceImpl implements NotificationsService {
    public void sendNotification(String username, NotificationType notificationType) {
        System.out.println("Notification:" + username + ":" + notificationType);
    }
}