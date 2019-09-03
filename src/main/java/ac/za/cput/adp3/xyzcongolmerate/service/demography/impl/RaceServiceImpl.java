package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    static RaceServiceImpl getService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private RaceRepository raceRepository;
    private static RaceService raceService = null;

    private RaceServiceImpl() {
        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceService getRaceService() {
        if (raceService == null) raceService = new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Race create(Race d) {
        return this.raceRepository.create(d);
    }

    @Override
    public Race read(String raceId) {
        return this.raceRepository.read(raceId);
    }

    @Override
    public Race update(Race race) {
        return this.raceRepository.update(race);
    }

    @Override
    public void delete(String raceId) {
        this.raceRepository.delete(raceId);
    }

    @Override
    public Set<Race> getAll() {
        return this.raceRepository.getAll();
    }
}
