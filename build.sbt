name := "SoDA"

version := "1.0"

scalaVersion := "2.10.4"

organization := "com.elsevier"

sbtVersion := "0.13.1"

jetty(config = "src/main/resources/jetty.xml")

libraryDependencies ++= Seq(
    // main
    "org.openrdf.sesame" % "sesame-rio" % "2.7.10",
    "org.openrdf.sesame" % "sesame-rio-ntriples" % "2.7.10",
    "com.amazonaws" % "aws-java-sdk" % "1.9.39",
    "org.apache.solr" % "solr-solrj" % "5.0.0",
    "org.apache.lucene" % "lucene-core" % "5.0.0",
    "org.apache.lucene" % "lucene-analyzers-common" % "5.0.0",
    "org.apache.opennlp" % "opennlp-maxent" % "3.0.3",
    "org.apache.opennlp" % "opennlp-tools" % "1.5.3",
    "log4j" % "log4j" % "1.2.14",
    // web
    "com.fasterxml.jackson.core" % "jackson-core" % "2.6.0-rc1",
    "org.springframework" % "spring-webmvc" % "4.0.0.RELEASE",
    "jfree" % "jfreechart" % "1.0.13",
    "org.apache.commons" % "commons-lang3" % "3.0",
    "net.sourceforge.collections" % "collections-generic" % "4.01",
    "commons-beanutils" % "commons-beanutils" % "1.8.3",
    "commons-io" % "commons-io" % "2.4",
    // client
    "org.apache.httpcomponents" % "httpclient" % "4.0-alpha4",
    "dom4j" % "dom4j" % "1.6.1",
    // local container
    "org.eclipse.jetty" % "jetty-webapp" % "9.3.0.M1" % "compile,container",
    "org.eclipse.jetty" % "jetty-jsp" % "9.3.0.M1" % "container",
    // test
    "com.novocode" % "junit-interface" % "0.8" % "test"
)
