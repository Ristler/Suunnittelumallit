package visitor;


//should traverse the file system and calculate the total
//size of all files.
public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int size = 0;

    public int getTotalSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size+=file.getSize();
    }

    @Override
    public void visit(Directory directory) {

    }
}
