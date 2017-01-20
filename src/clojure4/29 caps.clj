(defn f [x] (->> x
              (filter #(re-seq #"[A-Z]" (str %))
                 (clojure.string/join ""))))
                 
                 
                 

