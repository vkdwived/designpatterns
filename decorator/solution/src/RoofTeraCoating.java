public class RoofTeraCoating extends CarServiceDecorator {

    public RoofTeraCoating(CarService carService) {
        super(carService);
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", Roof Tera Coating";
    }

    @Override
    public double cost() {
        return carService.cost() + 1355.50;
    }
}
