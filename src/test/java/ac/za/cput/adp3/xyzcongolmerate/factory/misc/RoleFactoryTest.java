package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;


public class RoleFactoryTest {

    @Test
    public void buildRole() {
    Role role = RoleFactory.buildRole("Admin");
        Assert.assertNotNull(role);
    }
}