import java.util.Scanner;

class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] product = {"Ручка", "Карандаш", "Пенал", "Ластик", "Точилка"};

        System.out.println("Готовы ли вы озвучить наименование товара, которое вы хотите приобрести?");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Да")) {
            System.out.println("Наименование товаров в магазине:");
            for (int i = 0; i < product.length; i++) {
                System.out.println((i + 1) + " " + product[i]);
            }

            System.out.println("Какой товар вы хотите приобрести?");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= product.length) {
                System.out.println(product[choice - 1] + " ложим в пакетик...");
                System.out.println("Забирайте!♥♥♥");
            } else {
                System.out.println("Неверный выбор☻");
            }
        } else {
            System.out.println("Хорошего дня, заходите!");
        }

        scanner.close();
    }
}
