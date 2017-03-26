(ns alexanderjamesking.cv
  (:require [alexanderjamesking.html :refer :all])
  (:use [hiccup.core]
        [hiccup.page]
        [hiccup.element :only [link-to]]))

(defn content []
  (wrapper
   :cv
   [:div {:class "pure-g"}
    [:div {:class "pure-u-1 pure-u-md-4-5"}
     [:h1 "Alexander James King"]
     [:h2 "Software Engineer"]

     [:article 
      [:h3 "Profile"]
      [:p "An enthusiastic, hard working, senior software engineer, passionate about delivering clean, well tested code, that is easy for others to understand."]
      [:p "Adept at working in agile environments, pair programming, and communicating technical implications and processes to non-technical colleagues."]
      [:p "A versatile developer, experienced in both client and server side development, with a natural passion for software engineering."]]

     [:article 
      [:h3 "Expertise"]
      [:ul
       [:li "Scala, SBT, Play, Akka-Http"]
       [:li "Clojure, Leiningen"]
       [:li "Java, Maven, Groovy, Spring, Cucumber JVM, JAX-RS, Apache Camel, JMS"]
       [:li "Javascript, ES6, React, Redux, Node.js, Mocha, JSON, jQuery, MongoDB"]
       [:li "PHP, Linux, Apache, MySQL"]
       [:li "BDD, TDD, Cucumber, Continuous Delivery "]
       [:li "REST, CQRS, Event Sourcing"]
       [:li "Travis, Jenkins"]
       [:li "Amazon Web Services (EC2, SNS, SQS, S3)"]
       [:li "MarkLogic, XML, XQuery, XSLT"]
       [:li "Linked Data, SPARQL, RDF"]
       [:li "Git, Subversion"]
       [:li "XP, Agile, Kanban, Scrum"]
       ]]

     [:article 
      [:h3 "Achievements"]
      [:ul
       [:li "HMRC - Delievered a new system to prepare tax credit renewals for automation vastly reducing the manual work required to process renewals every year."]
       [:li "HMRC - Delivered a new payments system to process business tax payments."]
       [:li "BBC News - Successfully delivered the 2014 Elections results service working to a tight deadline."]
       [:li "BBC Core Engineering - Delivered new CMS features whilst contintually refactoring and improving code."]
       [:li "BBC Sport - Led the design and delivery of a new Java service to aggregate content from multiple APIs and dramatically improved the speed of content delivery to users of the site."]
       [:li "BBC Sport - Mentored software engineers at BBC Sport, encouraging development best practices (BDD, TDD, Clean Code)."]
       [:li "BBC Sport - Assisted in designing a new architecture with a consistent data format across sports, improved the speed of delivery and cost of maintenance."]
       [:li "CTI Digital - Bridged the gap between the front end and service layer teams, improved communication and ensured key deadlines were met."]
       [:li "England Agency - Designed and built a new CMS used on over 200 sites, dramatically reduced development time of new sites enabling a smaller team to deliver more."]
       [:li "England Agency - Led the development of World Cup and Champions League games for large betting client (AS3 frontend, PHP/MySQL REST api service) played by over half a million people worldwide."]
       ]]

     
     [:h3 "Professional Experience"]
     [:article
      [:h4 "Medidata (06/2016-03/2017)"]
      [:h5 "Senior Software Engineer (Full Stack)"]
      [:p "Development of a greenfield project. An ES6 React/Redux front end application with microservice Scala and Akka-Http backend applications."]
      [:p "ES6, React, Redux, Scala, Akka-Http, Selenium, MySQL, AWS, Travis CI, Swagger"]]

     [:article
      [:h4 "NOW TV (Sky) (12/2015 - 05/2016)"]
      [:h5 "Software Developer"]
      [:p "Ongoing development of the NOW TV platform, migration from a Java EE application to microservices written in Scala."]
      [:p "Scala, Play, Spray, Java, Groovy, Spock, REST, MongoDB, Swagger"]]

     [:article
      [:h4 "HMRC (09/2014 - 11/2015)"]
      [:h5 "Scala developer"]
      [:p "Development of a new payments system integrating with Worldpay."]
      [:p "Continued development and improvement of business tax homepage."]
      [:p "Development of a new system to automate tax credit renewals."]
      [:p "Scala, Play, REST, Cucumber JVM, Selenium, Microservices, Docker, MongoDB"]]

     [:article
      [:h4 "BBC News (03/2014 - 08/2014)"]
      [:h5 "Senior Software Engineer"]
      [:p "Delivered a new system to consume, transform and persist election results."]
      [:p "Development of an aggregation API to improve the delivery of content to the News IOS and Android apps."]
      [:p "Java, REST, AWS, Apache Camel, MySQL"]]

     [:article
      [:h4 "BBC Core Engineering (September 2013 - March 2014)"]
      [:h5 "Senior Software Engineer"]
      [:p "Development of a new in-house CMS. Focused on delivering new features to enable clients to migrate to the new system, dramatically improved the feedback loop and quality of the tests to faciliate BDD."]
      [:p "Provided expertise around the use of MarkLogic, worked on forming a strategy to reduce duplication across the various content management systems within the BBC."]
      [:p "Java, Scala, MarkLogic, XQuery, REST, JMS, Node.js, AWS"]]

     [:article
      [:h4 "BBC Sport (2011 - September 2013)"]
      [:h5 "Senior Software Engineer"]
      [:p ""]
      [:p ""]]

     [:article
      [:h4 ""]
      [:h5 ""]
      [:p ""]
      [:p ""]]

     [:article
      [:h4 ""]
      [:h5 ""]
      [:p ""]
      [:p ""]]
     
     
     ]

    (sidebar)]))
