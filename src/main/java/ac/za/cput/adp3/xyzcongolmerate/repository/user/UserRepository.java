package ac.za.cput.adp3.xyzcongolmerate.repository.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.IRepository;

import java.util.Set;

public interface UserRepository extends IRepository<User, String> {

    Set<User> getAll();
}
