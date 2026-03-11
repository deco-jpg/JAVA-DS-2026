package org.example.atividade3;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "5", "Casa Roxa", "40417-198", "Wakanda");
        Engenheiro engenheiro1 = new Engenheiro("Alvaro","alvaro@gmail.com",5.000, endereco1, "sei la" );
        Medico medico1 = new Medico("Gabrielle", "gabrielle@gmail.com", 1600,
                new Endereco("Rua A", "6","Casa Red", "29048328", "salvador"),
        "321321021307");
        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
    }


}
