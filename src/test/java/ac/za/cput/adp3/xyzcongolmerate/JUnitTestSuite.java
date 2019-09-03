package ac.za.cput.adp3.xyzcongolmerate;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationUserFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserRoleFactoryTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.GenderRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.RaceRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl.RoleRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationUserRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserDemographyRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRoleRepositoryImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.impl.GenderServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.impl.RaceServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.misc.impl.RoleServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationUserServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserDemographyServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserRoleServiceImplTest;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        GenderFactoryTest.class,
        RaceFactoryTest.class,
        RoleFactoryTest.class,
        OrganisationFactoryTest.class,
        OrganisationUserFactoryTest.class,
        UserDemographyFactoryTest.class,
        UserFactoryTest.class,
        UserRoleFactoryTest.class,
        GenderRepositoryImplTest.class,
        RaceRepositoryImplTest.class,
        RoleRepositoryImplTest.class,
        OrganisationRepositoryImplTest.class,
        OrganisationUserRepositoryImplTest.class,
        UserDemographyRepositoryImplTest.class,
        UserRepositoryImplTest.class,
        UserRoleRepositoryImplTest.class,
        GenderServiceImplTest.class,
        RaceServiceImplTest.class,
        RoleServiceImplTest.class,
        OrganisationServiceImplTest.class,
        OrganisationUserServiceImplTest.class,
        UserDemographyServiceImplTest.class,
        UserRoleServiceImplTest.class,
        UserServiceImplTest.class

})

/**
 * DO NOT MODIFY
 */
public class JUnitTestSuite {
}
