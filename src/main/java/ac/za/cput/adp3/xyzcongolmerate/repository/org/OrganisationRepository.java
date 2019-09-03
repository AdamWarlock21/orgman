package ac.za.cput.adp3.xyzcongolmerate.repository.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.repository.IRepository;


import java.util.Set;

public interface OrganisationRepository extends IRepository<Organisation, String> {

    Set<Organisation> getAll();
}
