package visitor;


import java.util.ArrayList;
import java.util.List;

//should traverse the file system and accumulate files
//that match a specified criterion
//(e.g., file extension, name pattern).
public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<FileSystemElement> children;


    public SearchVisitor(String extension) {
        this.children = new ArrayList<>();
        this.extension = extension;
    }
    public List<FileSystemElement> getMatchingFiles() {
        return children;
    }

    @Override
    public void visit(File file) {
        if(file.getFileExtension().equals(extension)) {
            children.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {

    }
}
