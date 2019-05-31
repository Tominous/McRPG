package us.eunoians.mcrpg.api.events.mcrpg.fitness;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import us.eunoians.mcrpg.abilities.fitness.IronMuscles;
import us.eunoians.mcrpg.api.events.mcrpg.AbilityActivateEvent;
import us.eunoians.mcrpg.players.McRPGPlayer;
import us.eunoians.mcrpg.types.AbilityEventType;

public class IronMusclesEvent extends AbilityActivateEvent {

  @Getter
  @Setter
  private int durabilityLoss;

  @Getter
  private Player enemy;

  public IronMusclesEvent(McRPGPlayer mcRPGPlayer, IronMuscles ironMuscles, int durabilityLoss, Player enemy) {
    super(ironMuscles, mcRPGPlayer, AbilityEventType.COMBAT);
    this.durabilityLoss = durabilityLoss;
    this.enemy = enemy;
  }

}
