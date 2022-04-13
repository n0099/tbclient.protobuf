package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TipInfo extends Message {
  public static final String DEFAULT_TIP_INTERVAL = "";
  
  public static final String DEFAULT_TIP_NAME = "";
  
  public static final String DEFAULT_TIP_NOTICE = "";
  
  public static final String DEFAULT_TIP_POP = "";
  
  public static final String DEFAULT_TIP_POP_TITLE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tip_interval;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tip_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tip_notice;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tip_pop;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_pop_title;
  
  public TipInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tip_name;
      if (str1 == null) {
        this.tip_name = "";
      } else {
        this.tip_name = str1;
      } 
      str1 = paramBuilder.tip_pop_title;
      if (str1 == null) {
        this.tip_pop_title = "";
      } else {
        this.tip_pop_title = str1;
      } 
      str1 = paramBuilder.tip_pop;
      if (str1 == null) {
        this.tip_pop = "";
      } else {
        this.tip_pop = str1;
      } 
      str1 = paramBuilder.tip_notice;
      if (str1 == null) {
        this.tip_notice = "";
      } else {
        this.tip_notice = str1;
      } 
      str = paramBuilder.tip_interval;
      if (str == null) {
        this.tip_interval = "";
      } else {
        this.tip_interval = str;
      } 
    } else {
      this.tip_name = ((Builder)str).tip_name;
      this.tip_pop_title = ((Builder)str).tip_pop_title;
      this.tip_pop = ((Builder)str).tip_pop;
      this.tip_notice = ((Builder)str).tip_notice;
      this.tip_interval = ((Builder)str).tip_interval;
    } 
  }
}
