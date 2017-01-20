
(defn f [n xs]
  (if (< (count xs) n)
    '()
    (conj (f n (drop n xs)) (take n xs))))

    

(= (f 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))


(= (f 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= (f 3 (range 8)) '((0 1 2) (3 4 5)))


  
(fn [m ys]
  (letfn [(f [n xs]
            (if (< (count xs) n)
                '()
                (conj (f n (drop n xs))
                      (take n xs))))]
           
     (f m ys)))
  
               
               
               
            
            
            
            
            
         

  
  
  
  
  
  
  
  
            
            
          
          
          
          
 

   

          
          
          
        
        
    

        
        
          
          
          
  
