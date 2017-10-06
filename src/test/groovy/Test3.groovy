import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by SG0224471 on 10/6/2017.
 */
class Test3 extends Specification{
    def "Sample 3"() {
        when:
             a = 1/0
        then:
            thrown(RuntimeException)
    }
}
