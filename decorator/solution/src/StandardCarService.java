public class StandardCarService extends CarService {

    @Override
    public String getDescription() {
        return "Standard car care";
    }

    @Override
    public double cost() {
        return 5999;
    }
}
