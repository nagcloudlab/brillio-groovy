package com.example.dsl
import static com.example.dsl.JenkinsDsl.*   ;

// NAG DSL
pipeline {
    agent any
    environment {
        SOME_NUMBER=123
        SOME_STRING="foobar"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'ls'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
}