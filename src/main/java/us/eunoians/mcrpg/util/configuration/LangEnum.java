package us.eunoians.mcrpg.util.configuration;

import de.articdive.enum_to_yaml.interfaces.ConfigurationEnum;

import java.util.Arrays;

public enum LangEnum implements ConfigurationEnum {

    PLUGIN_INFO_HEADER("Messages.PluginInfo", "", "#Messages relating to the general plugin information"),
    PLUGIN_PREFIX("Messages.PluginInfo.PluginPrefix", "&7[&1McRPG&7]"),
    COMMANDS_HEADER("Messages.Commands", "", "#Messages used by commands"),
    COMMANDS_UTILITY_HEADER("Messages.Commands.Utility", "", "#Messages used by misc commands"),
    NO_PERMS("Messages.Commands.Utility.NoPerms", "&cYou do not have the permissions to execute that command."),
    PLAYER_HAS_NOT_LOGGED_IN("Messages.Commands.Utility.PlayerHasNotLoggedIn", "&cThat player has not logged in before."),
    INVALID_AMOUNT("Messages.Commands.Utility.InvalidAmount", "&cThe amount you entered is invalid. Please try again."),
    ONLY_PLAYERS("Messages.Commands.Utility.OnlyPlayers", "&cOnly players can run this command."),
    HELP_PROMPT("Messages.Commands.Utility.HelpPrompt", "&eUse /mchelp or /mchelp <command> for proper usage."),
    NOT_AN_INT("Messages.Commands.Utility.NotAnInt", "&cThe argument you entered is not an integer."),
    NOT_A_LONG("Messages.Commands.Utility.NotALong", "&cThe argument you entered is not a long."),
    NOT_A_SKILL("Messages.Commands.Utility.NotASkill", "&cThe argument you entered is not a valid skill."),
    NOT_AN_ABILITY("Messages.Commands.Utility.NotAnAbility", "&cThe argument you entered is not a valid ability."),
    NOT_ACTIVE_ABILITY("Messages.Commands.Utility.NotActiveAbility", "&cThe ability you entered is not an active ability."),
    NOT_ENABLED_OR_UNLOCKED("Messages.Commands.Utility.NotEnabledOrUnlocked", "&cThat ability is either disabled or you have yet to unlock it."),
    PLAYER_FOLDER_DOESNT_EXIST("Messages.Commands.Utility.PlayerFolderDoesntExist", "&cThe player folder does not exist... possibly already been converted?"),
    BEGINNING_CONVERSION("Messages.Commands.Utility.BeginningConversion", "&aYour conversion is beginning... please prevent player log in while this process is going on. There are %FileAmount% of files to process."),
    CONVERSION_COMPLETE("Messages.Commands.Utility.ConversionComplete", "&aConverted %Amount% players in %Seconds% seconds."),
    RELOADED_FILES("Messages.Commands.ReloadFiles", "&aYou have successfully reloaded all files for this plugin."),
    MCHELP_DEFAULT("Messages.Commands.McHelp.Default", Arrays.asList("&e--------------------------", "&7[&6McRPG Command &7]&3 /mcrpg",
            "&3    -Opens main McRPG gui", "&7[&6McDisplay Command &7]&3 /mchelp mcdisplay", "&3    -Help prompt for mcdisplay.",
            "&7[&6McAdmin Command &7]&3 /mchelp mcadmin", "&3    -Help prompt for mcadmin.", "&e--------------------------")),
    MCHELP_MCDISPLAY("Messages.Commands.McHelp.McDisplay", Arrays.asList("&e--------------------------", "&7[&6McDisplay Command &7]&3 /mcdisplay {Skill}",
            "&3    -Opens your display for the skill.", "&7[&6McDisplay Command &7]&3 /mcdisplay clear", "&3    -Clears display.",
            "&e--------------------------")),
    MCHELP_MCADMIN1("Messages.Commands.McHelp.McAdmin1", Arrays.asList("&e--------------------------",
            "&7[&6AbilityPoints Give Command &7]&3 /mcadmin give abilitypoints {Player} {Amount}", "&3    -Opens your display for the skill.",
            "&7[&6Exp Give Command &7]&3 /mcadmin give exp {Player} {Amount} {Skill}", "&3    -Give a player exp in a skill.",
            "&7[&6Level Give Command &7]&3 /mcadmin give level {Player} {Amount} {Skill}", "&3    -Give a player levels in a skill.",
            "&7[&6Ability Give Command &7]&3 /mcadmin give ability {Player} {Ability}", "&3    -Give a player an ability.",
            "&7[&6Ability Replace Command &7]&3 /mcadmin replace {Player} {Ability} {Ability}", "&3    -Replace an ability with another.",
            "&eDo /mchelp mcadmin 2 for more.", "&e--------------------------")),
    MCHELP_MCADMIN2("Messages.Commands.McHelp.McAdmin2", Arrays.asList("&e--------------------------",
            "&7[&6Ability Remove Command &7]&3 /mcadmin remove {Player} {Ability}", "&3    -Removes an ability from a player.",
            "&7[&6View Loadout Command &7]&3 /mcadmin view loadout {Player}", "&3    -Views a players ability loadout.",
            "&7[&6View Skill Command &7]&3 /mcadmin view {Skill} {Player}", "&3    -View information about a players skill.",
            "&7[&6Cooldown Set Command &7]&3 /mcadmin cooldown set {Player} {Ability} {Duration}", "&3    -Sets a players cooldown for an ability.",
            "&7[&6Cooldown Remove Command &7]&3 /mcadmin cooldown remove {Player} {Ability}", "&3    -Removes a players cooldown for an ability.",
            "&eDo /mchelp mcadmin 3 for more.", "&e--------------------------")),
    MCHELP_MCADMIN3("Messages.Commands.McHelp.McAdmin3", Arrays.asList("&e--------------------------",
            "&7[&6Cooldown Add Command &7]&3 /mcadmin cooldown add {Player} {Ability} {Duration}", "&3    -Adds time to a players cooldown for an ability.",
            "&7[&6Reset Skill Command &7]&3 /mcadmin reset skill {Player} {Skill}", "&3    -Resets a players skill.",
            "&7[&6Reset Ability Command &7]&3 /mcadmin reset ability {Player} {Ability}", "&3    -Resets a players ability",
            "&7[&6Reset Player Command &7]&3 /mcadmin reset player {Player}", "&3    -Resets a player.", "&e--------------------------")),
    MCDISPLAY_INVALID_INPUT("Messages.Commands.McDisplay.InvalidInput", "&c%String% is not a skill or display type.", "#%String% is the failed input"),
    MCDISPLAY_NOT_A_TYPE("Messages.Commands.McDisplay.NotAType", "&c%String% is not a proper display type. Use bossbar, actionbar or scoreboard."),
    MCDISPLAY_NOTHING_TO_CLEAR("Messages.Commands.McDisplay.NothingToClear", "&cThere is nothing to remove."),
    MCADMIN_GIVE_ABILITY_POINTS("Messages.Commands.Admin.Give.AbilityPoints", "&aYou gave %Player% &e%Amount% &aability points."),
    MCADMIN_GIVE_EXP("Messages.Commands.Admin.Give.Exp", "&aYou gave %Player% &e%Amount% &aexp in &5%Skill%."),
    MCADMIN_GIVE_LEVEL("Messages.Commands.Admin.Give.Level", "&aYou gave %Player% &e%Amount% &alevel(s) in &5%Skill%."),
    MCADMIN_GIVE_ABILITY("Messages.Commands.Admin.Give.Ability", "&aYou gave %Player% &5%Ability%."),
    MCADMIN_GIVE_LOADOUT_FULL("Messages.Commands.Admin.Give.LoadoutFull", "&cThe players ability loadout is full."),
    MCADMIN_GIVE_DOES_NOT_HAVE_ABILITY("Messages.Commands.Admin.Give.DoesNotHaveAbility", "&cThe player does not have %Ability%."),
    MCADMIN_GIVE_REPLACED("Messages.Commands.Admin.Give.Replaced", "&aYou replaced %Player%s %Old_Ability% with %New_Ability%."),
    MCADMIN_GIVE_ALREADY_HAVE("Messages.Commands.Admin.Give.AlreadyHave", "&cThe player already has that ability."),
    MCADMIN_GIVE_HAS_ACTIVE("Messages.Commands.Admin.Give.HasActive", "&cThe player already has an active ability for that skill."),
    MCADMIN_RECEIVE_ABILITY_POINTS("Messages.Commands.Admin.Receive.AbilityPoints", "&aYou were given &e%Amount% &aability points."),
    MCADMIN_RECEIVE_EXP("Messages.Commands.Admin.Receive.Exp", "&aYou were given &e%Amount% &aexp in &5%Skill%."),
    MCADMIN_RECEIVE_LEVEL("Messages.Commands.Admin.Receive.Level", "&aYou were given &e%Amount% &alevel(s) in &5%Skill%."),
    MCADMIN_RECEIVE_ABILITY("Messages.Commands.Admin.Receive.Ability", "&aYou were given &5%Ability%."),
    MCADMIN_RECEIVE_REPLACED("Messages.Commands.Admin.Receive.Replaced", "&aYour %Old_Ability% was replaced with %New_Ability%."),
    MCADMIN_REMOVE_ABILITY("Messages.Commands.Admin.Remove.Ability", "Ability: '&aYou removed &5%Ability% &afrom %Player%s loadout."),
    MCADMIN_REMOVED_ABILITY("Messages.Commands.Admin.Removed.Ability", "&5%Ability% &cwas removed from your loadout."),
    MCADMIN_COOLDOWN_SET("Messages.Commands.Admin.Cooldown.Set", "&aYou set %Player%s &5%Ability% &ato have a &e%Cooldown% &asecond cooldown."),
    MCADMIN_COOLDOWN_WAS_SET("Messages.Commands.Admin.Cooldown.WasSet", "&cYour &5%Ability% &cnow has a &e%Cooldown% &csecond cooldown."),
    MCADMIN_COOLDOWN_REMOVE("Messages.Commands.Admin.Cooldown.Remove", "&aYou removed %Player%s cooldown for &5%Ability%."),
    MCADMIN_COOLDOWN_REMOVED("Messages.Commands.Admin.Cooldown.Removed", "&aYour cooldown for &5%Ability% &awas removed."),
    MCADMIN_COOLDOWN_ADD("Messages.Commands.Admin.Cooldown.Add", "&aYou added &e%Cooldown% &aseconds to %Player%s cooldown for &5%Ability%."),
    MCADMIN_COOLDOWN_ADDED("Messages.Commands.Admin.Cooldown.Added", "&cYour cooldown for &5%Ability% %chas &e%Cooldown% &cseconds added to it."),
    MCADMIN_RESET_SKILL_WAS_RESET("Messages.Commands.Admin.Reset.SkillWasReset", "&cYour %Skill% skill was reset."),
    MCADMIN_RESET_SKILL_RESET("Messages.Commands.Admin.Reset.SkillReset", "&aYou reset %Player%s %Skill% skill."),
    MCADMIN_RESET_ABILITY_WAS_RESET("Messages.Commands.Admin.Reset.AbilityWasReset", "&cYour %Ability% ability was reset."),
    MCADMIN_RESET_ABILITY_RESET("Messages.Commands.Admin.Reset.AbilityReset", "&aYou reset %Player%s %Ability% ability."),
    MCADMIN_RESET_PLAYER_WAS_RESET("Messages.Commands.Admin.Reset.PlayerWasReset", "&cYour McRPG stats were reset."),
    MCADMIN_RESET_PLAYER_RESET("Messages.Commands.Admin.Reset.PlayerReset", "&aYou reset %Player%s McRPG stats."),
    ABILITIES_BLEED_PLAYER_BLEEDING("Messages.Abilities.Bleed.PlayerBleeding", "&cYou are now bleeding."),
    ABILITIES_BLEED_PLAYER_BLEEDING_STOPPED("Messages.Abilities.Bleed.BleedingStopped", "&cThe bleeding has stopped."),
    ABILITIES_RAGE_SPIKE_CHARGING("Messages.Abilities.RageSpike.Charging", "&eYou are now charging Rage Spike. Please stay crouched for &a%Charge% &eseconds."),
    ABILITIES_RAGE_SPIKE_CHARGE_CANCELLED("Messages.Abilities.RageSpike.ChargeCancelled", "&cYou canceled the charge of Rage Spike."),
    ABILITIES_SERRATED_STRIKES_ACTIVATED("Messages.Abilities.SerratedStrikes.Activated", "&aSerrated Strikes is now active."),
    ABILITIES_SERRATED_STRIKES_DEACTIVATED("Messages.Abilities.SerratedStrikes.Deactivated", "&cSerrated Strikes has deactivated."),
    ABILITIES_TAINTED_BLADE_ACTIVATED("Messages.Abilities.TaintedBlade.Activated", "&aTainted Blade has activated."),
    ABILITIES_REMOTE_TRANSFER_FAILED_LINK("Messages.Abilities.RemoteTransfer.FailedLink", "&cYou are unable to link to that chest."),
    ABILITIES_REMOTE_TRANSFER_NOT_A_CHEST("Messages.Abilities.RemoteTransfer.NotAChest", "&cYou must be looking at a chest for this command to work."),
    ABILITIES_REMOTE_TRANSFER_LINKED("Messages.Abilities.RemoteTransfer.Linked", "&aYou have successfully linked a chest."),
    ABILITIES_REMOTE_TRANSFER_UNLINKED("Messages.Abilities.RemoteTransfer.Unlinked", "&aYou have unlinked your chest."),
    ABILITIES_REMOTE_TRANSFER_IS_LINKED("Messages.Abilities.RemoteTransfer.IsLinked", "&cThat chest is currently linked to %Player%."),
    ABILITIES_REMOTE_TRANSFER_IS_NOT_LINKED("Messages.Abilities.RemoteTransfer.IsNotLinked", "&cYou are not linked to a chest."),
    ABILITIES_REMOTE_TRANSFER_ADMIN_UNLINKED("Messages.Abilities.RemoteTransfer.AdminUnlinked", "&cSomeone has unlinked your chest."),
    ABILITIES_REMOTE_TRANSFER_CHEST_MISSING("Messages.Abilities.RemoteTransfer.ChestMissing", "&cFor some reason your chest is missing... Delinking..."),
    ABILITIES_SUPER_BREAKER_ACTIVATED("Messages.Abilities.SuperBreaker.Activated", "&aSuper breaker is now active."),
    ABILITIES_SUPER_BREAK_DEACTIVATED("Messages.Abilities.SuperBreaker.Deactivated", "&cSuper breaker has deactivated."),
    ABILITIES_ORE_SCANNED_NOTHING_FOUND("Messages.Abilities.OreScanner.NothingFound", "&cNo ores were found in your scan."),
    ABILITIES_ORE_SCANNER_POINTING_TO_VALUABLE("Messages.Abilities.OreScanner.PointingToValuable", "&cYou are now looking towards the most valuable ore."),
    ABILITIES_ORE_SCANNER_DIAMONDS_FOUND("Messages.Abilities.OreScanner.DiamondsFound", "&aYour scan showed &e%Amount% &adiamond ore near you."),
    ABILITIES_ORE_SCANNER_EMERALDS_FOUND("Messages.Abilities.OreScanner.EmeraldsFound", "&aYour scan showed &e%Amount% &aemerald ore near you."),
    ABILITIES_ORE_SCANNER_GOLD_FOUND("Messages.Abilities.OreScanner.GoldFound", "&aYour scan showed &e%Amount% &agold ore near you."),
    ABILITIES_STICKY_FINGERS_RESISTED("Messages.Abilities.StickyFingers.Resisted", "&aYou resisted being disarm."),
    ABILITIES_DISARM_PLAYER_DISARMED("Messages.Abilities.Disarm.PlayerDisarmed", "&aYou disarmed %Player%."),
    ABILITIES_DISARM_BEEN_DISARMED("Messages.Abilities.Disarm.BeenDisarmed", "&cYou have been disarmed."),
    ABILITIES_BERSERK_ACTIVATED("Messages.Abilities.Berserk.Activated", "&aBerserk is now active."),
    ABILITIES_BERSERK_DEACTIVATED("Messages.Abilities.Berserk.Deactivated", "&cBerserk has deactivated."),
    ABILITIES_SMITING_FIST_ACTIVATED("Messages.Abilities.SmitingFist.Activated", "&aSmiting Fist is now active."),
    ABILITIES_SMITING_FIST_DEACTIVATED("Messages.Abilities.SmitingFist.Deactivated", "&cSmiting Fist has deactivated."),
    ABILITIES_SMITING_FIST_SMITED("Messages.Abilities.SmitingFist.Smited", "&aYou smited %Player%."),
    ABILITIES_DENSE_IMPACT_ACTIVATED("Messages.Abilities.DenseImpact.Activated", "&aDense Impact is now active."),
    ABILITIES_DENSE_IMPACT_DEACTIVATED("Messages.Abilities.DenseImpact.Deactivated", "&cDense Impact has deactivated."),
    ABILITIES_MASS_HARVEST_ACTIVATED("Messages.Abilities.MassHarvest.Activated", "&aMass Harvest has activated."),
    ABILITIES_PANS_BLESSING_ACTIVATED("Messages.Abilities.PansBlessing.Activated", "&aPans Blessing has activated."),
    ABILITIES_BLESSING_OF_ARTEMIS_ACTIVATED("Messages.Abilities.BlessingOfArtemis.Activated", "&aThe goddess of the hunt has blessed you with invisibility young hunter."),
    ABILITIES_BLESSING_OF_ARTEMIS_HIT("Messages.Abilities.BlessingOfArtemis.Hit", "&cA blessed hunter has struck you."),
    ABILITIES_BLESSING_OF_APOLLO_ACTIVATED("Messages.Abilities.BlessingOfApollo.Activated", "&aThe sun god has blessed you with his fiery power."),
    ABILITIES_BLESSING_OF_APOLLO_HIT("Messages.Abilities.BlessingOfApollo.Hit", "&cThe power of the sun god has struck you."),
    ABILITIES_CURSE_OF_HADES_ACTIVATED("Messages.Abilities.CurseOfHades.Activated", "&aThe god of the dead has cursed your arrow with hells power."),
    ABILITIES_CURSE_OF_HADES_HIT("Messages.Abilities.CurseOfHades.Hit", "&cThe power of hell has entered your body."),
    ABILITIES_DAZE_HIT("Messages.Abilities.Daze.Hit", "&cThe sudden strike of the arrow has left you confused."),
    ABILITIES_TIPPED_ARROWS_HIT("Messages.Abilities.TippedArrows.Hit", "&cYou were stuck with a potion tipped arrow."),
    ABILITIES_PUNCTURE_HIT("Messages.Abilities.Puncture.Hit", "&cYour lungs were punctured and you are now Bleeding."),
    ABILITIES_COMBO_HIT("Messages.Abilities.Combo.Hit", "&cBeing hit by a combo has dealt extra damage to you."),
    GUIS_ACCEPTED_ABILITY("Messages.Guis.AcceptedAbility", "&aThe ability %Ability% has been added to your loadout!"),
    GUIS_UPGRADED_ABILITY("Messages.Guis.UpgradedAbility", "&aThe ability %Ability% has been upgraded to %Tier%!"),
    GUIS_HAS_ACTIVE("Messages.Guis.HasActive", "&cYou already have an active ability for that skill."),
    PLAYERS_LEVEL_UP("Messages.Players.LevelUp", "&eYou gained &a%Levels% &elevel(s) in %Skill%. Current Level: &e%Current_Level%"),
    PLAYERS_ABILITY_UNLOCKED("Messages.Players.AbilityUnlocked", "&eYou just unlocked %Ability%! Open up the main menu in order to accept or deny this ability."),
    PLAYERS_ABILITY_UNLOCKED_BUT_DENIED("Messages.Players.AbilityUnlockedButDenied", "&eYou just unlocked %Ability%! It was auto denied however."),
    PLAYERS_ABILITY_POINT_GAINED("Messages.Players.AbilityPointGained", "&eAbility upgrade point gained! You have &a%Ability_Points% &eto spend"),
    PLAYERS_PLAYER_READY("Messages.Players.PlayerReady", "&7You raise your %Skill_Item%"),
    PLAYERS_PLAYER_UNREADY("Messages.Players.PlayerUnready", "&7You lowered your %Skill_Item%"),
    PLAYERS_COOLDOWN_EXPIRE("Messages.Players.CooldownExpire", "&aYour cooldown for %Ability% is finished."),
    PLAYERS_COOLDOWN_ACTIVE("Messages.Players.CooldownActive", "&cYour %Skill% ability is on cooldown for &e%Time% &cseconds."),
    PLAYERS_REPLACE_COOLDOWN_EXPIRE("Messages.Players.ReplaceCooldownExpire", "&aYour cooldown for ability replacing is over."),
    TIPS_LOGIN_TIPS("Messages.Tips.LoginTips", Arrays.asList("&7[&5McRPG Tip&7]: &aCheck out /mcrpg menu to get familiar with the plugin!",
            "&7[&5McRPG Tip&7]: &aAs you level up, you can earn unlocked abilities!", "&7[&5McRPG Tip&7]: &aMake sure to check your player settings in /mcrpg!",
            "&7[&5McRPG Tip&7]: &aAbilities can be upgraded once you reach a certain level by using an ability point!",
            "&7[&5McRPG Tip&7]: &aEvery time you reach a certain power level, you gain an ability point!")),
    TIPS_LEVEL_UP_SWORDS("Messages.Tips.LevelIpSwords", Arrays.asList("&7[&5McRPG Tip&7]: &aBleed causes repeated damage for a short bit!",
            "&7[&5McRPG Tip&7]: &aRage spike allows you to crouch and dash forward, blasting enemies!",
            "&7[&5McRPG Tip&7]: &aAll bleed modifying abilities will work with Archerys Puncture!")),
    TIPS_LEVEL_UP_MINING("Messages.Tips.LevelUp.Mining",Arrays.asList("&7[&5McRPG Tip&7]: &aDouble Drop and Its A Triple do not stack!",
            "&7[&5McRPG Tip&7]: &aOre Scanner checks and points you to the nearest valuable ore!",
            "&7[&5McRPG Tip&7]: &aUse /mclink to link a chest to your Remote Transfer!", "&7[&5McRPG Tip&7]: &aUse /mcunlink to delink your chest from Remote Transfer!",
            "&7[&5McRPG Tip&7]: &aBlast Mining requires you to place TNT after readying your pick!")),
    TIPS_LEVEL_UP_UNARMED("Messages.Tips.LevelUpUnarmed", Arrays.asList("&7[&5McRPG Tip&7]: &aDense Impact makes you do 0 damage but do direct armor damage for a while!",
            "&7[&5McRPG Tip&7]: &aUse Smiting Fist to clean debuffs caused from abilities like Curse of Hades!",
            "&7[&5McRPG Tip&7]: &aDisarm will move the item into your upper inventory or if its full, it will drop the item!",
            "&7[&5McRPG Tip&7]: &aThe damage modifier from Iron Arm does not have a 100% activation rate at lower levels!")),
    TIPS_LEVEL_UP_HERBALISM("Messages.Tips.LevelUpHerbalism", Arrays.asList("&7[&5McRPG Tip&7]: &aPans Blessing requires you to bonemeal a plant after readying your hoe!",
            "&7[&5McRPG Tip&7]: &aMass Harvest will replant all crops it breaks!", "&7[&5McRPG Tip&7]: &aFarming sugar cane is the most effective way to level!",
            "&7[&5McRPG Tip&7]: &aNatures Wrath requires flowers to be in the off hand!", "&7[&5McRPG Tip&7]: &aNatures Wrath wont work if you are too hungry!")),
    TIPS_LEVEL_UP_ARCHERY("Messages.Tips.LevelUpArchery", Arrays.asList("&7[&5McRPG Tip&7]: &aThe further you shoot your target the more exp you will gain!",
            "&7[&5McRPG Tip&7]: &aCombo has a delay as to how often it activates to prevent bow spamming!",
            "&7[&5McRPG Tip&7]: &aPuncture can inflict Bleed and use all modifiers from your Swords skill!", "&7[&5McRPG Tip&7]: &aBlessing of Artemis is good for a sneaky surprise!",
            "&7[&5McRPG Tip&7]: &aReady your bow by attacking air before you shoot to activate abilities!"));

    private String path;
    private Object defaultValue;
    private String[] comments;


    LangEnum(String path, Object defaultValue, String... comments) {
        this.path = path;
        this.defaultValue = defaultValue;
        this.comments = comments;
    }


    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Object getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String[] getComments() {
        return comments;
    }
}
