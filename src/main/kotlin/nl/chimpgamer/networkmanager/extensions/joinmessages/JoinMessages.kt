package nl.chimpgamer.networkmanager.extensions.joinmessages

import nl.chimpgamer.networkmanager.api.extensions.NMExtension
import nl.chimpgamer.networkmanager.api.utils.PlatformType
import nl.chimpgamer.networkmanager.extensions.joinmessages.listeners.PlayerListener

class JoinMessages : NMExtension() {

    override fun onEnable() {
        if (networkManager.platformType !== PlatformType.BUNGEECORD) {
            logger.severe("Hey, this NetworkManager extension is for BungeeCord only!")
            return
        }

        networkManager.registerListener(PlayerListener())
    }

    override fun onDisable() {

    }

    override fun onConfigsReload() {

    }
}