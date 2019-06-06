public class BasicCarService extends CarService {

    @Override
    public String getDescription() {
        return "Basic car care";
    }

    @Override
    public double cost() {
        return 3799;
    }
}
