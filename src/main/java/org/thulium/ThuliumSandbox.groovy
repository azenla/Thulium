package org.thulium

import org.kohsuke.groovy.sandbox.GroovyValueFilter

class ThuliumSandbox extends GroovyValueFilter {

    private static final Set<Class> ALLOWED_TYPES = [
        String,
        Integer,
        Boolean,
        Double,
        Result
    ] as Set

    @Override
    Object filter(Object o) {
        if (o == null || ALLOWED_TYPES.contains(o.class))
            return o
        if (o instanceof Script || o instanceof Closure)
            return o
        throw new SecurityException("Unexpected type: ${o.class.getCanonicalName()}")
    }
}
