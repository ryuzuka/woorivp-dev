/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.39
 * Generated at: 2020-03-27 10:00:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.mobile.en.general.main.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/common/import/taglib.jspf", Long.valueOf(1555304080000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528432326000L));
    _jspx_dependants.put("jar:file:/home/ktbnetwork/www/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\t<section class=\"container\">\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<div class=\"mainSwipe\">\r\n");
      out.write("\t\t\t\t<div class=\"swiper-container\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"swiper-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"swiper-slide\"><a href=\"/home/en/watwedo/overview.do\" role=\"button\"><img src=\"/static/mobile/en/images/MA/img_main_promotion1.gif\" alt=\"Complete your success story with KTB Network - What We Do\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"swiper-slide\"><img src=\"/static/mobile/en/images/MA/img_main_promotion2.gif\" alt=\"Creating tomorrow’s value through high-potential ventures\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"swiper-slide\"><img src=\"/static/mobile/en/images/MA/img_main_promotion3.gif\" alt=\"Over the last 38 years since establishment,We walked together with 277 firms through IPO (including backdoor listing)\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"swiper-slide\"><img src=\"/static/mobile/en/images/MA/img_main_promotion4.gif\" alt=\"With decades of experience and global network We reach for the world\"></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"indicator\">\r\n");
      out.write("\t\t\t\t\t<div class=\"indiList\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"on\" title=\"select\">1</button><button type=\"button\">2</button><button type=\"button\">3</button><button type=\"button\">4</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //mainSwipe -->\r\n");
      out.write("\t\t\t<div class=\"srvIntro\">\r\n");
      out.write("\t\t\t\t<p class=\"srvTit\"><em>Our Fund Status</em><br>Grow Together with<br>KTB Network.</p>\r\n");
      out.write("\t\t\t\t<div class=\"tabCont on\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"fundStatus\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contBox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"tit\">Funds Exited</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Funds exited</dt><dd class=\"num01\">53</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Capital Raised<em style=\"white-space: nowrap\">(Unit : USD  Million)</em></dt><dd class=\"num02\">1.1</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Total Paid Out<em style=\"white-space: nowrap\">(Unit : USD  Million)</em></dt><dd class=\"num02\">1.7</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>IRR<em>(Unit : %)</em></dt><dd class=\"num02\">19.75</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#MAL1\" role=\"button\" class=\"btnView\">Documentation Criteria</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contBox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"tit\">Funds Active</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Funds Active<em>&nbsp;</em></dt><dd class=\"num01\">17</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Funds Size<em>&nbsp;</em></dt><dd class=\"num01\">763</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt style=\"white-space: nowrap\">Portfolio Companies</dt><dd class=\"num01\">297</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Total Amount<br>Invested<em></em></dt><dd class=\"num02\">588</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <dt>Capital Pledged<em>(Unit : USDMillion)</em></dt><dd class=\"num02\">756</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>Capital Deployed<em>(Unit : USDMillion)</em></dt><dd class=\"num02\">520</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt>IRR(e)<em>(Unit : %)</em></dt><dd class=\"num02\">16.22</dd> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#MAL2\" role=\"button\" class=\"btnView\">Documentation Criteria</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //srvIntro -->\r\n");
      out.write("\t\t\t<div class=\"introCon\">\r\n");
      out.write("\t\t\t\t<strong class=\"tit\"><a href=\"/home/en/watwedo/philosophy.do\" role=\"button\">Our Philosophy</a></strong>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"check01\">\r\n");
      out.write("\t\t\t\t\t\t<strong>Alignment of Interest</strong>We align our partners towards a common goal.\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"check02\">\r\n");
      out.write("\t\t\t\t\t\t<strong>Active Value Creation</strong>We support our portfolio companies through value-creating activities to achieve sustainable growth, the companies’ success and attaining returns\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"check03\">\r\n");
      out.write("\t\t\t\t\t\t<strong>Compliance</strong>We actively maintain our compliance system to control operational risk and prevent moral hazard\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //introCon -->\r\n");
      out.write("\t\t\t<div class=\"menuBanner01\">\r\n");
      out.write("\t\t\t\t<a href=\"/home/en/whoweare/korea.do\">\r\n");
      out.write("\t\t\t\t\t<strong>Our team works with you<br>to ensure successful<br>investments.</strong>\r\n");
      out.write("\t\t\t\t\t<p>Who We Are</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"menuBanner02\">\r\n");
      out.write("\t\t\t\t<a href=\"/home/en/meetourpartners/all.do\">\r\n");
      out.write("\t\t\t\t\t<strong>Meet Our Partners</strong>\r\n");
      out.write("\t\t\t\t\t<p>We will be your most<br>reliable partner in<br>investment.</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layerPop open\" id=\"MAL1\">\r\n");
      out.write("\t\t<div class=\"layerContainer\">\r\n");
      out.write("\t\t\t<h2 class=\"layerTit\">Documentation Criteria</h2>\r\n");
      out.write("\t\t\t<div class=\"layerCont\" tabindex=\"0\">\r\n");
      out.write("\t\t\t\t<ul class=\"listDep2\">\r\n");
      out.write("\t\t\t\t\t<li>The present 2019.12.31</li>\r\n");
      out.write("\t\t\t\t\t<li>Fully liquidated fund since Jan, 2000</li>\r\n");
      out.write("\t\t\t\t\t<li>IRR : Include Performance Remuneration, Weighted average return on payments</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button type=\"button\" class=\"layerClose\">close</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layerPop open\" id=\"MAL2\">\r\n");
      out.write("\t\t<div class=\"layerContainer\">\r\n");
      out.write("\t\t\t<h2 class=\"layerTit\">Documentation Criteria</h2>\r\n");
      out.write("\t\t\t<div class=\"layerCont\" tabindex=\"0\">\r\n");
      out.write("\t\t\t\t<ul class=\"listDep2\">\r\n");
      out.write("\t\t\t\t\t<li>The present 2019.12.31</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button type=\"button\" class=\"layerClose\">close</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"dimmed\"></div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
