package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ClientPlatform extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_SCHEDULE_CAL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schedule_cal;
  
  @ProtoField(tag = 2)
  public final StarSchedule star_schedule;
  
  public ClientPlatform(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.schedule_cal;
      if (str == null) {
        this.schedule_cal = "";
      } else {
        this.schedule_cal = str;
      } 
      this.star_schedule = paramBuilder.star_schedule;
    } else {
      this.schedule_cal = paramBuilder.schedule_cal;
      this.star_schedule = paramBuilder.star_schedule;
    } 
  }
  
  public ClientPlatform(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ClientPlatform> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String schedule_cal;
    
    public StarSchedule star_schedule;
    
    public Builder() {}
    
    public Builder(ClientPlatform param1ClientPlatform) {
      super(param1ClientPlatform);
      if (param1ClientPlatform == null)
        return; 
      this.schedule_cal = param1ClientPlatform.schedule_cal;
      this.star_schedule = param1ClientPlatform.star_schedule;
    }
    
    public ClientPlatform build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ClientPlatform)interceptResult.objValue; 
      } 
      return new ClientPlatform(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
