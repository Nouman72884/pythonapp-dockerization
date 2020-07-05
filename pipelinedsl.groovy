pipelineJob("flask_app_demo") {
  properties {
    pipelineTriggers {
      triggers {
        githubPush()
      }
    }
  }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/Nouman72884/pythonapp-dockerization.git")
            credentials("github_credentials")
          }
          branch('master')
        }
      }
      scriptPath("jenkinsfile")
    }
  }
}
