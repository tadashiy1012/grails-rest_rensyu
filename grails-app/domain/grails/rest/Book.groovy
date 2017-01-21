package grails.rest

import grails.rest.Resource

@Resource(uri='/books')
class Book {

    String title

    static constraints = {
    }
}
