 # Source-2it-exam 1st - algorithm
Para criaçao deste projeto foi utilizada a plataforma Java em sua versão 8 com maven

## Instalação e inicialicação da API
### Via Maven
```
git clone git@github.com:bernardolobato/source-2it-1st.git
cd source-2it-1st
mvn exec:java
```
### Para os testes
```
mvn test
```
## Consideraçoes
- Para implementaçao deste algoritmo eu utilizei uma variação do algoritmo de ordenaçao insertion sort. No caso deste projeto, insertionSortReverse, já que precisamos da ordem inversa.
- Esta implementaçao foi puramente para fins didáticos. Em um projeto *real* acredito que um *Collections.sort(arraylist, Collections.reverseOrder());* funcionaria adequadamente, trocando-se a estrutura de dados de array para List.
- Quaisquer problemas ou consideraçoes estou a disposiçao. bernardolobato@gmail.com
