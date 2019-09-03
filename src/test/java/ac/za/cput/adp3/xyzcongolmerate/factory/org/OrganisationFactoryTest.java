package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;


public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation org = OrganisationFactory.buildOrganisation("CPUT");
        Assert.assertNotNull(org);
    }
}