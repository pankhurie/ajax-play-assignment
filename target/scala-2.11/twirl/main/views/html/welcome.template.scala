
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/header()),format.raw/*2.10*/("""
"""),format.raw/*3.1*/("""<div class="row">
    <div>
        <h1><center>Welcome. Please Sign in or sign up. </center></h1>
    </div>
</div>
<div class="row">
    <br>
    </div>
<div class="row" id="content">

    <a class="btn btn-success col-md-2 col-md-offset-3" href="/signin" class="col-md-3 col-md-offset-4">Sign in</a>


    <a class="btn btn-success col-md-2 col-md-offset-2" href="/signup" class="col-md-3">Sign up</a>


</div>
"""),_display_(/*20.2*/footer()))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 00:22:18 IST 2017
                  SOURCE: /home/knoldus/Documents/KIPSolutions/play/play-assignment03/app/views/welcome.scala.html
                  HASH: 645ef08fc51cead8a663f98d8c6808866fb7e71e
                  MATRIX: 524->1|620->3|647->5|675->13|702->14|1143->429
                  LINES: 20->1|25->1|26->2|26->2|27->3|44->20
                  -- GENERATED --
              */
          