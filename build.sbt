import sbt.Keys.scalaVersion

lazy val intellijCbt = (project in file("."))
  .settings(Seq(
    name := "intellij-cbt",
    version := "0.1",
    scalaVersion := "2.12.3",
    ideaBuild := "173.4674.1",
    ideaExternalPlugins += IdeaPlugin.Zip(
      "scala",
      new sbt.URL(
        "https://plugins.jetbrains.com/files/1347/42173/scala-intellij-bin-2017.3.11.1.zip?updateId=42173&pluginId=1347"
      ))
  ))
  .enablePlugins(SbtIdeaPlugin)

lazy val ideaRunner = (project in file("idea-runner"))
  .settings(Seq(
    name := "idea-runner",
    autoScalaLibrary := false,
    unmanagedJars in Compile := ideaMainJars.in(intellijCbt).value,
    unmanagedJars in Compile += file(System.getProperty("java.home")).getParentFile / "lib" / "tools.jar",
    fork in run := true,
    mainClass in (Compile, run) := Some("com.intellij.idea.Main"),
    javaOptions in run ++= Seq(
      "-Xms128m",
      "-Xmx4096m",
      "-XX:ReservedCodeCacheSize=240m",
      "-XX:+HeapDumpOnOutOfMemoryError",
      "-ea",
      "-Didea.is.internal=true ",
      "-Didea.debug.mode=true ",
      "-Dapple.laf.useScreenMenuBar=true ",
      "-Didea.platform.prefix=Idea",
      s"-Dplugin.path=${baseDirectory.in(ThisBuild).value / "target" / "scala-2.12" / "intellij-cbt_2.12-0.1.jar"}"
    )
  ))
  .dependsOn(intellijCbt)

commands += Command.command("packageAndRun") { state =>
  "intellijCbt/package" :: "ideaRunner/run" :: state
}
