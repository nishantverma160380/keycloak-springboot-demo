package nhs.gps;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
class GpRepository {

    private static List<Gp> gps = Arrays.asList(
            new Gp(1L,"Liverpool","Family Practice","Grove Street Edge Hill Merseyside","L7 7HG","UK","0151 295 3888","familyPractice@nhs."),
            new Gp(1L,"Liverpool","Family Health Care Centre","361-365 Queens Drive Walton Merseyside","L4 8SJ","UK","0151 226 1501","familyHealth@nhs."),
            new Gp(1L,"Liverpool","Park Group Practice","Oriel Drive Aintree","L10 6NJ","UK","0151 295 8350","parkGroup1@nhs."),
            new Gp(1L,"Liverpool","Park Group Practice 1","46 Moss Lane Orrell Park","L9 8AL","UK","0151 295 8350","parkGroup1@nhs."),
            new Gp(1L,"Liverpool","Surgery","45 Everton Road  Merseyside","L6 2EH","UK","0151 300 8302","surgery@nhs.")

    );

    List<Gp> findAll() {
        return gps;
    }

    Gp findOne(Long id) {
        return gps.stream().filter(gp -> gp.getId().equals(id)).findFirst().get();
    }
}
