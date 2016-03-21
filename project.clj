(defproject test1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [mysql/mysql-connector-java "5.1.25"]
                 [org.clojure/java.jdbc "0.4.2"]
                 [org.clojure/clojure-contrib "1.2.0"]]

  :main ^:skip-aot test1.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
