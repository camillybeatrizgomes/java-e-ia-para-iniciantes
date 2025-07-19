package questao_3;

public class MaquinaDeBanho {
    private boolean limpa = true;
    private int agua = 30;
    private int shampoo = 2;
    private Pet pet;

    public boolean isLimpa() {
        return limpa;
    }

    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        if (!this.limpa) {
            System.out.println("A máquina está suja para colocar o pet. É necessário limpá-la primeiro.");
        }
        this.pet = pet;
    }

    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }
        this.shampoo -= 2;
        this.agua -= 10;
        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " está limpo.");
    }

    public void adicionarAgua() {
        if (agua == 30){
            System.out.println("A capacidade máxima de água foi atingida.");
            return;
        }
        agua += 2;
    }

    public void adicionarShampoo() {
        if (shampoo == 10){
            System.out.println("A capacidade máxima de shampoo foi atingida.");
            return;
        }
        shampoo += 2;
    }

    public boolean temPet() {
        return pet != null;
    }

    public void removerPet() {
        this.limpa = this.pet.isLimpo();
        System.out.println("O pet " + pet.getNome() + " foi removido da máquina.");
        this.pet = null;
    }

    public void lavar() {
        this.shampoo -= 2;
        this.agua -= 10;
        this.limpa = true;
        System.out.println("A máquina está limpa.");
    }
}
