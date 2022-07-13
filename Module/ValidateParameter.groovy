def call() {
    def paramsPattern = ~/(\w+)/
    def invalidKeys = []
    params.each { key, value ->
        if (!pattern.matcher(key).matches()) {
            invalidKeys.add(key)
        } 
    }
    if (invalidKeys) {
        throw new Exception("parameter validataion failed! keys:[${invalidKeys}]")
    }
}

def call(pattern, Closure onFail) {
    params.each { key, value ->
        if (pattern.matcher(key).matches()) {
            // do nothing 
        } else {
            onFail()
        }
    }
}

