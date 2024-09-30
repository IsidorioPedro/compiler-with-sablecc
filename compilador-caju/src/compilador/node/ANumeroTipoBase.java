/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ANumeroTipoBase extends PTipoBase
{
    private TTipoNumero _tipoNumero_;

    public ANumeroTipoBase()
    {
        // Constructor
    }

    public ANumeroTipoBase(
        @SuppressWarnings("hiding") TTipoNumero _tipoNumero_)
    {
        // Constructor
        setTipoNumero(_tipoNumero_);

    }

    @Override
    public Object clone()
    {
        return new ANumeroTipoBase(
            cloneNode(this._tipoNumero_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumeroTipoBase(this);
    }

    public TTipoNumero getTipoNumero()
    {
        return this._tipoNumero_;
    }

    public void setTipoNumero(TTipoNumero node)
    {
        if(this._tipoNumero_ != null)
        {
            this._tipoNumero_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoNumero_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoNumero_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoNumero_ == child)
        {
            this._tipoNumero_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoNumero_ == oldChild)
        {
            setTipoNumero((TTipoNumero) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}