node {
 
   stage('code checkout') { 
       
       git credentialsId: 'githubID', url: 'https://github.com/creativetech123/exam.git'
       
   }
   
   stage('Build') {
       withMaven(jdk: 'JDK', maven: 'maven') {
    sh 'mvn clean compile'
}
     
      
   }
   
   stage('unit test') {
       withMaven(jdk: 'JDK', maven: 'maven') {
    sh 'mvn test' 
}
      
   }
 //stage('sonar test') {
 //      withMaven(jdk: 'JDK', maven: 'maven') {
 //   sh 'mvn clean compile sonar:sonar -Dsonar.projectKey=maven-project -Dsonar.organization=creativetech123 -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=e130fab062012d5160ab51a8ee03561c457e0268' 
 //}
  
 //    }
   stage('package') {
       withMaven(jdk: 'JDK', maven: 'maven') {
    sh 'mvn package'
}
      
   }
   
   stage('deploy to dev') {
      
   }
   
   stage('deploy to test') {
      
   }
   
   stage('deploy to prod') {
      
   }
}
