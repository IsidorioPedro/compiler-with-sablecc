/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.parser;

import compilador.node.*;
import compilador.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInicioExecucao(@SuppressWarnings("unused") TInicioExecucao node)
    {
        this.index = 0;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 1;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 2;
    }

    @Override
    public void caseTTipoCaractere(@SuppressWarnings("unused") TTipoCaractere node)
    {
        this.index = 3;
    }

    @Override
    public void caseTTipoNumero(@SuppressWarnings("unused") TTipoNumero node)
    {
        this.index = 4;
    }

    @Override
    public void caseTTipoBooleano(@SuppressWarnings("unused") TTipoBooleano node)
    {
        this.index = 5;
    }

    @Override
    public void caseTTipoVetor(@SuppressWarnings("unused") TTipoVetor node)
    {
        this.index = 6;
    }

    @Override
    public void caseTTipoVazio(@SuppressWarnings("unused") TTipoVazio node)
    {
        this.index = 7;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 8;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 9;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 10;
    }

    @Override
    public void caseTParaCada(@SuppressWarnings("unused") TParaCada node)
    {
        this.index = 11;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 12;
    }

    @Override
    public void caseTRetorne(@SuppressWarnings("unused") TRetorne node)
    {
        this.index = 13;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 14;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 15;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 16;
    }

    @Override
    public void caseTPontoVirgula(@SuppressWarnings("unused") TPontoVirgula node)
    {
        this.index = 17;
    }

    @Override
    public void caseTBarraReta(@SuppressWarnings("unused") TBarraReta node)
    {
        this.index = 18;
    }

    @Override
    public void caseTAbreParentese(@SuppressWarnings("unused") TAbreParentese node)
    {
        this.index = 19;
    }

    @Override
    public void caseTFechaParentese(@SuppressWarnings("unused") TFechaParentese node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAbreColchete(@SuppressWarnings("unused") TAbreColchete node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFechaColchete(@SuppressWarnings("unused") TFechaColchete node)
    {
        this.index = 22;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 23;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 24;
    }

    @Override
    public void caseTDivisao(@SuppressWarnings("unused") TDivisao node)
    {
        this.index = 25;
    }

    @Override
    public void caseTMultiplicacao(@SuppressWarnings("unused") TMultiplicacao node)
    {
        this.index = 26;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 27;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 28;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 30;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 31;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 32;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 33;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 34;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 35;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 36;
    }

    @Override
    public void caseTLer(@SuppressWarnings("unused") TLer node)
    {
        this.index = 37;
    }

    @Override
    public void caseTExibir(@SuppressWarnings("unused") TExibir node)
    {
        this.index = 38;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 39;
    }

    @Override
    public void caseTTexto(@SuppressWarnings("unused") TTexto node)
    {
        this.index = 40;
    }

    @Override
    public void caseTNumero(@SuppressWarnings("unused") TNumero node)
    {
        this.index = 41;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 42;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 43;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 44;
    }
}
