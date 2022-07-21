package cn.tohsaka.factory.rotationcraft.client.model.gearbox;

import cn.tohsaka.factory.rotationcraft.Rotationcraft;
import cn.tohsaka.factory.rotationcraft.api.interfaces.IRotaryModel;
import cn.tohsaka.factory.rotationcraft.blocks.transmits.BlockGearBox;
import cn.tohsaka.factory.rotationcraft.client.ModLayerDefinitions;
import cn.tohsaka.factory.rotationcraft.client.utils.LODModelPart;
import cn.tohsaka.factory.rotationcraft.init.etc.annotations.GameInitializer;
import cn.tohsaka.factory.rotationcraft.tiles.transmits.TileGearBox;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.lang.reflect.Field;

@GameInitializer
public class ModelGearBox8x<T extends BlockEntity> implements IRotaryModel<T> {
    ModelPart Shape1;
    ModelPart Shape2;
    ModelPart Shape3;
    ModelPart Shape4;
    ModelPart Shape5;
    ModelPart Shape6;
    ModelPart Shape7;
    ModelPart Shape8;
    ModelPart Shape9;
    ModelPart Shape10;
    ModelPart Shape11;

    ModelPart Shape12;
    ModelPart Shape13;
    ModelPart Shape14;
    ModelPart Shape15;
    ModelPart Shape16;
    ModelPart Shape17;
    ModelPart Shape18;
    ModelPart Shape19;
    ModelPart Shape20;
    ModelPart Shape21;
    ModelPart Shape22;
    ModelPart Shape23;
    ModelPart Shape24;
    ModelPart Shape25;
    ModelPart Shape26;
    ModelPart Shape27;
    ModelPart Shape28;
    ModelPart Shape29;
    ModelPart Shape30;
    ModelPart Shape31;
    ModelPart Shape32;
    ModelPart Shape33;
    ModelPart Shape34;
    ModelPart Shape35;
    ModelPart Shape36;
    ModelPart Shape37;
    ModelPart Shape38;
    ModelPart Shape39;
    ModelPart Shape40;
    ModelPart Shape41;




    public ModelGearBox8x(ModelPart root) {
        try {
            for(Field f:this.getClass().getDeclaredFields()){
                if(f.getName().contains("Shape")){
                    f.set(this,root.getChild(f.getName()));
                }
            }
        }catch (Exception ex){
            //ex.printStackTrace();
        }
    }

    public static void init(){
        ModLayerDefinitions.registerModel(BlockGearBox.GB8X,createBodyLayer(),128,32);
    }

