//====================================================================================================================//
// Sample project demoing LibGDX with Scala-CLI.
//
//
// Author: William Howell <wlm.howell@gmail.com>
//
// License: The Unlicense <https://unlicense.org/>
// 
//====================================================================================================================//

//====================================================================================================================//
// SCALA VERSION AND PLATFORMS                                                                                        //
//====================================================================================================================//

//> using scala 3.3.3
//> using jvm 21

//====================================================================================================================//
// DEPENDENCIES                                                                                                       //
//====================================================================================================================//
/*
  Dependencies Overview
*/

//> using dep "com.badlogicgames.gdx:gdx:1.12.1"
//> using dep "com.badlogicgames.gdx:gdx-backend-lwjgl3:1.12.1"
//> using dep "com.badlogicgames.gdx:gdx-platform:1.12.1,classifier=natives-desktop"

//====================================================================================================================//
// RESOURCES                                                                                                          //
//====================================================================================================================//

//> using resourceDir ./resources

//====================================================================================================================//
// JAVA VIRTUAL MACHINE OPTIONS                                                                                             //
//====================================================================================================================//
/*
  Java Virtual Machine Options Overview
*/

// Required on macOS. Disable if running elsewhere.
//> using javaOpt -XstartOnFirstThread

//====================================================================================================================//
// SCALA COMPILER OPTIONS                                                                                             //
//====================================================================================================================//
/*
  Scala Compiler Options Overview
*/

//> using option -deprecation
//> using option -explain
//> using option -feature
//> using option -source:future
//> using option -unchecked

//> using option -Werror
//> using option -Wvalue-discard

//> using option -Yexplicit-nulls
//> using option -Ykind-projector
//> using option -Ysafe-init
