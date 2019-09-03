package ac.za.cput.adp3.xyzcongolmerate.repository.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.repository.IRepository;

import java.util.Set;

public interface RoleRepository extends IRepository<Role, String> {

    Set<Role> getAll();
}
