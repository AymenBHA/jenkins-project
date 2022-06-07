def buildJar (){
    echo "building the application ..."
    sh "mvn package"
}

def buildImage (){
    echo "building the docker image ..."
    withCredentials([usernamePassword(withCredentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')])
        sh 'docker build -t balha001/app:A .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push balha001/app:A'
}

def deployApp (){
    echo "deploying the app ..."
}

return this