package guiao7;

public class TestSistema {
    public static void main(String[] args) {
        Agencia agency = new Agencia("Teste", "Rua Feira de Marco");
        agency.addAlojamento(new Quarto("123456789","Quarto teste", "Aveiro", 58, TipoDeQuarto.DOUBLE));
        agency.addAlojamento(new Quarto("1234567891011","Quarto teste23", "Coimbra", 21, TipoDeQuarto.TRIPLE));
        agency.addAlojamento(new Apartamento("21342", "Ap teste", "Lisboa", 45.5, 3));
        agency.addViatura(new Viatura('A', Motorizacao.HIBRIDO));

        agency.listAlojamento();
        agency.listViaturas();
    }
    
}
