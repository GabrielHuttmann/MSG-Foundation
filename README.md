# Release 1.0.0
### 1. Arrumar Indentação do Código
- Reorganizar a Indentação do Código em Geral, buscando uma melhor visibilidade, simplicidade e manutenibilidade.

### 2. Remover métodos desnecessários da classe Mortgage
- Remover o método printAll()  que é desnecessário na classe Mortgage.

### 3. Unificação das MortgageReport e InvestmentReport
- Realizar a unificação das classes MortgageReport e InvestmentReport em uma única classe chamada Report.

### 4. Reestruturar métodos manageMortgage e manageInvestment da classe AssetManager
- Reestruturar esses métodos, criar enums para substituir os switchs, remover while reduntante e trycatch desnecessário.

### 5. Refatorar do Método read() da Classe Mortgage
- Substituir os laços de repetição while desse método pelo método split da classe String, atribuindo os valores resultantes em vetor a suas devidas variáveis.

### 6. Refatorar do Método write() da Classe Mortgage
- Refatorar parâmetro e substituir as diversas chamadas ao método “writeBytes” por uma única chamada passando como parâmetro uma string concatenada.
