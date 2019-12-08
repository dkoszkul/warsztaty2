package pl.coderslab;

import pl.coderslab.dao.UserDao;
import pl.coderslab.models.User;

public class Application {

    public static void main(String[] args) {
        // ------------------------ CREATE -----------------------------
//        User user = new User("dkoszkul",
//                "dominik.koszkul@gmail.com",
//                "test1234");
//
        UserDao userDao = new UserDao();
//        // Chcemy zapisać użytkownika user do bazy danych
//        System.out.println("Przed zapisem: " + user);
//        user = userDao.create(user);
//        System.out.println("Po zapisie: " + user);

        // ----------------------------------- READ -----------------------
        User user2 = userDao.read(1);
        System.out.println("Istniejący user w bazie " + user2);

        // Wersja dla użytkownika którego nie ma w bazie
        User user3 = userDao.read(46548);
        System.out.println("Brak usera w bazie " + user3);

        // ----------------------------------- UPDATE -----------------------
        user2.setUserName("Nowy lepszy username");
        userDao.update(user2);

        // ----------------------------------- DELETE -----------------------
        userDao.delete(1);
        System.out.println("Usuniety user -> read "+ userDao.read(1));

    }
}
