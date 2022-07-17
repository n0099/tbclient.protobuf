package tbclient.ExcFrsPage;

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
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_PN;
  
  public static final List<ExcellentTagInfo> DEFAULT_TAG_LIST = Collections.emptyList();
  
  public static final List<ExcellentThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ExcellentTagInfo> tag_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ExcellentThreadInfo> thread_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_PN = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ExcellentTagInfo> list1 = paramBuilder.tag_list;
      if (list1 == null) {
        this.tag_list = DEFAULT_TAG_LIST;
      } else {
        this.tag_list = Message.immutableCopyOf(list1);
      } 
      List<ExcellentThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
    } else {
      this.tag_list = Message.immutableCopyOf(((Builder)integer).tag_list);
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.has_more = ((Builder)integer).has_more;
      this.pn = ((Builder)integer).pn;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-887574236, "Ltbclient/ExcFrsPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-887574236, "Ltbclient/ExcFrsPage/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer has_more;
    
    public Integer pn;
    
    public List<ExcellentTagInfo> tag_list;
    
    public List<ExcellentThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.tag_list = Message.copyOf(param1DataRes.tag_list);
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.has_more = param1DataRes.has_more;
      this.pn = param1DataRes.pn;
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
