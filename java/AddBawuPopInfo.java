package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddBawuPopInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public AddBawuPopInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.img_url = ((Builder)str).img_url;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public AddBawuPopInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddBawuPopInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String content;
    
    public String img_url;
    
    public String jump_url;
    
    public String title;
    
    public Builder() {}
    
    public Builder(AddBawuPopInfo param1AddBawuPopInfo) {
      super(param1AddBawuPopInfo);
      if (param1AddBawuPopInfo == null)
        return; 
      this.title = param1AddBawuPopInfo.title;
      this.content = param1AddBawuPopInfo.content;
      this.img_url = param1AddBawuPopInfo.img_url;
      this.jump_url = param1AddBawuPopInfo.jump_url;
    }
    
    public AddBawuPopInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AddBawuPopInfo)interceptResult.objValue; 
      } 
      return new AddBawuPopInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
