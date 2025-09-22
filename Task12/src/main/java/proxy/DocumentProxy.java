package proxy;


import java.time.LocalDate;

public class DocumentProxy implements IDocument {

    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public String getIdentifier() {
        return document.getIdentifier();
    }

    @Override
    public String getContent(User user) {
        String username = user.getUsername();
        AccessControlService accessControl;
        accessControl = AccessControlService.getInstance();

        if (accessControl.isAllowed(getIdentifier(), username)) {
            return document.getContent(user);
        }
        throw new AccessDeniedException("User not allowed to access document " + getIdentifier());

    }

    @Override
    public LocalDate getCreationDate() {
        return document.getCreationDate();
    }
}
