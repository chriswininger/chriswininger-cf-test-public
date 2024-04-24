pipeline {
    agent any
     tools {
      maven 'mvn'
    }
    stages {
        stage('Build') {
            steps {
                withMaven {
                  sh 'echo "java version"'
                  sh 'java -version'
                  sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        stage('Policy Evaluation') {
          steps {
            sh '''
              echo "do policy evaluation"
              echo "the directory looks like"
              pwd
              ls -la
            '''
            nexusPolicyEvaluation(
              iqStage: 'build',
              iqApplication: 'chriswininger-temp-test',
              iqScanPatterns: [[scanPattern: 'target/**/*.jar']],
              failBuildOnNetworkError: true,
              runCallflow: true
            )
          }
        }
    }
}



