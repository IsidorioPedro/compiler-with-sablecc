/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AListaatribmaisListaAtrib extends PListaAtrib
{
    private PAtrib _atrib_;
    private TVirgula _virgula_;
    private PListaAtrib _listaAtrib_;

    public AListaatribmaisListaAtrib()
    {
        // Constructor
    }

    public AListaatribmaisListaAtrib(
        @SuppressWarnings("hiding") PAtrib _atrib_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PListaAtrib _listaAtrib_)
    {
        // Constructor
        setAtrib(_atrib_);

        setVirgula(_virgula_);

        setListaAtrib(_listaAtrib_);

    }

    @Override
    public Object clone()
    {
        return new AListaatribmaisListaAtrib(
            cloneNode(this._atrib_),
            cloneNode(this._virgula_),
            cloneNode(this._listaAtrib_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaatribmaisListaAtrib(this);
    }

    public PAtrib getAtrib()
    {
        return this._atrib_;
    }

    public void setAtrib(PAtrib node)
    {
        if(this._atrib_ != null)
        {
            this._atrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atrib_ = node;
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._atrib_)
            + toString(this._virgula_)
            + toString(this._listaAtrib_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atrib_ == child)
        {
            this._atrib_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._listaAtrib_ == child)
        {
            this._listaAtrib_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atrib_ == oldChild)
        {
            setAtrib((PAtrib) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._listaAtrib_ == oldChild)
        {
            setListaAtrib((PListaAtrib) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}