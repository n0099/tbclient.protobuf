package tbclient.GetAddressList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<listData> DEFAULT_ADDRESS_LIST = Collections.emptyList();
  
  public static final List<deleteList> DEFAULT_DELETED_LIST = Collections.emptyList();
  
  public static final List<robotsList> DEFAULT_ROBOTS_LIST;
  
  public static final Long DEFAULT_TIMESTAMP = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<listData> address_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<deleteList> deleted_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<robotsList> robots_list;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long timestamp;
  
  static {
    DEFAULT_ROBOTS_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<robotsList> list;
    if (paramBoolean == true) {
      List<listData> list2 = paramBuilder.address_list;
      if (list2 == null) {
        this.address_list = DEFAULT_ADDRESS_LIST;
      } else {
        this.address_list = Message.immutableCopyOf(list2);
      } 
      List<deleteList> list1 = paramBuilder.deleted_list;
      if (list1 == null) {
        this.deleted_list = DEFAULT_DELETED_LIST;
      } else {
        this.deleted_list = Message.immutableCopyOf(list1);
      } 
      Long long_ = paramBuilder.timestamp;
      if (long_ == null) {
        this.timestamp = DEFAULT_TIMESTAMP;
      } else {
        this.timestamp = long_;
      } 
      list = paramBuilder.robots_list;
      if (list == null) {
        this.robots_list = DEFAULT_ROBOTS_LIST;
      } else {
        this.robots_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.address_list = Message.immutableCopyOf(((Builder)list).address_list);
      this.deleted_list = Message.immutableCopyOf(((Builder)list).deleted_list);
      this.timestamp = ((Builder)list).timestamp;
      this.robots_list = Message.immutableCopyOf(((Builder)list).robots_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1467063694, "Ltbclient/GetAddressList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1467063694, "Ltbclient/GetAddressList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<listData> address_list;
    
    public List<deleteList> deleted_list;
    
    public List<robotsList> robots_list;
    
    public Long timestamp;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.address_list = Message.copyOf(param1DataRes.address_list);
      this.deleted_list = Message.copyOf(param1DataRes.deleted_list);
      this.timestamp = param1DataRes.timestamp;
      this.robots_list = Message.copyOf(param1DataRes.robots_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
