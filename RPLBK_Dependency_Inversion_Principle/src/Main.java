public class Main {
    public static void main(String[] args) {

        NotificationService emailService = new EmailService();
        NotificationManager emailNotificationManager = new NotificationManager(emailService);
        emailNotificationManager.sendNotification("Hello via email");

        NotificationService whatsappService = new WhatsappService();
        NotificationManager whatsappNotificationManger =  new NotificationManager(whatsappService);
        whatsappNotificationManger.sendNotification("hello via whatsapp");
    }
}