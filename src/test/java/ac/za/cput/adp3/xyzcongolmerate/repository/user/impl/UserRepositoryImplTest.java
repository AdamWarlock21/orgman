package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import java.util.Set;
import org.junit.Assert;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryImplTest {
     private UserRepository repo;
    private User user;

    private User getSavedUser(){
        Set<User> savedUsers = this.repo.getAll();
        return savedUsers.iterator().next();
    }
    
    @Before
    public void setUp() throws Exception{
        this.repo = UserRepositoryImpl.getUserRepository();
        this.user = UserFactory.buildUser("bleep@mycput.ac.za", "I", "V");
    }
    
    @Test
    public void a_create() {
        User created = this.repo.create(this.user);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.user);
        d_getAll();
    }

    @Test
    public void b_read() {
        User savedUser = getSavedUser();
        System.out.println("In read, UserEmail = "+ savedUser.getUserEmail());
        User read = this.repo.read(savedUser.getUserEmail());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedUser, read);
    }

    @Test
    public void c_update() {
        String newName = "What";
        User user = new User.Builder().copy(getSavedUser()).firstName(newName).build();
        System.out.println("In update, about_to_update = " + user);
        User updated = this.repo.update(user);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getFirstName());
    }

    @Test
    public void e_delete() {
        User savedUser = getSavedUser();
        this.repo.delete(savedUser.getUserEmail());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<User> all = this.repo.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(user);
    }
}