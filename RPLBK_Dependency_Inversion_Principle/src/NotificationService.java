interface NotificationService {
    void sendNotification(String message);
}
class EmailService implements NotificationService {
   @Override
   public void sendNotification(String message){
        System.out.println("Sending email with message " + message);
    }
}

class WhatsappService implements NotificationService{
    @Override
    public void sendNotification(String message){
        System.out.println("Sending whatsapp with message " + message);
    }
}
