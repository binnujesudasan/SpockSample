import spock.lang.Specification

/**
 * Created by SG0224471 on 10/6/2017.
 */
class Test1 extends Specification{
    def "Sample Test 1"() {
        given:
            def a = 10
        when:
            a = a * a
        then:
            a == 100
    }   
}