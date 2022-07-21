# RotaryModelTranformer
## 适用于将 1.7.10 RotaryCraft 模型转换至 forge[1.18] 模型的转换器

<br />
### 1. 启动converter.html
### 2. 将原版代码复制到网页上端文本框
### 3. 点击run
### 4. ModelPart 等变量复制到class中
### 5.<br /><br />
<code>
    public static MeshDefinition createBodyLayer() {<br />
    var mesh = new MeshDefinition();<br />
    var partdefinition = mesh.getRoot();<br />
    <br />
    ... model code<br />
    <br />
    return mesh;<br />
}<br />
</code>

### 6.<br /><br />
<code><br />
ResourceLocation name = !!!model name!!! ;<br />
ModelLayerLocation modelLayerLocation = ModModelLayers.make(name.getPath(),"main");<br />
modelconsumer.accept(modelLayerLocation, () -> LayerDefinition.create(!!! createBodyLayer() !!!, texW, texH));<br />
ModModelLayers.layers.put(name,modelLayerLocation);<br />
</code><br /><br />
### 7. enjoy your model :)
