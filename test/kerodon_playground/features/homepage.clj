(ns kerodon-playground.features.homepage
  (:require [kerodon-playground.core.handler :refer [app]]
            [kerodon.core :refer :all]
            [kerodon.test :refer :all]
            [clojure.test :refer :all]))

(deftest homepage-greeting
  (-> (session app)
      (visit "/")
      (has (text? "Welcome to Kerodon Playground"))))
