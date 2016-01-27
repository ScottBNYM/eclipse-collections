/*
 * Copyright (c) 2015 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.impl.stack.immutable;

import org.eclipse.collections.api.stack.ImmutableStack;
import org.eclipse.collections.impl.stack.StackIterableTestCase;

public abstract class ImmutableStackTestCase extends StackIterableTestCase
{
    @Override
    protected abstract <T> ImmutableStack<T> newStackWith(T... elements);

    @Override
    protected abstract <T> ImmutableStack<T> newStackFromTopToBottom(T... elements);

    @Override
    protected abstract <T> ImmutableStack<T> newStackFromTopToBottom(Iterable<T> elements);

    @Override
    protected abstract <T> ImmutableStack<T> newStack(Iterable<T> elements);
}