package HotThreadList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_TAB_CODE = "";
  
  public static final String DEFAULT_TAB_ID = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_id;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.tab_id;
      if (str1 == null) {
        this.tab_id = "";
      } else {
        this.tab_id = str1;
      } 
      str = paramBuilder.tab_code;
      if (str == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.tab_id = ((Builder)str).tab_id;
      this.tab_code = ((Builder)str).tab_code;
    } 
  }
}
