def call(String url, String branch){
echo "Cloning the Repository"
git url: "${url}", branch: "${branch}"
echo "Cloning Successful"

}
