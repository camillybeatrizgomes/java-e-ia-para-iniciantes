package questao_2;

public class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean admin;

    public Usuario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public void realizarLogin() {
        System.out.println(nome + " realizou login.");
    }

    public void realizarLogoff() {
        System.out.println(nome + " realizou logoff.");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso.");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return admin;
    }
}

