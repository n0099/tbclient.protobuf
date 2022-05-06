package SearchSug;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ISFORUM = "";
  
  public static final String DEFAULT_WORD = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String isforum;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String word;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.word;
      if (str1 == null) {
        this.word = "";
      } else {
        this.word = str1;
      } 
      str = paramBuilder.isforum;
      if (str == null) {
        this.isforum = "";
      } else {
        this.isforum = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.word = ((Builder)str).word;
      this.isforum = ((Builder)str).isforum;
    } 
  }
}
