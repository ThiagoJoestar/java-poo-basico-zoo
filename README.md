
# Projeto Zoo

## Descrição
Este é um mini-projeto em Java que demonstra conceitos básicos de **Programação Orientada a Objetos (POO)**, utilizando classes e métodos abstratos. O projeto cria um pequeno "zoológico" com animais que possuem comportamento específico, como o som que emitem. Aqui, temos um exemplo de um animal do tipo `Gato` que emite um som característico ao ser instanciado.

## Funcionalidades
- Instanciar objetos que representam diferentes tipos de animais.
- Utilizar herança e métodos abstratos para definir comportamentos específicos para cada animal.
- Exibir informações sobre o animal e o som que ele emite.

## Estrutura do Projeto

### Arquivos principais

- **Animal.java**: Classe abstrata que representa um animal genérico. Contém atributos comuns (nome, espécie e sexo) e um método `emitirSom`, que pode ser sobrescrito por subclasses.
- **Gato.java**: Subclasse de `Animal` que implementa o método `emitirSom`, emitindo um som específico ("Miau! Miau!") para objetos do tipo `Gato`.
- **Main.java**: Classe principal que contém o método `main`, onde é criado um objeto `Gato` e invocados os métodos para definir atributos e emitir o som característico do animal.

## Classes

### Animal
- **Descrição**: Classe abstrata que define os atributos e o comportamento básico de um animal.
- **Atributos**:
  - `nome` (String): Nome do animal.
  - `especie` (String): Espécie do animal.
  - `sexo` (String): Sexo do animal.
- **Métodos**:
  - `getNome`, `setNome`: Obter e definir o nome do animal.
  - `getEspecie`, `setEspecie`: Obter e definir a espécie do animal.
  - `getSexo`, `setSexo`: Obter e definir o sexo do animal.
  - `emitirSom`: Método que pode ser sobrescrito pelas subclasses para emitir um som específico.

### Gato
- **Descrição**: Subclasse de `Animal` que representa um gato. Sobrescreve o método `emitirSom` para exibir o som característico de um gato ("Miau! Miau!").

### Main
- **Descrição**: Classe principal com o método `main`, onde o projeto é executado.
- **Função**:
  - Cria um objeto `Gato`, define seus atributos (`nome`, `especie`, `sexo`) e chama o método `emitirSom`.

## Como Executar

1. Certifique-se de que o Java está instalado no seu sistema. Você pode verificar a instalação com:
   ```bash
   java -version
   ```

2. Compile os arquivos `.java`:
   ```bash
   javac Main.java Animal.java Gato.java
   ```

3. Execute a classe principal `Main`:
   ```bash
   java Main
   ```

### Saída Esperada
```plaintext
Miau! Miau!
```

## Conceitos de Orientação a Objetos Aplicados

- **Herança**: A classe `Gato` herda de `Animal`, aproveitando os atributos e métodos da superclasse.
- **Polimorfismo**: O método `emitirSom` é sobrescrito na subclasse `Gato`, permitindo que cada tipo de animal tenha seu próprio som.
- **Encapsulamento**: Atributos como `nome`, `especie` e `sexo` são privados e acessados por métodos `get` e `set`.


## Licença

Este projeto é de uso livre para fins de estudo e aprendizado de Programação Orientada a Objetos em Java.
