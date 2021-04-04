package sqa.hanu_minimart.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sqa.hanu_minimart.model.Role;
import sqa.hanu_minimart.model.RoleName;
import sqa.hanu_minimart.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RoleConfig {
//     @Bean
//     CommandLineRunner orderLineCommandLineRunner(RoleRepository roleRepository) {
//         return args -> {
//             Role r1 = new Role();
//             r1.setName(RoleName.ROLE_ADMIN);
//             Role r2 = new Role();
//             r2.setName(RoleName.ROLE_CUSTOMER);
//             Role r3 = new Role();
//             r3.setName(RoleName.ROLE_EMPLOYEE);
//             List<Role> list = new ArrayList<>();
//             list.add(r1);
//             list.add(r2);
//             list.add(r3);
//             try {
//                 roleRepository.saveAll(list);
//             }catch (Exception e){
//                 System.out.println("Already have admin role!");;
//             }
//         };
//     }
}
