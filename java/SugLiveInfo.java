package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SugLiveInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_WORD = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String word;
  
  public SugLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.word;
      if (str == null) {
        this.word = "";
      } else {
        this.word = str;
      } 
      this.ala_info = paramBuilder.ala_info;
    } else {
      this.word = paramBuilder.word;
      this.ala_info = paramBuilder.ala_info;
    } 
  }
  
  public SugLiveInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SugLiveInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public AlaLiveInfo ala_info;
    
    public String word;
    
    public Builder() {}
    
    public Builder(SugLiveInfo param1SugLiveInfo) {
      super(param1SugLiveInfo);
      if (param1SugLiveInfo == null)
        return; 
      this.word = param1SugLiveInfo.word;
      this.ala_info = param1SugLiveInfo.ala_info;
    }
    
    public SugLiveInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SugLiveInfo)interceptResult.objValue; 
      } 
      return new SugLiveInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
