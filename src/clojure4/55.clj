(fn f [xs]
  (reduce
    (fn [res x]
      (assoc res x ((fnil inc 0) (get res x))))   
    {} xs))
    
     
    
(f [1 1 2 3 2 1 1])
  


(= (f [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (f [:b :a :b :a :b]) {:a 2, :b 3})

(= (f '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
