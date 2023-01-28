package tbclient.Loop;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelPop extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BTN_SCHEME = "";
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_CANCEL_BTN_TEXT = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_LEVEL = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_scheme;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String cancel_btn_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public LevelPop(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str1 = paramBuilder.btn_scheme;
      if (str1 == null) {
        this.btn_scheme = "";
      } else {
        this.btn_scheme = str1;
      } 
      Integer integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
      str = paramBuilder.cancel_btn_text;
      if (str == null) {
        this.cancel_btn_text = "";
      } else {
        this.cancel_btn_text = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.btn_text = ((Builder)str).btn_text;
      this.btn_scheme = ((Builder)str).btn_scheme;
      this.level = ((Builder)str).level;
      this.cancel_btn_text = ((Builder)str).cancel_btn_text;
    } 
  }
  
  public LevelPop(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1387386035, "Ltbclient/Loop/LevelPop;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1387386035, "Ltbclient/Loop/LevelPop;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LevelPop> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String btn_scheme;
    
    public String btn_text;
    
    public String cancel_btn_text;
    
    public String desc;
    
    public Integer level;
    
    public String title;
    
    public Builder() {}
    
    public Builder(LevelPop param1LevelPop) {
      super(param1LevelPop);
      if (param1LevelPop == null)
        return; 
      this.title = param1LevelPop.title;
      this.desc = param1LevelPop.desc;
      this.btn_text = param1LevelPop.btn_text;
      this.btn_scheme = param1LevelPop.btn_scheme;
      this.level = param1LevelPop.level;
      this.cancel_btn_text = param1LevelPop.cancel_btn_text;
    }
    
    public LevelPop build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LevelPop)interceptResult.objValue; 
      } 
      return new LevelPop(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
