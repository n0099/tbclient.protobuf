package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CartoonChapterInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CHAPTER_ID;
  
  public static final Integer DEFAULT_CHAPTER_VIP;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer chapter_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer chapter_vip;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-225196444, "Ltbclient/CartoonChapterInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-225196444, "Ltbclient/CartoonChapterInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CHAPTER_ID = integer;
    DEFAULT_CHAPTER_VIP = integer;
  }
  
  public CartoonChapterInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.chapter_id;
      if (integer1 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer1;
      } 
      integer = paramBuilder.chapter_vip;
      if (integer == null) {
        this.chapter_vip = DEFAULT_CHAPTER_VIP;
      } else {
        this.chapter_vip = integer;
      } 
    } else {
      this.chapter_id = ((Builder)integer).chapter_id;
      this.chapter_vip = ((Builder)integer).chapter_vip;
    } 
  }
  
  public CartoonChapterInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CartoonChapterInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer chapter_id;
    
    public Integer chapter_vip;
    
    public Builder() {}
    
    public Builder(CartoonChapterInfo param1CartoonChapterInfo) {
      super(param1CartoonChapterInfo);
      if (param1CartoonChapterInfo == null)
        return; 
      this.chapter_id = param1CartoonChapterInfo.chapter_id;
      this.chapter_vip = param1CartoonChapterInfo.chapter_vip;
    }
    
    public CartoonChapterInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CartoonChapterInfo)interceptResult.objValue; 
      } 
      return new CartoonChapterInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
