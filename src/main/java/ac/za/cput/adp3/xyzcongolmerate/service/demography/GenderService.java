package ac.za.cput.adp3.xyzcongolmerate.service.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.service.IService;


import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set <Gender> getAll();
}
