import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();
    @Test
    public void nullTest() {

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilmsTest() {
        manager.addFilms("Film I");

        String[] expected = { "Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsTest() {
        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");

        String[] expected = { "Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ThreeFindLastTest() {

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");
        manager.addFilms("Film V");
        manager.addFilms("Film VI");
        manager.addFilms("Film VII");
        manager.afishaLimitManager (3);

        String[] expected = { "Film VII", "Film VI", "Film V"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FiveFindLastTest() {

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");
        manager.addFilms("Film V");
        manager.addFilms("Film VI");
        manager.addFilms("Film VII");
        manager.afishaLimitManager (5);

        String[] expected = { "Film VII", "Film VI", "Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SevenFindLastTest() {

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");
        manager.addFilms("Film IV");
        manager.addFilms("Film V");
        manager.addFilms("Film VI");
        manager.addFilms("Film VII");
        manager.afishaLimitManager (7);

        String[] expected = { "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void OverFindLastTest() {

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");

        manager.afishaLimitManager (7);

        String[] expected = { "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
