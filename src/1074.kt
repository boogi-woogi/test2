import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

private val s = Scanner(System.`in`)
//var arr = Array(16384, { IntArray(16384, { 0 }) })
var cnt = -1
var N=-1
var r=-1
var c=-1
var answer=0
fun marking(curY: Int, curX: Int, range: Int) {
    if (r==curY&&c==curX) {
        print(answer)
        return Unit
    } else if(r<curY+range&&r>=curY&&c<curX+range&&c>=curX){//범위 안에 있을 경우 4분면 탐색
        marking(curY, curX, range / 2)
        marking(curY, curX + range / 2, range / 2)
        marking(curY + range / 2, curX, range / 2)
        marking(curY + range / 2, curX + range / 2, range / 2)
    }
    else{// 그 범위 안에 없을 경우 그 영역의 넓이 +해주기
        answer+=range*range
    }
}

fun main() {
    N=s.nextInt()
    r=s.nextInt()
    c=s.nextInt()
    marking(0, 0 , (2.0).pow(N).toInt())
}

