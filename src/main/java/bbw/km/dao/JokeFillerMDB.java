package bbw.km.dao;

import bbw.km.model.Joke;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class JokerFillerMDB
 *
 * @author marco
 * @version 13.09.2022
 */
public class JokeFillerMDB {
    private static void fillJoke(Joke joke, ResultSet resultset) throws SQLException {
        joke.setId(resultset.getInt("jokeid"));
        joke.setJoke(resultset.getString("content"));
        joke.setDate(resultset.getDate("date"));
        joke.setRating(resultset.getInt("rating"));
    }

    public static Joke createJoke(ResultSet resultset) throws SQLException {
        Joke joke = new Joke();
        fillJoke(joke, resultset);
        return joke;
    }
}
