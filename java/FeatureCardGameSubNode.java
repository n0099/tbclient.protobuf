package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeatureCardGameSubNode extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public FeatureCardGameSubNode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.image = ((Builder)str).image;
      this.title = ((Builder)str).title;
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
  
  public FeatureCardGameSubNode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardGameSubNode> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String image;
    
    public String name;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(FeatureCardGameSubNode param1FeatureCardGameSubNode) {
      super(param1FeatureCardGameSubNode);
      if (param1FeatureCardGameSubNode == null)
        return; 
      this.image = param1FeatureCardGameSubNode.image;
      this.title = param1FeatureCardGameSubNode.title;
      this.name = param1FeatureCardGameSubNode.name;
      this.url = param1FeatureCardGameSubNode.url;
    }
    
    public FeatureCardGameSubNode build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeatureCardGameSubNode)interceptResult.objValue; 
      } 
      return new FeatureCardGameSubNode(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
