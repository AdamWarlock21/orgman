package ac.za.cput.adp3.xyzcongolmerate.factory.org;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;

import org.junit.Test;


public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser("1", "bleep@cput.ac.za");
        System.out.println("The User Email is: " + orgUser.getUserEmail());

        Assert.assertNotNull(orgUser);
    }
}
