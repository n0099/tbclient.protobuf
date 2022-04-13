package GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ManagerElectionTab extends Message {
  public static final Integer DEFAULT_IS_NEW_STRATEGY;
  
  public static final Integer DEFAULT_NEW_MANAGER_STATUS;
  
  public static final String DEFAULT_NEW_STRATEGY_LINK = "";
  
  public static final String DEFAULT_NEW_STRATEGY_TEXT = "";
  
  public static final String DEFAULT_TOAST_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_new_strategy;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer new_manager_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String new_strategy_link;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String new_strategy_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String toast_text;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-909302109, "Ltbclient/GetForumDetail/ManagerElectionTab;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-909302109, "Ltbclient/GetForumDetail/ManagerElectionTab;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_NEW_STRATEGY = integer;
    DEFAULT_NEW_MANAGER_STATUS = integer;
  }
  
  public ManagerElectionTab(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_new_strategy;
      if (integer2 == null) {
        this.is_new_strategy = DEFAULT_IS_NEW_STRATEGY;
      } else {
        this.is_new_strategy = integer2;
      } 
      String str2 = paramBuilder.new_strategy_link;
      if (str2 == null) {
        this.new_strategy_link = "";
      } else {
        this.new_strategy_link = str2;
      } 
      Integer integer1 = paramBuilder.new_manager_status;
      if (integer1 == null) {
        this.new_manager_status = DEFAULT_NEW_MANAGER_STATUS;
      } else {
        this.new_manager_status = integer1;
      } 
      String str1 = paramBuilder.new_strategy_text;
      if (str1 == null) {
        this.new_strategy_text = "";
      } else {
        this.new_strategy_text = str1;
      } 
      str = paramBuilder.toast_text;
      if (str == null) {
        this.toast_text = "";
      } else {
        this.toast_text = str;
      } 
    } else {
      this.is_new_strategy = ((Builder)str).is_new_strategy;
      this.new_strategy_link = ((Builder)str).new_strategy_link;
      this.new_manager_status = ((Builder)str).new_manager_status;
      this.new_strategy_text = ((Builder)str).new_strategy_text;
      this.toast_text = ((Builder)str).toast_text;
    } 
  }
}
