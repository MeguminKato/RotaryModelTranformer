package cn.tohsaka.factory.rotationcraft.client.utils;

import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class LODModelPart {
    private CubeListBuilder builder;

    public static LODModelPart create(int texX,int texY){
        return new LODModelPart(texX,texY);
    }

    public LODModelPart(int texX,int texY){
        builder = CubeListBuilder.create().texOffs(texX,texY);
    }

    public static PartDefinition simpleCreate(String name,PartDefinition partDefinition,int texX,int texY,float x,float y,float z,float xx,float yy,float zz,float rx,float ry,float rz){
        return new LODModelPart(texX,texY).addBox(x,y,z,xx,yy,zz).setRotationPofloat(rx,ry,rz).mirror().build(name,partDefinition);
    }
    public static PartDefinition simpleCreate(String name,PartDefinition partDefinition,int texX,int texY,float x,float y,float z,float xx,float yy,float zz,float rx,float ry,float rz,float rrx,float rry,float rrz){
        return new LODModelPart(texX,texY).addBox(x,y,z,xx,yy,zz).setRotationPofloat(rx,ry,rz).setRotation(rrx,rry,rrz).mirror().build(name,partDefinition);
    }

    public LODModelPart addBox(float x,float y,float z,float xx,float yy,float zz){
        builder.addBox(x,y,z,xx,yy,zz);
        return this;
    }
    Vector3f rotationpofloat;
    public LODModelPart setRotationPofloat(float x,float y,float z){
        rotationpofloat = new Vector3f(x,y,z);
        return this;
    }
    public LODModelPart mirror(boolean m){
        builder.mirror(m);
        return this;
    }
    public LODModelPart mirror(){
        builder.mirror(true);
        return this;
    }

    Vector3f rotation;
    public LODModelPart setRotation(float x,float y,float z){
        rotation = new Vector3f(x,y,z);
        return this;
    }


    public PartDefinition build(String partName, PartDefinition partDefinition){
        PartPose pose = null;
        if(rotationpofloat!=null){
            if(rotation!=null){
                pose = PartPose.offsetAndRotation(rotationpofloat.x(),rotationpofloat.y(),rotationpofloat.z(),rotation.x(),rotation.y(),rotation.z());
            }else{
                pose = PartPose.offset(rotationpofloat.x(),rotationpofloat.y(),rotationpofloat.z());
            }
        }else {
            pose = PartPose.ZERO;
        }
        return partDefinition.addOrReplaceChild(partName,
                builder
                , pose
        );

    }




}
