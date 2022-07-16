package java.RemnantSexQuest.Stage1;

import com.fs.starfarer.api.impl.campaign.fleets.FleetParamsV3;
import com.fs.starfarer.api.impl.campaign.ids.Factions;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.*;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.campaign.listeners.FleetEventListener;
import com.fs.starfarer.api.campaign.rules.MemoryAPI;
import com.fs.starfarer.api.characters.PersonAPI;
import com.fs.starfarer.api.impl.campaign.DerelictShipEntityPlugin.DerelictType;
import com.fs.starfarer.api.impl.campaign.fleets.FleetFactoryV3;
import com.fs.starfarer.api.impl.campaign.fleets.FleetParamsV3;
import com.fs.starfarer.api.impl.campaign.ids.*;
import com.fs.starfarer.api.impl.campaign.missions.hub.HubMissionWithBarEvent;
import com.fs.starfarer.api.ui.SectorMapAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.util.Misc;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Stage1_RemnantQuest_FleetSpawner {
    //note: because I'm lazy, I'm not going to hardcode in turkler's instructions of "3-5 cruisers, 6-7 destroyers and 4-6 frigates," but hope that the game engine spawns a composition that's right.
    FleetParamsV3 params = new FleetParamsV3(
            null,
            null,
            Factions.REMNANTS,
            null,
            PATROL_MEDIUM,
            150f, // combatPts
            0f, // freighterPts
            0f, // tankerPts
            0f, // transportPts
            0f, // linerPts
            0f, // utilityPts
            -0.25f // qualityMod
    );
}
