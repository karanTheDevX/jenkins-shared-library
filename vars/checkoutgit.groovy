def call(String url, String branch){
echo "Cloning the Repository"
git url: "${url}", branch: "${branch}", credentialsId: 'git-cred'
echo "Cloning Successful"

}
