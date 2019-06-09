(ns mastermind.code-breaker)

(defn guess-to-number [guess]
  (reduce #(+ (* 6 %1) %2) guess))

(defn number-to-guess [n]
  (loop [guess (list)
         num n]
    (if (= 4 (count guess))
      guess
      (recur (cons (rem num 6) guess) (quot num 6)))))

(defn inc-guess [guess]
  (let [guess-number (guess-to-number guess)]))

(defn break-code [past-guesses]
  [0 0 0 0])