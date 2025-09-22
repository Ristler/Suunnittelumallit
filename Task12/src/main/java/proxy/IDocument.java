package proxy;

import java.time.LocalDate;

public interface IDocument {
    String getIdentifier();
    String getContent(User user);
    LocalDate getCreationDate();
}
