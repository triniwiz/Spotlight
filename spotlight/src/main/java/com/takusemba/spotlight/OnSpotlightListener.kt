package com.takusemba.spotlight

/**
 * Listener to notify the state of Spotlight.
 */
interface OnSpotlightListener {

  /**
   * Called when Spotlight will start navigating
   */
  fun onWillNavigate(index: Int)

  /**
   * Called when Spotlight is started
   */
  fun onStarted()

  /**
   * Called when Spotlight finish navigating
   */
  fun onDidNavigate(index: Int)


  /**
   * Called when Spotlight is ended
   */
  fun onEnded()
}
