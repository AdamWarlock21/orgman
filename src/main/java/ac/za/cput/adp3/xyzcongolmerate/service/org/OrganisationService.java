package ac.za.cput.adp3.xyzcongolmerate.service.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.service.IService;

import java.util.Set;

public interface OrganisationService extends IService<Organisation, String> {
    
    Set<Organisation> getAll();
}
