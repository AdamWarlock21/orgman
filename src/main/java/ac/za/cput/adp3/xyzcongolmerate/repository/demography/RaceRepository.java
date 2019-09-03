package ac.za.cput.adp3.xyzcongolmerate.repository.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {

    Set<Race> getAll();
}
