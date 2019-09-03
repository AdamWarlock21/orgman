package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class RoleFactory {

private static final String SUFFIX = Helper.getSuffixFromClassName(RoleFactory.class);
    
    public static Role buildRole(String roleName) {
        return new Role.Builder().
                roleId(Helper.generateRandomGivenSuffix(SUFFIX)).
                roleName(roleName).
                build();
    }
}
