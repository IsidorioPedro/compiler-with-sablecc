/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseADecVariavelDecVariavel(ADecVariavelDecVariavel node);
    void caseAComumDecFuncao(AComumDecFuncao node);
    void caseAInicialDecFuncao(AInicialDecFuncao node);
    void caseAParametroParametro(AParametroParametro node);
    void caseATipoBaseTipo(ATipoBaseTipo node);
    void caseATipoVetorTipo(ATipoVetorTipo node);
    void caseANumeroTipoBase(ANumeroTipoBase node);
    void caseACaractereTipoBase(ACaractereTipoBase node);
    void caseABooleanoTipoBase(ABooleanoTipoBase node);
    void caseANaoVazioTipoRetorno(ANaoVazioTipoRetorno node);
    void caseAVazioTipoRetorno(AVazioTipoRetorno node);
    void caseAIdentificadorVar(AIdentificadorVar node);
    void caseAVariavelVar(AVariavelVar node);
    void caseABlocoBloco(ABlocoBloco node);
    void caseASeSenaoComando(ASeSenaoComando node);
    void caseASeComando(ASeComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaCadaComando(AParaCadaComando node);
    void caseARetorneComando(ARetorneComando node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAChamadaComando(AChamadaComando node);
    void caseAListaAtribListaAtrib(AListaAtribListaAtrib node);
    void caseAAtribAtrib(AAtribAtrib node);
    void caseAChamadaChamada(AChamadaChamada node);
    void caseAExibirChamada(AExibirChamada node);
    void caseALerChamada(ALerChamada node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAEmptyListaExp(AEmptyListaExp node);
    void caseAPositivoNumeroComSinal(APositivoNumeroComSinal node);
    void caseANegativoNumeroComSinal(ANegativoNumeroComSinal node);
    void caseALogicaEExp(ALogicaEExp node);
    void caseALogicaOuExp(ALogicaOuExp node);
    void caseALogicaNaoExp(ALogicaNaoExp node);
    void caseARelacionalIgualExp(ARelacionalIgualExp node);
    void caseARelacionalMenorExp(ARelacionalMenorExp node);
    void caseARelacionalMaiorExp(ARelacionalMaiorExp node);
    void caseARelacionalMenorIgualExp(ARelacionalMenorIgualExp node);
    void caseARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node);
    void caseAAritmeticaSomaExp(AAritmeticaSomaExp node);
    void caseAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node);
    void caseAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node);
    void caseAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node);
    void caseAVariavelExp(AVariavelExp node);
    void caseANumeroExp(ANumeroExp node);
    void caseABooleanoExp(ABooleanoExp node);
    void caseACaractereExp(ACaractereExp node);
    void caseATextoExp(ATextoExp node);
    void caseAChamadaExp(AChamadaExp node);

    void caseTVacuo(TVacuo node);
    void caseTComentario(TComentario node);
    void caseTInicioExecucao(TInicioExecucao node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTTipoCaractere(TTipoCaractere node);
    void caseTTipoNumero(TTipoNumero node);
    void caseTTipoBooleano(TTipoBooleano node);
    void caseTTipoVetor(TTipoVetor node);
    void caseTTipoVazio(TTipoVazio node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTPara(TPara node);
    void caseTParaCada(TParaCada node);
    void caseTEnquanto(TEnquanto node);
    void caseTRetorne(TRetorne node);
    void caseTPonto(TPonto node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTVirgula(TVirgula node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTBarraReta(TBarraReta node);
    void caseTAbreParentese(TAbreParentese node);
    void caseTFechaParentese(TFechaParentese node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTDivisao(TDivisao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTMod(TMod node);
    void caseTIgual(TIgual node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNao(TNao node);
    void caseTLer(TLer node);
    void caseTExibir(TExibir node);
    void caseTCaractere(TCaractere node);
    void caseTTexto(TTexto node);
    void caseTNumero(TNumero node);
    void caseTBooleano(TBooleano node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
