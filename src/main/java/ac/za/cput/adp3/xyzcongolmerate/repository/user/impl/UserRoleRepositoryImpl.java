package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRoleRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRoleRepositoryImpl implements UserRoleRepository {

    private Set<UserRole> userRoleDB;
    private static UserRoleRepository userRoleRepository = null;

    private UserRoleRepositoryImpl() {
        this.userRoleDB = new HashSet<>();
    }

    public static UserRoleRepository getUserRoleRepository() {
        if (userRoleRepository == null) userRoleRepository = new UserRoleRepositoryImpl();
        return userRoleRepository;
    }

   
    @Override
    public UserRole create(UserRole userRole) {
        this.userRoleDB.add(userRole);
        return userRole;
    }

    
    @Override
    public UserRole read(UserRole userRole) {
        throw new UnsupportedOperationException("Not supported yet.");
      //  return userRoleDB.stream().filter(UserRole(orgCode, userEmail, roleId) == userRole).findAny().orElse(null);
    }

    
    @Override
    public UserRole update(UserRole userRole) {
        UserRole toDelete = this.read(userRole);

        if(toDelete != null) {
            userRoleDB.remove(toDelete);
            return create(userRole);
        }
        return null;
    }

    
    @Override
    public void delete(UserRole userRole) {
        UserRole toDelete = this.read(userRole);

        if (toDelete != null){
            this.userRoleDB.remove(toDelete);
            
        }
        
    }

    
    @Override
    public Set<UserRole> getAll() {
        return userRoleDB;
    }
}
