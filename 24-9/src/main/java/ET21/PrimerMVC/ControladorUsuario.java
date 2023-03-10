package ET21.PrimerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class ControladorUsuario  {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private UsuarioRepositorio RepositorioUsuario;

  @PostMapping(path="/registro") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String Nombre, @RequestParam Integer Dni, @RequestParam String Apellido, @RequestParam String Rol, @RequestParam String Password, @RequestParam String Username) {
    
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Usuario n = new Usuario();
    n.setPassword(Password);
    n.setUsername(Username);
    n.setNombre(Nombre);
    n.setDni(Dni);
    n.setApellido(Apellido);
    n.setRol(Rol);
    RepositorioUsuario.save(n);
    return "Guardado pa";
  }
// https://spring.io/guides/gs/handling-form-submission/

   @GetMapping("/registro")
  public String greetingForm(Model model) {
    model.addAttribute("usuario", new Usuario());
    return "usuario.registro";
  }

  @GetMapping(path="/listadoregistro")
  public String getAllUsers(Model model) {
    model.addAttribute("usuarios", RepositorioUsuario.findAll());
    return "usuario.listado";
  }
}