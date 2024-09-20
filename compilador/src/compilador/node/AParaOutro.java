/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParaOutro extends POutro
{
    private TPara _para_;
    private TAbreParentese _abreParentese_;
    private PAuxListaAtrib _auxListaAtrib_;
    private PExprRelacional _exprRelacional_;
    private TPontoVirgula _pontoVirgula_;
    private PListaAtrib _listaAtrib_;
    private TFechaParentese _fechaParentese_;
    private PComando _comando_;

    public AParaOutro()
    {
        // Constructor
    }

    public AParaOutro(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") TAbreParentese _abreParentese_,
        @SuppressWarnings("hiding") PAuxListaAtrib _auxListaAtrib_,
        @SuppressWarnings("hiding") PExprRelacional _exprRelacional_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_,
        @SuppressWarnings("hiding") PListaAtrib _listaAtrib_,
        @SuppressWarnings("hiding") TFechaParentese _fechaParentese_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setPara(_para_);

        setAbreParentese(_abreParentese_);

        setAuxListaAtrib(_auxListaAtrib_);

        setExprRelacional(_exprRelacional_);

        setPontoVirgula(_pontoVirgula_);

        setListaAtrib(_listaAtrib_);

        setFechaParentese(_fechaParentese_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AParaOutro(
            cloneNode(this._para_),
            cloneNode(this._abreParentese_),
            cloneNode(this._auxListaAtrib_),
            cloneNode(this._exprRelacional_),
            cloneNode(this._pontoVirgula_),
            cloneNode(this._listaAtrib_),
            cloneNode(this._fechaParentese_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaOutro(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public TAbreParentese getAbreParentese()
    {
        return this._abreParentese_;
    }

    public void setAbreParentese(TAbreParentese node)
    {
        if(this._abreParentese_ != null)
        {
            this._abreParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParentese_ = node;
    }

    public PAuxListaAtrib getAuxListaAtrib()
    {
        return this._auxListaAtrib_;
    }

    public void setAuxListaAtrib(PAuxListaAtrib node)
    {
        if(this._auxListaAtrib_ != null)
        {
            this._auxListaAtrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._auxListaAtrib_ = node;
    }

    public PExprRelacional getExprRelacional()
    {
        return this._exprRelacional_;
    }

    public void setExprRelacional(PExprRelacional node)
    {
        if(this._exprRelacional_ != null)
        {
            this._exprRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprRelacional_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    public PListaAtrib getListaAtrib()
    {
        return this._listaAtrib_;
    }

    public void setListaAtrib(PListaAtrib node)
    {
        if(this._listaAtrib_ != null)
        {
            this._listaAtrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaAtrib_ = node;
    }

    public TFechaParentese getFechaParentese()
    {
        return this._fechaParentese_;
    }

    public void setFechaParentese(TFechaParentese node)
    {
        if(this._fechaParentese_ != null)
        {
            this._fechaParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParentese_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._abreParentese_)
            + toString(this._auxListaAtrib_)
            + toString(this._exprRelacional_)
            + toString(this._pontoVirgula_)
            + toString(this._listaAtrib_)
            + toString(this._fechaParentese_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._abreParentese_ == child)
        {
            this._abreParentese_ = null;
            return;
        }

        if(this._auxListaAtrib_ == child)
        {
            this._auxListaAtrib_ = null;
            return;
        }

        if(this._exprRelacional_ == child)
        {
            this._exprRelacional_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        if(this._listaAtrib_ == child)
        {
            this._listaAtrib_ = null;
            return;
        }

        if(this._fechaParentese_ == child)
        {
            this._fechaParentese_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._abreParentese_ == oldChild)
        {
            setAbreParentese((TAbreParentese) newChild);
            return;
        }

        if(this._auxListaAtrib_ == oldChild)
        {
            setAuxListaAtrib((PAuxListaAtrib) newChild);
            return;
        }

        if(this._exprRelacional_ == oldChild)
        {
            setExprRelacional((PExprRelacional) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        if(this._listaAtrib_ == oldChild)
        {
            setListaAtrib((PListaAtrib) newChild);
            return;
        }

        if(this._fechaParentese_ == oldChild)
        {
            setFechaParentese((TFechaParentese) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
