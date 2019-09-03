package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;


public class UserFactoryTest {

    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("bleep@mypcut.ac.za", "Ismail", "Vardien");
        Assert.assertNotNull(user);
    }
}