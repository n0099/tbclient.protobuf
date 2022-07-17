package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppealInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_APPEAL_URL = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String appeal_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String source;
  
  public AppealInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.source;
      if (str1 == null) {
        this.source = "";
      } else {
        this.source = str1;
      } 
      str = paramBuilder.appeal_url;
      if (str == null) {
        this.appeal_url = "";
      } else {
        this.appeal_url = str;
      } 
    } else {
      this.source = ((Builder)str).source;
      this.appeal_url = ((Builder)str).appeal_url;
    } 
  }
  
  public AppealInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AppealInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String appeal_url;
    
    public String source;
    
    public Builder() {}
    
    public Builder(AppealInfo param1AppealInfo) {
      super(param1AppealInfo);
      if (param1AppealInfo == null)
        return; 
      this.source = param1AppealInfo.source;
      this.appeal_url = param1AppealInfo.appeal_url;
    }
    
    public AppealInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppealInfo)interceptResult.objValue; 
      } 
      return new AppealInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
