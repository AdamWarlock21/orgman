package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;


public class RaceFactoryTest {

    @Test
    public void buildRace() {
         Race race = RaceFactory.buildRace("African");
         Assert.assertNotNull(race.getRaceId());
         System.out.println("Race Id is: " + race.getRaceId());
    }
}
