
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object management_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object management_Scope1 {
import scala.collection.mutable.ListBuffer

class management extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[ListBuffer[models.User],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(list:ListBuffer[models.User], loggedUser:models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.56*/("""
"""),_display_(/*3.2*/header()),format.raw/*3.10*/("""
"""),format.raw/*4.1*/("""<h1>Management Console (Disable/Enable Users)</h1>
<br><br>
<div class="row container">
    <table class="table">
        <tbody>
        """),_display_(/*9.10*/for(user <- list) yield /*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""
        """),_display_(/*10.10*/if(user.name!=loggedUser.name)/*10.40*/{_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.9*/("""<tr>
            <td>"""),_display_(/*12.18*/user/*12.22*/.name),format.raw/*12.27*/("""</td>
            <td>User Enabled?: """),_display_(/*13.33*/user/*13.37*/.isEnabled),format.raw/*13.47*/("""</td>
            <td>
                <form class="form" method="post" action="""),_display_(/*15.58*/routes/*15.64*/.HomeController.toggle()),format.raw/*15.88*/(""">
                    <input type="hidden" id="username" name="username" value="""),_display_(/*16.79*/user/*16.83*/.name),format.raw/*16.88*/(""">
                    <input type="submit" class="btn btn-default" name="toggleEnable" id = "toggleEnable"
                           """),_display_(/*18.29*/if(user.isEnabled)/*18.47*/{_display_(Seq[Any](format.raw/*18.48*/("""
                    """),format.raw/*19.21*/("""value="Disable"

                    """)))}),format.raw/*21.22*/("""
                    """),format.raw/*22.21*/("""else"""),format.raw/*22.25*/("""{"""),format.raw/*22.26*/("""
                    """),format.raw/*23.21*/("""value="Enable"

                    """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
                    """),format.raw/*26.21*/(""">
                </form>
            </td>
        </tr>
        """)))}),format.raw/*30.10*/("""
        """)))}),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""</tbody>
    </table>
    <a class="btn btn-default" href="/profile">Go to profile</a>
</div>
"""),_display_(/*36.2*/footer()),format.raw/*36.10*/("""
"""))
      }
    }
  }

  def render(list:ListBuffer[models.User],loggedUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(list,loggedUser)

  def f:((ListBuffer[models.User],models.User) => play.twirl.api.HtmlFormat.Appendable) = (list,loggedUser) => apply(list,loggedUser)

  def ref: this.type = this

}


}
}

/**/
object management extends management_Scope0.management_Scope1.management
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 15:51:31 IST 2017
                  SOURCE: /home/knoldus/Documents/KIPSolutions/play/play-assignment03/app/views/management.scala.html
                  HASH: 7446636f0774f0e8eb8402a58f05fa4bca31cc53
                  MATRIX: 642->45|791->99|818->101|846->109|873->110|1038->249|1070->266|1109->268|1146->278|1185->308|1224->309|1260->318|1309->340|1322->344|1348->349|1413->387|1426->391|1457->401|1564->481|1579->487|1624->511|1731->591|1744->595|1770->600|1932->735|1959->753|1998->754|2047->775|2116->813|2165->834|2197->838|2226->839|2275->860|2339->896|2368->897|2417->918|2515->985|2556->995|2592->1004|2713->1099|2742->1107
                  LINES: 23->2|28->2|29->3|29->3|30->4|35->9|35->9|35->9|36->10|36->10|36->10|37->11|38->12|38->12|38->12|39->13|39->13|39->13|41->15|41->15|41->15|42->16|42->16|42->16|44->18|44->18|44->18|45->19|47->21|48->22|48->22|48->22|49->23|51->25|51->25|52->26|56->30|57->31|58->32|62->36|62->36
                  -- GENERATED --
              */
          