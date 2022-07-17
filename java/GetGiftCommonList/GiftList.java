package tbclient.GetGiftCommonList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GiftList extends Message {
  public static Interceptable $ic;
  
  public static final List<Item> DEFAULT_ITEM;
  
  public static final Integer DEFAULT_TYPE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Item> item;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String type_name;
  
  static {
    DEFAULT_ITEM = Collections.emptyList();
  }
  
  public GiftList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Item> list;
    if (paramBoolean == true) {
      String str = paramBuilder.type_name;
      if (str == null) {
        this.type_name = "";
      } else {
        this.type_name = str;
      } 
      Integer integer = paramBuilder.type_id;
      if (integer == null) {
        this.type_id = DEFAULT_TYPE_ID;
      } else {
        this.type_id = integer;
      } 
      list = paramBuilder.item;
      if (list == null) {
        this.item = DEFAULT_ITEM;
      } else {
        this.item = Message.immutableCopyOf(list);
      } 
    } else {
      this.type_name = ((Builder)list).type_name;
      this.type_id = ((Builder)list).type_id;
      this.item = Message.immutableCopyOf(((Builder)list).item);
    } 
  }
  
  public GiftList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1732883933, "Ltbclient/GetGiftCommonList/GiftList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1732883933, "Ltbclient/GetGiftCommonList/GiftList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GiftList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Item> item;
    
    public Integer type_id;
    
    public String type_name;
    
    public Builder() {}
    
    public Builder(GiftList param1GiftList) {
      super(param1GiftList);
      if (param1GiftList == null)
        return; 
      this.type_name = param1GiftList.type_name;
      this.type_id = param1GiftList.type_id;
      this.item = Message.copyOf(param1GiftList.item);
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
