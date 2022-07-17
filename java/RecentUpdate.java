package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecentUpdate extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LOG = "";
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  public static final String DEFAULT_VERSION = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String log;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String update_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String version;
  
  public RecentUpdate(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.version;
      if (str1 == null) {
        this.version = "";
      } else {
        this.version = str1;
      } 
      str1 = paramBuilder.log;
      if (str1 == null) {
        this.log = "";
      } else {
        this.log = str1;
      } 
      str = paramBuilder.update_time;
      if (str == null) {
        this.update_time = "";
      } else {
        this.update_time = str;
      } 
    } else {
      this.version = ((Builder)str).version;
      this.log = ((Builder)str).log;
      this.update_time = ((Builder)str).update_time;
    } 
  }
  
  public RecentUpdate(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecentUpdate> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String log;
    
    public String update_time;
    
    public String version;
    
    public Builder() {}
    
    public Builder(RecentUpdate param1RecentUpdate) {
      super(param1RecentUpdate);
      if (param1RecentUpdate == null)
        return; 
      this.version = param1RecentUpdate.version;
      this.log = param1RecentUpdate.log;
      this.update_time = param1RecentUpdate.update_time;
    }
    
    public RecentUpdate build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecentUpdate)interceptResult.objValue; 
      } 
      return new RecentUpdate(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
