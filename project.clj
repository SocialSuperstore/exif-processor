(defproject social/exif-processor "0.1.2-socialsuperstore-SNAPSHOT"
  :description "A lightweight Clojure wrapper around the exif processing facility in Drew Oakes' metadata-extractor"
  :url "http://github.com/joshuamiller/exif-processor"
  :min-lein-version "2.1.0"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.drewnoakes/metadata-extractor "2.7.2"]
                 [clj-http "0.7.2"]]

  :aliases {"release" ["deploy" "clojars"]})
