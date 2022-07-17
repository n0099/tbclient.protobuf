package tbclient.GetTagList;

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
  
  public static final List<ResponseTagInfo> DEFAULT_SEX_TAGLIST = Collections.emptyList();
  
  public static final List<ResponseTagInfo> DEFAULT_TAGLIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ResponseTagInfo> sex_taglist;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ResponseTagInfo> taglist;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ResponseTagInfo> list;
    if (paramBoolean == true) {
      List<ResponseTagInfo> list1 = paramBuilder.sex_taglist;
      if (list1 == null) {
        this.sex_taglist = DEFAULT_SEX_TAGLIST;
      } else {
        this.sex_taglist = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.taglist;
      if (list == null) {
        this.taglist = DEFAULT_TAGLIST;
      } else {
        this.taglist = Message.immutableCopyOf(list);
      } 
    } else {
      this.sex_taglist = Message.immutableCopyOf(((Builder)list).sex_taglist);
      this.taglist = Message.immutableCopyOf(((Builder)list).taglist);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1049944664, "Ltbclient/GetTagList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1049944664, "Ltbclient/GetTagList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ResponseTagInfo> sex_taglist;
    
    public List<ResponseTagInfo> taglist;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.sex_taglist = Message.copyOf(param1DataRes.sex_taglist);
      this.taglist = Message.copyOf(param1DataRes.taglist);
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
