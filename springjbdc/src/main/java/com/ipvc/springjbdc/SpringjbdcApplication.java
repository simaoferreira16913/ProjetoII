package com.ipvc.springjbdc;

import com.ipvc.springjbdc.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


@SpringBootApplication
public class SpringjbdcApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringjbdcApplication.class, args);
    }
    @Override
    public void run ( String... args) throws Exception{
 /*       String qCliente = "SELECT * FROM CLIENTE";

        List<Cliente> clientes = jdbcTemplate.query(qCliente,
                BeanPropertyRowMapper.newInstance(Cliente.class));
        clientes.forEach(System.out::println);

        String qArmazem = "SELECT * FROM ARMAZEM";

        List<Armazem> armazems = jdbcTemplate.query(qArmazem,
                BeanPropertyRowMapper.newInstance(Armazem.class));

       armazems.forEach(System.out::println);
  */
        String mquery = "SELECT * FROM Fatura_FORNECEDOR";
        List<Fatura_Fornecedor> fatura_fornecedors = jdbcTemplate.query(mquery,
                BeanPropertyRowMapper.newInstance(Fatura_Fornecedor.class));
        fatura_fornecedors.forEach(System.out::println);
    }
}
