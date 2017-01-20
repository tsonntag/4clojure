(defn f [x]
  (if (seq x)
    (let [[fst & rst] x]
      (if (= fst (first rst))
        (f rst)
        (conj (f rst) fst)))
    '()))
    
  



(= (apply str (f "Leeeeeerrroyyy")) "Leroy")


(= (f [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (f [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
