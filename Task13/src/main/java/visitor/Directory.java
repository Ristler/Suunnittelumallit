package visitor;


import java.util.ArrayList;
import java.util.List;

//Implement a Directory class that represents a folder
//and can contain multiple files and directories.
public class Directory implements FileSystemElement {

    private List<FileSystemElement> children;

    public Directory() {
        this.children =  new ArrayList<>();
    }

    public void addChild(FileSystemElement element) {
        children.add(element);
    }


    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);

        for(FileSystemElement e : children) {
            e.accept(visitor);
        }
    }
}
