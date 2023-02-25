package ET21.PrimerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.time.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class ControladorClase  {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private ClaseRepositorio RepositorioClase;

  @PostMapping(path="/nuevaclase") // Map ONLY POST Requests
  public @ResponseBody String addClase (@RequestParam LocalTime Hora, @RequestParam String Ubicacion, @RequestParam LocalDate Fecha){
    
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Clase n = new Clase(); 
    n.setHora(Hora);
    n.setUbicacion(Ubicacion);
    n.setFecha(Fecha);
    RepositorioClase.save(n);
    return "Guardado pa";
  }
// https://spring.io/guides/gs/handling-form-submission/

   @GetMapping("/nuevaclase")
  public String greetingForm(Model model) {
    model.addAttribute("clase", new Clase());
    return "clase.nuevaclase";
  }

  @GetMapping(path="/listadoclase")
  public String getAllUsers(Model model) {
    model.addAttribute("clases", RepositorioClase.findAll());
    return "clase.listado";
  }
}