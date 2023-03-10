package ET21.PrimerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Optional;


@Controller // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class ControladorInscripcion  {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private InscripcionRepositorio RepositorioInscripcion;
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private ClaseRepositorio RepositorioClase;

  @PostMapping(path="/inscripcion") // Map ONLY POST Requests
  public @ResponseBody String addInscripcion (@RequestParam Integer clase){
    
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Inscripcion n = new Inscripcion(); 
    n.setClase(clase);
    n.setUsuario(2); // TODO: Get User id from session
    n.setEstado(false);
    RepositorioInscripcion.save(n);
    return "Guardado pa";
  }

  @PostMapping(path="/confirmacion") // Map ONLY POST Requests
  public @ResponseBody String confirmarTurno (@RequestParam Integer idInscripcion, @RequestParam Boolean Estado){
    
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Optional <Inscripcion> optional = RepositorioInscripcion.findById(idInscripcion);

      if (!optional.isPresent()) 
          return "Inscripci??n no encontrado";

      Inscripcion n = optional.get();

      n.setEstado(Estado);
      RepositorioInscripcion.save(n);
      return "Confirmado pa";
   
  }
// https://spring.io/guides/gs/handling-form-submission/

   @GetMapping("/inscripcion")
  public String greetingForm(Model model) {
    model.addAttribute("inscripcion", new Inscripcion());
    model.addAttribute("clases", RepositorioClase.findAll());
    return "inscripcion.clase";
  }
    @GetMapping(path="/listadoinscripcion")
  public String getAllinscripcion(Model model) {
    model.addAttribute("inscripciones", RepositorioInscripcion.findAll());
    return "inscripcion.listado";
  }
    @GetMapping("/confirmacion")
  public String greetingFom(Model model) {
    model.addAttribute("confirmacion", new Inscripcion());
    return "inscripcion.confirmacion";
  }
}