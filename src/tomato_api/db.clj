(ns tomato-api.db)

(def tomatos (atom []))

(defn get-all-tomatos []
  @tomatos)

(defn add-tomato [date count]
  (swap! tomatos conj {:date date :count count}))

