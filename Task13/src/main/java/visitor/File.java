package visitor;

public class File implements FileSystemElement {
    private String name;
    private String fileExtension;
    private int size;


    public File(String name, int size, String fileExtension) {
        this.name = name;
        this.size = size;
        this.fileExtension = fileExtension;
    }
    public int getSize() {
        return size;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);

    }
    @Override
    public String toString() {
        return name;
    }
}
