package com.nexocode.budget.notifications;

public interface NotificationsService {
    void sendNotification(String username, NotificationType notificationType);
}