vazio troca(numero x | numero y)
inicio
    numero temporario.
    temporario := x.
fim


vazio bubbleSort(vetor numero[2] array | numero n) 
inicio
    numero i, j.
    para (i := 0; i < n-1; i := i + 1)
        inicio
            para (j := 0; j < n-i-1; j := j + 1)
                inicio
                    se (array[j] > array[j+1])
                        inicio
                            troca(array[j] | array[j+1]).
                        fim
                fim
        fim
fim

-> vazio main()
inicio
    vetor numero [7] lista.
    numero n.
    n := 7.
    lista := (12).
    exibir("Array original: \n").
    exibirVetor(lista | n).

    bubbleSort(lista | n).
    exibir("Array ordenado: \n").
    exibirVetor(lista | n).
fim


vazio exibirVetor(vetor numero [2] array | numero tamanho)
inicio
    numero i.
    para (i := 0; i < tamanho; i := i + 1)
        inicio
            exibir(array[i]).
            exibir(' ').
        fim
    exibir('\n').
fim
