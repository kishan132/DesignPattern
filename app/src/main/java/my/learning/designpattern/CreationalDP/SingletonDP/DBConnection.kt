package my.learning.designpattern.CreationalDP.SingletonDP

/**
 *
 * Eager Approach to create Singleton class
 *
 * In this approach, the instance of the class is created once the class is loaded
 * by moving in companion object it will create only one instance of the class
 *
 */

class DBConnection1 {
    companion object {
        private val dbConnection: DBConnection = DBConnection()

        fun getInstance(): DBConnection {
            return dbConnection
        }
    }

}

/**
 *
 * Lazy Approach to create Singleton class
 *
 * In this approach, the instance of the class is created only when its method is invoked
 * when there is requirement then only it will create the instance of the class
 * its not thread safe
 *
 */

class DBConnection2 {
    companion object {
        private var dbConnection: DBConnection? = null

        // one problem with this approach is that it is not thread safe
        // if multiple threads are trying to access the instance of the class
        // then it may create multiple instances of the class
        fun getInstance(): DBConnection {
            if(dbConnection == null) {
                dbConnection = DBConnection()
            }

            return dbConnection!!
        }
    }

}

/**
 *
 * Synchronized Approach to create Singleton class
 *
 * In this approach, the instance of the class is created only when its method is invoked
 * when there is requirement then only it will create the instance of the class
 * It is thread safe but not efficient for request coming multiple threads at a time
 *
 */

class DBConnection3 {
    companion object {
        private var dbConnection: DBConnection? = null

        // this approach is tread safe
        //one problem it is not efficient
        // because every time it will check for the instance of the class
        // and it will make the method synchronized
        @Synchronized fun getInstance(): DBConnection {
            if(dbConnection == null) {
                dbConnection = DBConnection()
            }

            return dbConnection!!
        }
    }

}

/**
 *
 * Double check locking Approach to create Singleton class
 *
 * In this approach, the instance of the class is created only when its method is invoked
 * when there is requirement then only it will create the instance of the class
 * It is thread safe
 * it is efficient for request coming multiple threads at a time
 *
 */

class DBConnection {
    companion object {
        private var dbConnection: DBConnection? = null

        // this approach is tread safe
        // it is efficient for request coming multiple threads at a time
        // because it will check for the instance of the class only once
        // and it will make the method synchronized only once

        fun getInstance(): DBConnection {
            // first check
            if(dbConnection == null) {
                synchronized(DBConnection::class.java) {
                    // second check
                    if(dbConnection == null) {
                        dbConnection = DBConnection()
                    }
                }
            }

            return dbConnection!!
        }
    }

}