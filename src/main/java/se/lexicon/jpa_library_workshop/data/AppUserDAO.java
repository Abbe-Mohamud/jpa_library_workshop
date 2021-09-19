package se.lexicon.jpa_library_workshop.data;

public interface AppUserDAO {

    AppUser findById(int id);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update(AppUser appUser);
    void delete(int id);



}

