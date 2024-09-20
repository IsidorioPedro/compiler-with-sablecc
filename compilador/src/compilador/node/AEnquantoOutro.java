/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoOutro extends POutro
{
    private TEnquanto _enquanto_;
    private TAbreParentese _abreParentese_;
    private PExprRelacional _exprRelacional_;
    private TFechaParentese _fechaParentese_;
    private PComando _comando_;

    public AEnquantoOutro()
    {
        // Constructor
    }

    public AEnquantoOutro(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TAbreParentese _abreParentese_,
        @SuppressWarnings("hiding") PExprRelacional _exprRelacional_,
        @SuppressWarnings("hiding") TFechaParentese _fechaParentese_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setAbreParentese(_abreParentese_);

        setExprRelacional(_exprRelacional_);

        setFechaParentese(_fechaParentese_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoOutro(
            cloneNode(this._enquanto_),
            cloneNode(this._abreParentese_),
            cloneNode(this._exprRelacional_),
            cloneNode(this._fechaParentese_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoOutro(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
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
            + toString(this._enquanto_)
            + toString(this._abreParentese_)
            + toString(this._exprRelacional_)
            + toString(this._fechaParentese_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._abreParentese_ == child)
        {
            this._abreParentese_ = null;
            return;
        }

        if(this._exprRelacional_ == child)
        {
            this._exprRelacional_ = null;
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
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._abreParentese_ == oldChild)
        {
            setAbreParentese((TAbreParentese) newChild);
            return;
        }

        if(this._exprRelacional_ == oldChild)
        {
            setExprRelacional((PExprRelacional) newChild);
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