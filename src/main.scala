package main

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.{Game, Gdx}

object GameConfig {
  val title: String = "My LibGDX Game"
  val targetFps: Int = 60
  val width: Int = 640
  val height: Int = 480
}

def screenWidth: Int = Gdx.graphics.nn.getWidth

def screenHeight: Int = Gdx.graphics.nn.getHeight

def screenCenter: (Int, Int) = (screenWidth / 2, screenHeight / 2)

class MyGdxGame extends Game {
  lazy val batch = SpriteBatch()
  lazy val img = Texture("badlogic.jpg")
  lazy val font = BitmapFont()

  override def create(): Unit = ()

  override def resize(width: Int, height: Int): Unit = ()

  override def render(): Unit = {
    ScreenUtils.clear(Color.DARK_GRAY)

    batch.begin()
    {
      batch.draw(img, screenCenter._1.toFloat - 128, screenCenter._2.toFloat - 128)
      font.draw(batch, "Hello, world!", 20, 20)
    }
    batch.end()
  }

  override def pause(): Unit = ()
    
  override def resume(): Unit = ()

  override def dispose(): Unit = {
    batch.dispose()
    img.dispose()

    super.dispose()
  }
}


// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
// Default settings created from https://libgdx.com/wiki/app/starter-classes-and-configuration#desktop-lwjgl3
@main def run(): Unit = {
  val config = Lwjgl3ApplicationConfiguration()

  config.setForegroundFPS(GameConfig.targetFps)
  config.setTitle(GameConfig.title)
  config.setWindowedMode(GameConfig.width, GameConfig.height)
  
  val _ = Lwjgl3Application(MyGdxGame(), config)
}
