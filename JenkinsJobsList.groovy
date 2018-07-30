import jenkins.model.*

def jobName = env.getProperty("jobName")
    
def matchedJobs = Jenkins.instance.items.findAll { job ->
    job.name =~ /jobName/
}

matchedJobs.each { job ->
    println job.name
    //job.delete()
}