    public static MeshDefinition createBodyLayer() {
        var mesh = new MeshDefinition();
        var partdefinition = mesh.getRoot();



        LODModelPart.simpleCreate("Shape1",partdefinition, 0, 0, 0F, 0F, 0F, 16, 1, 16,-8F, 23F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape2",partdefinition, 64, 0, 0F, 0F, 0F, 1, 12, 16,7F, 11F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape3",partdefinition, 64, 0, 0F, 0F, 0F, 1, 12, 16,-8F, 11F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape4",partdefinition, 0, 17, 0F, 0F, 0F, 14, 4, 1,-7F, 19F, 7F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape5",partdefinition, 0, 17, 0F, 0F, 0F, 14, 4, 1,-7F, 19F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape6",partdefinition, 30, 17, 0F, 0F, 0F, 1, 3, 1,6F, 16F, 7F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape7",partdefinition, 30, 17, 0F, 0F, 0F, 1, 3, 1,6F, 16F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape8",partdefinition, 30, 17, 0F, 0F, 0F, 1, 3, 1,-7F, 16F, 7F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape9",partdefinition, 30, 17, 0F, 0F, 0F, 1, 3, 1,-7F, 16F, -8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape10",partdefinition, 42, 17, 0F, 0F, 0F, 1, 3, 10,7F, 8F, -5F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape11",partdefinition, 42, 17, 0F, 0F, 0F, 1, 3, 10,-8F, 8F, -5F, 0F, 0F, 0F);


        LODModelPart.simpleCreate("Shape12",partdefinition, 0, 27, 0F, 0F, 0F, 4, 2, 2,-8.5F, 15F, -1F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape13",partdefinition, 0, 27, 0F, 0F, 0F, 4, 2, 2,-8.5F, 16F, -1.4F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape14",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 15.5F, -5.7F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape15",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 17.5F, -6.5F, 0.8028515F, 0F, 0F);
        LODModelPart.simpleCreate("Shape16",partdefinition, 100, 0, 0F, 0F, 0F, 1, 6, 6,0F, 13F, -5.3F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape17",partdefinition, 100, 0, 0F, 0F, 0F, 1, 6, 6,-4F, 14.5F, -0.5F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape18",partdefinition, 100, 0, 0F, 0F, 0F, 1, 3, 3,-5F, 14.5F, 2F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape19",partdefinition, 100, 0, 0F, 0F, 0F, 1, 3, 3,-5F, 13F, 2.5F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape20",partdefinition, 0, 27, 0F, 0F, 0F, 8, 2, 2,-6F, 13F, -2.4F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape21",partdefinition, 0, 27, 0F, 0F, 0F, 10, 2, 2,-5F, 17.5F, -5F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape22",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 12.4F, 1.8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape23",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 14.5F, 1F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape24",partdefinition, 0, 27, 0F, 0F, 0F, 3, 2, 2,5.5F, 15F, -1F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape25",partdefinition, 0, 27, 0F, 0F, 0F, 3, 2, 2,5.5F, 16F, -1.4F, 0.7853982F, 0F, 0.0174533F);
        LODModelPart.simpleCreate("Shape26",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 15.5F, -5.5F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape27",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 17.5F, -6.5F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape28",partdefinition, 100, 19, 0F, 0F, 0F, 2, 7, 3,-2F, 16F, -5F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape29",partdefinition, 100, 19, 0F, 0F, 0F, 2, 10, 3,1F, 13F, 2.4F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape30",partdefinition, 0, 27, 0F, 0F, 0F, 8, 2, 2,-3F, 14.5F, 2.5F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape31",partdefinition, 0, 27, 0F, 0F, 0F, 8, 2, 2,-3F, 13.5F, 3F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape32",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 14F, -2F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape33",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,5F, 16F, -3F, 0.7853982F, 0F, 0F);
        LODModelPart.simpleCreate("Shape34",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 11F, -3F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape35",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 13F, -4F, 0.8028515F, 0F, 0F);
        LODModelPart.simpleCreate("Shape36",partdefinition, 100, 0, 0F, 0F, 0F, 1, 6, 6,-4F, 11.4F, 0.8F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape37",partdefinition, 100, 0, 0F, 0F, 0F, 1, 6, 6,0F, 10F, -4F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape38",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 14F, -2F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape39",partdefinition, 100, 0, 0F, 0F, 0F, 1, 4, 4,-5F, 16F, -3F, 0.8028515F, 0F, 0F);
        LODModelPart.simpleCreate("Shape40",partdefinition, 0, 27, 0F, 0F, 0F, 10, 2, 2,-5F, 16.5F, -4.6F, 0F, 0F, 0F);
        LODModelPart.simpleCreate("Shape41",partdefinition, 0, 27, 0F, 0F, 0F, 8, 2, 2,-6F, 12F, -2F, 0F, 0F, 0F);
        return mesh;
    }

    @Override
    public void renderToBuffer(T te, PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay) {

        float input = 0;
        float output = 0;

        poseStack.mulPose(Vector3f.YP.rotationDegrees(180));

        if(te!=null && te instanceof TileGearBox gb){
            input = gb.angleIn;
            output = gb.angleOut;
            if(gb.mode == 1){
                poseStack.mulPose(Vector3f.YP.rotationDegrees(180));
                input = -gb.angleOut;
                output = -gb.angleIn;
            }
        }

        poseStack.mulPose(Vector3f.YP.rotationDegrees(90));


        Shape1.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape2.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape3.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape4.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape5.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape6.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape7.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape8.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape9.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape10.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape11.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape28.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape29.render(poseStack, vertexConsumer, packedLight, packedOverlay);


        double d1 = 0;
        double d2 = 0.8125;
        double d3 = -0.0625;
        //poseStack.translate(0, 0.0625, 0.006125);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-input*1.1F));
        poseStack.translate(-d1, -d2, -d3);
        Shape16.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape37.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape20.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape34.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape35.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape41.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(input*1.1F));
        poseStack.translate(-d1, -d2, -d3);
        //poseStack.translate(0, -0.0625, -0.006125);

        d1 = 0;
        d2 = 1.092;
        d3 = -0.224;
        poseStack.translate(0, 0.0625, 0.006125);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-input*1.25F));
        poseStack.translate(-d1, -d2, -d3);
        Shape21.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape40.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape26.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape27.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape14.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape15.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(input*1.25F));
        poseStack.translate(-d1, -d2, -d3);
        poseStack.translate(0, -0.0625, -0.006125);

        d1 = 0;
        d2 = 0.9025;
        d3 = 0.25;
        poseStack.translate(0, 0.015125, -0.006125);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-input*1.25F));
        poseStack.translate(-d1, -d2, -d3);
        Shape22.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape36.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape23.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape17.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape18.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape19.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape30.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        Shape31.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        poseStack.translate(d1, d2, d3);
        poseStack.mulPose(Vector3f.XP.rotationDegrees(input*1.25F));
        poseStack.translate(-d1, -d2, -d3);
        poseStack.translate(0, -0.015125, 0.006125);

        {//output
            poseStack.translate(0, 1, 0);
            poseStack.mulPose(Vector3f.XP.rotationDegrees(output));
            poseStack.translate(0, -1, 0);
            Shape24.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape25.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape32.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape33.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            poseStack.translate(0, 1, 0);
            poseStack.mulPose(Vector3f.XP.rotationDegrees(-output));
            poseStack.translate(0, -1, 0);
        }

        {
            poseStack.translate(0, 1, 0);
            poseStack.mulPose(Vector3f.XP.rotationDegrees(input));
            poseStack.translate(0, -1, 0);
            Shape12.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape13.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape38.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            Shape39.render(poseStack, vertexConsumer, packedLight, packedOverlay);
            poseStack.translate(0, 1, 0);
            poseStack.mulPose(Vector3f.XP.rotationDegrees(-input));
            poseStack.translate(0, -1, 0);
        }
    }

    @Override
    public ResourceLocation getTexture(ItemStack stack) {
        if(stack.hasTag()){
            int material = stack.getTag().getInt("Material");
            return renderTexture("transmission/gear/geartex"+String.valueOf(material));
        }
        return renderTexture("transmission/gear/geartex0");
    }

    @Override
    public ResourceLocation getTexture(BlockEntity tile) {
        if(tile instanceof TileGearBox gb){
            return renderTexture("transmission/gear/geartex"+String.valueOf(gb.material));
        }
        return renderTexture("transmission/gear/geartex0");
    }
}
