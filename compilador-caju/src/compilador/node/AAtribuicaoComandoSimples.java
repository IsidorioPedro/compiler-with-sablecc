/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoComandoSimples extends PComandoSimples
{
    private PAtrib _atrib_;
    private TPonto _ponto_;

    public AAtribuicaoComandoSimples()
    {
        // Constructor
    }

    public AAtribuicaoComandoSimples(
        @SuppressWarnings("hiding") PAtrib _atrib_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setAtrib(_atrib_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoComandoSimples(
            cloneNode(this._atrib_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoComandoSimples(this);
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

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atrib_)
            + toString(this._ponto_);
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

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
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

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}