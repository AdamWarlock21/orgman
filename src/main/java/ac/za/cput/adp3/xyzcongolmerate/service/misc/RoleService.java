package ac.za.cput.adp3.xyzcongolmerate.service.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.service.IService;

import java.util.Set;

public interface RoleService extends IService<Role, String> {
    Set<Role> getAll();
}
