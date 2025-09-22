package proxy;
import java.util.HashMap;

public class Library {

    private HashMap<String, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(IDocument doc) {
        documents.put(doc.getIdentifier(), doc);
    }
    public void addProtectedDocument(String identifier, String content) {
        Document document = new Document(identifier, content);
        DocumentProxy proxy = new DocumentProxy(document);
        documents.put(identifier, proxy);


    }

    public IDocument getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void removeDocument(String id) {
        documents.remove(id);
    }

    public boolean containsDocument(String id) {
        return documents.containsKey(id);
    }
    public void listDocuments() {
        for (String id : documents.keySet()) {
            System.out.println(id);
        }
    }
}