
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Documents/KIPSolutions/play/play-assignment03/conf/routes
// @DATE:Tue Mar 07 23:09:08 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  CountController_3: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    CountController_3: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.HomeController.signin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.getProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newuser""", """controllers.HomeController.postProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management""", """controllers.HomeController.management()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management""", """controllers.HomeController.toggle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_signin4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_HomeController_signin4_invoker = createInvoker(
    HomeController_0.signin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signin",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    HomeController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_getProfile6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_getProfile6_invoker = createInvoker(
    HomeController_0.getProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_postProfile7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newuser")))
  )
  private[this] lazy val controllers_HomeController_postProfile7_invoker = createInvoker(
    HomeController_0.postProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """newuser"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout8_invoker = createInvoker(
    HomeController_0.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_upload9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_upload9_invoker = createInvoker(
    HomeController_0.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_management10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management")))
  )
  private[this] lazy val controllers_HomeController_management10_invoker = createInvoker(
    HomeController_0.management(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "management",
      Nil,
      "GET",
      """""",
      this.prefix + """management"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_toggle11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management")))
  )
  private[this] lazy val controllers_HomeController_toggle11_invoker = createInvoker(
    HomeController_0.toggle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "toggle",
      Nil,
      "POST",
      """""",
      this.prefix + """management"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_profile12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile12_invoker = createInvoker(
    HomeController_0.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_3.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_HomeController_signin4_route(params) =>
      call { 
        controllers_HomeController_signin4_invoker.call(HomeController_0.signin)
      }
  
    // @LINE:15
    case controllers_HomeController_signup5_route(params) =>
      call { 
        controllers_HomeController_signup5_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:16
    case controllers_HomeController_getProfile6_route(params) =>
      call { 
        controllers_HomeController_getProfile6_invoker.call(HomeController_0.getProfile())
      }
  
    // @LINE:17
    case controllers_HomeController_postProfile7_route(params) =>
      call { 
        controllers_HomeController_postProfile7_invoker.call(HomeController_0.postProfile())
      }
  
    // @LINE:18
    case controllers_HomeController_logout8_route(params) =>
      call { 
        controllers_HomeController_logout8_invoker.call(HomeController_0.logout())
      }
  
    // @LINE:19
    case controllers_HomeController_upload9_route(params) =>
      call { 
        controllers_HomeController_upload9_invoker.call(HomeController_0.upload())
      }
  
    // @LINE:20
    case controllers_HomeController_management10_route(params) =>
      call { 
        controllers_HomeController_management10_invoker.call(HomeController_0.management())
      }
  
    // @LINE:21
    case controllers_HomeController_toggle11_route(params) =>
      call { 
        controllers_HomeController_toggle11_invoker.call(HomeController_0.toggle())
      }
  
    // @LINE:22
    case controllers_HomeController_profile12_route(params) =>
      call { 
        controllers_HomeController_profile12_invoker.call(HomeController_0.profile)
      }
  }
}
