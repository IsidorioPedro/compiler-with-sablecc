/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AChamadaOutro extends POutro
{
    private PChamada _chamada_;
    private TPonto _ponto_;

    public AChamadaOutro()
    {
        // Constructor
    }

    public AChamadaOutro(
        @SuppressWarnings("hiding") PChamada _chamada_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setChamada(_chamada_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new AChamadaOutro(
            cloneNode(this._chamada_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaOutro(this);
    }

    public PChamada getChamada()
    {
        return this._chamada_;
    }

    public void setChamada(PChamada node)
    {
        if(this._chamada_ != null)
        {
            this._chamada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamada_ = node;
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
            + toString(this._chamada_)
            + toString(this._ponto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamada_ == child)
        {
            this._chamada_ = null;
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
        if(this._chamada_ == oldChild)
        {
            setChamada((PChamada) newChild);
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
