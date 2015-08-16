["one","two","three","four"].each { tid ->
    Thread.start {
        println "Thread $tid says Hello World!"
    }
}
