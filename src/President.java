public class President {
    // Приватне статичне поле, яке зберігає єдиний екземпляр класу
    private static President president;

    // Ім’я президента
    private String name;

    // Приватний конструктор, щоб заборонити створення об’єкта ззовні
    private President(String name) {
        this.name = name;
    }

    // Статичний метод для доступу до єдиного екземпляру
    public static President getInstance(String name) {
        if (president == null) {
            president = new President(name);
        }
        return president;
    }

    public void showInfo() {
        System.out.println("President's name is: " + name);
    }
}
