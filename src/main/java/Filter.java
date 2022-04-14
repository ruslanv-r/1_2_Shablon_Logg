import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < treshold) {
                logger.log("!!! Значение - " + list.get(i) + " удовлетворяет условию, т.к. меньше значения фильтра - " + treshold);
                result.add(list.get(i));
            } else {
                logger.log("Значение - " + list.get(i) + " не удовлетворяет условию, т.к. больше значения фильтра - " + treshold);
            }
        }
        logger.log("Создан отфильтрованный список");
        System.out.println(result);


        return result;
    }
}
