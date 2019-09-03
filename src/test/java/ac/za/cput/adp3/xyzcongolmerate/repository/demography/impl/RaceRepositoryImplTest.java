package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;

import org.junit.FixMethodOrder;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {
    private RaceRepository repo;
    private Race race;

    private Race getSavedRace(){
        Set<Race> savedRaces = this.repo.getAll();
        return savedRaces.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repo = RaceRepositoryImpl.getRaceRepository();
        this.race = RaceFactory.buildRace("White");
    }


    @Test
    public void a_create() {
        Race created = this.repo.create(this.race);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.race);
        d_getAll();
    }

    @Test
    public void b_read() {
    Race created = this.repo.create(this.race);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.race);
        d_getAll();
    }

    @Test
    public void c_update() {
      String newName = "Asian";
        Race race = new Race.Builder().copy(getSavedRace()).raceDescription(newName).build();
        System.out.println("In update, about_to_update = " + race);
        Race updated = this.repo.update(race);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getRaceDescription());
    }

    @Test
    public void e_delete() {
        Race savedRace = getSavedRace();
        this.repo.delete(savedRace.getRaceId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Race> all = this.repo.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(race);
    }
}