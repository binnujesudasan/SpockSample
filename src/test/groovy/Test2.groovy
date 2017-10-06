import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by SG0224471 on 10/6/2017.
 */
class Test2 extends Specification{
    @Unroll
    def "Sample 2"() {
        expect:
            a + b == c
        where:
            a   |b   |c
            1   |7   |8
            2   |6   |8
            3   |5   |8
    }
}