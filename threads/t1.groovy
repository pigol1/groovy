println("starting the program");

["one","two","three","four"].each { tid ->
    Thread.start {
        println "Thread $tid says Hello World!"
   	Thread.sleep(5000)
	println "Sleet completed: $tid"
	}
}
