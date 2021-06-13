/**
 * package com.sda.dianalenter.webshop;
 *
 * import com.sda.dianalenter.webshop.model.Account;
 * import com.sda.dianalenter.webshop.model.Customer;
 * import com.sda.dianalenter.webshop.model.Product;
 * import com.sda.dianalenter.webshop.model.ProductCategory;
 * import com.sda.dianalenter.webshop.repository.AccountRepository;
 * import com.sda.dianalenter.webshop.service.CustomerService;
 * import com.sda.dianalenter.webshop.service.MailService;
 * import com.sda.dianalenter.webshop.service.OrderService;
 * import com.sda.dianalenter.webshop.service.ProductService;
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.boot.CommandLineRunner;
 * import org.springframework.boot.SpringApplication;
 * import org.springframework.boot.autoconfigure.SpringBootApplication;
 * import org.springframework.boot.autoconfigure.domain.EntityScan;
 * import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 * import org.springframework.transaction.annotation.EnableTransactionManagement;
 *
 * import java.util.Arrays;
 *
 * @SpringBootApplication
 * @EnableTransactionManagement
 * @EnableJpaRepositories(basePackages = "com.sda.dianalenter.webshop.repository")
 * @EntityScan(basePackages = "com.sda.dianalenter.webshop.model")
 * public class WebshopApplication implements CommandLineRunner {
 *     @Autowired
 *     private CustomerService customerService;
 *
 *     @Autowired
 *     private MailService mailService;
 *
 *     @Autowired
 *     private ProductService productService;
 *     @Autowired
 *     private OrderService orderService;
 *
 *     @Autowired
 *     private AccountRepository accountRepository;
 *
 *
 *     public static void main(String[] args) {
 *         SpringApplication.run(WebshopApplication.class, args);
 *     }
 *
 *     @Override
 *     public void run(String... args) throws Exception {
 *         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
 *         context.refresh();
 *
 *
 *         //put here your code
 *         Account account1 = new Account();
 *         account1.setId(1L);
 *         Customer customer1 = new Customer();
 *         customerService.addCustomer(account1, customer1);
 *
 *         customerService.getCustomerAccounts().forEach(System.out::println);
 *
 * //        mailService.sendMail("dianacurca20@gmail.com",
 * //                "client@gmail.com",
 * //                "Mock mail subject",
 * //                "Mock mail subject");
 * //
 * //        accountRepository.findAllByIsClosed(false).forEach(System.out::println);
 * //        accountRepository.findAllByBillingAddressIsContaining("Hu").forEach(System.out::println);
 *
 *         Product product1 = new Product("ice cream", "ice cream", 1.50, "EUR", ProductCategory.PET_FOOD);
 *         productService.save(product1);
 *         productService.findAll().forEach(System.out::println);
 *
 *         orderService.save(customer1, Arrays.asList(product1));
 *     }
 *
 * }
 */
