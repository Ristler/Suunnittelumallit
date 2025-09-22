package proxy;

public class Main {
    public static void main(String[] args) {
        User daniel = new User("daniel");
        User heikki = new User("heikki");

        Library library = new Library();

        Document lockedDocument = new Document("doc1", "hello, i am document allowed only for daniel");
        Document publicDocument = new Document("doc3", "I am public document");
        DocumentProxy documentProxy = new DocumentProxy(lockedDocument);

        library.addDocument(documentProxy);
        library.addDocument(publicDocument);

        System.out.println(publicDocument.getContent(heikki));
    }
}
