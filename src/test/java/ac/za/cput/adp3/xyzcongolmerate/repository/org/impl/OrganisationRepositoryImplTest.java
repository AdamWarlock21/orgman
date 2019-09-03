package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;
import java.util.Set;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationRepositoryImplTest {

   private OrganisationRepository repository;
private Organisation gender;

    @Before
    public void setUp() throws Exception {
        this.repository = OrganisationRepositoryImpl.getOrganisationRepository();
    }


    private Organisation getSavedGender(){
        Set<Organisation> savedGenders = this.repository.getAll();
        return savedGenders.iterator().next();

    }
    @Test
    public void a_create() {
            Organisation employee = OrganisationFactory.buildOrganisation("M");

        repository.create(employee);

        Organisation inRepo = repository.read(employee.getOrgCode());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_read() {
        Organisation employee = OrganisationFactory.buildOrganisation("M");

        repository.create(employee);

        Organisation inRepo = repository.read(employee.getOrgCode());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        String newName = "Other";
        Organisation gender = new Organisation.Builder().copy(getSavedGender()).orgName(newName).build();
        System.out.println("In update, about_to_update = " + gender);
        Organisation updated = this.repository.update(gender);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getOrgName());
    }

    @Test
    public void e_delete() {
        Organisation savedGender = getSavedGender();
        this.repository.delete(savedGender.getOrgName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
       Set<Organisation> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(gender);
    }
}