/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVariavel(ADecVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaNomes(AListaNomes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplosIds(AMultiplosIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABaseTipo(ABaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorTipo(AVetorTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEntreColchetes(AExpEntreColchetes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoVazioTipoRetorno(ANaoVazioTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamParametros(AParamParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmpityParametros(AEmpityParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplosParametros(AMultiplosParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtrib(AAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtrib(AListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplosAtributos(AMultiplosAtributos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasadoComando(ACasadoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoCasadoComando(ANaoCasadoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoSimplesComando(AComandoSimplesComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoCasadoCasado(ASeSenaoCasadoCasado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeNaoCasadoNaoCasado(ASeNaoCasadoNaoCasado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoNaoCasadoNaoCasado(ASeSenaoNaoCasadoNaoCasado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComandoSimples(AEnquantoComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComandoSimples(AParaComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaCadaComandoSimples(AParaCadaComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComandoSimples(AAtribuicaoComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetorneComandoSimples(ARetorneComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComandoSimples(ABlocoComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaComandoSimples(AChamadaComandoSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelVar(AVariavelVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressaoLogica(ATermoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseLogicaTermoLogico(AParenteseLogicaTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalTermoLogico(ARelacionalTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExpressaoRelacional(AIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorExpressaoRelacional(AMaiorExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorExpressaoRelacional(AMenorExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualExpressaoRelacional(AMaiorIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExpressaoRelacional(AMenorIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpressaoAritmetica(ASomaExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtracaoExpressaoAritmetica(ASubtracaoExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressaoAritmetica(ATermoExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoTermoAritmetico(AMultiplicacaoTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoTermoAritmetico(ADivisaoTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermoAritmetico(AFatorTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseAritmeticaFatorAritmetico(AParenteseAritmeticaFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFatorAritmetico(AVariavelFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroFatorAritmetico(ANumeroFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoFatorAritmetico(ABooleanoFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFatorAritmetico(AChamadaFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereFatorAritmetico(ACaractereFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextoFatorAritmetico(ATextoFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpAritmeticaExp(AExpAritmeticaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLogicaExp(AExpLogicaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmpityListaExp(AEmpityListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplosExp(AMultiplosExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVacuo(TVacuo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicioExecucao(TInicioExecucao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoCaractere(TTipoCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoNumero(TTipoNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoBooleano(TTipoBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoVetor(TTipoVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoVazio(TTipoVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParaCada(TParaCada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraReta(TBarraReta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParentese(TAbreParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParentese(TFechaParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTexto(TTexto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}