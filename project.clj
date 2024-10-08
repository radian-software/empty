(defproject empty/lein-template "1.1.0"
  :description "Absolute bare minimum Leiningen template"
  :url "https://github.com/radian-software/empty"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :eval-in-leiningen true
  :release-tasks [["deploy" "clojars"]]
  :signing {:gpg-key "E6CED8CD047C9366D490C2784A88E27648CABA42"})
