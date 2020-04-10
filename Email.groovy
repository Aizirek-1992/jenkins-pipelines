<<<<<<< HEAD
node {
        stage("Stage1"){
                echo "hello"
}
        stage("Stage2"){
                echo "hello"
}
        stage("Stage3"){
                echo "hello"
}
        stage("Stage4"){
                echo "hello"
}
        stage("Send Email to Support"){
                mail bcc: '', body: 'Running', cc: 'support@company.com', from: '', replyTo: '', subject: 'Test', to: 'farrukhsadykov@gmail.com'
        }
}
=======
node { 
stage("Stage1"){ 
echo "hello" 
} 
stage("Stage2"){ 
echo "hello" 
} 
stage("Stage3"){ 
echo "hello" 
} 
stage("Stage4"){ 
echo "hello" 
} 
stage("Send Email to Support"){ 
mail bcc: '', body: 'Running', cc: 'support@company.com', from: '', replyTo: '', subject: 'Test', to: 'aizirekt98@gmail.com' 
} 
} 
>>>>>>> 3e23b5a991e051c0d0d9ac474ca1add611ac86d0
