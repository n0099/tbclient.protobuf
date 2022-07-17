package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbPresentList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_GIFT_ID;
  
  public static final String DEFAULT_GIFT_NAME = "";
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer gift_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String gift_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-503417378, "Ltbclient/PbPresentList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-503417378, "Ltbclient/PbPresentList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_GIFT_ID = integer;
    DEFAULT_NUM = integer;
  }
  
  public PbPresentList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.gift_id;
      if (integer1 == null) {
        this.gift_id = DEFAULT_GIFT_ID;
      } else {
        this.gift_id = integer1;
      } 
      String str = paramBuilder.gift_name;
      if (str == null) {
        this.gift_name = "";
      } else {
        this.gift_name = str;
      } 
      str = paramBuilder.thumbnail_url;
      if (str == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.gift_id = ((Builder)integer).gift_id;
      this.gift_name = ((Builder)integer).gift_name;
      this.thumbnail_url = ((Builder)integer).thumbnail_url;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public PbPresentList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbPresentList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer gift_id;
    
    public String gift_name;
    
    public Integer num;
    
    public String thumbnail_url;
    
    public Builder() {}
    
    public Builder(PbPresentList param1PbPresentList) {
      super(param1PbPresentList);
      if (param1PbPresentList == null)
        return; 
      this.gift_id = param1PbPresentList.gift_id;
      this.gift_name = param1PbPresentList.gift_name;
      this.thumbnail_url = param1PbPresentList.thumbnail_url;
      this.num = param1PbPresentList.num;
    }
    
    public PbPresentList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbPresentList)interceptResult.objValue; 
      } 
      return new PbPresentList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
