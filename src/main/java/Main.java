import java.util.*;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Filter filter = null;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int inputSize = 0;
        int inputMax = 0;
        int inputFiltr = 0;

        try {
            logger.log("Запрос ввода значения пользователем - размер списка:");
            System.out.println("Введите размер списка:\n");
              inputSize = scanner.nextInt();
            logger.log("Введено значение пользователем: размер списка (" + inputSize + ")");

            logger.log("Запрос ввода значения пользователем - Значение верхней границы:");
            System.out.println("Введите значение верхней границы:\n");
            inputMax = scanner.nextInt();
            logger.log("Введено значение пользователем: Значение верхней границы (" + inputMax + ")");

            logger.log("Запрос ввода значения пользователем - Значение фильтра:");
            System.out.println("Введите значение фильтра:\n");
            inputFiltr = scanner.nextInt();
            logger.log("Введено значение пользователем: Значение верхней границы (" + inputFiltr + ")");
        } catch (InputMismatchException | IndexOutOfBoundsException | IllegalArgumentException e) {

           logger.log("Введено значение вне диапазона");
        }


        List<Integer> listValues = new ArrayList();
        for (int i = 0; i < inputSize; i++) {
            listValues.add(random.nextInt(inputMax));
        }

        logger.log("Сгенерирован список:");
        System.out.println(listValues);

        filter = new Filter(inputFiltr);

        logger.log("Отправка списка в фильтр55: ");
        filter.filterOut(listValues);
    }
}
