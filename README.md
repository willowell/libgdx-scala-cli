# LibGDX with Scala-CLI

This repository demonstrates using LibGDX with Scala-CLI, targeting Desktop.

Compared to using SBT, Mill, or even Gradle, this LibGDX is very simple! All the setup is done in a few lines in `project.scala`.

If you're looking for a way to get into LibGDX (with or without Scala!), this is a great starting place.

Please note that this project targets ONLY Desktop. If you would like to target other platforms, you should convert this Scala-CLI project to a different build tool.

Please also note that `project.scala` specifies passing the JVM option `-XstartOnFirstThread`, which LWGL3 requires on macOS. If you are running this on a different platform, please disable this flag.
