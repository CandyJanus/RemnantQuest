package java.RemnantSexQuest;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.ids.Factions;
import com.fs.starfarer.api.impl.campaign.intel.bar.events.BarEventManager;

import java.RemnantSexQuest.Stage1.RemnantQuest_BarEventCreator;
import java.util.Map;

public class RemnantQuest_Plugin extends BaseModPlugin {
    @Override
    public void onGameLoad(boolean newGame) {
        super.onGameLoad(newGame);

       Map<String, Object> data = Global.getSector().getPersistentData();

        //note: ...you know, is it really a good idea to be using global variables all over the place?

        if (!data.containsKey("remnantSex_begun_or_completed"))
        {
            //note: spawn the Remn fleet if it hasn't already been. Hopefully I don't need more checks to avoid duplication.



            //note: spawns the bar event. I want this shit to have 100% probability.

            BarEventManager barEventManager = BarEventManager.getInstance();
            if (!barEventManager.hasEventCreator(RemnantQuest_BarEventCreator().class)) {
                barEventManager.addEventCreator(new RemnantQuest_BarEventCreator());
            }
        }
    }

}
