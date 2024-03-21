// src/jenkins/lib/datacenters/DataCenter.groovy
package src.jenkins.lib.datacenters;

// base class for all datacenters
class DataCenter{
    public static final String[]    hostGroupOne;
    public static final String[]    hostGroupTwo;

    public static final String[]    hostGroupThree = ["host5", "host6"]; // this field value should be available for all child datacenters (classes)
}