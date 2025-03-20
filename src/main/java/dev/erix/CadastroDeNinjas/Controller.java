package dev.erix.CadastroDeNinjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    //GET PARA "PEGAR" AS INFORMAÇÕES
    @GetMapping("/boasVindas")// isso faz: "localhost:8080/boasVindas"
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
