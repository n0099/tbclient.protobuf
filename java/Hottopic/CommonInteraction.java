package tbclient.Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonInteraction extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AFTER_CLICK_PIC = "";
  
  public static final String DEFAULT_BEFORE_CLICK_PIC = "";
  
  public static final Integer DEFAULT_HAS_CLICKED;
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Long DEFAULT_PK_ID;
  
  public static final String DEFAULT_QUES_DESC = "";
  
  public static final Long DEFAULT_TOTAL_NUM;
  
  public static final Long DEFAULT_USER_PK_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String after_click_pic;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String before_click_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_clicked;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long pk_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ques_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long total_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long user_pk_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-143628009, "Ltbclient/Hottopic/CommonInteraction;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-143628009, "Ltbclient/Hottopic/CommonInteraction;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOTAL_NUM = long_;
    DEFAULT_HAS_CLICKED = Integer.valueOf(0);
    DEFAULT_PK_ID = long_;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public CommonInteraction(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.module_name;
      if (str2 == null) {
        this.module_name = "";
      } else {
        this.module_name = str2;
      } 
      str2 = paramBuilder.ques_desc;
      if (str2 == null) {
        this.ques_desc = "";
      } else {
        this.ques_desc = str2;
      } 
      Long long_2 = paramBuilder.total_num;
      if (long_2 == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = long_2;
      } 
      Integer integer = paramBuilder.has_clicked;
      if (integer == null) {
        this.has_clicked = DEFAULT_HAS_CLICKED;
      } else {
        this.has_clicked = integer;
      } 
      String str1 = paramBuilder.before_click_pic;
      if (str1 == null) {
        this.before_click_pic = "";
      } else {
        this.before_click_pic = str1;
      } 
      str1 = paramBuilder.after_click_pic;
      if (str1 == null) {
        this.after_click_pic = "";
      } else {
        this.after_click_pic = str1;
      } 
      Long long_1 = paramBuilder.pk_id;
      if (long_1 == null) {
        this.pk_id = DEFAULT_PK_ID;
      } else {
        this.pk_id = long_1;
      } 
      long_ = paramBuilder.user_pk_id;
      if (long_ == null) {
        this.user_pk_id = DEFAULT_USER_PK_ID;
      } else {
        this.user_pk_id = long_;
      } 
    } else {
      this.module_name = ((Builder)long_).module_name;
      this.ques_desc = ((Builder)long_).ques_desc;
      this.total_num = ((Builder)long_).total_num;
      this.has_clicked = ((Builder)long_).has_clicked;
      this.before_click_pic = ((Builder)long_).before_click_pic;
      this.after_click_pic = ((Builder)long_).after_click_pic;
      this.pk_id = ((Builder)long_).pk_id;
      this.user_pk_id = ((Builder)long_).user_pk_id;
    } 
  }
  
  public CommonInteraction(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommonInteraction> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String after_click_pic;
    
    public String before_click_pic;
    
    public Integer has_clicked;
    
    public String module_name;
    
    public Long pk_id;
    
    public String ques_desc;
    
    public Long total_num;
    
    public Long user_pk_id;
    
    public Builder() {}
    
    public Builder(CommonInteraction param1CommonInteraction) {
      super(param1CommonInteraction);
      if (param1CommonInteraction == null)
        return; 
      this.module_name = param1CommonInteraction.module_name;
      this.ques_desc = param1CommonInteraction.ques_desc;
      this.total_num = param1CommonInteraction.total_num;
      this.has_clicked = param1CommonInteraction.has_clicked;
      this.before_click_pic = param1CommonInteraction.before_click_pic;
      this.after_click_pic = param1CommonInteraction.after_click_pic;
      this.pk_id = param1CommonInteraction.pk_id;
      this.user_pk_id = param1CommonInteraction.user_pk_id;
    }
    
    public CommonInteraction build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CommonInteraction)interceptResult.objValue; 
      } 
      return new CommonInteraction(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
