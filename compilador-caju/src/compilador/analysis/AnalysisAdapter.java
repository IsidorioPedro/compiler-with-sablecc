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
    public void caseADecVariavelDecVariavel(ADecVariavelDecVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComumDecFuncao(AComumDecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInicialDecFuncao(AInicialDecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametroParametro(AParametroParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoVetorTipo(ATipoVetorTipo node)
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
    public void caseABlocoBloco(ABlocoBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaCadaComando(AParaCadaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARetorneComando(ARetorneComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaComando(AChamadaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtribListaAtrib(AListaAtribListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribAtrib(AAtribAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaChamada(AChamadaChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExibirChamada(AExibirChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALerChamada(ALerChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyListaExp(AEmptyListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPositivoNumeroComSinal(APositivoNumeroComSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativoNumeroComSinal(ANegativoNumeroComSinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicaEExp(ALogicaEExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicaOuExp(ALogicaOuExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicaNaoExp(ALogicaNaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalIgualExp(ARelacionalIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalMenorExp(ARelacionalMenorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalMaiorExp(ARelacionalMaiorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalMenorIgualExp(ARelacionalMenorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAritmeticaSomaExp(AAritmeticaSomaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExp(AVariavelExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroExp(ANumeroExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABooleanoExp(ABooleanoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereExp(ACaractereExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextoExp(ATextoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaExp(AChamadaExp node)
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
    public void caseTLer(TLer node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTExibir(TExibir node)
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
