public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (this.name == null) { return false;}
        return name.matches("(?=.{3,19}$)[a-zA-Zа-яА-Я]+\\s[a-zA-Zа-яА-Я]+");
    }

}
