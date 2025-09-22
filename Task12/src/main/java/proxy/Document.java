package proxy;
import java.time.LocalDate;


public class Document implements IDocument {
    public String identifier;
    public LocalDate creationDate;
    protected String content;


    public Document(String identifier, String content) {
        LocalDate currentDate = LocalDate.now();

        this.identifier = identifier;
        this.content = content;
        this.creationDate = currentDate;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }
}
