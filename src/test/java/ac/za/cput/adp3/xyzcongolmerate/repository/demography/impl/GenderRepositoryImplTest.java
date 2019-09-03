package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import java.util.Set;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {
private GenderRepository repository;
private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.genderRepository();
    }


    private Gender getSavedGender(){
        Set<Gender> savedGenders = this.repository.getAll();
        return savedGenders.iterator().next();

    }
    @Test
    public void a_create() {
            Gender employee = GenderFactory.buildGender("M");

        repository.create(employee);

        Gender inRepo = repository.read(employee.getGenderId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_read() {
        Gender employee = GenderFactory.buildGender("M");

        repository.create(employee);

        Gender inRepo = repository.read(employee.getGenderId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        String newName = "Other";
        Gender gender = new Gender.Builder().copy(getSavedGender()).genderDescription(newName).build();
        System.out.println("In update, about_to_update = " + gender);
        Gender updated = this.repository.update(gender);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getGenderDescription());
    }

    @Test
    public void e_delete() {
        Gender savedGender = getSavedGender();
        this.repository.delete(savedGender.getGenderId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
       Set<Gender> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(gender);
    }
}