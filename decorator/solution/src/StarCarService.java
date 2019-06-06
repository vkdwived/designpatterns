public class StarCarService {

    public static void main(String[] args) {
        CarService service = new StandardCarService();
        service = new TeflonCoating(service);
        service = new RoofTeraCoating(service);

        System.out.println(service.getDescription() + ", Total Cost=$" + service.cost());
    }
}
