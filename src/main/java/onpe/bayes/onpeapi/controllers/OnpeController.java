package onpe.bayes.onpeapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import onpe.bayes.onpeapi.models.ActasNumero;
import onpe.bayes.onpeapi.models.Departamentos;
import onpe.bayes.onpeapi.models.Distritos;
import onpe.bayes.onpeapi.models.GrupoVotacion;
import onpe.bayes.onpeapi.models.LocalesVotacion;
import onpe.bayes.onpeapi.models.Provincia;
import onpe.bayes.onpeapi.repository.IActasNumero;
import onpe.bayes.onpeapi.repository.IDepartamentos;
import onpe.bayes.onpeapi.repository.IDistritos;
import onpe.bayes.onpeapi.repository.IGruposVotacion;
import onpe.bayes.onpeapi.repository.ILocalVotacion;
import onpe.bayes.onpeapi.repository.IProvincias;

@RestController
@RequestMapping
@CrossOrigin
@Configuration
public class OnpeController extends WebMvcAutoConfiguration {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Autowired
    private IActasNumero actasNumero;
    @Autowired
    private IDepartamentos departamentos;
    @Autowired
    private IProvincias provincias;
    @Autowired
    private IDistritos distritos;
    @Autowired
    private ILocalVotacion localVotacion;
    @Autowired
    private IGruposVotacion gruposVotacion;

    @GetMapping("/actas/{num}")
    public List<ActasNumero> getActasNumero(@PathVariable("num") String num) {
        return (List<ActasNumero>) actasNumero.getActasNumero(num);
    }

    @GetMapping("/ubigeo/{tipo}")
    public List<Departamentos> getDepartamentos(@PathVariable("tipo") String tipo) {
        int ini = 0;
        int fin = 0;
        if(tipo.equals("Peru")){
            ini = 1;
            fin = 25;
        }else if(tipo.equals("Extranjero")){
            ini = 26;
            fin = 30;
        }
        return (List<Departamentos>) departamentos.getDepartamentos(ini, fin);
    }

    @GetMapping("/ubigeo/{tipo}/{id}")
    public List<Provincia> getProvincias(@PathVariable("id") String id) {
        return (List<Provincia>) provincias.getProvincias(id);
    }

    @GetMapping("/ubigeo/{tipo}/{id}/{id2}")
    public List<Distritos> getDistritos(@PathVariable("id2") String id2) {
        return (List<Distritos>) distritos.getDistritos(id2);
    }

    @GetMapping("/ubigeo/{tipo}/{id}/{id2}/{id3}")
    public List<LocalesVotacion> getLocalesVotacion(@PathVariable("id2") String id2,@PathVariable("id3") String id3) {
        return (List<LocalesVotacion>) localVotacion.getLocalesVotacion(id2, id3);
    }

    @GetMapping("/ubigeo/{tipo}/{id}/{id2}/{id3}/{id4}")
    public List<GrupoVotacion> getGruposVotacion(@PathVariable("id2") String id2,@PathVariable("id3") String id3,@PathVariable("id4") String id4) {
        return (List<GrupoVotacion>) gruposVotacion.getGruposVotacion(id2, id3, id4);
    }

    @GetMapping("/ubigeo/{tipo}/{id}/{id2}/{id3}/{id4}/{id5}")
    public List<ActasNumero> getActaNumero(@PathVariable("id5") String id5) {
        return (List<ActasNumero>) actasNumero.getActaNumero(id5);
    }
    

}
