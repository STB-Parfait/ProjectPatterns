# Avaliação sobre padrões de projeto

## Questão 1
__Padrão utilizado:__ _factory_

__Justificativa:__

  A problemátixa deixa claro que cada maneira de calcular o frete deve ter sua própria lógica e, ainda sim, ser tradada de forma "genérica", então o método factory pareceu apropriado.

## Questão 2
__Padrão utilizado:__ _abstract factory_

__Justificativa:__

  Assim como a _questão 1_, cada método de pagamento deve ter sua própria lógica e, ainda sim ser tratado de forma "genérica", além de precisar ser instanciado sem que o código principal
  precise saber sua lógica interna.

## Questão 3
__Padrão utilizado:__ _observer_

__Justificativa:__

  O observer foi escolhido já que, a própria problemática descreve um comportamento de observer, onde um usuário _observa_ um ou mais tópicos, ou _subjects_.

## Questão 4
__Padrão utilizado:__ _decorator_

__Justificativa:__

  Nesta questão era necessário que um relatório pudesse receber "adições", então o _decorator_ foi escolhido como solução, o relatório gera um relatório base que pode ser _decorado_ com
   adições como gráficos e estatísticas.
