(defn f [xs]
  (loop [x xs prev nil res '()]
    (if x
      (if (= x prev)
        (conj res x x))
      res)))
    
      
    
    
 
(f [1 1 1])
  
(= (f [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= (f [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= (f [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
