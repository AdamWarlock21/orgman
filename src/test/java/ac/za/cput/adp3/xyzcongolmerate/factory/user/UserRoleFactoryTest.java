package ac.za.cput.adp3.xyzcongolmerate.factory.user;


import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;


public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole user = UserRoleFactory.buildUserRole("bleep@mypcut.ac.za", "Ismail", "Vardien");
        System.out.println("The Users email is: " + user.getUserEmail());
        Assert.assertNotNull(user);

    }
}
