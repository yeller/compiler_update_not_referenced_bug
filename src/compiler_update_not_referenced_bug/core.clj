(ns compiler-update-not-referenced-bug.core
  (:require [clojure.data.int-map :as int-map]))

(defn foo []
  (int-map/update (int-map/int-map)
                  1
                  (fn [x] (if (nil? x) 1 (inc x)))))
