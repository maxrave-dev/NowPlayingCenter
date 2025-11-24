package org.simpmusic.nowplayingcenter.domain

interface NowPlayingListener {
    fun onPlayPause()
    fun onNext()
    fun onPrevious()
    fun onStop()
}