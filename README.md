# compiler_update_not_referenced_bug

Run `lein do clean, uberjar, test` : you'll get this:

```
ERROR in (a-test) (Var.java:43)
Uncaught exception, not in assertion.
expected: nil
  actual: java.lang.IllegalStateException: Attempting to call unbound fn: #'clojure.data.int-map/update
 at clojure.lang.Var$Unbound.throwArity (Var.java:43)
    clojure.lang.AFn.invoke (AFn.java:40)
    compiler_update_not_referenced_bug.core$foo.invoke (core.clj:5)
    compiler_update_not_referenced_bug.core_test/fn (core_test.clj:6)
    clojure.test$test_var$fn__7591.invoke (test.clj:704)
```
## Usage

FIXME

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
