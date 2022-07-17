package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarVoice extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  public StarVoice(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.voice_md5;
      if (str == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str;
      } 
    } else {
      this.avatar = ((Builder)str).avatar;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.voice_md5 = ((Builder)str).voice_md5;
    } 
  }
  
  public StarVoice(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarVoice> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public String desc;
    
    public String title;
    
    public String voice_md5;
    
    public Builder() {}
    
    public Builder(StarVoice param1StarVoice) {
      super(param1StarVoice);
      if (param1StarVoice == null)
        return; 
      this.avatar = param1StarVoice.avatar;
      this.title = param1StarVoice.title;
      this.desc = param1StarVoice.desc;
      this.voice_md5 = param1StarVoice.voice_md5;
    }
    
    public StarVoice build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (StarVoice)interceptResult.objValue; 
      } 
      return new StarVoice(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
