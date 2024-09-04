package dev.rinat.directorsAndMovies;

import dev.rinat.directorsAndMovies.model.Director;
import dev.rinat.directorsAndMovies.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class).buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();

        try {
            currentSession.beginTransaction();

//            1
//            Director director1 = currentSession.get(Director.class, 1);
//            List<Movie> movies1 = director1.getMovies();
//            System.out.println(director1);
//            System.out.println(movies1);

//            2
//            Movie movie5 = currentSession.get(Movie.class, 5);
//            Director director5 = movie5.getDirector();
//            System.out.println(movie5);
//            System.out.println(director5);

//            3
//            Movie newMovie1 = new Movie("NewMovie1", 2022, director1);
//            currentSession.persist(newMovie1);

//            4
//            Director newDirector1 = new Director("NewDirector1", 1999);
//            Movie newMovie2 = new Movie("NewMovie2", 2020, newDirector1);
//            currentSession.persist(newDirector1);
//            currentSession.persist(newMovie2);
//            newDirector1.setMovies(new ArrayList<>(Collections.singletonList(newMovie2)));

//            5
//            Director director8 = currentSession.get(Director.class, 8);
//            Movie movie1 = currentSession.get(Movie.class, 1);
//            movie1.setDirector(director8);
//            director8.getMovies().add(movie1);

//            6
//            Director director2 = currentSession.get(Director.class, 2);
//            Movie movie2 = currentSession.get(Movie.class, 2);
//            movie2.getDirector().getMovies().remove(movie2);
//            movie2.setDirector(director2);
//            director2.getMovies().add(movie2);
//            7
            Director director1 = currentSession.get(Director.class, 1);
            currentSession.remove(director1);

            currentSession.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
