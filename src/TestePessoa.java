public class TestePessoa {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("João");
        fornecedor1.setEndereco("Rua A");
        fornecedor1.setTelefone("1111-1111");
        fornecedor1.setValorCredito(10000);
        fornecedor1.setValorDivida(5000);
        System.out.println("Saldo do Fornecedor: " + fornecedor1.obterSaldo());

        Administrador administrador1 = new Administrador();
        administrador1.setNome("Maria");
        administrador1.setSalarioBase(8000);
        administrador1.setImposto(10);
        administrador1.setAjudaDeCusto(2000);
        System.out.println("Salário do Administrador: " + administrador1.calcularSalario());

        Operario operario1 = new Operario();
        operario1.setNome("Carlos");
        operario1.setSalarioBase(3000);
        operario1.setImposto(5);
        operario1.setValorProducao(5000);
        operario1.setComissao(3);
        System.out.println("Salário do Operário: " + operario1.calcularSalario());

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Lucas");
        vendedor1.setSalarioBase(2500);
        vendedor1.setImposto(10);
        vendedor1.setValorVendas(10000);
        vendedor1.setComissao(5);
        System.out.println("Salário do Vendedor: " + vendedor1.calcularSalario());
    }
}
