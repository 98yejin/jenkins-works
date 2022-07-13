// Regular Expression 
// - \w: [a-zA-Z0-9_]
def parameterPattern = ~/(\w+)/ 
params.each { 
    key, value ->
    if (paramterPattern.matcher(key).matches() == false) {
        // Validation Failed 
    }
    if (paramterPattern.matcher(value).matches() == false) {
        // Validation Failed
    }
}