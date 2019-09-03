package ac.za.cput.adp3.xyzcongolmerate.service.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.service.IService;

import java.util.Set;

public interface UserService extends IService<User, String> {
    
    Set<User> getAll();
}
