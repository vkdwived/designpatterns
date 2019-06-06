public class AntiRustCoating extends CarServiceDecorator {

    public AntiRustCoating(CarService carService) {
        super(carService);
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", AntiRust Coating";
    }

    @Override
    public double cost() {
        return carService.cost() + 1200.90;
    }
}
