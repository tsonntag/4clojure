
(defn digits [x]
  (let [q (quot x 10) r (rem x 10)]
    (if (zero? q) [r] (conj (digits q) r)))) 
    
(defn squares [x]
  (reduce + (map #(* % %) (digits x))))
  
(defn f [x]
   (loop [ys (list (squares x))]
     (let [new (squares (first ys))]
      (cond 
       (= new 1) true
       (some #(= new %) ys) false
       :else (recur (conj ys new))))))
            

  


(= (f 7) true)
(= (f 986543210) true)
(= (f 2) false)
(= (f 3) false)
