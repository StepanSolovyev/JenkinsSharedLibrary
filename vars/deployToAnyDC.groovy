// /vars/deployToAnyDC.groovy
import  jenkins.lib.datacenters.*; // wildcard MUST be here to support all classes in package (DCs names)

def call(){
    // creating DataCenter class object based on Jenkins Job name
    // using env.JOB_BASE_NAME to read current Jenkins Job name
    def currentDC = this.class.classLoader.loadClass("src.jenkins.lib.datacenters."+env.JOB_BASE_NAME, true, false ).newInstance();

    pipeline {
        stages {
            stage ('Make deploy in a loop'){
                steps () {
                    script{
                        // reading hostGroupOne field to access host names
                        currentDC.hostGroupOne.foreach(){ host ->
                            // TODO: write your deploy procedure here
                            println host;
                        }

                        // reading host names shared by all DataCenters by parent class
                        currentDC.hostGroupThree.foreach(){ host ->
                            // TODO: write your deploy procedure here
                            println host;
                        }
                    }
                }
            }
        }
    }
}