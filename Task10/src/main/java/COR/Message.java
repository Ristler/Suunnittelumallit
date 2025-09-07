package COR;

public class Message {
    public enum MessageType {
        COMPENSATION_CLAIM,
        CONTACT_REQUEST,
        DEVELOPMENT_SUGGESTION,
        GENERAL_FEEDBACK

    }
    private MessageType type;
   private String messageContent;
   private String senderEmail;



   public Message(String messageContent, String senderEmail, MessageType type) {
       this.messageContent = messageContent;
       this.senderEmail = senderEmail;
       this.type = type;

   }
   public MessageType getType() {
       return type;

   }
   public String getMessageContent() {
       return messageContent;
   }
   public String getEmail() {
       return senderEmail;
   }
}
