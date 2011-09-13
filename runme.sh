#!/bin/bash
groovyc src/*.groovy
groovy src/Main.groovy --cp src/
