package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NaGuide extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DWNL_URL = "";
  
  public static final List<RecGuide> DEFAULT_REC_INFO = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dwnl_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecGuide> rec_info;
  
  public NaGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecGuide> list;
    if (paramBoolean == true) {
      String str = paramBuilder.dwnl_url;
      if (str == null) {
        this.dwnl_url = "";
      } else {
        this.dwnl_url = str;
      } 
      list = paramBuilder.rec_info;
      if (list == null) {
        this.rec_info = DEFAULT_REC_INFO;
      } else {
        this.rec_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.dwnl_url = ((Builder)list).dwnl_url;
      this.rec_info = Message.immutableCopyOf(((Builder)list).rec_info);
    } 
  }
  
  public NaGuide(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1042045756, "Ltbclient/NaGuide;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1042045756, "Ltbclient/NaGuide;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NaGuide> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String dwnl_url;
    
    public List<RecGuide> rec_info;
    
    public Builder() {}
    
    public Builder(NaGuide param1NaGuide) {
      super(param1NaGuide);
      if (param1NaGuide == null)
        return; 
      this.dwnl_url = param1NaGuide.dwnl_url;
      this.rec_info = Message.copyOf(param1NaGuide.rec_info);
    }
    
    public NaGuide build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NaGuide)interceptResult.objValue; 
      } 
      return new NaGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
