(ns leiningen.new.empty
  (:refer-clojure :exclude [empty])
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "empty"))

(defn empty
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating empty project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)])))
