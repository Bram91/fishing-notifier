package com.example;

import com.bram91.fishingnotifier.FishingNotifierPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FishingNotifierPlugin.class);
		RuneLite.main(args);
	}
}