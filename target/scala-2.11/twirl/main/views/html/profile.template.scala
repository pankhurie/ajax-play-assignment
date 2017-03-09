
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object profile_Scope1 {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import play.api.mvc.Session
import play.api.mvc.Request

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User,play.api.mvc.RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user:models.User)(implicit request: play.api.mvc.RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.66*/("""
"""),_display_(/*6.2*/header()),format.raw/*6.10*/("""
"""),format.raw/*7.1*/("""<br><br>
<div class="row container">
    <i>Welcome  """),_display_(/*9.18*/request/*9.25*/.session.get("connected")),format.raw/*9.50*/("""</i></div><br>
<div class="row container">
    <table class="table">
        <tbody>
        <tr>
            <td>User Name</td>
            <td>"""),_display_(/*15.18*/user/*15.22*/.name),format.raw/*15.27*/("""</td>
        </tr>
        <tr>
            <td>First Name</td>
            <td>"""),_display_(/*19.18*/user/*19.22*/.fname),format.raw/*19.28*/("""</td>
        </tr>
        <tr>
            <td>Middle Name</td>
            <td>"""),_display_(/*23.18*/user/*23.22*/.mname),format.raw/*23.28*/("""</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>"""),_display_(/*27.18*/user/*27.22*/.lname),format.raw/*27.28*/("""</td>
        </tr>

        <tr >
            <td>Mobile</td>
            <td>"""),_display_(/*32.18*/user/*32.22*/.mobile),format.raw/*32.29*/("""</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>"""),_display_(/*36.18*/user/*36.22*/.gender),format.raw/*36.29*/("""</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>"""),_display_(/*40.18*/user/*40.22*/.age),format.raw/*40.26*/("""</td>
        </tr>
        <tr>
            <td>Hobbies</td>

            <td>
                """),_display_(/*46.18*/if(user.singing)/*46.34*/{_display_(Seq[Any](format.raw/*46.35*/("""
                """),format.raw/*47.17*/("""Singing<br>
                """)))}),format.raw/*48.18*/("""
                """),_display_(/*49.18*/if(user.dancing)/*49.34*/{_display_(Seq[Any](format.raw/*49.35*/("""
                """),format.raw/*50.17*/("""Dancing<br>
                """)))}),format.raw/*51.18*/("""
                """),_display_(/*52.18*/if(user.reading)/*52.34*/{_display_(Seq[Any](format.raw/*52.35*/("""
                """),format.raw/*53.17*/("""Reading<br>
                """)))}),format.raw/*54.18*/("""
                """),_display_(/*55.18*/if(user.sports)/*55.33*/{_display_(Seq[Any](format.raw/*55.34*/("""
                """),format.raw/*56.17*/("""Sports<br>
                """)))}),format.raw/*57.18*/("""
            """),format.raw/*58.13*/("""</td>


        </tr>
        <tr>
            <form method="post" action = """"),_display_(/*63.44*/routes/*63.50*/.HomeController.upload),format.raw/*63.72*/("""" enctype="multipart/form-data">
                <td>Add Profile Picture</td>
                <td>
                    <input type="file" name="picture"> <input type="submit" value="Upload" class="btn btn-default">
                </td>
            </form>
        </tr>

        """),_display_(/*71.10*/if(user.isAdmin)/*71.26*/{_display_(Seq[Any](format.raw/*71.27*/("""
        """),format.raw/*72.9*/("""<tr>
            <td>Manage Users</td>
            <td><a href="/management">Go To Management Console</a></td>

        </tr>
        """)))}),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""</tbody>
    </table>

    <a href="/logout" class="btn btn-success">Logout</a>
    </div>
"""),_display_(/*84.2*/footer()),format.raw/*84.10*/("""
"""))
      }
    }
  }

  def render(user:models.User,request:play.api.mvc.RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(user)(request)

  def f:((models.User) => (play.api.mvc.RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)

  def ref: this.type = this

}


}
}

/**/
object profile extends profile_Scope0.profile_Scope1.profile
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 15:55:36 IST 2017
                  SOURCE: /home/knoldus/Documents/KIPSolutions/play/play-assignment03/app/views/profile.scala.html
                  HASH: 7b10723b47d780c3cb36e397a686949be3169765
                  MATRIX: 720->132|879->196|906->198|934->206|961->207|1041->261|1056->268|1101->293|1274->439|1287->443|1313->448|1422->530|1435->534|1462->540|1572->623|1585->627|1612->633|1720->714|1733->718|1760->724|1867->804|1880->808|1908->815|2013->893|2026->897|2054->904|2156->979|2169->983|2194->987|2318->1084|2343->1100|2382->1101|2427->1118|2487->1147|2532->1165|2557->1181|2596->1182|2641->1199|2701->1228|2746->1246|2771->1262|2810->1263|2855->1280|2915->1309|2960->1327|2984->1342|3023->1343|3068->1360|3127->1388|3168->1401|3273->1479|3288->1485|3331->1507|3639->1788|3664->1804|3703->1805|3739->1814|3905->1949|3942->1959|4060->2051|4089->2059
                  LINES: 26->5|31->5|32->6|32->6|33->7|35->9|35->9|35->9|41->15|41->15|41->15|45->19|45->19|45->19|49->23|49->23|49->23|53->27|53->27|53->27|58->32|58->32|58->32|62->36|62->36|62->36|66->40|66->40|66->40|72->46|72->46|72->46|73->47|74->48|75->49|75->49|75->49|76->50|77->51|78->52|78->52|78->52|79->53|80->54|81->55|81->55|81->55|82->56|83->57|84->58|89->63|89->63|89->63|97->71|97->71|97->71|98->72|103->77|105->79|110->84|110->84
                  -- GENERATED --
              */
          