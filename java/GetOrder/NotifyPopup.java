package tbclient.GetOrder;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NotifyPopup extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_APPENDIX_LINK = "";
  
  public static final Integer DEFAULT_APPENDIX_OPTIONAL;
  
  public static final String DEFAULT_APPENDIX_TEXT = "";
  
  public static final Integer DEFAULT_APP_SIZE;
  
  public static final String DEFAULT_APP_VERSION = "";
  
  public static final String DEFAULT_CHANGELOGS = "";
  
  public static final String DEFAULT_HINT = "";
  
  public static final String DEFAULT_N_BTN_LINK = "";
  
  public static final String DEFAULT_N_BTN_TEXT = "";
  
  public static final Integer DEFAULT_POPUP_ID;
  
  public static final Integer DEFAULT_POPUP_TIMES;
  
  public static final Integer DEFAULT_POPUP_TYPE;
  
  public static final String DEFAULT_Y_BTN_LINK = "";
  
  public static final String DEFAULT_Y_BTN_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer app_size;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String app_version;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String appendix_link;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer appendix_optional;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String appendix_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String changelogs;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String hint;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String n_btn_link;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String n_btn_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer popup_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer popup_times;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer popup_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String y_btn_link;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String y_btn_text;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(408779333, "Ltbclient/GetOrder/NotifyPopup;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(408779333, "Ltbclient/GetOrder/NotifyPopup;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_POPUP_ID = integer;
    DEFAULT_POPUP_TIMES = integer;
    DEFAULT_POPUP_TYPE = integer;
    DEFAULT_APP_SIZE = integer;
    DEFAULT_APPENDIX_OPTIONAL = integer;
  }
  
  public NotifyPopup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.popup_id;
      if (integer3 == null) {
        this.popup_id = DEFAULT_POPUP_ID;
      } else {
        this.popup_id = integer3;
      } 
      integer3 = paramBuilder.popup_times;
      if (integer3 == null) {
        this.popup_times = DEFAULT_POPUP_TIMES;
      } else {
        this.popup_times = integer3;
      } 
      integer3 = paramBuilder.popup_type;
      if (integer3 == null) {
        this.popup_type = DEFAULT_POPUP_TYPE;
      } else {
        this.popup_type = integer3;
      } 
      String str3 = paramBuilder.hint;
      if (str3 == null) {
        this.hint = "";
      } else {
        this.hint = str3;
      } 
      str3 = paramBuilder.app_version;
      if (str3 == null) {
        this.app_version = "";
      } else {
        this.app_version = str3;
      } 
      Integer integer2 = paramBuilder.app_size;
      if (integer2 == null) {
        this.app_size = DEFAULT_APP_SIZE;
      } else {
        this.app_size = integer2;
      } 
      String str2 = paramBuilder.changelogs;
      if (str2 == null) {
        this.changelogs = "";
      } else {
        this.changelogs = str2;
      } 
      str2 = paramBuilder.appendix_text;
      if (str2 == null) {
        this.appendix_text = "";
      } else {
        this.appendix_text = str2;
      } 
      str2 = paramBuilder.appendix_link;
      if (str2 == null) {
        this.appendix_link = "";
      } else {
        this.appendix_link = str2;
      } 
      Integer integer1 = paramBuilder.appendix_optional;
      if (integer1 == null) {
        this.appendix_optional = DEFAULT_APPENDIX_OPTIONAL;
      } else {
        this.appendix_optional = integer1;
      } 
      String str1 = paramBuilder.y_btn_text;
      if (str1 == null) {
        this.y_btn_text = "";
      } else {
        this.y_btn_text = str1;
      } 
      str1 = paramBuilder.y_btn_link;
      if (str1 == null) {
        this.y_btn_link = "";
      } else {
        this.y_btn_link = str1;
      } 
      str1 = paramBuilder.n_btn_text;
      if (str1 == null) {
        this.n_btn_text = "";
      } else {
        this.n_btn_text = str1;
      } 
      str = paramBuilder.n_btn_link;
      if (str == null) {
        this.n_btn_link = "";
      } else {
        this.n_btn_link = str;
      } 
    } else {
      this.popup_id = ((Builder)str).popup_id;
      this.popup_times = ((Builder)str).popup_times;
      this.popup_type = ((Builder)str).popup_type;
      this.hint = ((Builder)str).hint;
      this.app_version = ((Builder)str).app_version;
      this.app_size = ((Builder)str).app_size;
      this.changelogs = ((Builder)str).changelogs;
      this.appendix_text = ((Builder)str).appendix_text;
      this.appendix_link = ((Builder)str).appendix_link;
      this.appendix_optional = ((Builder)str).appendix_optional;
      this.y_btn_text = ((Builder)str).y_btn_text;
      this.y_btn_link = ((Builder)str).y_btn_link;
      this.n_btn_text = ((Builder)str).n_btn_text;
      this.n_btn_link = ((Builder)str).n_btn_link;
    } 
  }
  
  public static final class Builder extends Message.Builder<NotifyPopup> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer app_size;
    
    public String app_version;
    
    public String appendix_link;
    
    public Integer appendix_optional;
    
    public String appendix_text;
    
    public String changelogs;
    
    public String hint;
    
    public String n_btn_link;
    
    public String n_btn_text;
    
    public Integer popup_id;
    
    public Integer popup_times;
    
    public Integer popup_type;
    
    public String y_btn_link;
    
    public String y_btn_text;
    
    public Builder() {}
    
    public Builder(NotifyPopup param1NotifyPopup) {
      super(param1NotifyPopup);
      if (param1NotifyPopup == null)
        return; 
      this.popup_id = param1NotifyPopup.popup_id;
      this.popup_times = param1NotifyPopup.popup_times;
      this.popup_type = param1NotifyPopup.popup_type;
      this.hint = param1NotifyPopup.hint;
      this.app_version = param1NotifyPopup.app_version;
      this.app_size = param1NotifyPopup.app_size;
      this.changelogs = param1NotifyPopup.changelogs;
      this.appendix_text = param1NotifyPopup.appendix_text;
      this.appendix_link = param1NotifyPopup.appendix_link;
      this.appendix_optional = param1NotifyPopup.appendix_optional;
      this.y_btn_text = param1NotifyPopup.y_btn_text;
      this.y_btn_link = param1NotifyPopup.y_btn_link;
      this.n_btn_text = param1NotifyPopup.n_btn_text;
      this.n_btn_link = param1NotifyPopup.n_btn_link;
    }
    
    public NotifyPopup build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NotifyPopup)interceptResult.objValue; 
      } 
      return new NotifyPopup(this, param1Boolean);
    }
  }
}
