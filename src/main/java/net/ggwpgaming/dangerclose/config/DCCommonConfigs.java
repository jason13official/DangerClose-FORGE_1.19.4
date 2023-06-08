package net.ggwpgaming.dangerclose.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DCCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_TORCH_BURN_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_CAMPFIRE_BURN_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_STONECUTTER_DAMAGE;

    static {
        BUILDER.push("Danger Close Configuration");

        // CONFIGS

        ENABLE_TORCH_BURN_DAMAGE = BUILDER.comment().define("ENTITIES TAKE BURNING DAMAGE FROM TORCHES", true);
        ENABLE_CAMPFIRE_BURN_DAMAGE = BUILDER.comment().define("ENTITIES TAKE BURNING DAMAGE FROM CAMPFIRES", true);
        ENABLE_STONECUTTER_DAMAGE = BUILDER.comment().define("ENTITIES TAKE CUTTING DAMAGE FROM STONECUTTERS", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
