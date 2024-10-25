/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExibirChamada extends PChamada
{
    private TExibir _exibir_;
    private PListaExp _listaExp_;

    public AExibirChamada()
    {
        // Constructor
    }

    public AExibirChamada(
        @SuppressWarnings("hiding") TExibir _exibir_,
        @SuppressWarnings("hiding") PListaExp _listaExp_)
    {
        // Constructor
        setExibir(_exibir_);

        setListaExp(_listaExp_);

    }

    @Override
    public Object clone()
    {
        return new AExibirChamada(
            cloneNode(this._exibir_),
            cloneNode(this._listaExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExibirChamada(this);
    }

    public TExibir getExibir()
    {
        return this._exibir_;
    }

    public void setExibir(TExibir node)
    {
        if(this._exibir_ != null)
        {
            this._exibir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exibir_ = node;
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
            + toString(this._exibir_)
            + toString(this._listaExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exibir_ == child)
        {
            this._exibir_ = null;
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
        if(this._exibir_ == oldChild)
        {
            setExibir((TExibir) newChild);
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
