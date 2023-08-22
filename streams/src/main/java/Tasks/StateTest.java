package Tasks;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State tr = new State();
        tr.addCity("Ankara");
        tr.addCity("Kayseri");
        tr.addCity("Istanbul");

        State gr = new State();
        gr.addCity("Athens");
        gr.addCity("Selanik");
        gr.addCity("Patras");


        List<State>cityList = Arrays.asList(tr, gr);

        System.out.println("--------- only map ----------");
        cityList.stream()
                .map(State::getCities)
                .forEach(System.out::println);


        System.out.println("--------- flat map ----------");
        cityList.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
