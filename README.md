## O desafio consiste em
"2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. "

## Como eu fiz
Com base nos dados fornecidos na questão eu elaborei algumas formas de fazer o código
### Python
Em python eu abordei um conceito de isolamento, tratando a sequência como uma classe e dando atenção a importação. Garanti que o dado enviado seria um número por meio de try-except e com uma validação armazenada na variável para poupar código escrito no try. 
Também considerei a possibilidade de que os números da sequência seriam utilizados posteriormente e os guardei em um array, depois verificando se o número estava no array.
### NODE / JavaScript
No node eu optei por fazer uma abordagem rápida e direta ao ponto, a ideia de que "só preciso de um programa que faça exatamente isso", seguindo a ideia de YAGNI, se não for necessário, não faça. Inclusive, por seguir esta metodologia, evitei tratar excessões.
Em javascript a abordagem foi direta, o retorno já foi a frase pronta e ela só foi exibida, já que não seria necessário mais nenhuma implementação
### Java
Em java, embora não tenha tratado em classes isoladas, eu prezei pela possibilidade de extensão do programa. Com isso, fiz com que o valor retornado fosse apenas um boleano dizendo se está ou não, true or false, com isso teria certeza de que, caso necessário, essa validação poderia ser extendida.
Para que tivesse alguma validação de retorno em texto, fiz uma saída com um ternário baseado na resposta do boleano. Poderia ainda ter compilado e baseado a resposta nos valores recebidos do args por um loop ou outras formas.

## Sobre as possibilidades
Embora eu não tenha utilizado de interface gráfica em nenhuma por não ser necessário, é algo que sei utilizar e não seria problema no futuro. Todos estes códigos podem ser expandidos para interface gráfica facilmente.
