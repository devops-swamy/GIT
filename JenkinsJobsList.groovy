import jenkins.model.*

def jobName = System.getenv("jobName").toString();
    
println "jobName"+jobName
    
def matchedJobs = Jenkins.instance.items.findAll { job ->
    job.name =~ /jobName/
}

matchedJobs.each { job ->
    println job.name
    //job.delete()
}
