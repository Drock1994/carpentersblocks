package carpentersblocks.network;

import io.netty.buffer.ByteBufInputStream;

import java.io.IOException;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ServerCustomPacketEvent;

public class ServerPacketHandler {
    
    @SubscribeEvent
    public void onServerPacket(ServerCustomPacketEvent event) throws IOException
    {
        ByteBufInputStream bbis = new ByteBufInputStream(event.packet.payload());
        
        boolean incDamage = bbis.readBoolean();
        
        System.out.println("DEBUG: Received a packet with boolean: " + incDamage);
        
        /*
        ItemStack itemStack = entityPlayer.getHeldItem();

        if (itemStack != null) {

            if (incDamage) {

                if (itemStack.getItemDamage() >= BlockCarpentersSlope.slopeType.length - 1) {
                    itemStack.setItemDamage(0);
                } else {
                    itemStack.setItemDamage(itemStack.getItemDamage() + 1);
                }

            } else {

                if (itemStack.getItemDamage() <= 0) {
                    itemStack.setItemDamage(BlockCarpentersSlope.slopeType.length - 1);
                } else {
                    itemStack.setItemDamage(itemStack.getItemDamage() - 1);
                }

            }

        }
         */
        
        bbis.close();
    }
    
}
