package rest.resources;

import entities.Employe;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("employe")
public class employeRessource {

    static List<Employe> employes = new ArrayList<Employe>();

    @GET
    @Produces("application/json")
    public List<Employe> getAll()
    {
        return employes;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/plain")
    public String addEmp(Employe emp)
    {
        if(employes.add(emp))
            return "employe ajouté";

        return "employe non ajouté";
    }

    @PUT
    @Path("/update")
    @Consumes("application/json")
    @Produces("text/plain")
    public String updateEmp(Employe emp)
    {
        for(Employe e : employes)
        {
            if(e.getCin() == emp.getCin())
            {
                e.setNom(emp.getNom());
                e.setPrenom(emp.getPrenom());
                return "employe modifié";
            }
        }

        return "employe non modifié";
    }

    @DELETE
    @Path("/delete/{cin}")
    @Produces("text/plain")
    public String deleteEmp(@PathParam("cin") String cin) {
        for (Employe emp : employes) {
            if (emp.getCin() == cin) {
                employes.remove(emp);
                return "Employe supprimé";
            }
        }
        return "Employe non trouvé";
    }



}