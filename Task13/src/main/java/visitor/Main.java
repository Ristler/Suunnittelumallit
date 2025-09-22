package visitor;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();

        SizeCalculatorVisitor sizeCalcVisitor = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor("JPG");

        File kissaKuva = new File("Kissa", 2, "PNG");
        File koiraKuva = new File("Koira", 2, "PNG");
        File volvoKuva = new File("Volvo", 3, "JPG");
        File mercedesKuva = new File("Mercedes", 3, "JPG");

        dir.addChild(kissaKuva);
        dir.addChild(koiraKuva);
        dir.addChild(volvoKuva);
        dir.addChild(mercedesKuva);

        dir.accept(sizeCalcVisitor);
        dir.accept(searchVisitor);

        System.out.println(sizeCalcVisitor.getTotalSize());

        System.out.println(searchVisitor.getMatchingFiles());

    }
}
