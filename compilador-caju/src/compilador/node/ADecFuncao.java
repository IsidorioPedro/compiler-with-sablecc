/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADecFuncao extends PDecFuncao
{
    private TInicioExecucao _inicioExecucao_;
    private PTipoRetorno _tipoRetorno_;
    private TId _id_;
    private TAbreParentese _abreParentese_;
    private PParametros _parametros_;
    private TFechaParentese _fechaParentese_;
    private PBloco _bloco_;

    public ADecFuncao()
    {
        // Constructor
    }

    public ADecFuncao(
        @SuppressWarnings("hiding") TInicioExecucao _inicioExecucao_,
        @SuppressWarnings("hiding") PTipoRetorno _tipoRetorno_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAbreParentese _abreParentese_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TFechaParentese _fechaParentese_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setInicioExecucao(_inicioExecucao_);

        setTipoRetorno(_tipoRetorno_);

        setId(_id_);

        setAbreParentese(_abreParentese_);

        setParametros(_parametros_);

        setFechaParentese(_fechaParentese_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADecFuncao(
            cloneNode(this._inicioExecucao_),
            cloneNode(this._tipoRetorno_),
            cloneNode(this._id_),
            cloneNode(this._abreParentese_),
            cloneNode(this._parametros_),
            cloneNode(this._fechaParentese_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncao(this);
    }

    public TInicioExecucao getInicioExecucao()
    {
        return this._inicioExecucao_;
    }

    public void setInicioExecucao(TInicioExecucao node)
    {
        if(this._inicioExecucao_ != null)
        {
            this._inicioExecucao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicioExecucao_ = node;
    }

    public PTipoRetorno getTipoRetorno()
    {
        return this._tipoRetorno_;
    }

    public void setTipoRetorno(PTipoRetorno node)
    {
        if(this._tipoRetorno_ != null)
        {
            this._tipoRetorno_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoRetorno_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TAbreParentese getAbreParentese()
    {
        return this._abreParentese_;
    }

    public void setAbreParentese(TAbreParentese node)
    {
        if(this._abreParentese_ != null)
        {
            this._abreParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParentese_ = node;
    }

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
    }

    public TFechaParentese getFechaParentese()
    {
        return this._fechaParentese_;
    }

    public void setFechaParentese(TFechaParentese node)
    {
        if(this._fechaParentese_ != null)
        {
            this._fechaParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParentese_ = node;
    }

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicioExecucao_)
            + toString(this._tipoRetorno_)
            + toString(this._id_)
            + toString(this._abreParentese_)
            + toString(this._parametros_)
            + toString(this._fechaParentese_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicioExecucao_ == child)
        {
            this._inicioExecucao_ = null;
            return;
        }

        if(this._tipoRetorno_ == child)
        {
            this._tipoRetorno_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._abreParentese_ == child)
        {
            this._abreParentese_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._fechaParentese_ == child)
        {
            this._fechaParentese_ = null;
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicioExecucao_ == oldChild)
        {
            setInicioExecucao((TInicioExecucao) newChild);
            return;
        }

        if(this._tipoRetorno_ == oldChild)
        {
            setTipoRetorno((PTipoRetorno) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._abreParentese_ == oldChild)
        {
            setAbreParentese((TAbreParentese) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._fechaParentese_ == oldChild)
        {
            setFechaParentese((TFechaParentese) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}