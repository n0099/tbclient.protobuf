package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TbreadDispatch extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FLOOR_NUM = "";
  
  public static final String DEFAULT_PRODUCT_ID = "";
  
  public static final String DEFAULT_PRODUCT_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String floor_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String product_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String product_type;
  
  public TbreadDispatch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.floor_num;
      if (str1 == null) {
        this.floor_num = "";
      } else {
        this.floor_num = str1;
      } 
      str1 = paramBuilder.product_type;
      if (str1 == null) {
        this.product_type = "";
      } else {
        this.product_type = str1;
      } 
      str = paramBuilder.product_id;
      if (str == null) {
        this.product_id = "";
      } else {
        this.product_id = str;
      } 
    } else {
      this.floor_num = ((Builder)str).floor_num;
      this.product_type = ((Builder)str).product_type;
      this.product_id = ((Builder)str).product_id;
    } 
  }
  
  public TbreadDispatch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbreadDispatch> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String floor_num;
    
    public String product_id;
    
    public String product_type;
    
    public Builder() {}
    
    public Builder(TbreadDispatch param1TbreadDispatch) {
      super(param1TbreadDispatch);
      if (param1TbreadDispatch == null)
        return; 
      this.floor_num = param1TbreadDispatch.floor_num;
      this.product_type = param1TbreadDispatch.product_type;
      this.product_id = param1TbreadDispatch.product_id;
    }
    
    public TbreadDispatch build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TbreadDispatch)interceptResult.objValue; 
      } 
      return new TbreadDispatch(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
