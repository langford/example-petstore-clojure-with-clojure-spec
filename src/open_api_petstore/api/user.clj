(ns open-api-petstore.api.user
  (:require [open-api-petstore.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-user-with-http-info
  "Create user
  This can only be done by the logged in user."
  [user ]
  (check-required-params user)
  (call-api "/user" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn create-user
  "Create user
  This can only be done by the logged in user."
  [user ]
  (:data (create-user-with-http-info user)))

(defn create-users-with-array-input-with-http-info
  "Creates list of users with given input array"
  [user ]
  (check-required-params user)
  (call-api "/user/createWithArray" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn create-users-with-array-input
  "Creates list of users with given input array"
  [user ]
  (:data (create-users-with-array-input-with-http-info user)))

(defn create-users-with-list-input-with-http-info
  "Creates list of users with given input array"
  [user ]
  (check-required-params user)
  (call-api "/user/createWithList" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn create-users-with-list-input
  "Creates list of users with given input array"
  [user ]
  (:data (create-users-with-list-input-with-http-info user)))

(defn delete-user-with-http-info
  "Delete user
  This can only be done by the logged in user."
  [username ]
  (check-required-params username)
  (call-api "/user/{username}" :delete
            {:path-params   {"username" username }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn delete-user
  "Delete user
  This can only be done by the logged in user."
  [username ]
  (:data (delete-user-with-http-info username)))

(defn get-user-by-name-with-http-info
  "Get user by user name"
  [username ]
  (check-required-params username)
  (call-api "/user/{username}" :get
            {:path-params   {"username" username }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/xml" "application/json"]
             :auth-names    []}))

(defn get-user-by-name
  "Get user by user name"
  [username ]
  (:data (get-user-by-name-with-http-info username)))

(defn login-user-with-http-info
  "Logs user into the system"
  [username password ]
  (check-required-params username password)
  (call-api "/user/login" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"username" username "password" password }
             :form-params   {}
             :content-types []
             :accepts       ["application/xml" "application/json"]
             :auth-names    []}))

(defn login-user
  "Logs user into the system"
  [username password ]
  (:data (login-user-with-http-info username password)))

(defn logout-user-with-http-info
  "Logs out current logged in user session"
  []
  (call-api "/user/logout" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn logout-user
  "Logs out current logged in user session"
  []
  (:data (logout-user-with-http-info)))

(defn update-user-with-http-info
  "Updated user
  This can only be done by the logged in user."
  [username user ]
  (check-required-params username user)
  (call-api "/user/{username}" :put
            {:path-params   {"username" username }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    user
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn update-user
  "Updated user
  This can only be done by the logged in user."
  [username user ]
  (:data (update-user-with-http-info username user)))

