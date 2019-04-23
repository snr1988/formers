package domainapp.dom.impl;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QHelloWorldObject extends PersistableExpressionImpl<HelloWorldObject> implements PersistableExpression<HelloWorldObject>
{
    public static final QHelloWorldObject jdoCandidate = candidate("this");

    public static QHelloWorldObject candidate(String name)
    {
        return new QHelloWorldObject(null, name, 5);
    }

    public static QHelloWorldObject candidate()
    {
        return jdoCandidate;
    }

    public static QHelloWorldObject parameter(String name)
    {
        return new QHelloWorldObject(HelloWorldObject.class, name, ExpressionType.PARAMETER);
    }

    public static QHelloWorldObject variable(String name)
    {
        return new QHelloWorldObject(HelloWorldObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression notes;

    public QHelloWorldObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }

    public QHelloWorldObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }
}
