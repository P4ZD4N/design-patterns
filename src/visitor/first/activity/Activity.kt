package visitor.first.activity

import visitor.first.visitor.Visitor

interface Activity {

    fun accept(visitor: Visitor)
}