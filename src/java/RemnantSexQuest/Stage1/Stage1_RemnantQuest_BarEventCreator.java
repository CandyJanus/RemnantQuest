package java.RemnantSexQuest.Stage1;

import com.fs.starfarer.api.impl.campaign.intel.bar.events.BaseBarEventCreator;
import com.fs.starfarer.api.impl.campaign.intel.bar.events.BaseBarEventWithPerson;

public class Stage1_RemnantQuest_BarEventCreator extends BaseBarEventCreator {
    //note: Make sure your method returns the type of event that your bar event is extending.
    @Override
    public BaseBarEventWithPerson createBarEvent() {
        return new Stage1_RemnantQuest_BarEvent();
    }
}

