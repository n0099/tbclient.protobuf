package tbclient.GetGiftMyList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GiftList extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final Gift gift;
  
  @ProtoField(tag = 1)
  public final Sender sender;
  
  public GiftList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.sender = paramBuilder.sender;
      this.gift = paramBuilder.gift;
    } else {
      this.sender = paramBuilder.sender;
      this.gift = paramBuilder.gift;
    } 
  }
  
  public GiftList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GiftList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Gift gift;
    
    public Sender sender;
    
    public Builder() {}
    
    public Builder(GiftList param1GiftList) {
      super(param1GiftList);
      if (param1GiftList == null)
        return; 
      this.sender = param1GiftList.sender;
      this.gift = param1GiftList.gift;
    }
    
    public GiftList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GiftList)interceptResult.objValue; 
      } 
      return new GiftList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
