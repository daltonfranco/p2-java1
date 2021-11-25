
public class testaFuncionario{
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Programador", 5000.00);

        System.out.println("Seu cargo é --> "+f.getCargo());
        System.out.println("Seu salario é --> "+f.getSalario());

    }

}