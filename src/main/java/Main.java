import ua.kpi.iasa.Controller;
import ua.kpi.iasa.Model;
import ua.kpi.iasa.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(),new View());
        controller.userAction();
    }
}
