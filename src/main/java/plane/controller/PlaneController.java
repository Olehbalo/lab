package plane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import plane.model.Plane;
import plane.service.PlaneService;

import java.util.List;

@RestController
@RequestMapping("/plane")
@CrossOrigin(origins = "*")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @GetMapping("/{id}")
    public Object getPlane(@PathVariable(name = "id") Integer id) {
        if (planeService.getPlane(id) != null) {
            return planeService.getPlane(id);
        } else {
            return new ResponseEntity<Plane>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin
    @GetMapping()
    public List<Plane> getAllPlane() {
        return planeService.getAllPlane();
    }
    @CrossOrigin
    @PostMapping()
    public Plane addPlane(@RequestBody Plane plane) {
        return planeService.addPlane(plane);
    }
    @CrossOrigin
    @PutMapping()
    public Object updatePlane(@RequestBody Plane plane) {
        if (planeService.getPlane(plane.getId()) != null) {
            return planeService.updatePlane(plane);
        } else {
            return new ResponseEntity<Plane>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin
    @DeleteMapping("/{id}")
    public Object deletePlane(@PathVariable(name = "id") Integer id) {
        if (planeService.getPlane(id) != null) {
            return planeService.deletePlane(id);
        } else {
            return new ResponseEntity<Plane>(HttpStatus.NOT_FOUND);
        }
    }
}
