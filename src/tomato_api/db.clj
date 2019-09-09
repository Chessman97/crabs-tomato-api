(ns tomato-api.db)

(def tomatos (atom [{:date "08.01.1997" :count 2}
                    {:date "09.01.1997" :count 3}]))

(defn get-all-tomatos []
  @tomatos)

(defn adda [list node]
  (conj (filter (fn [x] (not= (:date x) (:date node))) list) node))

(defn add-tomato [date count]
  (swap! tomatos adda {:date date :count count}))


