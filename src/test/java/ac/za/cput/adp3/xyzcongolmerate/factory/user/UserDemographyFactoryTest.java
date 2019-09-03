package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;


public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("bleeep@mycput.ac.za", "Admin", "gender", "race", date);
        System.out.println("The User Demography Email is: " + userDemography.getUserEmail());
        Assert.assertNotNull(userDemography);
    }
}
