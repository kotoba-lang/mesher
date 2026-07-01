(ns mesher-test
  (:require [clojure.test :refer [deftest is testing]]
            [mesher]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? mesher))))
