package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CartoonThread extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_CARTOON_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_CHAPTER_ID = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer chapter_id;
  
  public CartoonThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.cartoon_id;
      if (long_ == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_;
      } 
      integer = paramBuilder.chapter_id;
      if (integer == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer;
      } 
    } else {
      this.cartoon_id = ((Builder)integer).cartoon_id;
      this.chapter_id = ((Builder)integer).chapter_id;
    } 
  }
  
  public CartoonThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(428477325, "Ltbclient/CartoonThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(428477325, "Ltbclient/CartoonThread;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CartoonThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long cartoon_id;
    
    public Integer chapter_id;
    
    public Builder() {}
    
    public Builder(CartoonThread param1CartoonThread) {
      super(param1CartoonThread);
      if (param1CartoonThread == null)
        return; 
      this.cartoon_id = param1CartoonThread.cartoon_id;
      this.chapter_id = param1CartoonThread.chapter_id;
    }
    
    public CartoonThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CartoonThread)interceptResult.objValue; 
      } 
      return new CartoonThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
