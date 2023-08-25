package com.marketitems.services;


import com.marketitems.domain.user.User;
import com.marketitems.dtos.NotificationDTO;
import com.marketitems.endpoints.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {
    Endpoint endpoint;

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception{
        String email = user.getEmail();
        NotificationDTO notificationDTO = new NotificationDTO(email, message);
    }
}
