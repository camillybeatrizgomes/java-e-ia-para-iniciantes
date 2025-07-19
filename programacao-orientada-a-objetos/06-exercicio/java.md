# 🧬 Herança e Polimorfismo em Java

## 👨‍👩‍👦 Herança

Herança é um conceito da programação orientada a objetos onde **uma classe (filha)** pode **herdar atributos e métodos** de outra **classe (pai)**.

### ✅ Vantagens:
- Reutilização de código
- Organização hierárquica
- Redução de repetição

### ⚠️ Java **não** permite herança múltipla de classes!
```java
class Animal {
    void comer() {
        System.out.println("Comendo...");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Latindo...");
    }
}
````

## 🔒 `sealed` vs `final`

### `sealed`

Uma classe **sealed** (selada) é uma forma de limitar quem pode estender (herdar) essa classe. Ou seja, só algumas classes específicas poderão ser filhas dela, e isso é decidido explicitamente pelo próprio código da classe **sealed**.

```java
public sealed class Veiculo permits Carro, Moto {}

public final class Carro extends Veiculo {}
public non-sealed class Moto extends Veiculo {}
```

### `final`

**Impede completamente** qualquer herança.

```java
public final class Util {}
```

---

## 🧩 Polimorfismo

Polimorfismo é a capacidade de um objeto se comportar de **formas diferentes** dependendo do contexto.

### 🧠 Tipos:

1. **Polimorfismo de Sobrescrita (Override)**
   Redefinir métodos da superclasse:

   ```java
   class Animal {
       void fazerSom() {
           System.out.println("Som genérico");
       }
   }

   class Gato extends Animal {
       void fazerSom() {
           System.out.println("Miau");
       }
   }
   ```

2. **Polimorfismo de Sobrecarga (Overload)**
   Mesmo nome de método com parâmetros diferentes:

   ```java
   class Soma {
       int somar(int a, int b) { return a + b; }
       double somar(double a, double b) { return a + b; }
   }
   ```

---

### ✅ Benefícios do Polimorfismo:

* Código mais reutilizável
* Mais flexibilidade
* Facilita a manutenção


