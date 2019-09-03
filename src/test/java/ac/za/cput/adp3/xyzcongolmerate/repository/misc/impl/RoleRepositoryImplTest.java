package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;
import java.util.Set;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryImplTest {

  private RoleRepository repository;
private Role role;

    @Before
    public void setUp() throws Exception {
        this.repository = RoleRepositoryImpl.getRoleRepository();
    }


    private Role getSavedGender(){
        Set<Role> savedGenders = this.repository.getAll();
        return savedGenders.iterator().next();

    }
    @Test
    public void a_create() {
            Role employee = RoleFactory.buildRole("M");

        repository.create(employee);

        Role inRepo = repository.read(employee.getRoleId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_read() {
        Role employee = RoleFactory.buildRole("M");

        repository.create(employee);

        Role inRepo = repository.read(employee.getRoleId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        String newName = "Other";
        Role role = new Role.Builder().copy(getSavedGender()).roleName(newName).build();
        System.out.println("In update, about_to_update = " + role);
        Role updated = this.repository.update(role);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getRoleName());
    }

    @Test
    public void e_delete() {
        Role savedRole = getSavedGender();
        this.repository.delete(savedRole.getRoleId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
       Set<Role> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(role);
    }
}
