package Services;


import Repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteServices {

    @Autowired
    private EstudanteRepository estudanteRepository;
}
