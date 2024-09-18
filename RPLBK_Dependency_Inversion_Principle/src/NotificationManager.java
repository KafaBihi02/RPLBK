

class NotificationManager {
//without DIP
    /*private EmailService emailService;

    public NotificationManager(){
        this.emailService = new EmailService();
    }

    public void sendNotification(String message){
        emailService.sendEmail(message);
    }*/

    private NotificationService notificationService;
    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void sendNotification(String message){
        notificationService.sendNotification(message);
    }


}
