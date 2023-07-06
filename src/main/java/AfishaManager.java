public class AfishaManager {

    private String[] listFilms = new String[0];   // список фильмов
    private int limit;

    public AfishaManager() {
        this.limit = 5;
    }

    public void afishaLimitManager(int limit) {
        this.limit = limit;
    }

    // добавление фильмов в список
    public void addFilms (String nameFilms) {
        String[] tmp = new String[listFilms.length +1];
        for (int i = 0; i < listFilms.length; i++) {
            tmp[i] = listFilms[i];
        }
        tmp[tmp.length - 1] = nameFilms;
        listFilms = tmp;
    }

    // Вывод в порядке добавления findAll
    public String[] findAll() {
        return listFilms;
    }

    // Вывод в обратном порядке по лимиту findLast
    public String[] findLast() {
        int resultLength;
        if (listFilms.length < limit) {
            resultLength = listFilms.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = listFilms[listFilms.length-1-i];
        }
        return tmp;
    }
}
