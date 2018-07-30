import jenkins.model.*

def jobName = build.getEnvironment(listener).get("jobName");
    
println "jobName: "+jobName
    
def matchedJobs = Jenkins.instance.items.findAll { job ->
    job.name =~ /$jobName/
}

matchedJobs.each { job ->
    println job.name
    //job.delete()
}
