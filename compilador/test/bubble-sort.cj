vazio {vetor numero[] array, numero tamanho} {exibirVetor}

vazio troca(numero *x | numero *y)
inicio
    numero temporario := *x.
    *x := *y.
    *y := temporario.
fim


vazio bubbleSort(vetor numero[] array | numero n) 
inicio
    numero i, j.
    para (i := 0; i < n-1; i := i + 1)
        inicio
            para (j := 0; j < n-i-1; j := j + 1)
                inicio
                    se (array[j] > array[j+1])
                        inicio
                            troca(&array[j] | &array[j+1]).
                        fim
                fim
        fim
fim

-> vazio main()
inicio
    vetor numero[7] lista := {0,99,55,12,33,45,19}.
    numero n := 7.
    exibir("Array original: \n").
    exibirVetor(lista | n).

    bubbleSort(lista | n).
    exibir("Array ordenado: \n").
    exibirVetor(lista | n).
fim


vazio exibirVetor(vetor numero[] array | numero tamanho)
inicio
    numero i.
    para (i := 0; i < tamanho; i := i + 1)
        inicio
            exibir(array[i]).
            exibir(' ').
        fim
    exibir('\n').
fim
