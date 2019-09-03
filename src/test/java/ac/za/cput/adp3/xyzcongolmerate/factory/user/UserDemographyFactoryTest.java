package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;


public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDem = UserDemographyFactory.buildUserDemography("bleep@cput.ac.za", "Admin", "F", "1",(1994-05-13));
        Assert.assertNotNull(userDem);
    }
}