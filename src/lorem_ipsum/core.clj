(ns lorem-ipsum.core
  (:gen-class))

(def words
  ["do" "eiusmod" "incididunt" "labore" "dolore" "aliqua" "erat" "bibendum"
   "venenatis" "condimentum" "nisi" "natoque" "penatibus" "magnis" "dis"
   "parturient" "montes" "aenean" "nam" "ante" "metus" "tempor" "nullam"
   "suscipit" "justo" "posuere" "eleifend" "vulputate" "luctus" "accumsan"
   "lacus" "dictum" "fusce" "euismod" "placerat" "elementum" "pharetra"
   "maecenas" "ultricies" "suspendisse" "potenti" "pulvinar" "gravida"
   "hendrerit" "interdum" "laoreet" "magna" "urna" "porttitor" "rhoncus"
   "dolor" "non" "praesent" "nec" "pretium" "fringilla" "est" "nulla"
   "facilisi" "etiam" "dignissim" "tincidunt" "lobortis" "vivamus" "augue"
   "velit" "ligula" "ullamcorper" "malesuada" "a" "duis" "diam" "quam" "mattis"
   "libero" "ornare" "arcu" "elit" "pellentesque" "habitant" "tristique"
   "senectus" "netus" "ut" "sem" "eget" "viverra" "integer" "feugiat"
   "scelerisque" "varius" "mollis" "consectetur" "lorem" "donec" "sapien"
   "molestie" "semper" "auctor" "neque" "vitae" "tempus" "nisl" "ipsum"
   "faucibus" "cras" "adipiscing" "enim" "eu" "turpis" "volutpat" "consequat"
   "nunc" "congue" "leo" "vel" "porta" "fermentum" "et" "sollicitudin" "ac"
   "orci" "phasellus" "egestas" "tellus" "rutrum" "mauris" "amet" "massa"
   "nibh" "tortor" "id" "aliquet" "lectus" "proin" "aliquam" "vestibulum"
   "blandit" "risus" "at" "ultrices" "mi" "facilisis" "sed" "morbi" "quis"
   "commodo" "odio" "cursus" "in" "hac" "habitasse" "platea" "dictumst"
   "quisque" "sagittis" "purus" "sit"])

(def prologue
  "Lorem ipsum dolor sit amet, consectetur adipiscing elit")

(defn word
  ([]
    (rand-nth words))
  ([a]
    (take a (repeatedly #(rand-nth words))))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
