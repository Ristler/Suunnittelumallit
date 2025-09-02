package Decorator;

public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }
    public void print(String text) {
        super.print("<printer>"+ text + "</printer>");
    }
}
