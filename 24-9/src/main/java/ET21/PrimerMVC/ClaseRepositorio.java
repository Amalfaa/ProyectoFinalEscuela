package ET21.PrimerMVC;

import org.springframework.data.repository.CrudRepository;

import ET21.PrimerMVC.Clase;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ClaseRepositorio extends CrudRepository<Clase, Integer> {

}