multibranchPipelineJob('demo') {
    branchSources {
        git {

            remote('https://github.com/Nouman72884/pythonapp-dockerization.git')
            credentialsId('github')
            includes('master app-changes')
        }
    }
    
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
