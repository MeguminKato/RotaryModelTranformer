# RotaryModelTranformer
## 适用于将 1.7.10 RotaryCraft 模型转换至 forge[1.18] 模型的转换器

<br />

### 1. 启动converter.html<br />

### 2. 将原版代码复制到网页上端文本框<br />

### 3. 点击run<br />

### 4. ModelPart 等变量复制到class中<br />

### 5.

>public static MeshDefinition createBodyLayer() {<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var mesh = new MeshDefinition();<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var partdefinition = mesh.getRoot();<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;... model code<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return mesh;<br />
>}<br />


### 6.

>ResourceLocation name = !!!model name!!! ;<br />
>ModelLayerLocation modelLayerLocation = ModModelLayers.make(name.getPath(),"main");<br />
>modelconsumer.accept(modelLayerLocation, () -> LayerDefinition.create(!!! createBodyLayer() !!!, texW, texH));<br />
>ModModelLayers.layers.put(name,modelLayerLocation);
<br />

### 7. enjoy your model :)
