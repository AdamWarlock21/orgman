package ac.za.cput.adp3.xyzcongolmerate.service.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;

import java.util.Set;

public interface OrganisationUserService {
    OrganisationUser create(OrganisationUser organisationUser);
    OrganisationUser read(String orgCode, String userEmail);
    OrganisationUser update(OrganisationUser organisationUser);
    void delete(String orgCode, String userEmail);
    Set<OrganisationUser> getAll();

    //Question1-Service
    Set<String> getUserFullNamesInOrganisation(String orgCode);
    
    //Question2-Service
    Set<String> getUserOrganisations(String userEmail);
}
