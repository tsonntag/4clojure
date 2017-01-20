(defn f [xs]
  (reduce
    (fn [res x]
      (if (some #(= x %) res) 
        res
        (conj res x)))
    [] xs))
      
    
  
  
  



(f [1 2 1 3 1 2 4])


(= (f [1 2 1 3 1 2 4]) [1 2 3 4])

(= (f [:a :a :b :b :c :c]) [:a :b :c])

(= (f '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= (f (range 50)) (range 50))


