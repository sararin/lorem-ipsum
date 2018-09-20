(defproject lorem-ipsum "0.1.0-SNAPSHOT"
  :description "outputs lorem-ipsumesque text"
  :license {:name "BSD-3"
            :url "https://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot lorem-ipsum.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
