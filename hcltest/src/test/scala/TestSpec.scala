import com.mahendar.Test
import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Inspectors}
import org.scalatest.junit.JUnitRunner
import org.scalatest.mockito.MockitoSugar

@RunWith(classOf[JUnitRunner])
class TestSpec extends FlatSpec with Inspectors with MockitoSugar{
  var obj = new Test

  "finAreOfTriangle" should "find the area of triangle" in {
    val area = obj.findAreOfTriangle(3,4,5)
    assert(area === 6.0 )
  }



}
