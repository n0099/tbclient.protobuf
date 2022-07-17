package tbclient.GetVerticalForumList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_BEGIN_ID;
  
  public static final List<Integer> DEFAULT_CLASSID_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_PN;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer begin_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
  public final List<Integer> classid_list;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BEGIN_ID = integer;
    DEFAULT_PN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      List<Integer> list = paramBuilder.classid_list;
      if (list == null) {
        this.classid_list = DEFAULT_CLASSID_LIST;
      } else {
        this.classid_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.begin_id;
      if (integer1 == null) {
        this.begin_id = DEFAULT_BEGIN_ID;
      } else {
        this.begin_id = integer1;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.classid_list = Message.immutableCopyOf(((Builder)integer).classid_list);
      this.begin_id = ((Builder)integer).begin_id;
      this.pn = ((Builder)integer).pn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1229076903, "Ltbclient/GetVerticalForumList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1229076903, "Ltbclient/GetVerticalForumList/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer begin_id;
    
    public List<Integer> classid_list;
    
    public CommonReq common;
    
    public Integer pn;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.classid_list = Message.copyOf(param1DataReq.classid_list);
      this.begin_id = param1DataReq.begin_id;
      this.pn = param1DataReq.pn;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
