package codes.biscuit.skyblockaddons.asm.utils;

import codes.biscuit.skyblockaddons.tweaker.SkyblockAddonsTransformer;

public enum TransformerClass {

    Minecraft("net/minecraft/client/Minecraft", "ave"),
    EntityItem("net/minecraft/entity/item/EntityItem", "uz"),
    GuiChest("net/minecraft/client/gui/inventory/GuiChest", "ayr"),
    IInventory("net/minecraft/inventory/IInventory", "og"),
    FontRenderer("Lnet/minecraft/client/gui/FontRenderer", "avn"),
    GuiScreen("net/minecraft/client/GuiScreen", "axu"),
    GuiContainer("net/minecraft/client/gui/inventory/GuiContainer", "ayl"),
    ItemStack("net/minecraft/item/ItemStack", "zx"),
    GlStateManager("net/minecraft/client/renderer/GlStateManager", "bfl"),
    Container("net/minecraft/inventory/Container", "xi"),
    Slot("net/minecraft/inventory/Slot", "yg"),
    RenderItem("net/minecraft/client/renderer/entity/RenderItem", "bjh"),
    GuiInventory("net/minecraft/client/gui/inventory/GuiInventory", "azc"),
    IChatComponent("net/minecraft/util/IChatComponent", "eu"),
    IReloadableResourceManager("net/minecraft/client/resources/IReloadableResourceManager", "bng"),
    S2FPacketSetSlot("net/minecraft/network/play/server/S2FPacketSetSlot", "gf"),
    S30PacketWindowItems("net/minecraft/network/play/server/S30PacketWindowItems", "gd"),
    BlockPos("net/minecraft/util/BlockPos", "cj"),
    EntityPlayer("net/minecraft/entity/player/EntityPlayer", "wn"),
    EnumPlayerModelParts("net/minecraft/entity/player/EnumPlayerModelParts", "wo"),
    Entity("net/minecraft/entity/Entity", "pk"),
    SoundManager("net/minecraft/client/audio/SoundManager", "bpx"),
    ISound("net/minecraft/client/audio/ISound", "bpj"),
    SoundPoolEntry("net/minecraft/client/audio/SoundPoolEntry", "bpw"),
    SoundCategory("net/minecraft/client/audio/SoundCategory", "bpg"),
    TileEntityEnderChestRenderer("net/minecraft/client/renderer/tileentity/TileEntityEnderChestRenderer", "bhg"),
    ResourceLocation("net/minecraft/util/ResourceLocation", "jy"),
    ModelChest("net/minecraft/client/model/ModelChest", "baz"),
    EntityPlayerSP("net/minecraft/client/entity/EntityPlayerSP", "bew"),
    EntityRenderer("net/minecraft/client/renderer/EntityRenderer", "bfk"),
    GuiNewChat("net/minecraft/client/gui/GuiNewChat", "avt"),
    Item("net/minecraft/item/Item", "zw"),
    MouseHelper("net/minecraft/util/MouseHelper", "avf"),
    NetHandlerPlayClient("net/minecraft/client/network/NetHandlerPlayClient", "bcy"),
    PlayerControllerMP("net/minecraft/client/multiplayer/PlayerControllerMP", "bda"),
    RendererLivingEntity("net/minecraft/client/renderer/entity/RendererLivingEntity", "bjl"),
    RenderManager("net/minecraft/client/renderer/entity/RenderManager", "biu"),
    EntityLivingBase("net/minecraft/entity/EntityLivingBase", "pr"),
    EnumFacing("net/minecraft/util/EnumFacing", "cq"),
    ICamera("net/minecraft/client/renderer/culling/ICamera", "bia"),
    TileEntity("net/minecraft/tileentity/TileEntity", "akw"),

    NULL(null,null);

    private String name;

    private String seargeClass;
    private String notchClass18;

    TransformerClass(String seargeClass, String notchClass18) {
        this.seargeClass = seargeClass;
        this.notchClass18 = notchClass18;

        if (SkyblockAddonsTransformer.isDeobfuscated() || !SkyblockAddonsTransformer.isUsingNotchMappings()) {
            name = seargeClass;
        } else {
            name = notchClass18;
        }
    }

    public String getNameRaw() {
        return name;
    }

    public String getName() {
        return "L"+name+";";
    }

    public String getTransformerName() {
        if (SkyblockAddonsTransformer.isLabymodClient()) return notchClass18;

        return seargeClass.replaceAll("/", ".");
    }
}
