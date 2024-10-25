/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDecVariavel> copy = new ArrayList<PDecVariavel>(node.getDecVariavel());
            for(PDecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDecFuncao> copy = new ArrayList<PDecFuncao>(node.getDecFuncao());
            for(PDecFuncao e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inADecVariavelDecVariavel(ADecVariavelDecVariavel node)
    {
        defaultIn(node);
    }

    public void outADecVariavelDecVariavel(ADecVariavelDecVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVariavelDecVariavel(ADecVariavelDecVariavel node)
    {
        inADecVariavelDecVariavel(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getListaNomes());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outADecVariavelDecVariavel(node);
    }

    public void inAComumDecFuncao(AComumDecFuncao node)
    {
        defaultIn(node);
    }

    public void outAComumDecFuncao(AComumDecFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComumDecFuncao(AComumDecFuncao node)
    {
        inAComumDecFuncao(node);
        if(node.getTipoRetorno() != null)
        {
            node.getTipoRetorno().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametros());
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outAComumDecFuncao(node);
    }

    public void inAInicialDecFuncao(AInicialDecFuncao node)
    {
        defaultIn(node);
    }

    public void outAInicialDecFuncao(AInicialDecFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInicialDecFuncao(AInicialDecFuncao node)
    {
        inAInicialDecFuncao(node);
        if(node.getTipoRetorno() != null)
        {
            node.getTipoRetorno().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PParametro> copy = new ArrayList<PParametro>(node.getParametros());
            for(PParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outAInicialDecFuncao(node);
    }

    public void inAParametroParametro(AParametroParametro node)
    {
        defaultIn(node);
    }

    public void outAParametroParametro(AParametroParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametroParametro(AParametroParametro node)
    {
        inAParametroParametro(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAParametroParametro(node);
    }

    public void inATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultIn(node);
    }

    public void outATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        inATipoBaseTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outATipoBaseTipo(node);
    }

    public void inATipoVetorTipo(ATipoVetorTipo node)
    {
        defaultIn(node);
    }

    public void outATipoVetorTipo(ATipoVetorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoVetorTipo(ATipoVetorTipo node)
    {
        inATipoVetorTipo(node);
        if(node.getTipoVetor() != null)
        {
            node.getTipoVetor().apply(this);
        }
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outATipoVetorTipo(node);
    }

    public void inANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultIn(node);
    }

    public void outANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroTipoBase(ANumeroTipoBase node)
    {
        inANumeroTipoBase(node);
        if(node.getTipoNumero() != null)
        {
            node.getTipoNumero().apply(this);
        }
        outANumeroTipoBase(node);
    }

    public void inACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultIn(node);
    }

    public void outACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipoBase(ACaractereTipoBase node)
    {
        inACaractereTipoBase(node);
        if(node.getTipoCaractere() != null)
        {
            node.getTipoCaractere().apply(this);
        }
        outACaractereTipoBase(node);
    }

    public void inABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultIn(node);
    }

    public void outABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoTipoBase(ABooleanoTipoBase node)
    {
        inABooleanoTipoBase(node);
        if(node.getTipoBooleano() != null)
        {
            node.getTipoBooleano().apply(this);
        }
        outABooleanoTipoBase(node);
    }

    public void inANaoVazioTipoRetorno(ANaoVazioTipoRetorno node)
    {
        defaultIn(node);
    }

    public void outANaoVazioTipoRetorno(ANaoVazioTipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoVazioTipoRetorno(ANaoVazioTipoRetorno node)
    {
        inANaoVazioTipoRetorno(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outANaoVazioTipoRetorno(node);
    }

    public void inAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultIn(node);
    }

    public void outAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        inAVazioTipoRetorno(node);
        if(node.getTipoVazio() != null)
        {
            node.getTipoVazio().apply(this);
        }
        outAVazioTipoRetorno(node);
    }

    public void inAIdentificadorVar(AIdentificadorVar node)
    {
        defaultIn(node);
    }

    public void outAIdentificadorVar(AIdentificadorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        inAIdentificadorVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentificadorVar(node);
    }

    public void inAVariavelVar(AVariavelVar node)
    {
        defaultIn(node);
    }

    public void outAVariavelVar(AVariavelVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelVar(AVariavelVar node)
    {
        inAVariavelVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAVariavelVar(node);
    }

    public void inABlocoBloco(ABlocoBloco node)
    {
        defaultIn(node);
    }

    public void outABlocoBloco(ABlocoBloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoBloco(ABlocoBloco node)
    {
        inABlocoBloco(node);
        {
            List<PDecVariavel> copy = new ArrayList<PDecVariavel>(node.getDecVariavel());
            for(PDecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outABlocoBloco(node);
    }

    public void inASeSenaoComando(ASeSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        inASeSenaoComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outASeSenaoComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outASeComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAParaComando(node);
    }

    public void inAParaCadaComando(AParaCadaComando node)
    {
        defaultIn(node);
    }

    public void outAParaCadaComando(AParaCadaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaCadaComando(AParaCadaComando node)
    {
        inAParaCadaComando(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAParaCadaComando(node);
    }

    public void inARetorneComando(ARetorneComando node)
    {
        defaultIn(node);
    }

    public void outARetorneComando(ARetorneComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARetorneComando(ARetorneComando node)
    {
        inARetorneComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outARetorneComando(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inABlocoComando(ABlocoComando node)
    {
        defaultIn(node);
    }

    public void outABlocoComando(ABlocoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        inABlocoComando(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outABlocoComando(node);
    }

    public void inAChamadaComando(AChamadaComando node)
    {
        defaultIn(node);
    }

    public void outAChamadaComando(AChamadaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaComando(AChamadaComando node)
    {
        inAChamadaComando(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaComando(node);
    }

    public void inAListaAtribListaAtrib(AListaAtribListaAtrib node)
    {
        defaultIn(node);
    }

    public void outAListaAtribListaAtrib(AListaAtribListaAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaAtribListaAtrib(AListaAtribListaAtrib node)
    {
        inAListaAtribListaAtrib(node);
        {
            List<PAtrib> copy = new ArrayList<PAtrib>(node.getAtrib());
            for(PAtrib e : copy)
            {
                e.apply(this);
            }
        }
        outAListaAtribListaAtrib(node);
    }

    public void inAAtribAtrib(AAtribAtrib node)
    {
        defaultIn(node);
    }

    public void outAAtribAtrib(AAtribAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribAtrib(AAtribAtrib node)
    {
        inAAtribAtrib(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAtribAtrib(node);
    }

    public void inAChamadaChamada(AChamadaChamada node)
    {
        defaultIn(node);
    }

    public void outAChamadaChamada(AChamadaChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaChamada(AChamadaChamada node)
    {
        inAChamadaChamada(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getListaExp() != null)
        {
            node.getListaExp().apply(this);
        }
        outAChamadaChamada(node);
    }

    public void inAExibirChamada(AExibirChamada node)
    {
        defaultIn(node);
    }

    public void outAExibirChamada(AExibirChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExibirChamada(AExibirChamada node)
    {
        inAExibirChamada(node);
        if(node.getExibir() != null)
        {
            node.getExibir().apply(this);
        }
        if(node.getListaExp() != null)
        {
            node.getListaExp().apply(this);
        }
        outAExibirChamada(node);
    }

    public void inALerChamada(ALerChamada node)
    {
        defaultIn(node);
    }

    public void outALerChamada(ALerChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALerChamada(ALerChamada node)
    {
        inALerChamada(node);
        if(node.getLer() != null)
        {
            node.getLer().apply(this);
        }
        if(node.getListaExp() != null)
        {
            node.getListaExp().apply(this);
        }
        outALerChamada(node);
    }

    public void inAListaExpListaExp(AListaExpListaExp node)
    {
        defaultIn(node);
    }

    public void outAListaExpListaExp(AListaExpListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        inAListaExpListaExp(node);
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outAListaExpListaExp(node);
    }

    public void inAEmptyListaExp(AEmptyListaExp node)
    {
        defaultIn(node);
    }

    public void outAEmptyListaExp(AEmptyListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyListaExp(AEmptyListaExp node)
    {
        inAEmptyListaExp(node);
        outAEmptyListaExp(node);
    }

    public void inAPositivoNumeroComSinal(APositivoNumeroComSinal node)
    {
        defaultIn(node);
    }

    public void outAPositivoNumeroComSinal(APositivoNumeroComSinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPositivoNumeroComSinal(APositivoNumeroComSinal node)
    {
        inAPositivoNumeroComSinal(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outAPositivoNumeroComSinal(node);
    }

    public void inANegativoNumeroComSinal(ANegativoNumeroComSinal node)
    {
        defaultIn(node);
    }

    public void outANegativoNumeroComSinal(ANegativoNumeroComSinal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativoNumeroComSinal(ANegativoNumeroComSinal node)
    {
        inANegativoNumeroComSinal(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANegativoNumeroComSinal(node);
    }

    public void inALogicaEExp(ALogicaEExp node)
    {
        defaultIn(node);
    }

    public void outALogicaEExp(ALogicaEExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALogicaEExp(ALogicaEExp node)
    {
        inALogicaEExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outALogicaEExp(node);
    }

    public void inALogicaOuExp(ALogicaOuExp node)
    {
        defaultIn(node);
    }

    public void outALogicaOuExp(ALogicaOuExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALogicaOuExp(ALogicaOuExp node)
    {
        inALogicaOuExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outALogicaOuExp(node);
    }

    public void inALogicaNaoExp(ALogicaNaoExp node)
    {
        defaultIn(node);
    }

    public void outALogicaNaoExp(ALogicaNaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALogicaNaoExp(ALogicaNaoExp node)
    {
        inALogicaNaoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outALogicaNaoExp(node);
    }

    public void inARelacionalIgualExp(ARelacionalIgualExp node)
    {
        defaultIn(node);
    }

    public void outARelacionalIgualExp(ARelacionalIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelacionalIgualExp(ARelacionalIgualExp node)
    {
        inARelacionalIgualExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outARelacionalIgualExp(node);
    }

    public void inARelacionalMenorExp(ARelacionalMenorExp node)
    {
        defaultIn(node);
    }

    public void outARelacionalMenorExp(ARelacionalMenorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelacionalMenorExp(ARelacionalMenorExp node)
    {
        inARelacionalMenorExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outARelacionalMenorExp(node);
    }

    public void inARelacionalMaiorExp(ARelacionalMaiorExp node)
    {
        defaultIn(node);
    }

    public void outARelacionalMaiorExp(ARelacionalMaiorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelacionalMaiorExp(ARelacionalMaiorExp node)
    {
        inARelacionalMaiorExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outARelacionalMaiorExp(node);
    }

    public void inARelacionalMenorIgualExp(ARelacionalMenorIgualExp node)
    {
        defaultIn(node);
    }

    public void outARelacionalMenorIgualExp(ARelacionalMenorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelacionalMenorIgualExp(ARelacionalMenorIgualExp node)
    {
        inARelacionalMenorIgualExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outARelacionalMenorIgualExp(node);
    }

    public void inARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node)
    {
        defaultIn(node);
    }

    public void outARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node)
    {
        inARelacionalMaiorIgualExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outARelacionalMaiorIgualExp(node);
    }

    public void inAAritmeticaSomaExp(AAritmeticaSomaExp node)
    {
        defaultIn(node);
    }

    public void outAAritmeticaSomaExp(AAritmeticaSomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAritmeticaSomaExp(AAritmeticaSomaExp node)
    {
        inAAritmeticaSomaExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outAAritmeticaSomaExp(node);
    }

    public void inAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node)
    {
        defaultIn(node);
    }

    public void outAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node)
    {
        inAAritmeticaSubtracaoExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outAAritmeticaSubtracaoExp(node);
    }

    public void inAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node)
    {
        defaultIn(node);
    }

    public void outAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node)
    {
        inAAritmeticaMultiplicacaoExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outAAritmeticaMultiplicacaoExp(node);
    }

    public void inAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node)
    {
        defaultIn(node);
    }

    public void outAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node)
    {
        inAAritmeticaDivisaoExp(node);
        if(node.getEsquerda() != null)
        {
            node.getEsquerda().apply(this);
        }
        if(node.getDireita() != null)
        {
            node.getDireita().apply(this);
        }
        outAAritmeticaDivisaoExp(node);
    }

    public void inAVariavelExp(AVariavelExp node)
    {
        defaultIn(node);
    }

    public void outAVariavelExp(AVariavelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExp(AVariavelExp node)
    {
        inAVariavelExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariavelExp(node);
    }

    public void inANumeroExp(ANumeroExp node)
    {
        defaultIn(node);
    }

    public void outANumeroExp(ANumeroExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroExp(ANumeroExp node)
    {
        inANumeroExp(node);
        if(node.getNumeroComSinal() != null)
        {
            node.getNumeroComSinal().apply(this);
        }
        outANumeroExp(node);
    }

    public void inABooleanoExp(ABooleanoExp node)
    {
        defaultIn(node);
    }

    public void outABooleanoExp(ABooleanoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoExp(ABooleanoExp node)
    {
        inABooleanoExp(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outABooleanoExp(node);
    }

    public void inACaractereExp(ACaractereExp node)
    {
        defaultIn(node);
    }

    public void outACaractereExp(ACaractereExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereExp(ACaractereExp node)
    {
        inACaractereExp(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACaractereExp(node);
    }

    public void inATextoExp(ATextoExp node)
    {
        defaultIn(node);
    }

    public void outATextoExp(ATextoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextoExp(ATextoExp node)
    {
        inATextoExp(node);
        if(node.getTexto() != null)
        {
            node.getTexto().apply(this);
        }
        outATextoExp(node);
    }

    public void inAChamadaExp(AChamadaExp node)
    {
        defaultIn(node);
    }

    public void outAChamadaExp(AChamadaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaExp(AChamadaExp node)
    {
        inAChamadaExp(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaExp(node);
    }
}
