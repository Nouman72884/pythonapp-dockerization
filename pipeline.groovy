multibranchPipelineJob('demo') {
    branchSources {
        git {
            //id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/Nouman72884/pythonapp-dockerization.git')
            credentialsId('github')
            includes('master app-changes')
        }
    }
    triggers {
        periodic(1)

}
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
