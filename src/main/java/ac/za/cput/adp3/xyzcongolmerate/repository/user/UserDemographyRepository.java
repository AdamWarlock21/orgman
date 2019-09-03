package ac.za.cput.adp3.xyzcongolmerate.repository.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.repository.IRepository;

import java.util.Set;

public interface UserDemographyRepository extends IRepository<UserDemography, String> {

    Set<UserDemography> getAll();
}
