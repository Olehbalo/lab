package plane.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import plane.model.Plane;
import plane.repo.PlaneRepository;

import java.util.List;

@Service
@ApplicationScope
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    public Plane addPlane(Plane plane) {
        planeRepository.save(plane);
        return plane;
    }

    public List<Plane> getAllPlane() {
        return (List<Plane>) planeRepository.findAll();
    }

    public Plane getPlane(Integer id) {
        return planeRepository.findById(id).orElse(null);
    }

    public Plane updatePlane(Plane plane) {

        planeRepository.save(plane);
        return plane;
    }

    public Plane deletePlane(Integer id) {
        Plane plane = planeRepository.findById(id).orElse(null);
        planeRepository.deleteById(id);
        return plane;
    }

}
