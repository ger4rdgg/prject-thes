package pelu.thes.email;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;

public interface EmailService {
    public abstract void sendSimpleEmail(String toAddress, String subject, String message);
    public  abstract void sendEmailWithAttachment(String toAddress, String subject, String message, String attachment) throws FileNotFoundException, MessagingException;
}
