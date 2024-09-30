/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TBarraReta extends Token
{
    public TBarraReta()
    {
        super.setText("|");
    }

    public TBarraReta(int line, int pos)
    {
        super.setText("|");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBarraReta(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBarraReta(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBarraReta text.");
    }
}