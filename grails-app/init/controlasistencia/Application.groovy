package controlasistencia

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
        
        ///
        

        grails.plugin.reveng.packageName = 'com.revengtest'
        grails.plugin.reveng.versionColumns = [other: 'nonstandard_version_name']
        grails.plugin.reveng.manyToManyTables = ['user_role']
        grails.plugin.reveng.manyToManyBelongsTos = ['user_role': 'role', 'author_books': 'book']


        ///
    }
}