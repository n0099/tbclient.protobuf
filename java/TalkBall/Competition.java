package tbclient.TalkBall;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Competition extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BTN_TITLE = "";
  
  public static final List<Country> DEFAULT_COUNTRY = Collections.emptyList();
  
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Country> country;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String type;
  
  public Competition(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<Country> list = paramBuilder.country;
      if (list == null) {
        this.country = DEFAULT_COUNTRY;
      } else {
        this.country = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str = paramBuilder.btn_title;
      if (str == null) {
        this.btn_title = "";
      } else {
        this.btn_title = str;
      } 
    } else {
      this.country = Message.immutableCopyOf(((Builder)str).country);
      this.time = ((Builder)str).time;
      this.type = ((Builder)str).type;
      this.btn_title = ((Builder)str).btn_title;
    } 
  }
  
  public Competition(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1530991254, "Ltbclient/TalkBall/Competition;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1530991254, "Ltbclient/TalkBall/Competition;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Competition> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String btn_title;
    
    public List<Country> country;
    
    public Long time;
    
    public String type;
    
    public Builder() {}
    
    public Builder(Competition param1Competition) {
      super(param1Competition);
      if (param1Competition == null)
        return; 
      this.country = Message.copyOf(param1Competition.country);
      this.time = param1Competition.time;
      this.type = param1Competition.type;
      this.btn_title = param1Competition.btn_title;
    }
    
    public Competition build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Competition)interceptResult.objValue; 
      } 
      return new Competition(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
