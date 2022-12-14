package petclinicproject.springdemo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinicproject.springdemo.model.Owner;
import petclinicproject.springdemo.model.Vet;
import petclinicproject.springdemo.services.OwnerService;
import petclinicproject.springdemo.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("ibrahim");
        owner1.setLastName("zeroual");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("3abslam");
        owner2.setLastName("zozo");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        Vet vet2 = new Vet();

        vet1.setFirstName("tbib1");
        vet2.setFirstName("tbib2");

        vetService.save(vet1);
        vetService.save(vet2);
    }
}
