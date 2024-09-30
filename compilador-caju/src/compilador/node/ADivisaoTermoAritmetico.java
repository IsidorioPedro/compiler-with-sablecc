/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADivisaoTermoAritmetico extends PTermoAritmetico
{
    private PFatorAritmetico _fatorAritmetico_;
    private TDivisao _divisao_;
    private PTermoAritmetico _termoAritmetico_;

    public ADivisaoTermoAritmetico()
    {
        // Constructor
    }

    public ADivisaoTermoAritmetico(
        @SuppressWarnings("hiding") PFatorAritmetico _fatorAritmetico_,
        @SuppressWarnings("hiding") TDivisao _divisao_,
        @SuppressWarnings("hiding") PTermoAritmetico _termoAritmetico_)
    {
        // Constructor
        setFatorAritmetico(_fatorAritmetico_);

        setDivisao(_divisao_);

        setTermoAritmetico(_termoAritmetico_);

    }

    @Override
    public Object clone()
    {
        return new ADivisaoTermoAritmetico(
            cloneNode(this._fatorAritmetico_),
            cloneNode(this._divisao_),
            cloneNode(this._termoAritmetico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivisaoTermoAritmetico(this);
    }

    public PFatorAritmetico getFatorAritmetico()
    {
        return this._fatorAritmetico_;
    }

    public void setFatorAritmetico(PFatorAritmetico node)
    {
        if(this._fatorAritmetico_ != null)
        {
            this._fatorAritmetico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorAritmetico_ = node;
    }

    public TDivisao getDivisao()
    {
        return this._divisao_;
    }

    public void setDivisao(TDivisao node)
    {
        if(this._divisao_ != null)
        {
            this._divisao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._divisao_ = node;
    }

    public PTermoAritmetico getTermoAritmetico()
    {
        return this._termoAritmetico_;
    }

    public void setTermoAritmetico(PTermoAritmetico node)
    {
        if(this._termoAritmetico_ != null)
        {
            this._termoAritmetico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoAritmetico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorAritmetico_)
            + toString(this._divisao_)
            + toString(this._termoAritmetico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorAritmetico_ == child)
        {
            this._fatorAritmetico_ = null;
            return;
        }

        if(this._divisao_ == child)
        {
            this._divisao_ = null;
            return;
        }

        if(this._termoAritmetico_ == child)
        {
            this._termoAritmetico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorAritmetico_ == oldChild)
        {
            setFatorAritmetico((PFatorAritmetico) newChild);
            return;
        }

        if(this._divisao_ == oldChild)
        {
            setDivisao((TDivisao) newChild);
            return;
        }

        if(this._termoAritmetico_ == oldChild)
        {
            setTermoAritmetico((PTermoAritmetico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}