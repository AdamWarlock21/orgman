package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserDemographyRepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import java.util.Set;
import org.junit.Assert;
import org.junit.runners.MethodSorters;
import java.util.Date;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDemographyRepositoryImplTest {
private UserDemographyRepository repo;
private UserDemography user;

    private UserDemography getSavedUser(){
        Set<UserDemography> savedUsers = this.repo.getAll();
        return savedUsers.iterator().next();
    }
    @Before
    public void setUp() throws Exception{
        Date date = new Date();
        this.repo = UserDemographyRepositoryImpl.getUserDemographyRepository();
        this.user = UserDemographyFactory.buildUserDemography("bleep@mycput.ac.za", "Admin", "1", "1",date);
    }
    @Test
    public void a_create() {
        UserDemography created = this.repo.create(this.user);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.user);
        d_getAll();
    }

    @Test
    public void b_read() {
        UserDemography savedUser = getSavedUser();
        System.out.println("In read, UserEmail = "+ savedUser.getUserEmail());
        UserDemography read = this.repo.read(savedUser.getUserEmail());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedUser, read);
    }

    @Test
    public void c_update() {
        String newName = "What";
        //UserDemography user = new UserDemography.Builder().(getSavedUser()).getUserEmail(newName).build();
        System.out.println("In update, about_to_update = " + user);
        UserDemography updated = this.repo.update(user);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getUserEmail());
    }

    @Test
    public void e_delete() {
        UserDemography savedUser = getSavedUser();
        this.repo.delete(savedUser.getUserEmail());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<UserDemography> all = this.repo.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(user);
    }
}
