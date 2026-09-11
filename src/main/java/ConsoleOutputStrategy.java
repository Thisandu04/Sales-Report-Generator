public class  ConsoleOutputStrategy implements OuputStrategy {
    @Override
    public void output(String report) {
        System.out.println(report);
    }
}
