void main() {

    Desenvolvedor desenvolvedor = new Desenvolvedor("stacy", "47704610860", 3000, "Java");
    Gerente gerente = new Gerente("Lucas", "12345678907", 5000, 50);


    IO.println(desenvolvedor);
    desenvolvedor.aumento();
    IO.println(desenvolvedor);

    IO.println(gerente);
    gerente.aumento();
    IO.println(gerente);
}