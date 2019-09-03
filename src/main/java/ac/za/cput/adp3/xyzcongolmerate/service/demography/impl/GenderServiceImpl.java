package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.GenderRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    static GenderServiceImpl GenderService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private GenderRepository genderRepository;
    private static GenderService genderService = null;

    private GenderServiceImpl() {
        this.genderRepository = GenderRepositoryImpl.genderRepository();
    }

    public GenderService getGenderService() {
        if (genderService == null) genderService = new GenderServiceImpl();
        return genderService;
    }

    @Override
    public Gender create(Gender d) {
        return this.genderRepository.create(d);
    }

    @Override
    public Gender read(String genderId) {
        return this.genderRepository.read(genderId);
    }

    @Override
    public Gender update(Gender gender) {
        return this.genderRepository.update(gender);
    }

    @Override
    public void delete(String genderId) {
        this.genderRepository.delete(genderId);
    }

    @Override
    public Set<Gender> getAll() {
        return this.genderRepository.getAll();
    }
}
