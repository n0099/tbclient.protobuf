package GetWorksTags;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String second_class;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.first_class;
      if (str1 == null) {
        this.first_class = "";
      } else {
        this.first_class = str1;
      } 
      str = paramBuilder.second_class;
      if (str == null) {
        this.second_class = "";
      } else {
        this.second_class = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.first_class = ((Builder)str).first_class;
      this.second_class = ((Builder)str).second_class;
    } 
  }
}
