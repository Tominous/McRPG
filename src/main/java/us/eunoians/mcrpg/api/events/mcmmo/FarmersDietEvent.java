package us.eunoians.mcrpg.api.events.mcmmo;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import us.eunoians.mcrpg.abilities.herbalism.FarmersDiet;
import us.eunoians.mcrpg.players.McMMOPlayer;

public class FarmersDietEvent extends AbilityActivateEvent {

  @Getter
  @Setter
  private int foodRestorationBonus;

  @Getter
  @Setter
  private double saturationBonus;

  @Getter
  @Setter
  private Material foodItem;

  public FarmersDietEvent(McMMOPlayer player, FarmersDiet farmersDiet, int foodRestorationBonus, double saturationBonus, Material foodItem){
    super(farmersDiet, player);
    this.foodRestorationBonus = foodRestorationBonus;
    this.saturationBonus = saturationBonus;
    this.foodItem = foodItem;
  }
}