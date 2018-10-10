package us.eunoians.mcmmox.events.vanilla;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import us.eunoians.mcmmox.gui.EditLoadoutGUI;
import us.eunoians.mcmmox.gui.GUI;
import us.eunoians.mcmmox.gui.GUITracker;
import us.eunoians.mcmmox.gui.HomeGUI;
import us.eunoians.mcmmox.players.PlayerManager;

public class InvCloseEvent implements Listener {

  @EventHandler
  public void invClose(InventoryCloseEvent e){
	Player p = (Player) e.getPlayer();
	if(GUITracker.isPlayerTracked(p)){
	  GUI currentGUI = GUITracker.getPlayersGUI(p);
	  if(currentGUI instanceof EditLoadoutGUI && ((EditLoadoutGUI) currentGUI).getEditType() != EditLoadoutGUI.EditType.ABILITY_UPGRADE){
		currentGUI.setClearData(false);
		GUI prev = new HomeGUI(PlayerManager.getPlayer(p.getUniqueId()));
		GUITracker.replacePlayersGUI(PlayerManager.getPlayer(p.getUniqueId()), prev);
		return;
	  }
	  if(GUITracker.getPlayersGUI(p).isClearData()){
		GUITracker.stopTrackingPlayer(p);
	  }
	}

  }
}
