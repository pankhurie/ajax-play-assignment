
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/header()),format.raw/*2.10*/("""

"""),format.raw/*4.1*/("""<div class="row">
<br>
    <form class="form" method="post" autocomplete="on" action="""),_display_(/*6.64*/routes/*6.70*/.HomeController.getProfile()),format.raw/*6.98*/(""">
    <div class="container">
        <div class="row">
            <h1>Sign in below</h1>
        </div>
        <div class="form-group form-inline row">
            <div class="form-group ">
                <label for="name">User Name:</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>


            <div class="form-group  col-md-offset-1">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
        </div>

        <div class="form-group row">
            <input type="submit" class="btn btn-success">
        </div>
    </div>
    </form>

</div>
"""),_display_(/*31.2*/footer()))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 23:23:08 IST 2017
                  SOURCE: /home/knoldus/Documents/KIPSolutions/play/play-assignment03/app/views/signin.scala.html
                  HASH: 60de8d5b859d3442589e40cb572feb9b9b70e7ba
                  MATRIX: 522->1|618->3|645->5|673->13|701->15|813->101|827->107|875->135|1643->877
                  LINES: 20->1|25->1|26->2|26->2|28->4|30->6|30->6|30->6|55->31
                  -- GENERATED --
              */
          