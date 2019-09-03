package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationUserRepositoryImpl implements OrganisationUserRepository {

    private Set<OrganisationUser> organisationUserDB;
    private static OrganisationUserRepository organisationUserRepository = null;

    private OrganisationUserRepositoryImpl() {
        this.organisationUserDB = new HashSet<>();
    }

    public static OrganisationUserRepository getOrganisationUserRepository() {
        if (organisationUserRepository == null) organisationUserRepository = new OrganisationUserRepositoryImpl();
        return organisationUserRepository;
    }

    
    @Override
    public OrganisationUser create(OrganisationUser organisationUser) {
        this.organisationUserDB.add(organisationUser);
        return organisationUser;
    }

    
    @Override
    public OrganisationUser read(String orgCode, String userEmail) {
        return organisationUserDB.stream().filter(org -> org.getOrgCode()== orgCode && org.getUserEmail() == userEmail ).findAny().orElse(null);
    }

 
    @Override
    public OrganisationUser update(OrganisationUser organisationUser) {
         OrganisationUser toDelete = read(organisationUser.getOrgCode(),organisationUser.getUserEmail());

        if(toDelete != null) {
            organisationUserDB.remove(toDelete);
            return create(organisationUser);
        }
        return null;
    }

 
    @Override
    public void delete(String orgCode, String userEmail) {
        OrganisationUser toDelete = this.read(orgCode, userEmail);

        if (toDelete != null){
            this.organisationUserDB.remove(toDelete);
            
        }
        
    }

 
    @Override
    public Set<OrganisationUser> getAll() {
        return organisationUserDB;
    }


}
