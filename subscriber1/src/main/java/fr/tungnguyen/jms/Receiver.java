package fr.tungnguyen.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by tungnguyen on 18/04/17.
 */
@Component
public class Receiver {

    @JmsListener(destination = "mailbox.topic", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }
}
