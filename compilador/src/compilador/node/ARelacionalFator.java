/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ARelacionalFator extends PFator
{
    private PExprRelacional _exprRelacional_;

    public ARelacionalFator()
    {
        // Constructor
    }

    public ARelacionalFator(
        @SuppressWarnings("hiding") PExprRelacional _exprRelacional_)
    {
        // Constructor
        setExprRelacional(_exprRelacional_);

    }

    @Override
    public Object clone()
    {
        return new ARelacionalFator(
            cloneNode(this._exprRelacional_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelacionalFator(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprRelacional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprRelacional_ == child)
        {
            this._exprRelacional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprRelacional_ == oldChild)
        {
            setExprRelacional((PExprRelacional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}