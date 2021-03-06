package org.apache.ojb.otm.lock.wait;

/* Copyright 2003-2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.ojb.otm.core.Transaction;
import org.apache.ojb.otm.lock.LockingException;
import org.apache.ojb.otm.lock.ObjectLock;

public class NoWaitStrategy implements LockWaitStrategy
{

    /**
    * @see org.apache.ojb.otm.lock.wait.LockWaitStrategy#waitForLock(ObjectLock, Transaction)
    */
    public void waitForLock(ObjectLock lock, Transaction tx)
        throws LockingException
    {
        throw new ConcurrentModificationException(
            "Object [id: " + lock.getTargetIdentity() 
            + "] locked by Transaction " + lock.getWriter());
    }

}
