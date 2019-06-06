public abstract class CarServiceDecorator extends CarService {

    protected CarService carService;

    CarServiceDecorator(CarService carService) {
        this.carService = carService;
    }

    @Override
    public abstract String getDescription();
}
