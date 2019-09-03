package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

@SuppressWarnings("ALL")
public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }


    @Override
    public Gender create(Gender gender) {
        this.genderDB.add(gender);
        return gender;
    }


    @Override
    public Gender read(final String genderId) {
      return genderDB.stream().filter(race -> race.getGenderId()== genderId).findAny().orElse(null);
    }


    @Override
    public Gender update(Gender gender) {
        Gender genderToDelete = read(gender.getGenderId());

        if(genderToDelete != null) {
            genderDB.remove(genderToDelete);
            return create(gender);
        }
        return null;
    }


    @Override
    public boolean delete(String genderId) {
        Gender toDelete = this.read(genderId);

        if (toDelete != null){
            this.genderDB.remove(toDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Gender> getAll() {
      return genderDB;
    }
}
