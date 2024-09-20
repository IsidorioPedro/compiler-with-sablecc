/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ARetornevazioAuxRetorne extends PAuxRetorne
{
    private TRetorne _retorne_;

    public ARetornevazioAuxRetorne()
    {
        // Constructor
    }

    public ARetornevazioAuxRetorne(
        @SuppressWarnings("hiding") TRetorne _retorne_)
    {
        // Constructor
        setRetorne(_retorne_);

    }

    @Override
    public Object clone()
    {
        return new ARetornevazioAuxRetorne(
            cloneNode(this._retorne_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARetornevazioAuxRetorne(this);
    }

    public TRetorne getRetorne()
    {
        return this._retorne_;
    }

    public void setRetorne(TRetorne node)
    {
        if(this._retorne_ != null)
        {
            this._retorne_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._retorne_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._retorne_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._retorne_ == child)
        {
            this._retorne_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._retorne_ == oldChild)
        {
            setRetorne((TRetorne) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
