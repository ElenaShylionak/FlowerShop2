package by.itstep.elena.java.stages.stage20.flowerShop.theoryOnPatternsAndInterfaces;

public class CopyConstructorte {
    //Конструктор копирования-это простая альтернатива механизму клонирования java.

    //Конструктор копирования полезен, когда мы хотим скопировать объект, который трудно создать.

    //Это полезно, когда мы хотим скопировать сложный объект, который имеет несколько полей,
    // или когда мы хотим сделать глубокую копию существующего объекта.
    //Такие конструкторы применяются также тогда, когда мы не хотим использовать метод clone().

    //Пример:
    public class User  { //класс Пользователь

        private int id; //инкапсулированые поля
        private String name;

       public User(int id, String name) { //конструктор с параметрами
            this.id = id;
            this.name = name;
        }

        //Здесь стоит обратить внимание на конструктор.
        //Здесь просто в конструктор передается объект User и вызывается конструктор User(int id, String name) через this.
       public User (User u) {
            this(u.getId(), u.getName());
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    //Клиентский код:

    //User u1 = new User(1, "Name 1");
    //User u2 = new User(u1);
    //u2.setId(2);
   //System.out.println(u1);
   //System.out.println(u2);

    //Вывод на консоль:
    //User{id=1, name=’Name 1′}
    //User{id=2, name=’Name 1′}
}

