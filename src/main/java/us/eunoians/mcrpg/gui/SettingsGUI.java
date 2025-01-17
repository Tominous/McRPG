package us.eunoians.mcrpg.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import us.eunoians.mcrpg.McRPG;
import us.eunoians.mcrpg.api.util.FileManager;
import us.eunoians.mcrpg.api.util.Methods;
import us.eunoians.mcrpg.players.McRPGPlayer;
import us.eunoians.mcrpg.types.DisplayType;
import us.eunoians.mcrpg.util.mcmmo.MobHealthbarUtils;

import java.util.ArrayList;

public class SettingsGUI extends GUI {

  private static GUIInventoryFunction function;

  public SettingsGUI(McRPGPlayer player) {
    super(new GUIBuilder(player));
    function = (GUIBuilder guiBuilder) -> {
      FileConfiguration settingsFile = McRPG.getInstance().getFileManager().getFile(FileManager.Files.SETTINGS_GUI);
      Inventory inv = Bukkit.createInventory(null, settingsFile.getInt("Size"), Methods.color(player.getPlayer(), settingsFile.getString("Title")));
      ArrayList<GUIItem> items = new ArrayList<>();
      ItemStack displayItem = new ItemStack(Material.BLAZE_ROD);
      ItemMeta displayMeta = displayItem.getItemMeta();
      if(player.getDisplayType() == DisplayType.SCOREBOARD) {
        displayItem.setType(Material.SIGN);
        displayMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("ChangeDisplaySettings.ScoreBoard")));
      }
      else if(player.getDisplayType() == DisplayType.BOSS_BAR) {
        displayItem.setType(Material.DRAGON_HEAD);
        displayMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("ChangeDisplaySettings.BossBar")));
      }
      else if(player.getDisplayType() == DisplayType.ACTION_BAR) {
        displayMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("ChangeDisplaySettings.ActionBar")));
      }
      displayMeta.setLore(Methods.colorLore(settingsFile.getStringList("ChangeDisplaySettings.Lore")));
      displayItem.setItemMeta(displayMeta);
      items.add(new GUIItem(displayItem, settingsFile.getInt("ChangeDisplaySettings.Slot")));

      ItemStack itemPickup = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
      ItemMeta itemPickupMeta = itemPickup.getItemMeta();
      if(player.isKeepHandEmpty()) {
        itemPickupMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("KeepHandEmpty.Enabled")));
      }
      else {
        itemPickup.setType(Material.RED_STAINED_GLASS_PANE);
        itemPickupMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("KeepHandEmpty.Disabled")));
      }
      itemPickupMeta.setLore(Methods.colorLore(settingsFile.getStringList("KeepHandEmpty.Lore")));
      itemPickup.setItemMeta(itemPickupMeta);
      items.add(new GUIItem(itemPickup, settingsFile.getInt("KeepHandEmpty.Slot")));

      MobHealthbarUtils.MobHealthbarType healthbarType = player.getHealthbarType();
      ItemStack healthItem = new ItemStack(Material.BUBBLE_CORAL_BLOCK);
      ItemMeta healthMeta = healthItem.getItemMeta();
      if(healthbarType == MobHealthbarUtils.MobHealthbarType.BAR) {
        healthMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("MobHealthDisplay.Bar")));
      }
      else if(healthbarType == MobHealthbarUtils.MobHealthbarType.DISABLED) {
        healthItem.setType(Material.DEAD_FIRE_CORAL_BLOCK);
        healthMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("MobHealthDisplay.None")));
      }
      else if(healthbarType == MobHealthbarUtils.MobHealthbarType.HEARTS) {
        healthItem.setType(Material.FIRE_CORAL_BLOCK);
        healthMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("MobHealthDisplay.Hearts")));
      }
      healthMeta.setLore(Methods.colorLore(settingsFile.getStringList("MobHealthDisplay.Lore")));
      healthItem.setItemMeta(healthMeta);
      items.add(new GUIItem(healthItem, settingsFile.getInt("MobHealthDisplay.Slot")));

      ItemStack autoDenyItem = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
      ItemMeta autoDenyItemMeta = autoDenyItem.getItemMeta();
      if(player.isAutoDeny()) {
        autoDenyItemMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("AutoDenyNewAbilities.Enabled")));
      }
      else {
        autoDenyItem.setType(Material.RED_STAINED_GLASS_PANE);
        autoDenyItemMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("AutoDenyNewAbilities.Disabled")));
      }
      autoDenyItemMeta.setLore(Methods.colorLore(settingsFile.getStringList("AutoDenyNewAbilities.Lore")));
      autoDenyItem.setItemMeta(autoDenyItemMeta);
      items.add(new GUIItem(autoDenyItem, settingsFile.getInt("AutoDenyNewAbilities.Slot")));

      ItemStack ignoreTip = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
      ItemMeta ignoreTipMeta = ignoreTip.getItemMeta();
      if(player.isIgnoreTips()) {
        ignoreTipMeta.setDisplayName(Methods.color(player.getPlayer(),settingsFile.getString("IgnoreTips.Enabled")));
      }
      else {
        ignoreTip.setType(Material.RED_STAINED_GLASS_PANE);
        ignoreTipMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("IgnoreTips.Disabled")));
      }
      ignoreTipMeta.setLore(Methods.colorLore(settingsFile.getStringList("IgnoreTips.Lore")));
      ignoreTip.setItemMeta(ignoreTipMeta);
      items.add(new GUIItem(ignoreTip, settingsFile.getInt("IgnoreTips.Slot")));

      ItemStack later = new ItemStack(Material.RED_STAINED_GLASS_PANE);
      ItemMeta laterMeta = later.getItemMeta();
      laterMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("AddLater.DisplayName")));
      laterMeta.setLore(Methods.colorLore(settingsFile.getStringList("AddLater.Lore")));
      later.setItemMeta(laterMeta);
      items.add(new GUIItem(later, settingsFile.getInt("AddLater.Slot")));


      ItemStack back = new ItemStack(Material.valueOf(settingsFile.getString("BackButton.Material")));
      ItemMeta backMeta = back.getItemMeta();
      backMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("BackButton.DisplayName")));
      backMeta.setLore(Methods.colorLore(settingsFile.getStringList("BackButton.Lore")));
      back.setItemMeta(backMeta);
      items.add(new GUIItem(back, settingsFile.getInt("BackButton.Slot")));

      ItemStack filler = new ItemStack(Material.valueOf(settingsFile.getString("FillerItem.Material")), settingsFile.getInt("FillerItem.Amount"));
      ItemMeta fillerMeta = filler.getItemMeta();
      fillerMeta.setDisplayName(Methods.color(player.getPlayer(), settingsFile.getString("FillerItem.DisplayName")));
      fillerMeta.setLore(Methods.colorLore(settingsFile.getStringList("FillerItem.Lore")));
      filler.setItemMeta(fillerMeta);

      return Methods.fillInventory(inv, filler, items);
    };
    this.getGui().setBuildGUIFunction(function);
    this.getGui().rebuildGUI();
  }
}
