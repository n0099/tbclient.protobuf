package tbclient.TalkBall;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class CardInfo extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final InsertFloor insert_floor;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  public CardInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      this.insert_floor = paramBuilder.insert_floor;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.insert_floor = paramBuilder.insert_floor;
    } 
  }
  
  public CardInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CardInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public InsertFloor insert_floor;
    
    public ThreadInfo thread_info;
    
    public Builder() {}
    
    public Builder(CardInfo param1CardInfo) {
      super(param1CardInfo);
      if (param1CardInfo == null)
        return; 
      this.thread_info = param1CardInfo.thread_info;
      this.insert_floor = param1CardInfo.insert_floor;
    }
    
    public CardInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CardInfo)interceptResult.objValue; 
      } 
      return new CardInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
