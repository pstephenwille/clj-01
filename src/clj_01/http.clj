(ns clj-01.http
  (:require [clj-http.client :as client]))

(defn make-http-request [url]
  (let [response (client/get url)]
    (println "Response status:" (:status response))
    (println "Response body:" (:body response))))
