vazio insertionSort(vetor numero[] lista | numero n)
inicio
    numero i, j, chave.

    i := 1.
    enquanto (i < n)
    inicio
      chave := lista[i].
      j := i - 1.

      enquanto (j >= 0 e lista[j] > chave)
      inicio
        lista[j + 1] := lista[j].
        j := j - 1.
      fim

      lista[j + 1] := chave.
      i := i + 1.
    fim
fim

vazio exibirLista(vetor numero[] lista | numero n)
inicio
    numero i.

    para (i := 0; i <= n - 1; i := i + 1)
    inicio
        exibir(lista[i]).
        exibir(' ').
    fim
    exibir('\n').
fim

numero solicitarOrdenacao(vetor numero[] lista | numero n)
inicio
    se (n < 1)
    inicio
        retorne 400.
    fim
    senao
    inicio
        exibir("Lista pre ordenacao:\n").
        exibirLista(lista | n).

        insertionSort(lista | n).

        exibir("Lista pos ordenacao:\n").
        exibirLista(lista | n).
        
        retorne 200.
    fim
fim

-> vazio main()
inicio
  numero lista[5].
  numero tamanho, resposta.

  lista[0] := 5.
  lista[1] := 2.
  lista[2] := 4.
  lista[3] := 6.
  lista[4] := 1.
  tamanho := 5.

  resposta := solicitarOrdenacao(lista | tamanho).
fim