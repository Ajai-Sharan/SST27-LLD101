package SOLID.ex01.srcAnswer;
public class SmtpEmailClient implements EmailService {
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}
