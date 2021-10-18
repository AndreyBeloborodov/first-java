public class  Example1{

    public static void main(String[] args) {
        User user[] = {
                new User("Andrey", "Kazan", 0),
                new User("Ivan", "Moscow", 1),
                new User("Danil", "Piter", 2)
        };
        System.out.println(user[1].name);
    }
}
