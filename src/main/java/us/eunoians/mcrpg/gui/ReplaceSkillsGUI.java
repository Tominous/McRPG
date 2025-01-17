package us.eunoians.mcrpg.gui;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.eunoians.mcrpg.McRPG;
import us.eunoians.mcrpg.api.util.FileManager;
import us.eunoians.mcrpg.players.McRPGPlayer;
import us.eunoians.mcrpg.types.Skills;
import us.eunoians.mcrpg.util.Parser;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ReplaceSkillsGUI extends GUI {

  private static FileManager fm = McRPG.getInstance().getFileManager();

  private static FileManager.Files file = FileManager.Files.REPLACE_SKILLS_GUI;

  private static GUIPlaceHolderFunction function = (GUIBuilder guiBuilder) -> {
	McRPGPlayer player = guiBuilder.getPlayer();
	if(guiBuilder.getRawPath().equalsIgnoreCase("ReplaceSkillsGUI")){
	  skillsPlaceHolders(guiBuilder, player);
	}
  };

  static void skillsPlaceHolders(GUIBuilder guiBuilder, McRPGPlayer player){
	for(int i = 0; i < guiBuilder.getInv().getSize(); i++){
	  ItemStack item = guiBuilder.getInv().getItem(i);
	  if(item.hasItemMeta() && item.getItemMeta().hasLore()){
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<>();
		for(String s : meta.getLore()){
		  for(Skills skill : Skills.values()){
			s = s.replaceAll("%" + skill.getName() + "_Level%", Integer.toString(player.getSkill(skill).getCurrentLevel()));
			Parser equation = skill.getDefaultAbility().getActivationEquation();
			equation.setVariable(skill.getName().toLowerCase() + "_level", player.getSkill(skill).getCurrentLevel());
			equation.setVariable("power_level", player.getPowerLevel());
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMinimumIntegerDigits(1);
			nf.setMaximumFractionDigits(3);
			nf.setMinimumFractionDigits(2);
			s = s.replaceAll("%" + skill.getDefaultAbility().getName().replaceAll(" ", "_") + "_Chance%", nf.format(equation.getValue()));
		  }
		  lore.add(s.replaceAll("%Power_Level%", Integer.toString(player.getPowerLevel()))
			  .replaceAll("%Ability_Points%", Integer.toString(player.getAbilityPoints())));
		  meta.setLore(lore);
		  item.setItemMeta(meta);
		  guiBuilder.getInv().setItem(i, item);
		}
	  }
	  continue;
	}
  }

  public ReplaceSkillsGUI(McRPGPlayer p){
	super(new GUIBuilder("ReplaceSkillsGUI", fm.getFile(file), p));
	this.getGui().setReplacePlaceHoldersFunction(function);
	this.getGui().replacePlaceHolders();
	if(!GUITracker.isPlayerTracked(p)){
	  GUITracker.trackPlayer(p, this);
	}
  }

}
