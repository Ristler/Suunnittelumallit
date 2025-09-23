package builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();

        ComputerDirector directorOffice = new ComputerDirector(officeComputerBuilder);
        ComputerDirector directorGaming = new ComputerDirector(gamingComputerBuilder);

        directorOffice.constructorComputer();
        directorGaming.constructorComputer();

        Computer officeComputer = officeComputerBuilder.getComputer();
        Computer gamingComputer = gamingComputerBuilder.getComputer();

        System.out.println(officeComputer);
        System.out.println(gamingComputer);

    }
}
