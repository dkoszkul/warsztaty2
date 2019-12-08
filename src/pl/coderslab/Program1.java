package pl.coderslab;

public class Program1 {

    public static void main(String[] args) {
        // Wyświetlenie dostępnych opcji -> add, edit, delete ...
        String chosenOption = null;
        while (!chosenOption.equals("quit")) {
            // scanner dla chosenOption
            if(chosenOption.equals("add")) {
                handleAdd();
            }
        }

    }

    private static void handleAdd() {
        // Pytamy o dane z obiektu User -> username, mail ...
        // Sprawdzamy czy dane są poprawne
        // Zapisujemy do bazy danych
    }
}
