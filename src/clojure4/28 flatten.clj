(defn f [x]
  (if (seq x)
    (let [[fst & rst] x]
      (if (coll? fst)
        (concat (f fst) (f rst))
        (conj (f rst) fst)))
    '()))
      

    
  
   
  
   
    
   
    
(coll? [1 2])   
(f '((1 2) 3))
(f '((1 2) 3))
(f '(1 2 (3)))

(f '(1 (1 2)))
(f '((1 2) 3 [4 [5 6]]))

(= (f '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))


(= (f ["a" ["b"] "c"]) '("a" "b" "c"))

(= (f '((((:a))))) '(:a))
