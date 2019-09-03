package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import java.util.Set;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderServiceImplTest {
private GenderServiceImpl genderService;
    private Gender gender;

    private Gender getSavedGender(){
        Set<Gender> savedGenders = this.genderService.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp(){
        this.genderService = GenderServiceImpl.GenderService();
        this.gender = GenderFactory.buildGender( "Male");
    }

    @Test
    public void a_create(){
        Gender created = this.genderService.create(this.gender);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.gender);
    }

    @Test
    public void b_read(){
        Gender savedGender = getSavedGender();
        System.out.println("In read, GenderId = "+ savedGender.getGenderId());
        Gender read = this.genderService.read(savedGender.getGenderId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedGender, read);
    }

    @Test
    public void e_delete(){
        Gender savedGender = getSavedGender();
        this.genderService.delete(savedGender.getGenderId());
        d_getAll();
    }

    @Test
    public void c_update(){
        String newName = "Reeeee";
        Gender gender = new Gender.Builder().copy(getSavedGender()).genderDescription(newName).build();
        System.out.println("In update, about_to_update = " + gender);
        Gender updated = this.genderService.update(gender);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getGenderDescription());
    }

    @Test
    public void d_getAll(){
        Set<Gender> all = this.genderService.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(gender);
    }
}