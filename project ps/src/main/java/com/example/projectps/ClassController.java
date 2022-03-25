package com.example.projectps;

import com.example.projectps.model.Barber;
import com.example.projectps.model.Client;
import com.example.projectps.model.Product;
import com.example.projectps.model.Service;
import com.example.projectps.service.BarberService;
import com.example.projectps.service.ClientService;
import com.example.projectps.service.ProductService;
import com.example.projectps.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/test")
public class ClassController {
    @Autowired
    private ClientService client;

    @Autowired
    private ServiceService service;

    @Autowired
    private BarberService barber;

    @Autowired
    private ProductService product;

    @GetMapping("/")
    public String welcome()
    {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    @PostMapping(path="/addClient/{idbarber}/{idservice}//{name}/{phonenumber}")
    public void addNewClient (@PathVariable("idbarber") int idbarber,
                                @PathVariable("idservice") int idservice,
                                @PathVariable("name") String name,
                                @PathVariable("phonenumber") String phonenumber) {
        Client cl = new Client();
        cl.setName(name);
        cl.setPhoneNumber(phonenumber);
        cl.setIdBarber(idbarber);
        cl.setIdService(idservice);

        client.addClient(cl);
    }

    @PostMapping(path="/addClient")
    public String addClient (@RequestBody Client cl) {
        client.addClient(cl);
        return "Saved";
    }

    @GetMapping(path="/service")
    public @ResponseBody Iterable<Service> getAllServices() {
        return service.getServices();
    }

    @GetMapping(path="/service/{idservice}")
    public @ResponseBody
    Optional<Service> getService(@PathVariable("idservice") int idservice) {
        return service.getByIdServices(idservice);
    }

    @GetMapping(path="/client")
    public @ResponseBody Iterable<Client> getAllClients() {
        return client.getClients();
    }

    @DeleteMapping(path="/deleteClient/{idclient}")
    public void deleteClient(@PathVariable("idclient") int idclient){
        client.deleteByIdClient(idclient);
    }

    @GetMapping(path="/barber")
    public @ResponseBody Iterable<Barber> getAllBarbers() {
        return barber.getBarbers();
    }

    @PostMapping(path="/addBarber/{name}/{phonenumber}/{services}/{image}")
    public void addNewBarber (@PathVariable("name") String name,
                              @PathVariable("phonenumber") String phonenumber,
                              @PathVariable("services") String services,
                              @PathVariable("image") String image) {
        Barber bar = new Barber();
        bar.setName(name);
        bar.setPhonenumber(phonenumber);
        bar.setServices(services);
        bar.setImage(image);

        barber.addBarber(bar);
    }
    @GetMapping(path="/product")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return product.getProducts();
    }

}