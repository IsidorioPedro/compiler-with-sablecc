/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PExpr _pExpr_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PExpr _pExpr_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPExpr(_pExpr_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pExpr_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PExpr getPExpr()
    {
        return this._pExpr_;
    }

    public void setPExpr(PExpr node)
    {
        if(this._pExpr_ != null)
        {
            this._pExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pExpr_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pExpr_ == child)
        {
            this._pExpr_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pExpr_ == oldChild)
        {
            setPExpr((PExpr) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pExpr_) +
            toString(this._eof_);
    }
}
