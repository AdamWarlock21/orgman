package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import java.util.Set;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Before;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceServiceImplTest {

 private RaceServiceImpl raceService;
    private Race race;

    private Race getSavedRace(){
        Set<Race> savedRaces = this.raceService.getAll();
        return savedRaces.iterator().next();
    }

    @Before
    public void setUp(){
        this.raceService = RaceServiceImpl.getService();
        this.race = RaceFactory.buildRace( "Male");
    }

    @Test
    public void a_create(){
        Race created = this.raceService.create(this.race);
        System.out.println("In read, created=" + created);
        Assert.assertEquals(created, this.race);
    }

    @Test
    public void b_read(){
        Race savedRace = getSavedRace();
        System.out.println("In read, RaceId = "+ savedRace.getRaceId());
        Race read = this.raceService.read(savedRace.getRaceId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedRace, read);
    }

    @Test
    public void e_delete(){
        Race savedRace = getSavedRace();
        this.raceService.delete(savedRace.getRaceId());
        d_getAll();
    }

    @Test
    public void c_update(){
        String newName = "Reeeee";
        Race race = new Race.Builder().copy(getSavedRace()).raceDescription(newName).build();
        System.out.println("In update, about_to_update = " + race);
        Race updated = this.raceService.update(race);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(newName, updated.getRaceDescription());
    }

    @Test
    public void d_getAll(){
        Set<Race> all = this.raceService.getAll();
        System.out.println("In getAll, all = " + all);
        Assert.assertNotNull(race);
    }
}