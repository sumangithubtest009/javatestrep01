pipeline 
    agent {label 'test'}
 
 stages {
      stage ('Test')
       steps {
           bat 'docker run -it -p 82:80 -d suman/apachetest'
       }
}