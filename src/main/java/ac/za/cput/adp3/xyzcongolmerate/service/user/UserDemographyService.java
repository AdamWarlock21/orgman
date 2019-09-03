package ac.za.cput.adp3.xyzcongolmerate.service.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.service.IService;

import java.util.Set;

public interface UserDemographyService extends IService<UserDemography, String> {
    
    Set<UserDemography> getAll();
}
