(ns clj-01.core
  (:gen-class)
  (:require [clj-01.http :as req] ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (req/make-http-request "https://jsonplaceholder.typicode.com/posts/1")
  )
