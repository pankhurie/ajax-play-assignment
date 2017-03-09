
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/header()),format.raw/*2.10*/("""

"""),format.raw/*4.1*/("""<div class="row">
    <br>
    <form class="form" method="post" autocomplete="on" action="""),_display_(/*6.64*/routes/*6.70*/.HomeController.postProfile()),format.raw/*6.99*/(""">
        <div class="container">
            <div class="row">
                <h1>Please fill details below (Fields marked with * are mandatory)</h1>
            </div>
            <div class="form-group row">
                <label for="name">User Name*:</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>

            <div class="form-group form-inline row">
                <div class="form-group">
                    <label for="fname">First Name*:</label>
                    <input type="text" class="form-control" id="fname" name="fname" required>
                </div>

                <div class=" form-group col-md-offset-1 ">
                    <label for="mname">Middle Name:</label>
                    <input type="text" class="form-control" id="mname" name="mname">
                </div>

                <div class="form-group col-md-offset-1 ">
                    <label for="lname">Last Name:</label>
                    <input type="text" class="form-control" id="lname" name="lname">
                </div>
            </div>
            <div class="form-group form-inline row">
                <div class="form-group  ">
                    <label for="password">Password (Min length 8, cannot be all numbers)*:</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>

                <div class="form-group  col-md-offset-1 ">
                    <label for="repassword">Re-enter Password*:</label>
                    <input type="password" class="form-control" id="repassword" name="repassword" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="mobile">Mobile:</label>
                <input type="text" class="form-control" id="mobile" name="mobile">
            </div>
            <div class="form-group row">
                <label class="radio-inline"><input type="radio" name="gender" value="male">Male</label>
                <label class="radio-inline"><input type="radio" name="gender" value="female">Female</label>
            </div>
            <div class="form-group row">
                <label for="age">Age (18-75)*:</label>
                <input type="text" class="form-control" id="age" name="age" required>
            </div>
            <div class="form-group row">
                <label class="checkbox-inline"><input type="checkbox" name="singing" id="singing" checked="checked" value="true">Singing</label>
                <label class="checkbox-inline"><input type="checkbox" name="dancing" id="dancing" checked="checked" value="true">Dancing</label>
                <label class="checkbox-inline"><input type="checkbox" name="reading" id="reading" checked="checked" value="true">Reading</label>
                <label class="checkbox-inline"><input type="checkbox" name="sports" id="sports" checked="checked" value="true">Sports</label>
            </div>
            <input type="hidden" name="isEnabled" id="isEnabled" value = true>
            <input type="hidden" name="isAdmin" id="isAdmin"
                   """),_display_(/*63.21*/if(play.Play.application().configuration().getString("play.cache.role")=="admin")/*63.102*/{_display_(Seq[Any](format.raw/*63.103*/("""
                        """),format.raw/*64.25*/("""value=true
            """)))}),format.raw/*65.14*/("""
            """),format.raw/*66.13*/("""else """),format.raw/*66.18*/("""{"""),format.raw/*66.19*/("""
            """),format.raw/*67.13*/("""value=false
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/(""">
            <div class="form-group row">
                <input type="submit" class="btn btn-success">
            </div>
        </div>
    </form>

</div>
"""),_display_(/*76.2*/footer()))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Wed Mar 08 01:16:05 IST 2017
                  SOURCE: /home/knoldus/Documents/KIPSolutions/play/play-assignment03/app/views/signup.scala.html
                  HASH: 53fb1b4468e0d86d7ae54348e843e2ab7520b719
                  MATRIX: 522->1|618->3|645->5|673->13|701->15|817->105|831->111|880->140|4093->3326|4184->3407|4224->3408|4277->3433|4332->3457|4373->3470|4406->3475|4435->3476|4476->3489|4528->3513|4557->3514|4743->3674
                  LINES: 20->1|25->1|26->2|26->2|28->4|30->6|30->6|30->6|87->63|87->63|87->63|88->64|89->65|90->66|90->66|90->66|91->67|92->68|92->68|100->76
                  -- GENERATED --
              */
          