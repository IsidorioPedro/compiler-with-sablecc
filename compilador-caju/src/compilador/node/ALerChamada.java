/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ALerChamada extends PChamada
{
    private TLer _ler_;
    private PListaExp _listaExp_;

    public ALerChamada()
    {
        // Constructor
    }

    public ALerChamada(
        @SuppressWarnings("hiding") TLer _ler_,
        @SuppressWarnings("hiding") PListaExp _listaExp_)
    {
        // Constructor
        setLer(_ler_);

        setListaExp(_listaExp_);

    }

    @Override
    public Object clone()
    {
        return new ALerChamada(
            cloneNode(this._ler_),
            cloneNode(this._listaExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALerChamada(this);
    }

    public TLer getLer()
    {
        return this._ler_;
    }

    public void setLer(TLer node)
    {
        if(this._ler_ != null)
        {
            this._ler_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ler_ = node;
    }

    public PListaExp getListaExp()
    {
        return this._listaExp_;
    }

    public void setListaExp(PListaExp node)
    {
        if(this._listaExp_ != null)
        {
            this._listaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ler_)
            + toString(this._listaExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ler_ == child)
        {
            this._ler_ = null;
            return;
        }

        if(this._listaExp_ == child)
        {
            this._listaExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ler_ == oldChild)
        {
            setLer((TLer) newChild);
            return;
        }

        if(this._listaExp_ == oldChild)
        {
            setListaExp((PListaExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
