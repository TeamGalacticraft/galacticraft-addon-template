package io.github.addonmod;

public class Reference {
	
    // Mod info
	public static final String MOD_NAME = "@MODNAME@";
    public static final String MOD_ID = "@MODID@";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String MOD_CHANNEL = MOD_ID;
    public static final String MOD_MC_VERSION_RANGE = "@MC_VERSION_RANGE@";

    // Paths
    public static final String TEXTURE_PATH_GUI = "textures/gui/";
    public static final String TEXTURE_PATH_SKINS = "textures/skins/";
    public static final String TEXTURE_PATH_MODELS = "textures/models/";
    public static final String TEXTURE_PATH_ENTITIES = "textures/entities/";
    public static final String TEXTURE_PATH_GUIBACKGROUNDS = "textures/gui/title/background/";
    public static final String TEXTURE_PATH_ITEMS = "textures/items/";
    public static final String TEXTURE_PATH_PARTICLES = "textures/particles/";
    public static final String MODEL_PATH = "models/";
    
    // MOD ID's
    public static final String MOD_FORGE = "forge";
    public static final String MOD_FORGE_VERSION = "@FORGE_VERSION@";
    public static final String MOD_FORGE_VERSION_MIN = "14.23.5.2860";
    
    public static final String MOD_GALACTICRAFT = "galacticraftcore";
    
    // This value is set when you run the Build task and is derived from the galacticraft dependency version
    public static final String MOD_GALACTICRAFT_VERSION_MIN = "@GC_VERSION@";
    
    public static final String FORGE_DEPENDENCY = "required-after:" + MOD_FORGE + "@[" + MOD_FORGE_VERSION_MIN + ",); ";
    public static final String GC_DEPENDENCY = "required-after:" + MOD_GALACTICRAFT + "@[" + MOD_GALACTICRAFT_VERSION_MIN + ",); ";
    
    // Dependencies
    public static final String MOD_DEPENDENCIES =
            FORGE_DEPENDENCY + GC_DEPENDENCY;
}
