public class TeflonCoating extends CarServiceDecorator {

    public TeflonCoating(CarService carService) {
        super(carService);
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", Teflon Coating";
    }

    @Override
    public double cost() {
        return carService.cost() + 2200.43;
    }
}
