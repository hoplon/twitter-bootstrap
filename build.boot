(set-env!
  :resource-paths #{"src"}
  :dependencies '[[adzerk/bootlaces           "0.1.9"         :scope "test"]
                  [tailrecursion/boot-hoplon  "0.1.0"         :scope "test"]
                  [tailrecursion/hoplon       "6.0.0-SNAPSHOT"]])

(require '[adzerk.bootlaces :refer :all]
         '[tailrecursion.boot-hoplon :refer :all])

(def +version+ "0.1.0")

(task-options!
 pom  {:project     'hoplon/twitter-bootstrap
       :version     +version+
       :description "hoplon components for twitter bootstrap"
       :url         ""
       :scm         {:url "https://github.com/hoplon/twitter-boostrap"}
       :license     {"" ""}})

