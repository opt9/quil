(ns snippets.color.creating-and-reading
  (:require #+cljs quil.snippet
            #+clj [quil.snippet :refer [defsnippet]]
            [quil.core :as q])
  #+cljs
  (:use-macros [quil.snippet :only [defsnippet]]))

; These snippets test non-graphic functions.
; Draw results as strings in sketch.

#+clj
(defsnippet binary {}
  (q/background 255)
  (q/fill 0)
  (q/text (q/binary 42) 10 10)

  (q/text (q/binary 42 5) 10 30))

#+clj
(defsnippet hex {}
  (q/background 255)
  (q/fill 0)
  (q/text (q/hex 42) 10 10)

  (q/text (q/hex 42 5) 10 30))

#+clj
(defsnippet unbinary {}
  (q/background 255)
  (q/fill 0)
  (q/text (str (q/unbinary "0101010")) 10 10))

#+clj
(defsnippet unhex {}
  (q/background 255)
  (q/fill 0)
  (q/text (str (q/unhex "2A")) 10 10))
