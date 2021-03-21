(ns fizzbuzz.core)

(defn fizzbuzz
  "Returns Fizz Buzz FizzBuzz or x"
  [x]
  (let [a (atom "")]
    (when (= (mod x 3) 0)
      (swap! a str "Fizz")
      )
    (when (= (mod x 5) 0)
      (swap! a str "Buzz")
      )
    (if (empty? @a)
      (str x)
      @a
      )
    )
    )

(defn main-function
  "Prints out fizzbuzz "
  [x]
  (let [rang (range 1 (inc x))]
    (map fizzbuzz rang)
    )
  )

(defn looping-fizz [x]
  "Looper over en liste og fizzbuzzer den"
  (
    let [lf (loop [i 100 j []]
              (if (not (zero? i))
                (recur (dec i)
                       (conj j (fizzbuzz i))
                       )
                j))]
    (reverse lf)
    )
  )
