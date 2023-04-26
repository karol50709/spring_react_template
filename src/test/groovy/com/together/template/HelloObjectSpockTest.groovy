package com.together.template

import spock.lang.Specification

class HelloObjectSpockTest extends Specification {

    def "object not null"(){
        expect:
        new HelloObject() != null
    }
}
