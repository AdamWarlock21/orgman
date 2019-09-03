package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class OrganisationFactory {
private static final String SUFFIX = Helper.getSuffixFromClassName(OrganisationFactory.class);

    public static Organisation buildOrganisation(String organisationName) {
        return new Organisation.Builder().
                orgCode(Helper.generateRandomGivenSuffix(SUFFIX)).
                orgName(organisationName).
                build();
    }
}
