pipeline {
  agent any
  tools {
    maven 'Maven' 
  }
  stages {
    stage ('Build') {
      steps {
        sh "mvn install:install-file '-DgroupId=org.mozilla' '-DartifactId=jss' '-Dversion=4.2.5' '-Dpackaging=jar' '-Dfile=C:\Users\AArmijos\workspace\componentes-1.0.4\deps\jss-4.2.5.jar' "
      }
    }

  }
}
