(ns compiler-update-not-referenced-bug.core-test
  (:require [clojure.test :refer :all]
            [compiler-update-not-referenced-bug.core :refer :all]))

(deftest a-test
  (compiler-update-not-referenced-bug.core/foo))
