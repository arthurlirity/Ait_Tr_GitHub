public class User {
    // Создать класс User, содержащий логин, пароль и объект класса Basket.
    String login;
    String password;
    Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
