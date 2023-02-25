package ET21.PrimerMVC;

import org.springframework.data.repository.CrudRepository;

import ET21.PrimerMVC.Inscripcion;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface InscripcionRepositorio extends CrudRepository<Inscripcion, Integer> {

}