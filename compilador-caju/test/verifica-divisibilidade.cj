vazio verifica_divisivel(vetor numero [2] valores | numero digito)
inicio
  se (nao(digito > 0))
  inicio
    exibir(valores).
    retorne.
  fim

  para cada(numero valor : valores)
  inicio
    numero mult, div.

    mult := valor * digito.
    div := valor / digito.

    se (nao(valor - 2 = 0) )
    inicio
      exibir("O numero: " + valor + ", nao eh divisivel nem por 2 nem por 3.\n").
    fim
    senao
    inicio
      exibir("O numero: " + valor + ", eh divisivel por 2 ou 3.\n").
    fim
    
    exibir("O produto do numero: " + valor + " com o digito: " + digito + ", eh: " + mult).
    exibir("A divisao do numero: " + valor + " com o digito> " + digito + ", eh: " + div).
  fim
fim

-> vazio main()
inicio
  vetor numero[4] valores.
  numero digito.

  valores[0] := 37.
  valores[1] := 64.
  valores[2] := 121.
  valores[3] := 276.

  digito := 5.

  verifica_divisivel(valores | digito).
fim