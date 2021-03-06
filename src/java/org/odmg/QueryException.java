package org.odmg;

/**
 * This is the base class for all exceptions associated with queries.
 * @author	David Jordan (as Java Editor of the Object Data Management Group)
 * @version ODMG 3.0
 */

public class QueryException extends ODMGException
{
    /**
     * Constructs an instance of the exception.
     */
    public QueryException()
    {
        super();
    }

    /**
     * Constructs an instance of the exception with a message indicating the reason
     * for the exception.
     * @param msg	A message indicating the reason for the exception.
     */
    public QueryException(String msg)
    {
        super(msg);
    }
}
