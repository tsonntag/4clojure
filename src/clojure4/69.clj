

(defn f [g & ms]
  (println "ms" ms)
  (let [m (apply conj ms)
        fv (fn [k] (->> ms 
                         (filter #(contains? % k))
                         (map #(get % k))))]
    
    (reduce (fn [res k]
              (let [vs (fv k)]
                (assoc res k (if (< 1 (count vs)) (apply g vs) (first vs)))))
                      {} (keys m))))
              
          
          
(merge-with - {:a 3 :b 5} {:a 1 :b 3 :c 2})
(f - {:a 3 :b 5} {:a 1 :b 3 :c 2})
    
  
(= (f * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})


(= (f - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

(= (f concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})

