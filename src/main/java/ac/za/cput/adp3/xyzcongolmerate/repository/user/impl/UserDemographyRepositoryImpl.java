package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserDemographyRepository;

import java.util.HashSet;
import java.util.Set;

public class UserDemographyRepositoryImpl implements UserDemographyRepository {

    private Set<UserDemography> userDemographyDB;
    private static UserDemographyRepository userDemographyRepository = null;

    private UserDemographyRepositoryImpl() {
        this.userDemographyDB = new HashSet<>();
    }

    public static UserDemographyRepository getUserDemographyRepository() {
        if (userDemographyRepository == null) userDemographyRepository = new UserDemographyRepositoryImpl();
        return userDemographyRepository;
    }

    
    @Override
    public UserDemography create(UserDemography userDemography) {
        this.userDemographyDB.add(userDemography);
        return userDemography;
    }

    
    @Override
    public UserDemography read(String userEmail) {
        return userDemographyDB.stream().filter(user -> user.getUserEmail()== userEmail).findAny().orElse(null);
    }

   
    @Override
    public UserDemography update(UserDemography userDemography) {
        UserDemography toDelete = read(userDemography.getUserEmail());

        if(toDelete != null) {
            userDemographyDB.remove(toDelete);
            return create(userDemography);
        }
        return null;
    }

    
    @Override
    public boolean delete(String userEmail) {
        UserDemography toDelete = this.read(userEmail);

        if (toDelete != null){
            this.userDemographyDB.remove(toDelete);
            return true;
        }
        return false;
    }

    
    @Override
    public Set<UserDemography> getAll() {
        return userDemographyDB;
    }
}
