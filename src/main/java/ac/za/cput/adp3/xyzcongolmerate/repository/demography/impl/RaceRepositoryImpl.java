package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class RaceRepositoryImpl implements RaceRepository {

    private Set<Race> raceDB;
    private static RaceRepository raceRepository = null;

    private RaceRepositoryImpl() {
        this.raceDB = new HashSet<>();
    }

    public static RaceRepository getRaceRepository() {
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }


    @Override
    public Race create(Race race) {
        this.raceDB.add(race);
        return race;
    }


    @Override
    public Race read(String raceId) {
        return raceDB.stream().filter(race -> race.getRaceId() == raceId).findAny().orElse(null);

    }

    @Override
    public Race update(Race race) {
        Race toDelete = read(race.getRaceId());

        if(toDelete != null) {
            raceDB.remove(toDelete);
            return create(race);
        }
        return null;
    }


    @Override
    public boolean delete(String raceId) {
        Race toDelete = this.read(raceId);

        if (toDelete != null){
            this.raceDB.remove(toDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<Race> getAll() {
        return raceDB;
    }
}
