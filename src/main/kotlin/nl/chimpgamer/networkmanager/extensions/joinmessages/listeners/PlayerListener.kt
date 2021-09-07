package nl.chimpgamer.networkmanager.extensions.joinmessages.listeners

import net.md_5.bungee.api.event.PlayerDisconnectEvent
import net.md_5.bungee.api.event.PostLoginEvent
import net.md_5.bungee.api.event.ServerSwitchEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler

class PlayerListener: Listener {

    @EventHandler
    fun onPostLogin(event: PostLoginEvent) {

    }

    @EventHandler
    fun onDisconnect(event: PlayerDisconnectEvent) {

    }

    @EventHandler
    fun onServerSwitch(event: ServerSwitchEvent) {

    }
}